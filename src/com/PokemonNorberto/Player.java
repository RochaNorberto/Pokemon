package com.PokemonNorberto;

public class Player {
    String name;
    int x;
    int y;

    public Player(String name, int x, int y){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void movesPlayerNorth(){
        setY(getY()+1);
    }
    public void movesPlayerSouth(){
        setY(getY()-1);
    }
    public void movesPlayerEast(){
        setX(getX()+1);

    }
    public void movesPlayerWest(){
        setX(getX()-1);
    }





    @Override
    public String toString() {
        return "Player " + name + " is currently in position [" + x + "," + y +"]" ;
    }
}
