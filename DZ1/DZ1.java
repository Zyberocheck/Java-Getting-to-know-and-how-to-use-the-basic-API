import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Как задавать масив через n, как выводить массив. 
// Через sysout. Как делать форматированный вывод. 
// Вопрос с выводом как убрать вводное число в консоли.

public class DZ1 {
    public static void main(String[] args){
        // sumMultNumbers();
        // findingPrimeNumber();
        // kalkulator();

    }

    static void sumMultNumbers(){
    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner ns = new Scanner(System.in);
        System.out.println("Inpun the number of triangular points: ");
        
        int size = ns.nextInt();
        int[] arrayn = new int[size] ;
        int sum = 0;
        BigInteger mult = BigInteger.ONE;
        int in = 1;

        for (int i = 0; i < arrayn.length; i++) {
            arrayn[i] += in; 
            in++;
            sum+=i + 1;
            mult = mult.multiply(BigInteger.valueOf(arrayn[i]));            
        }

        System.out.printf("Sum triangular points: %d" , sum );
        System.out.printf("\nFactorial of a number %d is %d", size , mult );
        ns.close();
    }

    static void findingPrimeNumber(){
    // Вывести все простые числа от 1 до 1000
        ArrayList<Integer> arraya = new ArrayList<>();
        for (int i = 1; i < 1001; i++) {
            boolean isPrime = true;
            if (i % 2 !=0) {
                for (int j = 2; j <(i / 2) ; j++) {
                    if( i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime){
                    arraya.add(i);
                }
            }
        }
        System.out.print(arraya);
    }

    static void kalkulator(){
        // Реализовать простой калькулятор
        Scanner ns = new Scanner(System.in);
        System.out.println("Inpun first operand: ");
        int a = ns.nextInt();
        System.out.println("Inpun second operand: ");
        int b = ns.nextInt();

        
        System.out.println("1 - summation ");
        System.out.println("2 - subtracting ");
        System.out.println("3 - multiplication ");
        System.out.println("4 - division ");

        System.out.println("\nСhoose an arithmetic action: ");
        int act = ns.nextInt(); 

        switch (act){
            case 1:
            System.out.printf("The result of addition: " + (a + b) );
            break;
            case 2:
            System.out.printf("The result of subtraction: " + (a - b) );
            break;
            case 3:
            System.out.printf("The result of multiplication: " + (a * b) );
            break;
            case 4:
            if(b==0){
                System.out.println("You can't divide by zero!");
            }else{
                System.out.println("Division result: " + (a / b));
            }
            break;
            default:
            System.out.println("Это простой калькулятор");
        }

        ns.close();
    }
}   


















