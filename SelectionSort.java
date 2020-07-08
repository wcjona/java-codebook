
class SelectionSort{
    //sort left to right by finding minimum value. 
    void selectionSort (int arr[], int left, int right)
    {
        int i, j, temp;
        for (i = left; i < right; i++)
        {
            int min = i;
            for (j = i+1; j <= right; j++)
                if (arr[j] < arr[min]) min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    //sort right to left by finding maximum value. 
    void selectionSort(int arr[]){
        int i, j, temp, max;

        for (i = arr.length-1; i >0; i--)
        {
            max = 0;
            for (j = 0; j <= i; j++)
                if (arr[j] > arr[max]) max = j;
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    
}

