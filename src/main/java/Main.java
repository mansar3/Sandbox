public class Main {

    public static void main(String[] args) {
        // Loop through an array and find the max number
        int[] arr = {4, 5, 6, 3, 11, 4, 82, 43, 64};
        int[] arr3 = {4, 165, 6, 3, 11, 4, 82, 43, 64};
        //Make numbers class
        // make two methods min and max

        // Instantiate the class
        // type - nickname - new - type
        Numbers A = new Numbers();
        int f=A.testVar;
        // nickname "." method
        A.max(arr);

        int X = A.max(arr);
        //print out the results of both
      System.out.println(X);
      System.out.println(A.min(arr3));


    }

}
