package com.PokemonNorberto;

import java.util.ArrayList;

/*
This class, Game, represents a new game everytime we want to play. It needs a Player and the path we want him/her to follow.
 */

public class Game {
    public static ArrayList<Movement> pokemonPositions = new ArrayList<Movement>();

    //Contructor
    public Game(){
    }

    public static int startGame(Player player,String path){  //recieves the arguments needed to start a new game

        pokemonPositions.add(new Movement(player.getX(),player.getY()));//adds the first movement/position, whatever it be, to the list of different positions
        String pathUpper = path.toUpperCase();//checks if the string given stays uppercase so we wont fail the sitch case below, this prevents small mistakes from not having the CAPS LOCK key activated
        for (int i=0; i <pathUpper.length();i++){ //iterates n given times giving the path lenght, checking this way letter by letter making different moves according the letter
            switch(pathUpper.charAt(i)){
                case 'N':
                    player.movesPlayerNorth();//moves the player first then proceeds to check is there's a pokemon
                    if(checkPokemon(player.getX(),player.getY())){  //uses the method to verify if the currenty Player position has been visited before
                        pokemonPositions.add(new Movement(player.getX(),player.getY())); //adds a unvisited position to the list of new positions
                    }
                    break;
                case 'S':
                    player.movesPlayerSouth();
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                case 'E':
                    player.movesPlayerEast();
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                case 'O':
                    player.movesPlayerWest();
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                default:
                    System.out.println("Direction not correct.");
            }
        }
        return pokemonPositions.size();//the method will return the size of the list of different positions that will always represent the ammount
                                       // of pokemons catched preventing this way using variables with no need. Using the return of an Integer we can later
                                       // use this value to run tests and check the reliability of the algorithm
    }

    public static boolean checkPokemon(int x, int y) { //static method so it can be called outside the scope
        for(Movement movement: pokemonPositions){  //for each movement in the different moves list the for is verifying if the position given is present
            if(movement.getX() == x && movement.getY()==y){
                return false; //returns false if the Player was in the same position before
            }
        }
        return true; //if there is no EQUAL position in the list COMPARED to the actual position it returns true and the position is later added to the list
    }

}
