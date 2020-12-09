import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T>{

  ArrayList<T> nullTheNull = new ArrayList<T>();
  public NoNullArrayList(){
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }else{
      return nullTheNull.set(index, value);
    }
  }
}
