package chess_layer;

public class ChessPosition {
	
	private char column;
	private Integer row;
	
	public ChessPosition() {
	}

	public ChessPosition(char column, Integer row) {
		this.column = column;
		this.row = row;
	}
	
	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	protected Position toPosition() {
		
	}
	
	protected ChessPosition fromPosition(Position position) {
		
	}
}
