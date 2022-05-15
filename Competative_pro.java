import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 class Competative_pro {
	
	

	static int n = 1000001;
	static List<Integer> primes = new ArrayList();	

	public static void main(String[] args) {

		FastReader f = new FastReader();

	
		
//		sieve();
		
		int t = f.nextInt();
		
		while(t-->0) {
			
			int n = f.nextInt();
			int x = f.nextInt();
			int y = f.nextInt();
			
			
			
		}
		
		
		
	}
	
	public static void segmentedSieve(long l, long r) {
		
		if(l == 1) {
			l++;
		}
		
		int size = (int) (r - l + 1);
		int ans[] = new int[size];
		for(long p : primes) {
			if(p*p <= r) {
				
				int i = (int) ((l/r)*r);
				if(i < l) {
					i += p;
				}
				
				for( ; i <= r ; i+=p) {
					if(i != p) {
						ans[(int) (i - l)]  = 1;
					}
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(ans[i] == 0) {
				System.out.println(l + i);
			}
		}
		
		
	}
	
	
	
	
	public static void sieve() {
		
		int arr[] = new int[n + 1];
		arr[1] = 1;
		
		for(int i = 2 ; i <= n; i++) {
			if(arr[i] == 0) {
				
				for(int j = i * 2  ; j < n ; j+=i) {
					arr[j] = 1;
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++){
			if(arr[i] == 0) {
				primes.add(i);
			}
		}
		
	}
	

	
	
	
	
	
	
	
	static int isPrime[] = new int[1000001];
	static int primePrime[] = new int[1000001];
	static int MOD = 1000000007;

	static long fact[] = new long[1000001];


	
	
//	public static int setBitNumber(int n)
//    {
// 
//        // Below steps set bits after
//        // MSB (including MSB)
// 
//        // Suppose n is 273 (binary
//        // is 100010001). It does following
//        // 100010001 | 010001000 = 110011001
//        n |= n >> 1;
// 
//        // This makes sure 4 bits
//        // (From MSB and including MSB)
//        // are set. It does following
//        // 110011001 | 001100110 = 111111111
//        n |= n >> 2;
// 
//        n |= n >> 4;
//        n |= n >> 8;
//        n |= n >> 16;
// 
//        // Increment n by 1 so that
//        // there is only one set bit
//        // which is just before original
//        // MSB. n now becomes 1000000000
//        n = n + 1;
// 
//        // Return original MSB after shifting.
//        // n now becomes 100000000
//        return n;
//    }
	
	  static int setBitNumber(int n)
	    {
	 
	        // To find the position of the
	        // most significant set bit
	        int k = (int)(Math.log(n) / Math.log(2));
	 
	        // To return the the value of the number
	        // with set bit at k-th position
	        return k;
	    }
	
	
	
	
	
	
	
	static int INT_SIZE = 32;
	 
    public static int Right_most_setbit(long num)
    {
        int pos = 1;
        // counting the position of first set bit
        for (int i = 0; i < INT_SIZE; i++) {
            if ((num & (1 << i))== 0)
                pos++;
             
            else
                break;
        }
        return pos;
    }
	
	
	
	
	
	
	

	static int nn = 1000000;
	static int phi[] = new int[nn + 1];

	public static void ETFUsingSieve() {

		for (int i = 1; i <= nn; i++)
			phi[i] = i;

		for (int i = 2; i <= nn; i++) {
			if (phi[i] == i) {
				for (int j = i; j <= nn; j += i) {
					phi[j] /= i;
					phi[j] *= (i - 1);
				}
			}
		}
	}

	// Eular Totient Function
	// TC : O(√N)
	public static long ETFUsingPrimeFact(int n) {

		long res = n;
		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0) {
				res /= i;
				res *= (i - 1);
				while (n % i == 0) {
					n /= i;
				}
			}
		}

		if (n > 1) {
			res /= n;
			res *= (n - 1);
		}

		return res;
	}

	public static void makeFact(int n) {

		// default n = 10^6
		fact[0] = 1;
		fact[1] = 1;

		for (int i = 2; i <= n; i++) {
			fact[i] = (fact[i - 1] * i) % MOD;
		}

	}

	public static int C(int n, int k) {

		if (k > n) {
			return 0;
		}

		long res = fact[n];

		res = (res * (power(fact[k], MOD - 2))) % MOD;

		res = (res * (power(fact[n - k], MOD - 2))) % MOD;

		return (int) res;

	}

	public static long power(long a, int n) {
		long res = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				res = (res * a) % MOD;
				n--;
			} else {
				a = (int) ((a * a) % MOD);
				n /= 2;
			}
		}

		return res;
	}

	public static boolean isPrime(long number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				// number is perfectly divisible - no prime
				return false;
			}
		}
		return true;
	}

	public static long gcdExtended(long a, long b, long x, long y) {
		// Base Case
		if (a == 0) {
			x = 0;
			y = 1;
			return b;
		}

		long x1 = 1, y1 = 1; // To store results of recursive call
		long gcd = gcdExtended(b % a, a, x1, y1);

		// Update x and y using results of recursive
		// call
		x = y1 - (b / a) * x1;
		y = x1;

		return gcd;
	}

	// BINARY EXPONENTATION
	public static long power(long a, long n, long d) {

		long res = 1;

		while (n > 0) {
			if (n % 2 == 1) {
				res = ((res % d) * (a % d)) % d;
				n--;
			} else {
				a = ((a % d) * (a % d)) % d;
				n /= 2;
			}
		}

		return res;
	}

	public static boolean allZero(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0')
				return false;
		}

		return true;
	}

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}

	public static void mul(long a[][], long b[][], int n) {

		long res[][] = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				res[i][j] = 0;
				for (int k = 1; k <= n; k++) {
					long x = (a[i][k] * b[k][j]) % MOD;
					res[i][j] = (res[i][j] + x) % MOD;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] = res[i][j];
			}
		}

	}

	// MATRIX EXPONENTATION
	// TC : O(M^3 * LOG(N))
	public static void powerMat(long a[][], long m, long n) {

		long I[][] = new long[50][50];

		for (int i = 0; i < m; i++) {
			I[i][i] = 1;
		}

		// Below two statements perform , I = I * a;
// 			for(int i = 0 ; i < n ; i++)
// 				mul(I, a, m); 

		// Below method is binary exponentiation for matrix to get a^n. Which is better
		// than the above method

		while (n > 0) {
			if (n % 2 == 1) {
				mulMat(I, a, m);
				n--;

			} else {
				mulMat(a, a, m);
				n /= 2;
			}
		}

		printMat(I, m);

	}

	public static void mulMat(long a[][], long b[][], long m) {

		long res[][] = new long[(int) (m + 1)][(int) (m + 1)];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				res[i][j] = 0;
				for (int k = 0; k < m; k++) {
					res[i][j] += ((a[i][k] * b[k][j]) % 1000000007);
					res[i][j] = res[i][j] % 1000000007;
				}
			}
		}

		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = res[i][j];

	}

	public static void printMat(long a[][], long m) {

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < m; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

	// PRIME FACTORIZATION USING SIEVE.
	// TC : O(logN)
	public static void primeFact(int n) {

		int a[] = new int[n + 1];
		// Fill all elements of array with -1.
		Arrays.fill(a, -1);

		// Start from i = 2 and goes till n, if a[i] = -1 then
		// Start from j = i and goes till n and if a[j] = -1 (means this is prime) ,So
		// fill a[j] = i.
		for (int i = 2; i <= n; i++) {
			if (a[i] == -1) {
				for (int j = i; j <= n; j += i) {
					if (a[j] == -1) {
						a[j] = i;
					}
				}
			}
		}

		// Now print prime factor of all numbers from 2 to n.
		for (int i = 2; i <= n; i++) {

			int idx = i;
			System.out.print(i + " = ");
			while (a[idx] != -1) {
				if (a[idx / a[idx]] != -1)
					System.out.print(a[idx] + "*");
				else
					System.out.print(a[idx]);
				idx = idx / a[idx];
			}
			System.out.println();

		}

	}

	// SIEVE
	// TC : O(NLOG(LOGN)))
	public static void Sieve() {

		int n = 1000000;
		Arrays.fill(isPrime, 1);

		isPrime[0] = 0;
		isPrime[1] = 0;

		// Start from i = 2 and goes till sqrt(n).
		for (int i = 2; i * i <= n; i++) {

			// If isPrime[i] == 1, means i is prime
			// Then start from i^2 goes till n and put all j as 0. jump j from j to j+i.
			if (isPrime[i] == 1) {

				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = 0;
				}
			}
		}

		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (isPrime[i] == 1) {
				count++;
			}

			if (isPrime[count] == 1) {
				primePrime[i] = 1;
			} else {
				primePrime[i] = 0;
			}
		}

		for (int i = 1; i <= n; i++) {
			primePrime[i] += primePrime[i - 1];
		}

	}

	public static boolean isValid(long a, long b) {

		long n2 = (a + b) / 2;
		long n1 = (a - b) / 2;

		if (n1 >= 0 && n2 >= 0 && n2 >= n1) {
			return true;
		}
		return false;
	}

	public static void aliceAndCondies(long n) {

		long count = 0;

		for (int i = 1; i * i <= n; i++) {

			if (n % i == 0) {

				long a = i, b = n / i;

				if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
					if (isValid(a, b)) {
						count++;
					}
					if (i * i != n && isValid(b, a)) {
						count++;
					}
				}

			}
		}

		System.out.println(count);

	}

	// BINARY EXPONENTATION
	// Binary Exponentiation - a^n
	// O(logN)
	public static long binaryExponentation(long a, long n) {

		long res = 1;

		while (n > 0) {
			if (n % 2 == 1) {
				n--;
				res = (res * a) % MOD;
			} else {
				n /= 2;
				a = (a * a) % MOD;
			}
		}

//			System.out.println(res%10);
		return res % MOD;
	}

	public static boolean isPlaindrome(String s) {
		int n = s.length();
		int i = 0, j = n - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	public static long sum(long n) {

		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;

	}
	
	
	
	
	
	
	
	
	
	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
	
	
	
	
	

}