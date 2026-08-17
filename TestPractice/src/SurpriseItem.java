public class SurpriseItem<T>{

    private T item;

    public SurpriseItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public void activateSurprise(){
        System.out.println("You got a surprise! Congratulations!");
    }
}
