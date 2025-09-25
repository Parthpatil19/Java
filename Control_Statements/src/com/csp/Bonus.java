package com.csp;

//Calculator to Add. 

public class Bonus {

	public int add(int... num)// (varargs)
	{
		int sum = 0;
		for (int i : num) {

			sum = sum + i;

		}
		return sum;

	}

	public static void main(String[] args) {

		Bonus b = new Bonus();

		int res = b.add(2, 2, 2);

		System.out.println(res);

	}

}
