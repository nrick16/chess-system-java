package chess_layer;

import board_layer.Board;
import board_layer.Piece;
import board_layer.Position;
import chess_layer.enums.Color;

public class ChessPiece extends Piece {

	private Color color;
	private Integer moveCount;
	
	public ChessPiece() {
	}
		
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public ChessPiece(Color color, Integer moveCount) {
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

	public Integer getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(Integer moveCount) {
		this.moveCount = moveCount;
	}
	
	public ChessPosition getChessPosition() {
		return null;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		
	}
	
	protected void increaseMoveCount() {
		
	}
	
	protected void decreaseMoveCount() {
		
	}
}
