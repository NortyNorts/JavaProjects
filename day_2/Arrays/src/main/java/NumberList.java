import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public int getNumbersOfItems() {
        return this.numbers.size();
    }

    public void addItems(int i) {
        this.numbers.add(i);
    }

    public int getNumberAtInsdex(int i) {
        return this.numbers.get(i);
    }

    public void clearArrayList() {
        this.numbers.clear();
    }

    public int getTotal() {
        int total = 0;

//        for(int i = 0; i < getNumbersOfItems(); i++){
//            total += getNumberAtInsdex(i);
//        }

        for(int i : this.numbers){
            total += i;
        }

        return total;
    }
}
