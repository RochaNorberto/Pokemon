package com.PokemonNorberto;



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

    public static void main(String[] args) {

        Player ash = new Player("Ash",0,0);
        Game game = new Game(ash);
        System.out.println(game.startGame(ash));
    }

}
