import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class DZ_3 {
    public static void main(String[] args){
        randomNumbers(20,100);

    }
    static void randomNumbers(int size, int maxValue){
        ArrayList<Integer> nums = new ArrayList<>(size);
        ArrayList<Integer> numsa = new ArrayList<>(size);

        Random rand = new Random();
        
        for (int i = 0; i < size; i++)
            nums.add(rand.nextInt(maxValue));

        for (Integer num : nums)
            System.out.print(num + " ");
        System.out.println();

        for (Integer num : nums)
            if(num % 2!=0)
            numsa.add(num);
            System.out.print(numsa + "- массив без четных чисел");
        System.out.println();
    
    }
        
}

