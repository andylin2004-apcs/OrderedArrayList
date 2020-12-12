public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  NoNullArrayList<T> orderedList;

  public OrderedArrayList(){
    nullTheNull = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int initalCapacity){
    nullTheNull = new NoNullArrayList<T>(initalCapacity);
  }
}
