package engine.Pieces;

import java.util.List;

public abstract class Piece {
    // Attributes
    private char displayChar;

    // Constructor
    public Piece(char displayChar) {
        this.displayChar = displayChar;
    }

    // Methods
    public abstract void isValidMove();
    public abstract List<int[]> avaliableMoves();
}
