public class Main {
    public static void main(String[] args) {
        //test case 1
        Game one = new Game();
        one.getLevel(1).setPoints(200);
        one.getLevel(1).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(2).reachGoal();
        one.getLevel(3).setPoints(500);
        one.getLevel(3).reachGoal();
        one.makeBonus();
        System.out.println(one.getScore());

        //test case 2
        Game two = new Game();
        two.getLevel(1).setPoints(200);
        two.getLevel(1).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(2).reachGoal();
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());

        //test case 3
        Game three = new Game();
        three.getLevel(1).setPoints(200);
        three.getLevel(1).reachGoal();
        three.getLevel(2).setPoints(100);
        three.getLevel(3).setPoints(500);
        three.getLevel(3).reachGoal();
        three.makeBonus();
        System.out.println(three.getScore());

        //test case 4
        Game four = new Game();
        four.getLevel(1).setPoints(200);
        four.getLevel(2).setPoints(100);
        four.getLevel(2).reachGoal();
        four.getLevel(3).setPoints(500);
        four.getLevel(3).reachGoal();
        System.out.println(four.getScore());


        

    }
}