public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + args[0] + ":");
        boolean[] isPrime = isPrime(n);
        int count = countPrint(isPrime);
        double percent = ((double) count / n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + args[0] + " (" + (int)percent + "% are primes)");


        // Replace this statement with your code
    }

    public static boolean[] isPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < (n + 1); i++ ) {
            isPrime[i] = true;
        }

        int i = 2;
        while (i * i < n + 1) {
            if (isPrime[i]) {
                int j = i + i;
                while (j < n + 1) {
                    isPrime[j] = false;
                j += i;
                }
            } 
            i++;
        }
        return isPrime;
    }

    public static int countPrint(boolean[] primes) {
        int count = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println(i);
                count++;
            }
        }
        return count;
}

}