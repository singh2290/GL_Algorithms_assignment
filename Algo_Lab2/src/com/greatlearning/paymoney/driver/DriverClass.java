//author: Prateek Singh
//Assignment: Lab2: Algorithms-DSA
//to determine target and transaction in which it takes to complete

package com.greatlearning.paymoney.driver;

import java.util.Scanner; 

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of transaction array");
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		System.out.println("enter values of array");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();

		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int tot_no_target = sc.nextInt();

		targetStatus(arraySize, arr, tot_no_target, sc);

		sc.close();
	}

	public static void targetStatus(int arraySize, int[] arr, int tot_no_target, Scanner sc) {
		boolean Flag = false;
		int i;
		for (int j = 0; j < tot_no_target; j++) {
			System.out.println("enter value of the target" + (j + 1));
			int target = sc.nextInt();
			int Sum = 0;

			for (i = 0; i < arraySize; i++) {
				Sum = Sum + arr[i];
				if (Sum >= target) {
					Flag = true;
					break;
				}

			}
			if (Flag == true) {
				System.out.println("target" + (j + 1) + " acheived after " + (i + 1) + " transactions \n\n");
			} else {
				System.out.print("given target is not achieved");
			}

		}
	}
}