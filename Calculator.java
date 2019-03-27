import java.util.Scanner;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<String> dec = new MyDeque<String>();
      String operators = "-+*/%";
      Scanner string = new Scanner(s);
      while(string.hasNext()){
        System.out.println(dec);
        String inpt = string.next();
        if(operators.contains(inpt)){
          double comb = operate(Double.parseDouble(dec.removeFirst()), Double.parseDouble(dec.removeFirst()), inpt);
          inpt = (int)comb + " ";
        }
        dec.addFirst(inpt);
      }
      System.out.println(dec);
      return Double.parseDouble(dec.getFirst());
    }

    private static double operate(double inpt1, double inpt2, String operator){
      if(operator.equals("+")){
        return inpt2 + inpt1;
      }else if(operator.equals("-")){
        return inpt2 - inpt1;
      }else if(operator.equals("*")){
        return inpt2 * inpt1;
      }else if(operator.equals("/")){
        return inpt2 / inpt1;
      }else if(operator.equals("%")){
        return inpt2 % inpt1;
      }
      return 0.0;
    }

    public static void main(String[] args) {
      System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    }
}
