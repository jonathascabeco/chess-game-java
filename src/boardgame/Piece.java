package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		
		this.board = board;
		position = null; // nao precisaria criar, ja vem nulo;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { // na uml esta em italico que define metodos abstratos;
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() { // implementa��o completa que depende de um metodo abstrato;
		boolean[][] mat = possibleMoves();
		for (int i = 0; i<mat.length; i++) {
			for(int j = 0; j< mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
