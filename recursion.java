import java.util.ArrayList;
import java.lang.Math;

public class recursion{

    public static void main(String[] args){
        System.out.println("square root of 16: " + sqrt(16.0,1));
        System.out.println("all sums of n = 3");
        ArrayList<Integer> output = makeAllSums(3);
        for (int x = 0; x < output.size(); x++){
            System.out.println(output.get(x));
        }
        System.out.println(" 4th term of fib is: " + fib(4));
    }

    public static double sqrt(double n, double tolerance){
        return helperA(n,1,tolerance);
    }
    public static double helperA(double n, double guess, double tolerance){
        if (Math.abs((n - (guess * guess)))/n * 100 >= tolerance){
            return helperA(n , (n / guess + guess) / 2, tolerance);
        }
        return guess;
    }

    public static ArrayList<Integer> makeAllSums(int n){
        ArrayList<Integer> output = new ArrayList<Integer>();
        helperB(n, 0, output);
        return output;
    }

    public static void helperB(int n, int sum, ArrayList<Integer> input){
        if (n > 0){
            helperB(n-1,sum + n, input);
            helperB(n-1,sum,input);
        }  else{
        input.add(sum);
        }
    }
    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        return helperC(n, 0 , 1);
    }
    public static int helperC(int n, int one, int two){
        if (n > 0){
            return helperC(n - 1, two, one + two);
        }
        return two;
    }
}
