import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		 int arr[] ={3,60,35,2,45,320,5};  
         
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         BubbleSort.bubbleSort(arr); 
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         } 
		
         System.out.println();
         System.out.println("*****************************");
		
		int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        InsertionSort.insertionSort(arr1);  
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }
        
        
        
        System.out.println();
        System.out.println("*****************************");
        int[] array = { 6, 5, 12, 10, 9, 1 };

        MergeSort ob = new MergeSort();

        ob.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }

}
