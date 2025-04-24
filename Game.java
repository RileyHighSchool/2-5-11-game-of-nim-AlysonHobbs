
import java.util.Scanner;


public class Game {

private Player player1;
private Player player2;
private Player currentPlayer;




public Game(){
  player1= new Player();
  player2 = new Player();

}


public void setFirstPlayer(){
    if (Math.random() > .5){
      currentPlayer = player1;
    }else{
      currentPlayer = player2;
    }

}


public void endGame(){
   if (currentPlayer == player1){
    System.out.println("You win, "+ player2.getName());
   }else{
    System.out.println("You win, " + player1.getName());
   
   player1.updateScore(1);
   }
   System.out.println(player1.getName() + "You have" + player1.getScore());
    System.out.println(player2.getName() + "You have" + player2.getScore());

    System.out.println("Would you like to play again?");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    if(input.equals("y")){
      Board.populate();
      play();
    }

}



public void switchPlayer(){
System.out.println(" ");
     if (currentPlayer ==player1){
      currentPlayer = player2;
        System.out.println("Your turn, " + player2.getName());
      }else{
        currentPlayer = player1;
       System.out.println("Your turn, " + player1.getName());
      }
}

public void play(){
  setFirstPlayer();
  System.out.println("It's your turn, " + currentPlayer.getName());


  while (Board.getPileSize() >1){
    System.out.println("There are " + Board.getPileSize() + " pieces that are on the board");
    Board.takePieces();
    switchPlayer();
  }
  endGame();
  





  }
  
}














