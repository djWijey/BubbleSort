import java.util.Arrays;
public class App {
    public static void main(String[] args){
        Integer[] unsorted_1 = {70,61,72,83,38};
        Integer[] sorted_1 = BubbleSort.Sort(unsorted_1);
        printArr(sorted_1);

        Integer[] unsorted_2 = {7,2,76,4,99};
        Integer[] sorted_2 = BubbleSort.Sort(unsorted_2);
        printArr(sorted_2);

        Integer[] unsorted_3 = {28,9,13,78,19};
        Integer[] sorted_3 =BubbleSort.Sort(unsorted_3);
        printArr(sorted_3);

        Integer[] unsorted_4 = {68,84,41,62,18};
        Integer[] sorted_4 = BubbleSort.Sort(unsorted_4);
        printArr(sorted_4);

        Integer[] unsorted_5 = {37,57,40,13,50};
        Integer[] sorted_5 = BubbleSort.Sort(unsorted_5);
        printArr(sorted_5);

    }

    public static void printArr(Integer[] sorted){
            System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}
