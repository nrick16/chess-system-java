package chess_layer;

import chess_layer.enums.Color;

public class ChessMatch {

	private Integer turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	public ChessMatch() {
	}

	public ChessMatch(Integer turn, Color currentPlayer, boolean check, boolean checkMate,
			ChessPiece enPassantVulnerable, ChessPiece promoted) {
		this.turn = turn;
		this.currentPlayer = currentPlayer;
		this.check = check;
		this.checkMate = checkMate;
		this.enPassantVulnerable = enPassantVulnerable;
		this.promoted = promoted;
	}
	
	public ChessPiece piece[][] getPieces(){
		
	}
	
	public boolean[][] getPieces() {
		return
	}
	
	
}
