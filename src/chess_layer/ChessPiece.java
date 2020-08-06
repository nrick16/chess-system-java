package chess_layer;

import chess_layer.enums.Color;

public class ChessPiece {

	private Color color;
	private Integer moveCount;
	
	public ChessPiece() {
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
