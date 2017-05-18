package com.stefn.java.object;

import com.stefn.java.object.controller.Game;
import com.stefn.java.object.model.Board;
import com.stefn.java.object.view.AdvConsoleView;
import com.stefn.java.object.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(advConsoleView);

    }

    private static void startGame(final AdvConsoleView advConsoleView){
        advConsoleView.showGameName();
    }
}
