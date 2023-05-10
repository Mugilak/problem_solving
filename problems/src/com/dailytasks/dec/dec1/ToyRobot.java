package com.dailytasks.dec.dec1;

import java.util.Scanner;

public class ToyRobot {
	private int[][] board;
	private int[] obstacles;
	private int[] robotPosition;

	private boolean isInObstacles(int val) {
		for (int x : obstacles) {
			if (x == val) {
				return true;
			}
		}
		return false;
	}

	private void setBoard(int row, int column) {
		board = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i % 2 == 0) {
					board[i][j] = (i * column) + (j + 1);
				} else {
					board[i][j] = (i * column) + (column - j);
				}
			}
		}
	}

	private void setObstacles(int[] obstacles) {
		this.obstacles = obstacles;
	}

	private void setRobotOnBoard(int val) {
		robotPosition = new int[2];
		robotPosition[0] = (val - 1) / board[0].length;
		if (robotPosition[0] % 2 == 0) {
			robotPosition[1] = (val - 1) % board[0].length;
		} else {
			robotPosition[1] = (board[0].length - 1) - ((val - 1) % board[0].length);
		}
	}
	private int move(int steps) {
		int[] startPosition = { robotPosition[0], robotPosition[1] };
		for (int i = steps; i > 0; i--) {
			if (robotPosition[0] % 2 == 0) {
				// even row
				if (board[0].length - 1 == robotPosition[1]) {
					// last position
					if (board.length - 1 == robotPosition[0]
							|| isInObstacles(board[robotPosition[0] + 1][robotPosition[1]])) {
						// down blocked
						if (robotPosition[0] == 0) {
							// first row
							robotPosition[0] = startPosition[0];
							robotPosition[1] = startPosition[1];
						} else {
							if (isInObstacles(board[robotPosition[0] - 1][robotPosition[1]])) {
								// up blocked
								robotPosition[0] = startPosition[0];
								robotPosition[1] = startPosition[1];
							} else {
								// go up
								robotPosition[0] = robotPosition[0] - 1;
							}
						}
					} else {
						robotPosition[0] = robotPosition[0] + 1;
					}
				} else {
					// not last position
					if (isInObstacles(board[robotPosition[0]][robotPosition[1] + 1])) {
						// front blocked
						if (robotPosition[0] == board.length - 1
								|| isInObstacles(board[robotPosition[0] + 1][robotPosition[1]])) {
							// down blocked
							if (robotPosition[0] == 0) {
								// first row
								robotPosition[0] = startPosition[0];
								robotPosition[1] = startPosition[1];
							} else {
								if (isInObstacles(board[robotPosition[0] - 1][robotPosition[1]])) {
									// up blocked
									robotPosition[0] = startPosition[0];
									robotPosition[1] = startPosition[1];
								} else {
									// move up
									robotPosition[0] = robotPosition[0] - 1;
								}
							}
						} else {
							// move down
							robotPosition[0] = robotPosition[0] + 1;
						}
					} else {
						// move forward
						robotPosition[1] = robotPosition[1] + 1;
					}
				}
			} else {
				// odd row
				if (robotPosition[1] == 0 || isInObstacles(board[robotPosition[0]][robotPosition[1] - 1])) {
					// last step in the row or blocked
					if (robotPosition[0] == board.length - 1
							|| isInObstacles(board[robotPosition[0] + 1][robotPosition[1]])) {
						// last row or down blocked
						if (robotPosition[0] == 0 || isInObstacles(board[robotPosition[0] - 1][robotPosition[1]])) {
							// up blocked or first row
							robotPosition[0] = startPosition[0];
							robotPosition[1] = startPosition[1];
						} else {
							robotPosition[0] = robotPosition[0] - 1;
						}
					} else {
						// go down
						robotPosition[0] = robotPosition[0] + 1;
					}
				} else {
					// go backwards
					robotPosition[1] = robotPosition[1] - 1;
				}
			}
		}
		return board[robotPosition[0]][robotPosition[1]];
	}

	private void printBoard() {
		int space = (" " + (board.length * board[0].length)).length();
		System.out.println(space);
		for (int[] row : board) {
			for (int val : row) {
				if (isInObstacles(val)) {
					System.out.printf("%" + space + "s ", ("*" + val));
				} else {
					System.out.printf("%" + space + "s ", ("" + val));
				}
			}
			System.out.println();
		}
	}

	private void displayOptions() {
		System.out.println("1. Play");
		System.out.println("2. Exit");
	}

	private void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size");
		int rowSize = scanner.nextInt();
		System.out.println("Enter column size");
		int columnSize = scanner.nextInt();
		setBoard(rowSize, columnSize);
		System.out.println("Enter the number of bostacles");
		int noOfObstacles = scanner.nextInt();
		int[] temp = new int[noOfObstacles];
		for (int i = 0; i < noOfObstacles; i++) {
			System.out.printf("Enter obstacle %d", i + 1);
			temp[i] = scanner.nextInt();
		}
		setObstacles(temp);

		int selectedOption = 0;
		do {
			printBoard();
			displayOptions();
			try {
				selectedOption = scanner.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("Enter a number");
				selectedOption = 0;
			}
			if (selectedOption == 1) {
				System.out.print("Current position : ");
				int position = scanner.nextInt();
				setRobotOnBoard(position);
				System.out.print("steps : ");
				int steps = scanner.nextInt();
				System.out.println(move(steps));
			}
			if (!(selectedOption > 0 && selectedOption < 3)) {
				System.out.println("worng input");
			}
		} while (selectedOption != 2);

		scanner.close();
	}

	public static void main(String[] args) {
		ToyRobot ob = new ToyRobot();
		ob.getInput();
	}

}
