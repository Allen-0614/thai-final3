public class Question {
    private String stimulus;
    private String question;
    private String[] answerChoices;   
    private int seconds;
    private String correct;

    public Question (String stimulus, String question, String[] answerChoices, String correct) {
        this.stimulus = stimulus;
        this.question = question;
        this.answerChoices = answerChoices;
        this.seconds = 60;
        this.correct = correct;
    }
    public Question (String question, String[] answerChoices, String correct) {
        stimulus = null;
        this.question = question;
        this.answerChoices = answerChoices;
        this.seconds = 60;
        this.correct = correct;
    }
    

    public String getStimulus() {
        return stimulus;
    }

    public void setStimulus(String stimulus) {
        this.stimulus = stimulus;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public String toString(){
        String temp = "";
        if (stimulus != null){
            temp = stimulus + "\n\n" + question;
        }
        else{
            temp = "\n"+question;
        }
        temp = temp + "\n";
        for(int i = 0; i < answerChoices.length; i++){
            temp = temp + "\n" + answerChoices[i];
        }
        return temp;
    }

    public boolean isCorrect(String userInput){
        if((userInput.equals(correct.toLowerCase())) || (userInput.equals(correct.toUpperCase()))){
            return true;
        }
        return false;
    }

    public boolean withinTime(long secondsTaken){
        if(secondsTaken > seconds){
            return false;
        }
        return true;
    }

    public void result(long secondsTake, String userInput){
        if(withinTime(secondsTake) && isCorrect(userInput)){
            System.out.println("Correct and in Time!");
        }
        else if(isCorrect(userInput) && !withinTime(secondsTake)){
            System.out.println("You are right but, you need to be quicker on the ap test");
        }
        else if(!isCorrect(userInput) && withinTime(secondsTake)){
            System.out.println("You were wrong but... atleast you were wrong quickly");
        }
        else{
            System.out.println("You were wrong and slow... atleast you are improving!");
        }
    }

    public int getCorrectIndex() {
        // correct is "A", "B", "C", or "D"
        return correct.toUpperCase().charAt(0) - 'A';
    }
}
