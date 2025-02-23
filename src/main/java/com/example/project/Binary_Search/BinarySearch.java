package com.example.project.Binary_Search;

public class BinarySearch {
    // Implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if not found.
    public static int binarySearch(int[] elements, int target) {
        int leftIdx = 0;  // Initialize left index to the start of the array
        int rightIdx = elements.length - 1;  // Initialize right index to the end of the array

        while (leftIdx <= rightIdx) {  // Continue while left index is <= right index
            int middleIdx = leftIdx + (rightIdx - leftIdx) / 2;  // Find middle index

            if (elements[middleIdx] == target) {  // If target is found, return index
                return middleIdx;
            } else if (elements[middleIdx] < target) {  // If target is greater, search right half
                leftIdx = middleIdx + 1;
            } else {  // If target is smaller, search left half
                rightIdx = middleIdx - 1;
            }
        }
        return -1; // Return -1 if target is not found
    }
}

