/**
 * 
 */
package recursive;

public class Maze {
	private char[][] grid;
	int iStart, jStart;
	int iExit, jExit;
	int step;

	public Maze(char[][] g, int i, int j) {
		grid = g;
		iStart = i;
		jStart = j;
		step = 0;
	}

	public void display() {
		for (char[] row : grid) {
			for (char space : row)
				System.out.print(space + " ");
			System.out.println();
		}
	}

	public boolean findExit() {
		return findExit(iStart, jStart);
	}

	private boolean findExit(int i, int j) {
		if ((i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) || grid[i][j] == '*')
			return false;
		grid[i][j] = '.';
		step++;
		display();
		if (isExit(i, j)) {
			iExit = i;
			jExit = j;
			return true;
		}
		if (grid[i+1][j] == ' ' && findExit(i + 1, j))
			return true;
		else if (grid[i-1][j] == ' ' && findExit(i - 1, j))
			return true;
		else if (grid[i][j+1] == ' ' && findExit(i, j + 1))
			return true;
		else if (grid[i][j-1] == ' ' && findExit(i, j - 1))
			return true;
		return false;

	}

	private boolean isExit(int i, int j) {
		if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1)
			return true;
		return false;
	}

	public int getIExit() {
		return iExit;
	}

	public int getJExit() {
		return jExit;
	}

	public int getSteps() {
		return step;
	}

}
