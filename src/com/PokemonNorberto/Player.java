package com.PokemonNorberto;

/*
The class Player represents the player playing the Game.
The player has it's own position with coordinates, x and y, and moves freely with no restrictions what so ever.
The player cna only move North, South, East or West.
If the game expands and we want to add new Players we can do it by creating a new Player and giving it their own position.
 */
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
