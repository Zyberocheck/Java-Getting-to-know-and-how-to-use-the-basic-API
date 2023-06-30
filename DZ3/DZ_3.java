import java.util.ArrayList;
import java.util.Random;

public class DZ_3 {
    public static void main(String[] args){
        randomNumbers(20,100);

    }
    static void randomNumbers(int size, int maxValue){
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();
        
        for (int i = 0; i < size; i++)
            nums.add(rand.nextInt(maxValue));

        for (Integer num : nums) 
            System.out.print(num + " ");
        System.out.println();

        nums.sort(null);

        // for (Integer num : nums)
        for (int i = 0; i < nums.size(); i++) {
            if(i % 2 != 0)
            System.out.print(i + " ");
        System.out.println();
        }    
        
    }
}
