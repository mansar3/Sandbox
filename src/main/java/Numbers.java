public class Numbers {
    public int testVar = 34234;

    // access modifier - varType - name - (parameters)
    public int max(int[] array) {
        // we have to set a low max
        int max =0;
        for (int i = 0; i < array.length; i++) {  // <-- iterate through from 0 to the array size(notice its dynamic for the array)
            if (array[i] > max) {  // <---- the value of the index of the array at i is greater than max
                max = array[i];  // <--- assign current value to max

            }
        }
        return max; // return AFTER loop is finished
    }
//{4, 165, 6, 3, 11, 4, 82, 43, 64};
    public int min(int[] array) {
        int min =1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
