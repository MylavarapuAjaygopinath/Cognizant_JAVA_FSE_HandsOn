package Cognizant_JAVA_FSE_HandsOn.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class EcommerceSearch {
    // Linear Search
    public static int linearSearch(String[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(String[] products, String target) {
        Arrays.sort(products, String.CASE_INSENSITIVE_ORDER);

        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].compareToIgnoreCase(target);

            if (compare == 0) return mid;
            else if (compare < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Backpack","Desk Chair","Laptop","Notebook","Running Shoes","Shampoo","Smartphone","Table Lamp","Water Bottle","Wireless Mouse"};

        System.out.print("Enter product name to search: ");
        String target = scanner.nextLine();

        // Linear Search
        long startLinear = System.nanoTime();
        int indexLinear = linearSearch(products, target);
        long endLinear = System.nanoTime();

        if (indexLinear != -1)
            System.out.println("Linear Search → Found at index " + indexLinear);
        else
            System.out.println("Linear Search → Not found.");
        System.out.println("Time taken: " + (endLinear - startLinear) + " ns\n");

        // Binary Search
        long startBinary = System.nanoTime();
        int indexBinary = binarySearch(products, target);
        long endBinary = System.nanoTime();

        if (indexBinary != -1)
            System.out.println("Binary Search → Found in sorted array at index " + indexBinary);
        else
            System.out.println("Binary Search → Not found.");
        System.out.println("Time taken: " + (endBinary - startBinary) + " ns");

        scanner.close();
    }
}
