package com.example.gitauksinisprotas;

public class player {
    String playerName;
    int score;
    String team;
    boolean playing;

     player(String playerName, int score, String team, boolean playing ){
        this.playerName = playerName;
        this.score = score;
        this.team = team;
        this.playing = playing;

    }

    void clearScore(){
        score = 0 ;
    }
    void scorePlus(){
        score++;
    }
    void scoreMinus(){
        score--;
    }

}
