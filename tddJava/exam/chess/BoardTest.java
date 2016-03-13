package chess;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chess.Board;
import chess.pieces.Pawn;

public class BoardTest {

	@Test
	public void test() {
		Pawn pawn1 = new Pawn("WHITE");
		Pawn pawn2 = new Pawn("BLACK");
		Pawn pawn3 = new Pawn("BLACK");
		Board board = new Board();
		ArrayList<Pawn> pawns = new ArrayList<Pawn>();
		
		
		board.enroll(pawn1);
		//pawn�� ������ Ȯ���Ѵ�.
		assertEquals(1, board.getNumberOfPawn());
		board.enroll(pawn2);
		//pawn�� ������ Ȯ���Ѵ�.
		assertEquals(2, board.getNumberOfPawn());
		//pawn�� ������ Ȯ���Ѵ�.
		
		board.enroll(pawn3);
		assertEquals(3, board.getNumberOfPawn());
		assertEquals("BLACK", pawn3.getColor());
		

	}

}
