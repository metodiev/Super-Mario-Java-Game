

public class MainMenu {


    public void printMenu(){
        System.out.println("1. One player game");
        System.out.println("2. Two players game ");
        System.out.println("3. Choose difficulty");

    }


    public  void  playerChoice(int choice){

        switch (choice){

            case 1:
                    DrawStage.numberOfPlayers = 1;
                //TODO create switch choices -- swhitch case statements 1. draw 1 or two players
                break;

            case 2:
                DrawStage.numberOfPlayers = 2;

                break;
        }

    }
}
