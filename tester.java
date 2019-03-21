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
    Integer[] ary = {1, null, 2 ,3,4,5};
    System.out.println(toString(ary, 2, 0));
  }
}
