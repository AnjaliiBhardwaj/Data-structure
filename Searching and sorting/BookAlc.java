import jaav.util.*;
class BookAlc{
    // Function to check if it is possible to allocate books such that no student
    // reads more than 'mid' pages
    public static boolean isPossible(int arr[], int n, int m, int mid) {
        int student = 1; // Start with the first student
        int pageSum = 0; // Sum of pages assigned to the current student
        
        for (int i = 0; i < n; i++) {
            // If adding arr[i] to pageSum doesn't exceed mid, add it to pageSum
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                // Otherwise, assign the book to the next student
                student++;
                // If the number of students exceeds the limit or a single book has more pages than mid, return false
                if (student > m || arr[i] > mid) {
                    return false;
                }
                // Reinitialize pageSum for the new student
                pageSum = arr[i];
            }
        }
        return true; // If we successfully allocate books within the limit, return true
    }
    
    // Function to find the minimum number of pages that a student has to read
    // The function uses binary search to find this minimum
    public static long findPages(int n, int[] arr, int m) {
        // If there are more students than books, it's impossible to allocate
        if (m > n) {
            return -1; // More students than books, not possible
        }

        int sum = 0; // Total number of pages in all books
        int maxi = 0; // Maximum number of pages in a single book
        
        // Calculate the total sum of pages and find the book with the maximum pages
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxi = Math.max(maxi, arr[i]);
        }
        
        // Initialize the binary search range
        int s = maxi; // Start with the maximum number of pages in a single book
        int e = sum; // End with the total number of pages in all books
        int mid = s + (e - s) / 2; // Calculate the middle of the current range
        
        int ans = -1; // Initialize the answer to -1 (impossible case)
        
        // Perform binary search
        while (s <= e) {
            // Check if it's possible to allocate books with the current mid value
            if (isPossible(arr, n, m, mid)) {
                ans = mid; // If possible, update the answer to the current mid value
                e = mid - 1; // Try for a better (smaller) solution on the left side
            } else {
                s = mid + 1; // Move to the right side to find a feasible solution
            }
            mid = s + (e - s) / 2; // Recalculate the middle of the current range
        }
        
        return ans; // Return the minimum number of pages that a student has to read
    }
}