public class tester{
  public static String toString(Integer[] data, int start, int end){
    String ans = "[ ";
    for(int i = start; i < data.length; i++){
      if(data[i] != null){
        ans += data[i];
        if(i != end){
          ans += ", ";
        }
      }
    }
    for(int i = 0; i < start; i++){
      if(data[i] != null){
        ans += data[i];
        if(i != end){
          ans += ", ";
        }
      }
    }
    ans += "]";
    return ans;
  }
  public static void main(String[] args) {
    Integer[] ary = {2,3,4,5,null,1};
    System.out.println(toString(ary, 5, 3));
    MyDeque<Integer> dec = new MyDeque<Integer>(3);
    System.out.println(dec);
    dec.addFirst(0);
    System.out.println(dec);
    dec.addFirst(1);
    System.out.println(dec);
    dec.addFirst(2);
    System.out.println(dec);
    dec.addFirst(3);
    System.out.println(dec);
    dec.addLast(-1);
    System.out.println(dec);
    dec.addLast(-2);
    System.out.println(dec);
    dec.addLast(-3);
    System.out.println(dec);
    System.out.println(dec.removeFirst());
    System.out.println(dec);
    System.out.println(dec.removeFirst());
    System.out.println(dec);
    System.out.println(dec.removeFirst());
    System.out.println(dec);
    System.out.println(dec.removeLast());
    System.out.println(dec);
    System.out.println(dec.removeLast());
    System.out.println(dec);
    System.out.println(dec.removeLast());
    System.out.println(dec);
  }
}
