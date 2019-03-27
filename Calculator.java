public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<String> dec = new MyDeque<String>();
      String operators = "-+*/%";
      double ans = 0.0;
      for(int i = 0; i < s.length(); i++){
        if(!s.substring(i, i+1).equals(" ")){
          String inpt = s.substring(i, i+1);
          if(operators.contains(s.substring(i, i+1))){
            double comb = operate((double)Integer.parseInt(dec.removeFirst()), (double)Integer.parseInt(dec.removeFirst()), s.substring(i, i+1));
            ans += comb;
            inpt = (int)comb + " ";
          }
          dec.addFirst(inpt);
        }

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
    }

    public static void main(String[] args) {
      eval("1 2 3 4 5 + * - - ");
    }
}
