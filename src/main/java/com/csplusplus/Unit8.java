package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
    	int sum = 0;
    		for (int[] value : array) {
    			for (int v : value) {
    				sum += v;
    			}
    		}
        return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        // TODO: Implement this method
    	int count = 0;
		for (int[] val : array) {
			for (int v : val) {
				if (v == value) {
					count++;
				}
			}
		}
    return count;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        // TODO: Implement this method
    	int max = array[0][0];
		for (int[] val : array) {
			for (int v : val) {
				if (v > max) {
					max = v;
				}
			}
		}
    return max;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
        // TODO: Implement this method
    	int[] temp;
		for (int i = 0; i < array.length/2;i++) {
			temp = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
    	int[][] newArray = new int[array[0].length][array.length];
    	for (int j = 0 ; j< array.length; j++) {
    		for (int i = 0 ; i< array[0].length; i++) {
    			newArray[i][j] = array[j][i];
    		}
    	}
        return newArray;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	int[][] newArray = new int[numRows][numCols];
    	for (int j = 0 ; j< newArray.length; j++) {
    		for (int i = 0 ; i< newArray[0].length; i++) {
    			newArray[j][i] = (int)(Math.random()*(max-min+1)+min);
    		}
    	}
        return newArray;  // Placeholder return value
    }
}