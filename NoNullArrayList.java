import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T>{
  ArrayList<T> nullTheNull;

  public NoNullArrayList(){
    nullTheNull = new ArrayList<T>();
  }

  public NoNullArrayList(int initalCapacity){
    nullTheNull = new ArrayList<T>(initalCapacity);
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    return nullTheNull.add(value);
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    nullTheNull.add(index, value);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    return nullTheNull.set(index, value);
  }

  public int size(){
    return nullTheNull.size();
  }

  public T get(int index){
    return nullTheNull.get(index);
  }

  public String toString(){
    return nullTheNull.toString();
  }
}
