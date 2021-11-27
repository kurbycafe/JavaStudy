import java.util.*;

public class JavaArray {
    public static void main(String[] args) {
        int[] intArray = new int[30];
        for(int i =0;i<30;i++){
            intArray[i] = 1000+(i+1);
        }
        String remainders[]={"Zero","One","Two","Three"};
        for(int i =0; i<intArray.length;i++){
            System.out.println(remainders[intArray[i]%4]);
        }

    }
}
