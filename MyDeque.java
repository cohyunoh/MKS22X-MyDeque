public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    size = 10;
    start = 0;
    end = 0;
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[size];
    data = d;
  }
  public MyDeque(int initialCapacity){
    size = initialCapacity;
    start = 0;
    end = 0;
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[size];
    data = d;
  }
  public int size(){
    return end - start + 1;
  }
  public String toString(){
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
  public void addFirst(E element){ }
  public void addLast(E element){ }
//  public E removeFirst(){ }
//  public E removeLast(){ }
//  public E getFirst(){ }
//  public E getLast(){ }
}
