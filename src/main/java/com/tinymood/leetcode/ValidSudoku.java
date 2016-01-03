package com.tinymood.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem36 数独
 */
public class ValidSudoku {
	
	private boolean isPartialValid(int x1, int y1, int x2, int y2, char[][] board) {
		Set<Character> sc = new HashSet<>();
		for (int i=x1; i<=x2; i++) {
			for (int j=y1; j<=y2; j++) {
				if (board[i][j]!='.') {
					if (!sc.add(board[i][j]))
						return false;
				}
			}
		}
		return true;
	}

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (!isPartialValid(i, 0, i, 8, board)) return false;
			if (!isPartialValid(0, i, 8, i, board)) return false;
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (!isPartialValid(3*i, 3*j, 3*i+2, 3*j+2, board))
					return false;
			}
		}
		
		return true;
	}
}
