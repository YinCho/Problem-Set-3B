
public class RockPaperScissor {
    
    public RockPaperScissor(int option) {
        int x = option;

    }

    public static String computerChoice() {
        String s;
        int random = (int) (Math.random()*3 );
        if (random == 0) {  
            s = "ROCK";
        } else if (random == 1) {
            s = "PAPER"; 
        } else s = "SCISSOR";
        
        return s;
    }
}
