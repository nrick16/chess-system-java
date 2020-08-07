package board_layer;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public boolean posibleMoves() {
		return 
	}
	
	public boolean posibleMove(Position position) {
		//this.position = position;
		return null;
	}
}
