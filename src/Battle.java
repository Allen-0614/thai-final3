import java.util.*;
public class Battle {
    private int periodNumber;
    private ArrayList<Question> questionList;
    private Boss enemy;
    private Player player;
    
    public Battle(int periodNumber, ArrayList<Question> questionList, Player player, Boss enemy) {
        this.periodNumber = periodNumber;
        this.questionList = questionList;
        this.player = player;
        this.enemy = enemy;
    }


    
}