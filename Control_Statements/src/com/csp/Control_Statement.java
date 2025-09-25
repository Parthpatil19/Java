package com.csp;

public class Control_Statement {

	// Write a program to accept a number and find it is even or odd.

	public void evenodd(int a) {

		String result = (a % 2 == 0) ? "even" : "odd";
		System.out.println(a + " -> " + result);

	}

	// Write a program to accept a number and find it Zero, Positive or Negative.

	public void Zero_Positive_Negative(int a) {

		String result = (a == 0) ? "zero" : (a > 0 ? "positive" : "negative");
		System.out.println("num is " + result);

	}

	// Write a program to accept two number and find smallest no.

	public void smallest_num(int a, int b) {

		int result = (a < b) ? a : b;
		System.out.println(result + " is smallest");
	}

	// Write a program to accept three number and find largest no.

	public void largest_three(int a, int b, int c) {

		int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		System.out.println(result + " is largest");

	}

	// Write a program to accept three number , store in an array and find largest no.

	public void largest_five(int a, int b, int c, int d, int e) {

		int arr[] = { a, b, c, d, e };

		int largest = (arr[0] > arr[1]) ? arr[0] : arr[1];
		largest = (largest > arr[3]) ? largest : arr[3];
		largest = (largest > arr[4]) ? largest : arr[4];
		largest = (largest > arr[5]) ? largest : arr[5];
		System.out.println(largest + " is the largest");

	}

	// Write a program to accept a year check whether it is Leap Year or not.

	public void leapyear(int a) {

		if (a % 4 == 0 || a % 400 == 0 || a % 100 != 0) {
			System.out.println(a + " is a leap year");
		} else {
			System.out.println(a + " is not a leap year");
		}

	}

	// Write a program to accept a day of week(int) and display the weekday (e.g -day=4→ Thursday) (use switch case)

	public void week_day(int a) {

		switch (a) {
		case 0:
			System.out.println("0 -> Sunday");
			break;
		case 1:
			System.out.println("1 -> Monday");
			break;
		case 2:
			System.out.println("2 -> Tuesday");
			break;
		case 3:
			System.out.println("3 -> Wednesday");
			break;
		case 4:
			System.out.println("4 -> Thrusday");
			break;
		case 5:
			System.out.println("5 -> Friday");
			break;
		case 6:
			System.out.println("6 -> Saturday");
			break;
		default:
			System.out.println("number out of week day");

		}

	}

	// Write a program to accept a character and check whether it is a vowel or consonant.

	public void vowel_consonant(char c) {

		String result = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
		System.out.println(c + " -> " + result);
	}

	// Write a Java program to count the number of vowels in a string.

	public void numofvowels(String originalstr) {
		String str = originalstr.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}

		}
		System.out.println(originalstr + " contains " + count + " Vowels.");

	}

	// Write a Java program to count the number of consonants in a string.

	public void numofconsonants(String originalstr) {
		String str = originalstr.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				count++;
			}

		}
		System.out.println(originalstr + " contains " + count + " Consonants.");

	}

	// Write a Java program to calculate the square root of a number.

	public void squareroot(int num) {

		// double result = Math.pow(num,(1.0/2.0));
		double result = Math.sqrt(num);

		System.out.println("Square root of " + num + " -> " + result);

	}
	// Write a Java program to calculate the cube root of a number.

	public void cuberoot(int num) {

		// double result = Math.pow(num, (1.0/3.0));
		double result = Math.cbrt(num);
		System.out.println("Cube root of " + num + " -> " + result);

	}
	// Write a Java program to calculate simple interest.

	public void simple_interest(double Principal, double Rate_of_interest, double Time) {

		double Simple_interest = (Principal * Rate_of_interest * Time) / 100;
		System.out.println("Obtained Simple Interest -> " + Simple_interest);

	}

	// Write a Java program to calculate compound interest.
	public void compound_interest(double P, double R, double T) {

		double CI = P * Math.pow((1 + R / 100), T) - P;
		System.out.println("Obtained Compound Interest -> " + CI);

	}

	// Write a Java program to convert kilometers into meters, centimeters, and millimeters.

	public void km_m_cm_mm(int value) {

		int m = value * 1000;
		int cm = value * 1000 * 100;
		int mm = value * 1000 * 1000;

		System.out.println(value + "km in m -> " + m + ", in cm -> " + cm + ", in mm -> " + mm);

	}

	// Write a Java program to convert days into years, weeks, and months.

	public void days_year_months_weeks(int days) {

		int year = days / 365;
		int daysremainafteryear = days % 365;

		int months = daysremainafteryear / 30;
		int daysremainaftermonths = daysremainafteryear % 30;

		int weeks = daysremainaftermonths / 7;
		int remainingdays = daysremainaftermonths % 7;

		System.out.println(year + " years");
		System.out.println(months + " months");
		System.out.println(weeks + " weeks");
		System.out.println(remainingdays + " days");

	}

	// Write a Java program to convert hours into minutes and seconds.

	public void hr_min_sec(int hr) {

		int min = hr * 60;
		int sec = hr * 60 * 60;
		System.out.println(hr + "hours in minutes -> " + min + ", in seconds -> " + sec);

	}

	public static void main(String[] args) {

		Control_Statement c = new Control_Statement();

		// c.evenodd(5);
		// c.Zero_Positive_Negative(-1);
		// c.scargest_three(1,2,3);
		// c.largest_five(4,9,1,4,6);
		// c.week_day(1);
		// c.vowel_consonant('a');
		// c.numofvowels("Parth");
		// c.numofconsonants("Parth");
		// c.squareroot(4);
		// c.cuberoot(8);
		// c.simple_interest(2000.0, 2.5, 3);
		// c.compound_interest(5000.0, 2, 3);
		// c.km_m_cm_mm(5);
		// c.days_year_months_weeks(500);
		// c.hr_min_sec(1);

	}

}
