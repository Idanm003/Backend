import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //Creating the array list
        ArrayList<String> colorList = new ArrayList<>();

        //Adds to original list
        addColor("Red", colorList);
        addColor("Blue", colorList);
        addColor("Green", colorList);
        addColor("Yellow", colorList);

        //Adds to new list
        ArrayList<String> colorList2 = new ArrayList<>();
        addColor("Purple", colorList2);

        System.out.println(compareLists(colorList, colorList2));

        System.out.println("Testing");

    }
    public static void addColor(String color, List<String> listToAdd){
        listToAdd.add(color);
    }

    public static <T> ArrayList<Boolean> compareLists(ArrayList<T> arrayList, ArrayList<T> arrayList2){
        ArrayList<Boolean> res = new ArrayList<>();
        ArrayList<T> biggerArrayList;
        ArrayList<T> smallerArrayList;

        if (arrayList.size() > arrayList2.size()) {
            biggerArrayList = arrayList;
            smallerArrayList = arrayList2;
        } else {
            biggerArrayList = arrayList2;
            smallerArrayList = arrayList;
        }
        for (T element : biggerArrayList) {
            res.add(smallerArrayList.contains(element));
        }
        return res;
    }
}