package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		super();
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	
	
	
}
