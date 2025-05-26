public class Even_Odd {

    // Print array method
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int n = 8;
        // array with N size
        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };

        int evenSize = 0;
        int oddSize = 0;
        int primeSize = 0;
        
        // First loop to calculate sizes of even, odd, and prime arrays
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
            if (isPrime(array[i]))
                primeSize++;
        }
        
        // odd, even, and prime arrays with calculated sizes
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        int[] prime = new int[primeSize];
        
        // iterators for each array
        int j = 0, k = 0, p = 0;
        
        // second loop to populate even, odd, and prime arrays
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
            if (isPrime(array[i]))
                prime[p++] = array[i];
        }
        
        // print arrays
        System.out.print("Even Array contains: ");
        printArray(even);
        
        System.out.print("Odd Array contains: ");
        printArray(odd);
        
        System.out.print("Prime Array contains: ");
        printArray(prime);
        
        // print prime count
        System.out.println("Total prime numbers: " + primeSize);
    }
}
