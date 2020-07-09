import java.util.Comparator;

class QuickSort {
    //InPlace meaning new arrays do not need to be created
    //leftmost index = a, rightmost index = b
    static <K> void quickSortInPlace(K[ ] S, Comparator<K> comp,int a, int b) {
        if (a >= b) return; // subarray is trivially sorted
        int left = a, right = b-1;
        K pivot = S[b];
        K temp; // temp object used for swapping
        while (left <= right) {
            // scan until reaching value equal or larger than pivot (or right marker)
            while (left <= right && comp.compare(S[left], pivot) < 0) //while S[left] < pivot is true.
                left++;
            // scan until reaching value equal or smaller than pivot (or left marker)
            while (left <= right && comp.compare(S[right], pivot) > 0) //while S[right] > pivot is true.
                right--;
            if (left <= right) { // indices did not strictly cross
                // so swap values and shrink range
                temp = S[left]; 
                S[left] = S[right]; 
                S[right] = temp;
                left++; 
                right--;
            }
        }
        // put pivot into its final place (currently marked by left index)
        temp = S[left]; 
        S[left] = S[b]; 
        S[b] = temp;
        
        // make recursive calls
        quickSortInPlace(S, comp, a, left-1);
        quickSortInPlace(S, comp, left + 1, b);
    }
    
}