public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    size = 10;
    start = 0;
    end = 9;
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[size];
    data = d;
  }
  public MyDeque(int initialCapacity){  }
  public int size(){ }
  public String toString(){ }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
