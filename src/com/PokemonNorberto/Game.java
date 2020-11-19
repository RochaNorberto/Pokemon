package com.PokemonNorberto;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Player player;
    public static ArrayList<Movement> pokemonPositions = new ArrayList<Movement>();

    public Game(Player player){
        this.player = player;
    }

    public static int startGame(Player player){
        Scanner s=new Scanner(System.in);
        System.out.println("What is Ashe's Path?");
        String path = s.next();
        String pathUpper = path.toUpperCase();
        for (int i=0; i <pathUpper.length();i++){
            switch(pathUpper.charAt(i)){
                case 'N':
                    System.out.println("CASE N");
                    player.movesPlayerNorth();
                    System.out.println(player);
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                case 'S':
                    System.out.println("CASE S");
                    player.movesPlayerSouth();
                    System.out.println(player);
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                case 'E':
                    System.out.println("CASE E");
                    player.movesPlayerEast();
                    System.out.println(player);
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                case 'O':
                    System.out.println("CASE O");
                    player.movesPlayerWest();
                    System.out.println(player);
                    if(checkPokemon(player.getX(),player.getY())){
                        pokemonPositions.add(new Movement(player.getX(),player.getY()));
                    }
                    break;
                default:
                    System.out.println("Direction not correct.");
            }
        }
        return pokemonPositions.size();
    }

    public static boolean checkPokemon(int x, int y) {
        for(Movement movement: pokemonPositions){
            if(movement.getX() == x && movement.getY()==y){
                return false;
            }
        }
        return true;
    }

}
