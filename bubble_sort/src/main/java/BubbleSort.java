public class BubbleSort {
    public static Integer[] Sort(Integer[] sortArr){
        int n = sortArr.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n-i-1; j++) {
                //array will iterate through each adjacent pair
                if (sortArr[j] > sortArr[j + 1]) {
                    //create a temporary variable to hold the variable whilst swapping value
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
        //method will return a sorted array
        return sortArr;
    }
}
