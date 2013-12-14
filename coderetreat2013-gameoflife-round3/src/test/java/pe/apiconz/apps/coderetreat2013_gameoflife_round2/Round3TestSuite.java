package pe.apiconz.apps.coderetreat2013_gameoflife_round2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Round3TestSuite {

	@Test
	public void estableciendoTablero4x4() {
		Board board = new Board(4, 4);
		assertEquals(16, board.size());
	}

	@Test
	public void verificarPosicion1x1() {
		Board board = new Board(4, 4);
		assertEquals(1, board.estaVivo(1, 1));
	}

	@Test
	public void noVivira1x1() {
		Board board = new Board(4, 4);
		assertFalse(board.vivira(1, 1));
	}

	@Test
	public void vivira0x0() {
		Board board = new Board(4, 4);
		assertTrue(board.vivira(0, 0));
	}

	@Test
	public void viveVecinoArribaIzquierda() {
		Board board = new Board(4, 4);
		assertEquals(1, board.estaVivo(1, 1));
	}

	public static void main(String[] args) {
		Board tablero = new Board(3, 3);
		tablero.toString();
	}
}
