import java.util.*;
public class Battle {
    private String name;
    private ArrayList<Question> questionList;
    private Boss enemy;
    private Player player;
    
    public Battle(String name, ArrayList<Question> questionList, Player player, Boss enemy) {
        this.name = name;
        this.questionList = questionList;
        this.player = player;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Question> getQuestions() {
        return questionList;
    }
    public void setQuestions(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Boss getBoss() {
        return enemy;
    }
    public void setBoss(Boss enemy) {
        this.enemy = enemy;
    }


    
}