package for_continue_break;

import java.util.Random;

public class examples {

    public static void main(String[] args) {


        /* todo 1.LOOP

        write a program to calculate average of 4 random numbers using by for loop
         */

        Random rand = new Random();
//
//        int num1 = rand.nextInt(20);
//        int num2 = rand.nextInt(20);
//        int num3 = rand.nextInt(20);
//        int num4 = rand.nextInt(20);
//
//        int totalNum = num1 + num2 + num3 + num4;
//
//        System.out.println(totalNum);

        //how to sum hundreds of line code like that, will be hard, instead of writing one by one we need to use loop



        int totalNum = 0; //if you write this inside loop, before each iteration total will be assigned 0

        for (int i = 0; i < 4 ; i++) {


            int num = rand.nextInt(20);

            System.out.println(num);

            totalNum += num;

        }

        System.out.println(totalNum);

        /* todo 2.LOOP with scanner

        write a program that takes a number from console and

        print multiplication according that number
        ex : number 3

         3 = 3 * 1
         6 = 3 * 2
         9 = 3 * 3

         */




        /* todo 3.BREAK
         write a program to calculate the sum of 10 numbers
         If number equals 5, make the loop terminates using by for loops

         */

        /* todo 4.BREAK

        run the loop up to 100 time, and exit the loop when i is equal to random number

        */




        /*todo  5.CONTINUE
        use String text = "masskakchuksetts" and print text in one word without letter k using loop and continue
         */



        /* todo 6.CONTINUE

          get 5 random numbers between 0 to 10

          if random number is odd number, skip it, print only even numbers

        */



    }
}
