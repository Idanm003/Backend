public class Box<T> {
    //<T> means class is of type generic
    private T item;

    public Box(T item) {}

    public T getItem() {
        return this.item;
    }
    public void setValue(T value) {
        this.item = value;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItemClass(){
        System.out.println("Item is a " + this.item.getClass());
    }
}