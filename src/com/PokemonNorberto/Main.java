package com.PokemonNorberto;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


/* ------------------- POKEMON APANHÁ-LOS TODOS-------------------

O Ash está a apanhar pokémons num mundo que consiste numa grelha bidimensional infinita de casas.
Em cada casa há exatamente um pokémon.
O Ash começa por apanhar o pokémon que está na casa onde começa. A seguir, move-se para a casa
imediatamente a norte, sul, este ou oeste de onde se encontra e apanha o pokémon que aí se encontrar,
e assim sucessivamente. Atenção: se ele passar numa casa onde já passou (e, portanto, onde já apanhou
um pokémon), já lá não está um pokémon para ele apanhar!
O que queremos saber é: começando com um mundo cheio de pokémons (um em cada casa!), quantos
pokémons o Ash apanha para uma dada sequência de movimentos?

*Code will be written in English leaving the variables of the exercise in Portuguese
*N = Norte = North
*S = Sul = South
*E = Este = East
*O = Oeste = West

The coordinates represented by X AND y are horizontal and vertical respectively
 */




public class Main {

    public static ArrayList<Movement> pokemonPositions = new ArrayList<Movement>();


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Player ash = new Player("Ash",0,0);
        pokemonPositions.add(new Movement(0,0));
        System.out.println("What is Ashe's Path?");
        String path = s.next();
        String pathUpper = path.toUpperCase();
        for (int i=0; i <pathUpper.length();i++){
            switch(pathUpper.charAt(i)){
                case 'N':
                    System.out.println("CASE N");
                    ash.movesPlayerNorth();
                    System.out.println(ash);
                    if(checkPokemon(ash.getX(),ash.getY())){
                        pokemonPositions.add(new Movement(ash.getX(),ash.getY()));
                    }
                    break;
                case 'S':
                    System.out.println("CASE S");
                    ash.movesPlayerSouth();
                    System.out.println(ash);
                    if(checkPokemon(ash.getX(),ash.getY())){
                        pokemonPositions.add(new Movement(ash.getX(),ash.getY()));
                    }
                    break;
                case 'E':
                    System.out.println("CASE E");
                    ash.movesPlayerEast();
                    System.out.println(ash);
                    if(checkPokemon(ash.getX(),ash.getY())){
                        pokemonPositions.add(new Movement(ash.getX(),ash.getY()));
                    }
                    break;
                case 'O':
                    System.out.println("CASE O");
                    ash.movesPlayerWest();
                    System.out.println(ash);
                    if(checkPokemon(ash.getX(),ash.getY())){
                        pokemonPositions.add(new Movement(ash.getX(),ash.getY()));
                    }
                    break;
                default:
                    System.out.println("Direction not correct.");
            }
        }
        System.out.println(pokemonPositions.size());
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
