//author: Prateek Singh
//Assignment: Lab2: Algorithms-DSA
//determine minimum notes for making payment

package com.greatlearning.currencycount.driver;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort sort = new MergeSort();

		System.out.println("Enter size of currency denomination");
		int currencySize = sc.nextInt();
		System.out.println("Enter currency denomination values");
		int currency[] = new int[currencySize];

		for (int i = 0; i < currencySize; i++) {
			currency[i] = sc.nextInt();
		}
		sort.mergeSort(currency, 0, currency.length - 1);
		System.out.println("enter amount you need to pay");
		int amount = sc.nextInt();

		currencyDistribution(currencySize, currency, amount);

		sc.close();

	}

	public static void currencyDistribution(int currencySize, int[] currency, int amount) {
		HashMap<Integer, Integer> distribution = new HashMap<>();
		for (int i = 0; i < currencySize; i++) {
			if (amount != 0) {
				int value = amount / currency[i];
				if (value != 0) {
					distribution.put(currency[i], value);
				}
				amount = amount % currency[i];
			}
		}

		System.out.println("Payment approach to give minimum notes is");
		distribution.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
