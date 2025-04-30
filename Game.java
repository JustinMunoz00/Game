import java.util.Scanner;
public class Game{
private Level levelOne = new Level();
private Level levelTwo = new Level();
private Level levelThree = new Level();
private boolean bonus = false;
/** Postcondition: All instance variables have been initialized. */
public Game(){}

public boolean isBonus()
{ return bonus; }
public void makeBonus(){
    bonus = true;
}
public void play()
{ 
    levelOne.setpoints((int) (Math.random()*1000));
}

public int getScore(){
    int score = 0;
    if (levelOne.goalReached()){
        score+= levelOne.getPoints();
        if (levelTwo.goalReached()){
            score+= levelTwo.getPoints();
            if (levelThree.goalReached()){
                score+= levelThree.getPoints();
            }
        }
    }
    if (isBonus()) score *= 3;
    return score;
}

public int playManyTimes(int num)
{
    return 0;
}

public Level getLevel(int i){
    if(i == 1) return levelOne;
    if (i == 2) return levelTwo;
    if (i == 3) return levelThree;
    else return null;
}

}