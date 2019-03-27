import java.util.Scanner;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<String> dec = new MyDeque<String>();
      String operators = "-+*/%";
      double ans = 0.0;
      Scanner string = new Scanner(s);
      while(string.hasNext()){
        String inpt = string.next();
        if(operators.contains(inpt)){
          double comb = operate((double)Integer.parseInt(dec.removeFirst()), (double)Integer.parseInt(dec.removeFirst()), inpt);
          ans += comb;
          inpt = (int)comb + " ";
        }
        dec.addFirst(inpt);
      }

      return ans;
    }

    private static double operate(double inpt1, double inpt2, String operator){
      if(operator.equals("+")){
        return inpt1 + inpt2;
      }else if(operator.equals("-")){
        return inpt1 - inpt2;
      }else if(operator.equals("*")){
        return inpt1 * inpt2;
      }else if(operator.equals("/")){
        return inpt1 / inpt2;
      }else if(operator.equals("%")){
        return inpt1 % inpt2;
      }
      return 0.0;
    }

    public static void main(String[] args) {
      System.out.println(eval("2 4 71 8.5 + - * 5 + "));
    }
}
