package com.ky8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if(p1 == p2)
            return "Draw!";
        else{
            String relers = "rockpaperscissorsrock";
            if(relers.contains(p1 + p2))
                return "Player 2 won!";
            else
                return "Player 1 won!";
        }
    }
}
