package com.stefn.java.object.model;

/**
 * Created by Stefan on 19.05.2017.
 */
public class Player {

    private final String name;

    private final  String figure;

    public Player(final String name, final String figure){
        this.name=name;
        this.figure=figure;
    }

    public String getName(){
        return name;
    }

    public String getFigure(){
        return figure;
    }

}
