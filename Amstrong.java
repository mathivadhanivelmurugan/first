package hello;

public class Amstrong {
	public static void main(String[] args) {
		String mail = "mathivadhani21023@gmail.*&%$#@!com";
		char[] a = mail.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'z') {
				continue;
			} else if (a[i] >= '0' && a[i] <= '9') {
				System.out.print(a[i] + "\n");
			} else {
				System.out.print(a[i]);
			}
		}

		System.out.println();
// Amstro
// Number...............................................................................................

//  1  5  3
//  1 +125+ 27 = 153

//153 % 10 --> 3*3*3 num = 27+125+1 =153
//15 % 10 --> 5*5*5 
//153 / 10 --> 153 /10 --> n =15
//15 /10 --> 1 --> n=1
		int n = 153;
		int original = n;
		int temp;
		int num = 0;
		while (n > 0) {
			int r = n % 10;
			temp = r * r * r;
			num = num + temp;
			n = n / 10;
		}
		if (num == original) {
			System.out.println("is Amstro");
		} else {
			System.out.println("not amstro");
		}

//Number......................................................................................................

	}
}
