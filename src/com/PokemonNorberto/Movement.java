package com.PokemonNorberto;

/*
Class Movement also can be seen as a position and always needs two coordenates, x and y.
The class generates a new object everytime the player moves to a different position so
that we can know how many different positions he/she has been to. The amount of different position
gives us the amount of pokemons catched.
 */

public class Movement {
    int x;
    int y;

    public Movement(int x,int y){
        this.x = x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
