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
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addFirst(0);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addFirst(1);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addFirst(2);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addFirst(3);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addLast(-1);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addLast(-2);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addLast(-3);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeFirst());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeFirst());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeFirst());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeLast());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeLast());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    System.out.println("Removed: " + dec.removeLast());
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addFirst(null);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
    dec.addLast(null);
    System.out.println(dec);
    System.out.println("Size: " + dec.size());
    System.out.println("First Element: " + dec.getFirst());
    System.out.println("Last Element: " + dec.getLast());
  }
}
