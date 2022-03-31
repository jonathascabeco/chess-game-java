package chess;

import boardgame.Position;

public class ChessPosition {
	 
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException ("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() { // no uml protected � com #
		return new Position(8 - row, column -'a');
	}
	
	protected static ChessPosition fromPosition(Position position) { // no uml static � sublinhado
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() { 
		return "" + column + row; // essa string vazia � pra o programa concatenar as outras strings, sem isso nao faz; 
	}
}
