package org.example.models;

import org.example.enums.GameStatus;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //state
    private String name;
    private GameStatus gameStatus;
    private Board board;
    private List<Player> players = new ArrayList<>();
    private CheckWinnerStrategy checkWinnerStrategy;

    public void startGame(){

    }
    public void makeMove(){

    }
    public Player checkWinner(){
        return checkWinnerStrategy.checkWinner();
    }
    public void register(){

    }

}
