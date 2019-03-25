public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<String> dec = new MyDeque<String>();
      for(int i = 0; i < s.length(); i++){
        if(!s.substring(i, i+1).equals(" ")){
          dec.addLast(s.substring(i, i+1));
        }
        //System.out.println(dec);
      }
      return 0.0;
    }

    public static void main(String[] args) {
      eval("1 2 3 4 5 + * - - ");
    }
}
