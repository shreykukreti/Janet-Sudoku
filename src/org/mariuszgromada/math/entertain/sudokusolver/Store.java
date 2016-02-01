/*
 * @(#)Store.java        0.0.1    2016-02-01
 *
 * You may use this software under the condition of "Simplified BSD License"
 *
 * Copyright 2016 MARIUSZ GROMADA. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY <MARIUSZ GROMADA> ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of MARIUSZ GROMADA.
 *
 * If you have any questions/bugs feel free to contact:
 *
 *     Mariusz Gromada
 *     mariusz.gromada@mathspace.pl
 *     http://mathspace.pl/
 *     http://mathparser.org/
 *     http://github.com/mariuszgromada/java-utils
 *     http://github.com/mariuszgromada/MathParser.org-mXparser
 *     http://mariuszgromada.github.io/MathParser.org-mXparser/
 *     http://mxparser.sourceforge.net/
 *     http://bitbucket.org/mariuszgromada/mxparser/
 *     http://mxparser.codeplex.com/
 *
 *                              Asked if he believes in one God, a mathematician answered:
 *                              "Yes, up to isomorphism."
 */
package org.mariuszgromada.math.entertain.sudokusolver;

/**
 * Storehouse for various things used in library, i.e. sudoku board examples.
 *
 * @author         <b>Mariusz Gromada</b><br/>
 *                 <a href="mailto:mariusz.gromada@mathspace.pl">mariusz.gromada@mathspace.pl</a><br>
 *                 <a href="http://mathspace.pl/" target="_blank">MathSpace.pl</a><br>
 *                 <a href="http://mathparser.org/" target="_blank">MathParser.org - mXparser project page</a><br>
 *                 <a href="http://github.com/mariuszgromada/java-utils" target="_blank">Java-Utils on GitHub</a><br>
 *                 <a href="http://github.com/mariuszgromada/MathParser.org-mXparser" target="_blank">mXparser on GitHub</a><br>
 *                 <a href="http://mariuszgromada.github.io/MathParser.org-mXparser/" target="_blank">mXparser on GitHub pages</a><br>
 *                 <a href="http://mxparser.sourceforge.net/" target="_blank">mXparser on SourceForge</a><br>
 *                 <a href="http://bitbucket.org/mariuszgromada/mxparser/" target="_blank">mXparser on Bitbucket</a><br>
 *                 <a href="http://mxparser.codeplex.com/" target="_blank">mXparser on CodePlex</a><br>
 *
 * @version        0.0.1
 */
public final class Store {
	/**
	 * Sudoku example - number 1.
	 */
	public static final int[][] SUDOKU_EXAMPLE_1 = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},

            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},

            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
		};
	/**
	 * Sudoku example - number 2.
	 */
	public static final int[][] SUDOKU_EXAMPLE_2 = {
            {0,0,9, 1,0,8, 0,4,0},
            {0,4,0, 6,0,5, 7,0,8},
            {0,0,0, 0,0,0, 0,1,0},

            {8,0,0, 3,0,0, 0,7,0},
            {1,0,5, 7,0,2, 4,0,9},
            {0,9,0, 0,0,1, 0,0,2},

            {0,6,0, 0,0,0, 0,0,0},
            {9,0,3, 8,0,4, 0,2,0},
            {0,5,0, 2,0,6, 1,0,0},
		};
	/**
	 * Sudoku example - number 3.
	 */
	public static final int[][] SUDOKU_EXAMPLE_3 = {
            {3,0,0, 0,2,9, 0,0,5},
            {5,9,2, 0,3,8, 1,0,0},
            {0,7,8, 0,6,5, 3,9,2},

            {0,0,0, 9,0,0, 0,0,0},
            {0,0,1, 8,0,3, 9,0,0},
            {0,0,9, 0,0,4, 0,0,0},

            {8,0,0, 5,9,0, 4,2,3},
            {0,0,3, 0,8,0, 5,7,9},
            {9,0,0, 3,4,0, 0,0,1},
		};
	public static final int NUMBER_OF_SUDOKU_EXAMPLES = 3;

}
/**
 * Digit random seed data type
 */
class DigitRandomSeed {
	int digit;
	double randomSeed;
}
/**
 * Package level class describing empty field
 */
class EmptyField {
	/**
	 * Empty field row number
	 */
	int rowIdx;
	/**
	 * Empty field column number
	 */
	int colIdx;
	/**
	 * List of digits than still can be used.
	 */
	int[] digitsStillFree;
	/**
	 * Random seed for randomized accessing digits still free
	 */
	DigitRandomSeed[] digitsRandomSeed;
	/**
	 * Number of digits than still can be used.
	 */
	int digitsStillFreeNumber;
	/**
	 * Default constructor.
	 */
	/**
	 * Random seed for randomized accessing empty fields
	 */
	double randomSeed;
	/**
	 * Default constructor;
	 */
	public EmptyField() {
		rowIdx = SudokuBoard.NULL_INDEX;
		colIdx = SudokuBoard.NULL_INDEX;
		digitsStillFree = new int[SudokuBoard.BOARD_MAX_INDEX];
		digitsRandomSeed = new DigitRandomSeed[SudokuBoard.BOARD_MAX_INDEX];
		for (int i = 0; i < SudokuBoard.BOARD_MAX_INDEX; i++) {
			digitsRandomSeed[i] = new DigitRandomSeed();
			digitsRandomSeed[i].digit = i;
			digitsRandomSeed[i].randomSeed = Math.random();
		}
		sortDigitsRandomSeed(1, SudokuBoard.BOARD_SIZE);
		randomSeed = Math.random();
		setAllDigitsStillFree();
	}
	/**
	 * Sorting digits  by random seed
	 *
	 * @param l    Starting left index
	 * @param r    Starting rgth index
	 */
	private void sortDigitsRandomSeed(int l, int r) {
		int i = l;
		int j = r;
		DigitRandomSeed x;
		DigitRandomSeed w;
		x = digitsRandomSeed[(l+r)/2];
		do {
			while (digitsRandomSeed[i].randomSeed < x.randomSeed)
				i++;
			while (digitsRandomSeed[j].randomSeed > x.randomSeed)
					j--;
			if (i<=j)
			{
				w = digitsRandomSeed[i];
				digitsRandomSeed[i] = digitsRandomSeed[j];
				digitsRandomSeed[j] = w;
				i++;
				j--;
			}
		} while (i <= j);
		if (l < j)
			sortDigitsRandomSeed(l,j);
		if (i < r)
			sortDigitsRandomSeed(i,r);
	}
	/**
	 * All digits are set that can be used in the specified filed
	 * of the board
	 */
	public void setAllDigitsStillFree() {
		for (int i = 0; i < SudokuBoard.BOARD_MAX_INDEX; i++) {
			digitsStillFree[i] = SudokuBoard.DIGIT_STILL_FREE;
		}
		digitsStillFreeNumber = 0;
	}
}
/**
 * Data type for sub-square definition
 * on the Sudoku board
 */
class SubSquare {
	/**
	 * Left top - row index
	 */
	int rowMin;
	/**
	 * Right bottom - row index
	 */
	int rowMax;
	/**
	 * Left top - column index
	 */
	int colMin;
	/**
	 * Right bottom - column index
	 */
	int colMax;
}
