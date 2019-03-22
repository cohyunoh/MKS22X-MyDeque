import java.util.NoSuchElementException;
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
        if(i != end){
          ans += " ";
        }
      }
    }
    for(int i = 0; i < start; i++){
      if(data[i] != null){
        ans += data[i];
        if(i != end){
          ans += " ";
        }
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
      size ++;
    }else{
      if(size == data.length){
        resize();
      }
      int index = -1;
      if(start - 1 < 0){
        index = data.length - 1;
      }else{
        index = start - 1;
      }
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
      data[end] = element;
      size ++;
    }else{
      if(size == data.length){
        resize();
      }
      int index = -1;
      if(end + 1 >= data.length){
        index = 0;
      }else{
        index = end + 1;
      }
      if(data[index] == null){
        data[index] = element;
        end = index;
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
      if(start + 1 >= data.length){
        start = 0;
      }else{
        start += 1;
      }
      return returnVal;
    }
  }

  public E removeLast(){
    if(size == 0){
      throw new NoSuchElementException("Deque has size of zero");
    }else{
      E returnVal = data[end];
      data[end] = null;
      if(end - 1 < 0){
        end = data.length - 1;
      }else{
        end -= 1;
      }
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
      return data[end];
    }
  }

  private void resize(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[data.length * 2];
    boolean done = false;
    int index = 0;
    for (int i = start; i < data.length; i++){
      if(data[i] != null){
        d[index] = data[i];
        index ++;
      }
    }
    for(int i = 0; i < start; i++){
      if(data[i] != null){
        d[index] = data[i];
        index ++;
      }
    }
    data = d;
    start = 0;
    end = index - 1;
  }
}
