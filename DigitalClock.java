import java.awt.*;
import javax.swing.*;
import java.util.*;

class ClockRun implements Runnable {
    private JLabel LabelforClock;
    public ClockRun( JLabel LabelforClock ) {
        this.LabelforClock = LabelforClock;
    }
    @Override
    public void run() {

        while(true) {
            Calendar c = Calendar.getInstance();
            String date = c.get(Calendar.YEAR) +"년"+c.get(Calendar.MONTH)+"월"+c.get(Calendar.DATE)+"일" +c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND) ;
            LabelforClock.setText( date );
            try {
                Thread.sleep( 1000 );
                for (int t=0; t<1; t++){
                    LabelforClock.setLocation(LabelforClock.getX()+1,LabelforClock.getY()+1);
                    Thread.sleep(50);
                    LabelforClock.setLocation(LabelforClock.getX(),LabelforClock.getY());
                }

            }
            catch( InterruptedException e ) {
                return;
            }
        }
    }
}
public class DigitalClock extends JFrame {
    public DigitalClock() {
        setTitle( "Vibrating Digital Clock" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        JLabel LabelforClock = new JLabel();
        LabelforClock.setFont( new Font("Gothic", Font.ITALIC, 80) );
        c.add( LabelforClock );
        setSize( 1050, 150 );
        setVisible( true );
        Thread th = new Thread( new ClockRun( LabelforClock ) );
        th.start();
    }
    public static void main( String[] args ) {
        new DigitalClock();
    }
}
