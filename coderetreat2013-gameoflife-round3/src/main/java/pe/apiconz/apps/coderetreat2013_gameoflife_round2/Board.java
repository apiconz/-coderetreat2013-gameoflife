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

	public Board(int[][] result) {
		board = result;
	}

	public Object size() {
		// TODO Auto-generated method stub
		return board.length * board[0].length;
	}

	public int estaVivo(int i, int j) {

		switch (i) {
		case -1:
			break;
		default:
			switch (j) {
			case -1:
				break;
			default:
				switch (board[i][j]) {
				case 0:
					return 0;
				default:
					return 1;
				}
			}
		}
		return 0;

	}

	public boolean vivira(int i, int j) {
		int vecinosVivos = 0;

		// Valida arriba
		vecinosVivos += estaVivo(i, j + 1);
		// Valida arriba - izquieda
		vecinosVivos += estaVivo(i - 1, j + 1);
		// Valida arriba - derecha
		vecinosVivos += estaVivo(i + 1, j + 1);
		// Valida izquierda
		vecinosVivos += estaVivo(i - 1, j);
		// Valida derecha
		vecinosVivos += estaVivo(i + 1, j);
		// Valida abajo
		vecinosVivos += estaVivo(i, j - 1);
		// Valida abajo - izquieda
		vecinosVivos += estaVivo(i - 1, j - 1);
		// Valida abajo - derecha
		vecinosVivos += estaVivo(i + 1, j - 1);

		switch (board[i][j]) {
		case 1:
			switch (vecinosVivos) {
			case 2:

				return true;
			case 3:
				return true;
			default:
				return false;
			}

		default:

			switch (vecinosVivos) {
			case 3:
				return true;
			default:
				return false;
			}
		}

	}

	public Board ronda() {

		int[][] result = board;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (vivira(i, j)) {
					result[i][j] = 1;
				} else {
					result[i][j] = 0;
				}
			}
		}

		return new Board(result);
	}

	public String toString() {

		String result = "";

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				result += board[i][j];
			}
			result += "\n";
		}

		return result;
	}

}
