public class findMinimumValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        minValue(arr);
    }
    private static void minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                index = index + i;
            }
        }
        System.out.println("Minimum value in the array: " + min + ", at position: " + index);
    }
}
