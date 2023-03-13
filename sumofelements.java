package GSLC1;

import java.util.Scanner;

public class sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input number of array and expected value");
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] list = new int[n];
		
		System.out.println("input array element");
		
		for(int i = 0; i<n;i++) {
			if (input.hasNextInt()) {
				list[i] = input.nextInt();
			}
		}
		
		int a = 0;
		int flag = 0;
		n--;
		
		while(a<n) {
			if(list[a] + list[n] == k) {
				flag = 1;
				System.out.println("index array: " + a + " and " + n);
				break;
			}
			else if(list[a] + list[n] < k) {
				a++;
			}
			else {
				n--;
			}
		}
		if(flag == 0) {
			System.out.println("no solution");
		}
		input.close();
	}
}
