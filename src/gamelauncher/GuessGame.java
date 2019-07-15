package gamelauncher;

public class GuessGame {

   public void startGame(){
       Player p1;
       Player p2;
       Player p3;

       String p1IsRight="false";
       String p2IsRight="false";
       String p3IsRight="false";

           p1=new Player();
           p2=new Player();
           p3=new Player();

           int guessP1;
           int guessP2;
           int guessP3;

           int targetNumber=(int) (Math.random()*10);

           System.out.println("Number to Guess = "+targetNumber);

           p1.guess();
           p2.guess();
           p3.guess();

           guessP1=p1.number;
           System.out.println("Number Guessed by the player P1 = "+guessP1);

           guessP2=p2.number;
           System.out.println("Number guessed by Player P2 = "+guessP2);

           guessP3=p3.number;
           System.out.println("Number guessed by Player P3 = "+guessP3);

           if(guessP1==targetNumber){
               p1IsRight="true";
           }
           if(guessP2==targetNumber){
               p2IsRight="true";
           }
           if (guessP3==targetNumber){
               p3IsRight="true";
           }

           if (p1IsRight=="true"){
               System.out.println("Player P1 is WINNER..");
           }
           else if (p2IsRight=="true"){
               System.out.println("Player P2 is WINNER..");
           }
           else if (p3IsRight=="true"){
               System.out.println("Player P3 is WINNER..");
           }
           else
               System.out.println("Player should have to try again...");
   }
   }

