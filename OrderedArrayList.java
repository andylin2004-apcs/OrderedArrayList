public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  NoNullArrayList<T> orderedList;

  public OrderedArrayList(){
    orderedList = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int initalCapacity){
    orderedList = new NoNullArrayList<T>(initalCapacity);
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    if (orderedList.size() == 0){
      orderedList.add(value);
      return true;
    }
    for (int i = 0; i<orderedList.size(); i++){
      if (orderedList.get(i).compareTo(value) > 0){
        orderedList.add(i, value);
        return true;
      }
    }
    orderedList.add(value);
    return true;
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    if (orderedList.size() == 0){
      orderedList.add(value);
    }else{
      for (int i = 0; i<orderedList.size(); i++){
        if (orderedList.get(i).compareTo(value) > 0){
          orderedList.add(i, value);
          break;
        }else if(i == orderedList.size()-1){
          orderedList.add(value);
        }
      }
    }
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    T out = orderedList.get(index);
    orderedList.remove(index);
    orderedList.add(value);
    return out;
  }

  public String toString(){
    return orderedList.toString();
  }
}
