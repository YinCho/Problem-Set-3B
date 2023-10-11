import java.util.Scanner;

public class Play {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        int win = 0;
        int l;
        final int LOSE = 1;
        final int TIE = 2;
        final int WIN = 0;
        String cChoice = "didnt work";
        String pChoice = "didnt work";
        boolean work = false;

        cChoice = RockPaperScissor.computerChoice();
        System.out.println(cChoice);

        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        String playerText = input.nextLine();
        String pText = playerText.toUpperCase();
        l = pText.length();

        int pChoiceRock = pText.indexOf("ROCK");
        int pChoicePaper = pText.indexOf("PAPER");
        int pChoiceScissor = pText.indexOf("SCISSOR");

        if (l>50 && pChoiceRock != -1 || l>50 && pChoicePaper != -1 || l>50 && pChoiceScissor != -1) {
            if (pChoiceRock > -1 ) {
                pChoice = pText.substring(pChoiceRock);
            } else if (pChoiceScissor > -1) {
                pChoice = pText.substring(pChoiceScissor);
            } else pChoice = pText.substring(pChoicePaper);
        } else win = LOSE;

        if (pChoiceRock > -1 && l < 50) {
            pChoice = pText.substring(pChoiceRock);
            cChoice = "PAPER";
        } else if (pChoiceScissor > -1 && l < 50) {
            pChoice = pText.substring(pChoiceScissor);
            cChoice = "ROCK";
        } else if (pChoicePaper > -1 && l < 50) {
            pChoice = pText.substring(pChoicePaper);
            cChoice = "SCISSOR";
        } else if (pChoice.equals("ROCK") && cChoice.equals("SCISSOR") || pChoice.equals("PAPER") && cChoice.equals("ROCK") || pChoice.equals("SCISSOR") && cChoice.equals("PAPER")) {
            win = WIN;
            work = true;
        } else if (pChoice.equalsIgnoreCase(cChoice)) {
            win = TIE;
        } else {
            win = LOSE;
        }

        if (win == TIE){
            System.out.println("Computer: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: " + cChoice);
            System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
        } else if (win == WIN) {
            System.out.println("You: HAHAHA I WIN");
        } else if (win == LOSE) {
            if (l < 50) {
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + cChoice);
            }
            if (pChoiceRock == pChoiceScissor && pChoiceScissor == pChoicePaper && pChoiceRock == pChoicePaper) {
                System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            } else System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE! ");
        }
        else System.out.println(win);
    }

}
