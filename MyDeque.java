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
    return size;
  }
  public String toString(){ }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
