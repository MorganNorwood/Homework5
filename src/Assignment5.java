/*Morgan Norwood
assignment 5
make a table that shows the conversion between miles and kilometers
*/



public class Assignment5 {

    //prints table headers
    public static void main (String [] args){
        System.out.println("miles    Kilometers");

//prints incrementing i and (i*1.60) 10 times
        for (int i = 1; i <= 10; i++){
            System.out.printf("%1s        %s\n", i, i*1.609);
        }


    }
}