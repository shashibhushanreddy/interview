package interviewprograms;

public class Minimum_number_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 22, 3, 5 }, { 2, 4, 7 }, { 10, 21, 9 } };
		int min = a[0][0];
		int p=0;
		int q=0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i][j] < min) {

					min = a[i][j];
					p=i;
					q=j;

				}

			}

		}
		System.out.println(min);
		System.out.println(p);
		System.out.println(q);

	}

}
