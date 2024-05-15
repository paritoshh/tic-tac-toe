package org.example.models;

import org.example.enums.Symbol;

public abstract class Player {

    private Symbol symbol;
    public abstract Move makeMove(Board board);
}
