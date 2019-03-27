import java.util.NoSuchElementException;
import java.util.Arrays;
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
    String ans = "{";
    for(int i = start; i < data.length; i++){
      if(data[i] != null){
        ans += data[i];
        ans += " ";
      }
    }
    for(int i = 0; i < start; i++){
      if(data[i] != null){
        ans += data[i];
        ans += " ";
      }
    }
    ans += "}";
    return ans;
  }
  public void addFirst(E element){
    if(element == null){
      throw new NullPointerException("Null is not a valid element to add");
    }
    if(size == 0){
      data[start] = element;
      end = end + 1 + data.length;
      end = end % data.length;
      size ++;
    }else{
      if(size == data.length){
        resize();
      }
      int index = (start - 1 + data.length) % data.length;
      if(data[index] == null){
        data[index] = element;
        start = index;
        size ++;
      }
    }
  }
  public void addLast(E element){
    if(element == null){
      throw new NullPointerException("Null is not a valid element to add");
    }
    if(size == 0){
      data[start] = element;
      end = end + 1 + data.length;
      end = end % data.length;
      size ++;

    }else{
      if(data[end % data.length] == null){
        data[end % data.length] = element;
        end = end % data.length + 1;
        size ++;
      }
    }
  }

  public E removeFirst(){
    if(size == 0){
      throw new NoSuchElementException("Deque has size of zero");
    }else{
      E returnVal = data[start];
      data[start] = null;
      start = start + 1 + data.length;
      start = start % data.length;
      size--;
      return returnVal;
    }
  }

  public E removeLast(){
    if(size == 0){
      throw new NoSuchElementException("Deque has size of zero");
    }else{
      int index = end - 1 + data.length;
      index = index % data.length;
      E returnVal = data[index];
      data[index] = null;
      end = index;
      size --;
      return returnVal;
    }
  }

  public E getFirst(){
    if(size == 0){
      throw new NoSuchElementException("Deque has size of zero");
    }else{
      return data[start];
    }
  }

  public E getLast(){
    if(size == 0){
      throw new NoSuchElementException("Deque has size of zero");
    }else{

      return data[(end - 1 + data.length) % data.length];
    }
  }

  private void resize(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[data.length * 2];
    boolean done = false;
    int index = 0;
    for(int i = start; i != end; i = (i + 1 + data.length) % data.length){
      d[index] = data[i];
      index ++;
    }
    data = d;
    start = 0;
    end = index;
  }
  /*
  public E[] getData(){
    return data;
  }
  */
  public void toStringDebug(){
    System.out.println(Arrays.toString(data));
    System.out.println("Size: " + size);
    System.out.println("First: " + start);
    System.out.println("Last: " + end);
  }
}
