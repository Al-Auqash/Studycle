import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = 0;
        do {
            System.out.println("How many amount of numbers do you want to input?");
            System.out.println("-- input 0 to quit the application --");
            System.out.print("amount of numbers : ");
            amount = input.nextInt();
            if(amount == 0){
                break;
            }else if(amount < 0){
                System.out.println("please input positive number");
            }else {
                double[] arr = new double[amount];
                for (int i = 0; i < amount; i++) {
                    int counter = i + 1;
                    System.out.print("input number " + counter + " : ");
                    arr[i] = input.nextDouble();
                }
                System.out.println("the result of the sorted input is   : " + Arrays.toString(SortedArray(arr)));
                System.out.println("the result of the multiplication is : " + Multiplication(arr));
                System.out.println("the result of the average is        : " + Average(arr));
                System.out.println("the result of the median is         : " + Median(arr));
                System.out.println("================================================");
            }
        }while(amount != 0);
        System.out.println(" -- Thank you -- ");
    }

    public static double [] SortedArray(double [] array){
        Arrays.sort(array);
        return array;
    }

    public static double Median(double [] array){
        double result = 0;
        int length = array.length;
        Arrays.sort(array);

        if(length % 2 == 0){
            result = (array[length/2] + array[(length/2) - 1]) / 2;
        }else{
            result = array[Math.round(length/2)];
        }

        return result;
    }

    public static double Average(double [] array){
        double result = 0;

        int length = array.length;

        for(double i : array){
            result += i;
        }

        return result/length;
    }

    public static double Multiplication(double [] array){
        double result = 1;

        for(double i : array){
            result *= i;
        }

        return result;
    }
}
