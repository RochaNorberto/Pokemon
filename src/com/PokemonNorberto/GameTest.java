package com.PokemonNorberto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
The battery of tests below try to test a different set of possible flaws and unexpected cases including the inputs given in the exercise paper.
The name of the tests is a condesed representation of it's purpose.
 */
class GameTest {
    @Test
    void testSquare(){
        Game game = new Game();
        assertEquals(4, game.startGame(new Player("ash",0,0),"NESO"));
    }
    @Test
    void testInputUpAndDown(){
        Game game = new Game();
        assertEquals(2,game.startGame(new Player("ash",0,0),"NSNSNSNSNSNSNS"));
    }
    @Test
    void testInputlowerCase(){
        Game game = new Game();
        assertEquals(2,game.startGame(new Player("ash",0,0),"nsnsnsnsnsns"));
    }
    @Test
    void testInputIncorretLetters(){
        Game game = new Game();
        assertEquals(1,game.startGame(new Player("ash",0,0),"T"));
    }

    @Test
    void testInputLeftAndRight(){
        Game game = new Game();
        assertEquals(2,game.startGame(new Player("ash",0,0),"EOEOEOE"));
    }
    @Test
    void testInputBig(){
        Game game = new Game();
        assertEquals(120,game.startGame(new Player("ash",0,0),"EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE" +
                                                                                         "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"));
    }
    @Test
    void testInput1(){
        Game game = new Game();
        assertEquals(2,game.startGame(new Player("ash",0,0),"E"));
    }
    @Test
    void testInput2(){
        Game game = new Game();
        assertEquals(4,game.startGame(new Player("ash",0,0),"NESO"));
    }
    @Test
    void testInput3(){
        Game game = new Game();
        assertEquals(2,game.startGame(new Player("ash",0,0),"NSNSNSNSNS"));
    }

}