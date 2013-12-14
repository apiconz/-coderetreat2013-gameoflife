package pe.apiconz.apps.coderetreat2013_gameoflife_round4;

public class Board {

	int[][] board;

	public Board(int i, int j) {
		board = new int[i][j];
		populateBoard();
	}

	private void populateBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 1;
			}
		}
	}

	public Object getWidth() {

		return board.length;
	}

	public Object getHeight() {
		return board[0].length;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				result += board[i][j];
			}
			result += "\r";
		}
		return result;
	}

	public boolean isAlive(int i, int j) {
		if ((i > -1 && i < board.length) && (j > -1 && j < board[0].length)) {
			switch (board[i][j]) {
			case 1:
				return true;
			default:
				return false;
			}
		}
		return false;
	}

	public boolean willBeAlive(int x, int y) {

		int neighbors = 0;

		neighbors = getNeighbors(x, y);

		if (isAlive(x, y)) {
			if (neighbors == 2 || neighbors == 3) {
				return true;
			}
		} else {
			if (neighbors == 3) {
				return true;
			}
		}

		return false;
	}

	protected int getNeighbors(int x, int y) {
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (i != x || j != y) {
					if (isAlive(i, j)) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public void round(int numberRounds) {
		System.out.println("Numero de Rondas" + numberRounds);
		System.out.println(this.toString());

		for (int z = 0; z < numberRounds; z++) {
			System.out.println("Ronda " + (z+1));

			int auxiliaryBoard[][] = new int[board.length][board[0].length];

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (willBeAlive(i, j)) {
						auxiliaryBoard[i][j] = 1;
					} else {
						auxiliaryBoard[i][j] = 0;
					}
				}
			}

			board = auxiliaryBoard;

			System.out.println(this.toString());
		}

	}

}
