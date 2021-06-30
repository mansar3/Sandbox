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




      // Over here is what i want you to do:

        // Create a "StringChar" class

        // in there make a method that takes in two strings: the three strings:
        // the first string is a bunch of random letters the second string
        // is going to be the letter you want to find and  and third is what you want to replace ir with
        String random = "Smoke Test Hell";
        String find = "e";
        String replace = "a";
        // then print back the new string without the letter to be replaced

        // Then instantiate that class here

        // then call that method here

        // then print that methods output in a print statement here


    }



}
