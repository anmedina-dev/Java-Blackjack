import java.util.Scanner;

public class blackjack{


    public static void main(String[] args) {
        

        //get player info
        player playerOne = makePlayer();
        
        System.out.println(playerOne.getName() + " " + playerOne.getAmount());



        return;
    }

    //Make player function taking in the name and the ammount they wanna play with
    public static player makePlayer(){
        String name;
        int amount;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");
        name = myObj.nextLine();

        System.out.println("How much money do you plan on playing with?");
        amount = myObj.nextInt();

        player playerOne = new player(name, amount);

        return(playerOne);
    }




}
