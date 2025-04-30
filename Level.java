public class Level {
    private boolean goalReached = false;
    private int points;
    public Level(){
    }
    public boolean goalReached(){
        return goalReached;
    }
    public void reachGoal(){
        goalReached = true;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int p){
        points = p;
    }
}