public class Loops50 {
	public static void main(String[] args) {

		// 1
		for (int i = 1; i <= 5; i++)
			System.out.println(i);

		// 2
		for (int i = 5; i >= 1; i--)
			System.out.println(i);

		// 3
		for (int i = 1; i <= 15; i++)
			System.out.println(i);

		// 4
		for (int i = 10; i <= 20; i++)
			System.out.println(i);

		// 5
		for (int i = 2; i <= 20; i += 2)
			System.out.println(i);

		// 6
		for (int i = 1; i <= 19; i += 2)
			System.out.println(i);

		// 7
		for (int i = 20; i <= 30; i++)
			System.out.println(i);

		// 8
		for (int i = 50; i <= 60; i++)
			System.out.println(i);

		// 9
		for (int i = 100; i <= 110; i++)
			System.out.println(i);

		// 10
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// 11
		for (i = 1; i <= 5; i++)
			System.out.println("Atharv");

		// 12
		for (i = 1; i <= 10; i++)
			System.out.println("Java");

		// 13
		for (i = 1; i <= 7; i++)
			System.out.println("Hello World");

		// 14
		for (i = 1; i <= 8; i++)
			System.out.println("Welcome");

		// 15
		for (i = 1; i <= 6; i++)
			System.out.println("Loop");

		// 16
		for (i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + (2 * i));

		// 17
		for (i = 1; i <= 10; i++)
			System.out.println("3 x " + i + " = " + (3 * i));

		// 18
		for (i = 1; i <= 10; i++)
			System.out.println("4 x " + i + " = " + (4 * i));

		// 19
		for (i = 1; i <= 10; i++)
			System.out.println("6 x " + i + " = " + (6 * i));

		// 20
		for (i = 1; i <= 10; i++)
			System.out.println("7 x " + i + " = " + (7 * i));

		// 21
		for (i = 1; i <= 5; i++)
			System.out.print("*");
		System.out.println();

		// 22
		i = 1;
		while (i <= 5) {
			System.out.println("*");
			i++;
		}

		// 23
		for (i = 1; i <= 3; i++)
			System.out.println("**");

		// 24
		for (i = 1; i <= 5; i++)
			System.out.print(i);
		System.out.println();

		// 25
		for (char c = 'A'; c <= 'E'; c++)
			System.out.print(c);
		System.out.println();

		// 26
		for (i = 1; i <= 50; i++)
			System.out.println(i);

		// 27
		for (i = 50; i >= 1; i--)
			System.out.println(i);

		// 28
		for (i = 2; i <= 20; i += 2)
			System.out.println(i);

		// 29
		for (i = 5; i <= 50; i += 5)
			System.out.println(i);

		// 30
		for (i = 10; i <= 100; i += 10)
			System.out.println(i);

		// 31
		for (i = 1; i <= 5; i++)
			System.out.println(i * i);

		// 32
		for (i = 1; i <= 5; i++)
			System.out.println(i * i * i);

		// 33
		int sum = 0;
		for (i = 1; i <= 5; i++)
			sum += i;
		System.out.println(sum);

		// 34
		sum = 0;
		for (i = 1; i <= 20; i++)
			sum += i;
		System.out.println(sum);

		// 35
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		// 36
		for (char c = 'A'; c <= 'E'; c++)
			System.out.println(c);

		// 37
		for (char c = 'F'; c <= 'J'; c++)
			System.out.println(c);

		// 38
		for (char c = 'a'; c <= 'e'; c++)
			System.out.println(c);

		// 39
		for (i = 0; i <= 9; i++)
			System.out.println(i);

		// 40
		char[] v = { 'A', 'E', 'I', 'O', 'U' };
		for (char c : v)
			System.out.println(c);

		// 41
		for (i = 1; i <= 5; i++)
			System.out.println(i);

		// 42
		for (i = 5; i >= 1; i--)
			System.out.println(i);

		// 43
		for (i = 1; i <= 5; i++)
			System.out.print(i + " ");
		System.out.println();

		// 44
		for (i = 10; i <= 50; i += 10)
			System.out.print(i + " ");
		System.out.println();

		// 45
		for (i = 2; i <= 20; i += 2)
			System.out.print(i + " ");
		System.out.println();

		// 46
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// 47
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		// 48
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

		// 49
		i = 1;
		do {
			System.out.println("Atharv");
			i++;
		} while (i <= 3);

		// 50
		System.out.println("For Loop:");
		for (i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("While Loop:");
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		System.out.println("Do While Loop:");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
	}
}