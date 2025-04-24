
import java.util.Scanner;

public class Board {
  private static int pileSize;
    

  public static void takePieces(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many pieces do you want to take?");
    int pieces = sc.nextInt();

    while (pieces > pileSize/2 || pieces < 1){
      System.out.println("Try again, you must take at least one, and no more than half.");
      pieces = sc.nextInt();
    }
    pileSize -= pieces;
  }

  public static int getPileSize(){
    return pileSize;
  }

  public static void populate(){
    int randomInt = (int) ((Math.random()* 50));
   pileSize = randomInt;
  }





}