package maxCombo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of queries");
		int queries = scan.nextInt();

		int[] answers = numberOfWays(queries);
		
		System.out.println("Possible combinations are : "); 

		for (int ans : answers) {
			 System.out.print(ans+", ");
		}

	}

	private static int[] numberOfWays(int queries) {

		int[] answer = new int[queries];

		List<int[]> problems = new ArrayList<>(queries);

		for (int i = 0; i < queries; i++) {

			int[] object = new int[2];

			for (int j = 0; j < object.length; j++) {
				System.out.println("Enter the dimension");
				int r = scan.nextInt();
				object[j] = r;
			}

			problems.add(object);
		}

		int index = 0;
		for (int[] arr : problems) {

			int first = arr[0];
			int second = arr[1];
			int sum = 0;

			while (first > 0 && second > 0) {
				int combination = first * second;
				first--;
				second--;
				sum += combination;
			}
			answer[index] = sum;
			index++;
		}

		return answer;
	}

}
