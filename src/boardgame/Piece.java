package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		// Se n�o atribuir nada automaticamente j� fica nulo
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
