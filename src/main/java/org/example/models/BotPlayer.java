package org.example.models;

import org.example.enums.DifficultyLevel;
import org.example.enums.Symbol;

public class BotPlayer extends Player {

    private DifficultyLevel level;

    private MoveStrategy moveStrategy;


    public Move makeMove(Board board){
        return moveStrategy.makeMove(board);

    }
}
