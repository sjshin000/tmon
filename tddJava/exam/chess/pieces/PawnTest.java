package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {
	final static String firstPawnColor = "WHITE";
	final static String secondPawnColor = "BLACK";
	
	@Test
	public void test() {
		Pawn firstPawn = new Pawn(firstPawnColor);
		assertEquals("WHITE", firstPawn.getColor());
		
		
		Pawn secondPawn = new Pawn(secondPawnColor);
		assertEquals("BLACK", secondPawn.getColor());
	}

}
