package org.digitalstack.chess;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void move(MovementType movementType, int newX, int newY) {
        if(movementType==MovementType.MOVE) {
            if (this.xCoordinate == newX && newY - this.yCoordinate == -1) {
                this.xCoordinate=newX;
                this.yCoordinate=newY;
            }
        }
        else {
            if ((newX - this.xCoordinate == 1 || newX - this.xCoordinate == -1)&& newY - this.yCoordinate == 1) {
                this.xCoordinate=newX;
                this.yCoordinate=newY;
            }
        }
    }

    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        return String.format("Current X: %s\nCurrent Y: %s\nPiece Color: %s", xCoordinate, yCoordinate, pieceColor);
    }
}
