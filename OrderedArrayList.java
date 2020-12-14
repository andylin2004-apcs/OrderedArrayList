import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
  }

  public OrderedArrayList(int initalCapacity){
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    if (super.size() == 0){
      super.add(value);
      return true;
    }
    for (int i = 0; i<super.size(); i++){
      if (super.get(i).compareTo(value) >= 0){
        super.add(i, value);
        return true;
      }else if(i == super.size()-1){
        super.add(value);
        return true;
      }
    }
    return true;
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    if (super.size() == 0){
      super.add(value);
    }else{
      for (int i = 0; i<super.size(); i++){
        if (super.get(i).compareTo(value) >= 0){
          super.add(i, value);
          break;
        }else if (i == super.size()-1){
          super.add(value);
          break;
        }
      }
    }
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    T out = super.get(index);
    if (super.size() > index){
      super.remove(index);
    }
    this.add(value);
    return out;
  }
}
