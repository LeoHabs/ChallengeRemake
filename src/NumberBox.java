import java.util.ArrayList;

public class NumberBox {
   public static int getMultipliedBoxDigits(ArrayList<Integer> array){
       int result=array.get(0);
       for (int i = 1; i < array.size(); i++) {
           result= result * array.get(i);
       }
       return result;
    }
}
