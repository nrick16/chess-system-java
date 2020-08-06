package board_layer;

public class Board {
	
	private Integer rows;
	private Integer columns;
	
	public Board() {
	}

	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		this.rows = row;
		this.columns = column;
	}
	
	public Piece piece(Position position) {
		this.piece(position);
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		
	}
	
	public boolean positionExists(Position position) {
		
	}
	
	public boolean thereIsAPiece(Position position) {
		
	}

}
