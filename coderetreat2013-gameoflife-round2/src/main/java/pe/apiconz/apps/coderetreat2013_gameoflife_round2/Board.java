package pe.apiconz.apps.coderetreat2013_gameoflife_round2;

public class Board {

	int[][] board;

	public Board(int ancho, int largo) {
		this.board = new int[ancho][largo];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 1;
			}
		}
	}

	public Object size() {
		// TODO Auto-generated method stub
		return board.length * board[0].length;
	}

	public int estaVivo(int i, int j) {
		switch (board[i][j]) {
		case 0:
			return 0;
		default:
			return 1;
		}

	}

	public boolean vivira(int i, int j) {
		int vecinosVivos = 0;
		
		Integer ij = new Integer(1);

		// Valida arriba
		vecinosVivos += estaVivo(i, j + 1);
		
		                                
		
		return false;
	}
}
