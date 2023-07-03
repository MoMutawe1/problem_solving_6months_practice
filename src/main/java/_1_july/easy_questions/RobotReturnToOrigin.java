package _1_july.easy_questions;

// question description: https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturnToOrigin {

    public static void main(String[] args) {
        //String moves = "UDRLUD";
        String moves = "RRDD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int UD = 0;
        int RL = 0;

        for(char c: moves.toCharArray()){
            if(c == 'U') UD++;
            else if(c == 'D') UD--;
            else if(c == 'R') RL++;
            else if(c == 'L') RL--;
        }

        return UD==0 && RL==0 ? true : false;
    }
}
