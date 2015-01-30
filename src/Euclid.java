public class Euclid {

	public static int EuclidGCD(int m, int n) {
		if (n == 0)
			return m;
		return EuclidGCD(n, m % n);
	}

	public static void main(String[] args) {
		System.out.println(EuclidGCD(9, 3));

	}

}
