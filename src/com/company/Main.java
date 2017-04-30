/**
 * Created by Emina on 9/14/2016.
 */


package com.company;

public class Main {
    /*could it look better with collections, yes,
    but this is more newbie style so it will do*/

    public static void main(String[] args) {

        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -201, 400};
        int[] result;

        //using a variable to figure out lenght of result array
        int nrOfevenNumbers=0;
        //looping through the input array looking for even numbers
        for(int i=0;i<input.length;i++) {
            if(input[i]%2==0)
                //if there is an even number increase the counter
                nrOfevenNumbers++;
        }

        //instantiating the array with the right number of elements(counter for even numbers)
        result=new int[nrOfevenNumbers];
        //initializing a variable for position of elements in result array
        int j=0;
        //again looping through the input array looking for evens
        for(int i=0;i<input.length;i++){
            if(input[i]%2 == 0) {
                //adding evens into result array
                // where position number(j)increases by 1 for each loop
                result[j++] = input[i];
            }
        }

        //printing all the items in result array
        for (int item : result) {
            System.out.println(item);
        }

    }
}
