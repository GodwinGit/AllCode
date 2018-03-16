public class Example2DArray {

	public static void main(String[] args) {

		int[][] TwoDim = new int[4][3];

		// TwoDim[2][1] = 10 (This assigns 10 to i = 2 & J = 1
		int temp = 10;
		// A loop within a loop (Nested For Loop) to populate 2D array.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {

				TwoDim[i][j] = temp;
				temp += 10;
			}
		}
			//Print out whole matrix
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(TwoDim[i][j] + " ");

				}
				System.out.println();

			}
		}

	}

/* TO add values myself 3x5:

int myGreatArray[][]=({23, 45, 22, 44, 70},
                      {34, 23, 26, 65, 87},
                      {54, 43, 15, 88, 99});
            for (int rows = 0; rows < 3; rows++) {
            System.out.println();
			for (int columns = columns; columns < 5; j++) {
			System.out.print(TwoDim[rows][columns] + " ");

*/