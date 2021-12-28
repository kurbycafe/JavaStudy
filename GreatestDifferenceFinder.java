import java.util.*;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 코드를 입력하세요.
        if(intArray.length<2){
            return 0;
        }
        else{
            int max = Arrays.stream(intArray).max().getAsInt();
            int min = Arrays.stream(intArray).min().getAsInt();
            return max - min;
        }
    }
}