import java.util.ArrayList;
public class recursion{

    public static double sqrt(double n, double tolerance){
        return helperA(n,1,tolerance);
    }
    public static double helperA(double n, double guess, double tolerance){
        if ((n-guess)/n * 100 <= tolerance){
            return helperA(n , (n / guess + guess) / 2, tolerance);
        }
        return guess;
    }
    public static int fib(int n){

    }
    public static ArrayList<Integer> makeAllSums(int n){
        ArrayList<Integer> output = new ArrayList<Integer>();
        helperB(n, 0, output);
        return output;
    }

    public static void helperB(int n, int sum, ArrayList<Integer> input){
        if (n > 0){
            input.add(sum);
            helperB(n-1,sum + n, input);
            helperB(n-1,sum,input);
        }
        input.add(sum);
    }

}
