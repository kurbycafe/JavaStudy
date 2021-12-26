import java.awt.*;
import javax.swing.*;
class FlickeringLabel extends JLabel
        implements Runnable {
    private long delay;
    private int mode;
    public FlickeringLabel(String text, long delay,int mode)
    {
        super(text);
        this.delay = delay;
        this.mode = mode;
        setOpaque(true);
        Thread th = new Thread(this);
        th.start();
    }
    @Override
    public void run() {
        int n;
        if(mode==0){
           n=0;
        }
        else {
            n = 1;
        }
        while(true) {

            if(n == 0)
                setBackground(Color.YELLOW);
            else
                setBackground(Color.GREEN);
            if(n == 0) n = 1;
            else n = 0;
            try {
                Thread.sleep(delay);
            }
            catch(InterruptedException e) {
                return;
            }
        }
    }
}
public class Ex14FlickeringLabelEx2 extends JFrame {
    public Ex14FlickeringLabelEx2() {
        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
// 깜박이는 레이블 생성
        FlickeringLabel fLabel = new FlickeringLabel("건국대학교",1000,0);

// 깜박이는 레이블 생성
        FlickeringLabel fLabel2 = new FlickeringLabel("소프트웨어전공",1000,1);

        c.add(fLabel);
        c.add(fLabel2);

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex14FlickeringLabelEx2();
    }
}