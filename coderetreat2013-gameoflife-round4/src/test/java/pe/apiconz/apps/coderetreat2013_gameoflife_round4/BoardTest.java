package pe.apiconz.apps.coderetreat2013_gameoflife_round4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BoardTest {

	@Test
	public void validateWidthBoard4x4() {
		Board board = new Board(4, 4);
		assertEquals(4, board.getWidth());
	}

	@Test
	public void validateHeightBoard4x4() {
		Board board = new Board(4, 4);
		assertEquals(4, board.getHeight());
	}

	@Test
	public void validateIfCellIsAlive() {
		Board board = new Board(4, 4);
		assertTrue(board.isAlive(0, 0));
	}

	@Test
	public void countNeighborsEqualsToThree() {
		Board board = new Board(3, 3);
		int result = board.getNeighbors(0, 0);
		assertEquals(3, result);
	}

	@Test
	public void validateIfCellWillBeAliveNextGeneration() {
		Board board = new Board(4, 4);
		assertTrue(board.willBeAlive(0, 0));
	}


	@Test
	public void validateIfCellWillNotBeAliveNextGeneration() {
		Board board = new Board(4, 4);
		assertFalse(board.willBeAlive(1, 1));
	}
	
	
	public static void main(String[] args) {
		Board boardFinal = new Board(10, 10);
		boardFinal.round(4);
	}
}
