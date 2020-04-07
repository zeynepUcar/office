package for_continue_break;

public class ForLoop {

    public static void main(String[] args) {


        //until today you see do-while, while and for loop

           /** simple for loop
            instead of writing same codes again and again, with 3 statements I can write it

            loop will iterate until condition is false

            it has special syntax

            increased- decreased

            */

              // initilize + condition + inc/dec
        // for ( int i = 0   ;  i < 5     ; i++   ){



        //counting from smaller to bigger number

        for (int i = 0; i < 5; i++){

            //for loop helps us to iterate until condition is false

            //inside of curly braces, you can reach i

            System.out.println("incresing i is here >>>> " + i);
        }



        //counting from bigger to smaller number

        for (int i = 5 ; i > 0; i--){
            System.out.println("decresing numbers " + i);
        }



        //sum the numbers from 1 to 5

        int total = 0;

        for (int i = 1; i < 6 ; i++) {

         //    0  + 1 = 1
         //    1  + 2 = 3
         //    3  + 3 = 6
         //    6  + 4 = 10
         //    10 + 5 = 15

            total = total+i;  // both are same    total += i

            System.out.println("will print total again again " + total);  //total will be printing again and again, need to write outside of loop

        }
        System.out.println("total is here >>> " + total);


        System.out.println("example 1>>>>>>>> ");



        /**
         break

         we can control the loop to terminate from there.
         basically used for out of jump from loop

         mostly it is used with if- else statement

         */

        String text = "keep calm";

        for (int i =0; i <= text.length(); i++){

            char letter = text.charAt(i);

            if (letter == ' '){
                break;
            }
            System.out.print(letter);
        }

        /**
         continue

         this continue statement will break the iteration if specified condition is occured,
         then will keep iterate in the loop

         */

        String sentence = "hola @ gmail. com";
        for (int i = 0; i < sentence.length(); i++){

            char ch = sentence.charAt(i);

            if (ch == ' '){
                continue;
            }
            System.out.print(ch);
        }













    }
}
