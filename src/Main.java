import java.util.Random;

public class Main {

    private static Random randomGenerator = new Random();
    private static int randomNum;

    public static void main(String[] args){
        while(true) {
            randomNum = randomGenerator.nextInt(10) + 1;    //scaffold
            System.out.println(randomNum);                         //scaffold
        }
    }



    public static int[] fillArray(int a){
        int[] randomArr = new int[a];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = randomGenerator.nextInt(10) + 1;
        }
        return randomArr;
    }


    /* A method called, returnOne, that will return the value of the element based on the index value passed to the method.
     * In other words, given the method call: returnOne(3), the method will return the value of the element at index 3 in the array.
     */
    public static void returnOne(){
        return;
    }


    /*
    * A method called, printEven, that uses a for loop to determine and print all the even numbers contained in the
    * test array to the terminal window.
    */
    public static void printEven(){
        return;
    }


    /*
    * (5 points) A method called, sumElements, that uses a for loop to sum all the elements of the array, test,
    * and prints the result to the terminal window ONE time.
    */
    public static void sumElements(){
        return;
    }

    /*
    * A method called, reverse, that will print the contents of the array, test, in reverse order.*/
    public static void reverse(){
        return;
    }

}
