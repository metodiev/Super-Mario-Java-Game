import java.util.Scanner;

public class StartApplication {

    public static  void main(String [] args) throws InterruptedException {

        startGame();
    }

    public  static  void startGame() throws InterruptedException {

        //start menu
        MainMenu menu = new MainMenu();
        menu.printMenu();
        //player choice
        Scanner in = new Scanner(System.in);
        int playerChoice = in.nextInt();
        menu.playerChoice(playerChoice);


        //start player drawing
        DrawStage drawStage = new DrawStage();
        drawStage.drawPlayer();

        for (int i = 0; i < 5000 ; i++) {
            System.out.print(i);

            Thread.sleep(500);
            System.out.print((char)13);
        }

    }
}
