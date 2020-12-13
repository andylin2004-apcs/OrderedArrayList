import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
  }

  public NoNullArrayList(int initalCapacity){
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    return super.add(value);
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    super.add(index, value);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    return super.set(index, value);
  }

  public int size(){
    return super.size();
  }

  public T get(int index){
    return super.get(index);
  }

  public String toString(){
    return super.toString();
  }
}
