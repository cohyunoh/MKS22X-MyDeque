public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    size =  0;
    start = 0;
    end = 0;
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
  }
  public MyDeque(int initialCapacity){
    size = 0;
    start = 0;
    end = 0;
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
  }
  public int size(){
    return size;
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
  public void addFirst(E element){
    if(size)
    int index = -1;
    if(start - 1 < 0){
      index = data.length - 1;
    }else{
      index = start - 1;
    }
    for(int i = index; i >=0; i--){
      if()
    }
  }
  public void addLast(E element){ }
//  public E removeFirst(){ }
//  public E removeLast(){ }
//  public E getFirst(){ }
//  public E getLast(){ }
}
