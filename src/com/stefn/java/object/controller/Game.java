package com.stefn.java.object.controller;

import com.stefn.java.object.model.Player;
import com.sun.xml.internal.ws.server.ServerRtException;

public class Game {

    private static final String GAME_NAME = "XO";

   // int levels = 3;

    private Player[] players;

    public String getGameName() {
        return GAME_NAME;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

    public Player[] getPlayers(){
        return players;
    }

   /* public void printLevelsCount() {
        System.out.printf("Levels count : %d", this.levels);
    }

       public static void main(String[] args) {
        Game a1 = new Game();
        Game.printGameName();//this is right
        // a1.printGameName(); this is don't right
        a1.printLevelsCount();
    }*/
}
