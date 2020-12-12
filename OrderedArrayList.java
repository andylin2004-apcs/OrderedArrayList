public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  OrderedArrayList<T> orderedList;

  public OrderedArrayList(){
    orderedList = new OrderedArrayList<T>();
  }

  public OrderedArrayList(int initalCapacity){
    orderedList = new OrderedArrayList<T>(initalCapacity);
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    for (int i = 0; i<orderedList.size(); i++){
      if (orderedList.get(i).compareTo(value) < 0){
        orderedList.add(i, value);
        return true;
      }
    }
    return true;
  }
}
