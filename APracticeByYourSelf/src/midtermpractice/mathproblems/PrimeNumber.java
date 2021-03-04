package mathproblems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		List<Integer> primesList = new ArrayList<>();

		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				primesList.add(i);
			}
		}

		for (int prime: primesList) {
			System.out.print(prime + " ");
		}

		ConnectToSqlDB.insertDataFromArrayListToSqlTableIntegers(primesList, "primes", "primes");
		ConnectToSqlDB.readDataBase("primes", "primes");

	}

	public static boolean isPrime(int num){
		if ( num > 2 && num%2 == 0 ) {
			return false;
		}
		int top = (int)Math.sqrt(num) + 1;
		for(int i = 3; i < top; i+=2){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}

