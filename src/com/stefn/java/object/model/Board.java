package com.stefn.java.object.model;

import com.stefn.java.object.Figure;

public class Board {

  private /** static */final String GAME_NAME ="XO";

    private Figure figure1 = new Figure(" ");
    private Figure figure2 = new Figure(" ");
    private Figure figure3 = new Figure(" ");
    private Figure figure4 = new Figure(" ");
    private Figure figure5 = new Figure(" ");
    private Figure figure6 = new Figure(" ");
    private Figure figure7 = new Figure(" ");
    private Figure figure8 = new Figure(" ");
    private Figure figure9 = new Figure(" ");

    public /**static */void printGameName(){
    System.out.println(/**Board.*/GAME_NAME);
  }

    public void printBoard() {
        System.out.printf("%s|%s|%s\n", figure1.getFigure(), figure2.getFigure(), figure3.getFigure());
        System.out.println("-----");
        System.out.printf("%s|%s|%s\n", figure4.getFigure(), figure5.getFigure(), figure6.getFigure());
        System.out.println("-----");
        System.out.printf("%s|%s|%s\n", figure7.getFigure(), figure8.getFigure(), figure9.getFigure());

    }
   }
