package com.stefn.java.object;


public class ThreePlayersGame extends TwoPlayersGame {

    private final String player3Name;

    ThreePlayersGame(final String player1Name, final String player2Name, final String player3Name){
        super(player1Name, player2Name);

        this.player3Name=player3Name;
    }

    public void printPlayer3Name(){
        System.out.println(this.player3Name);
    }
}
