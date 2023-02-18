package Programs;

import java.util.Scanner;

class Game{
    Game()
    {
        int max=100,min=0;
        //generating random number.
        int a = (int) (Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
    void takeUserInput()
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Guess:");
        int user_guess= scan.nextInt();

    }
}
public class Guess_Num {
    public static void main(String[] args) {

        Game g=new Game();//creating obj for class game so that constructor is called

    }
}
