/**
 * This class represents best approach to find Maximum Product SubArray.
 * The time complexity of the given solution is O(n).
 */
public class BestApproach {

  /**
   * Main method to execute the program.
   * @param args command-line arguments.
   */
  public static void main(String args[]){
    int[] arr= {-2,0,-1};
    int preProduct=1;
    int suffProduct=1;
    int n=arr.length;
    int max= Integer.MIN_VALUE;
    // This loop calculate product of numbers in the array from front and back.
    // It also keeps the record of max product.
    // If any product becomes zero, that product is updated to 1.
    for(int i=0;i<n;i++){
      if(preProduct==0){
        preProduct=1;
      }
      if(suffProduct==0){
        suffProduct=1;
      }
       preProduct = preProduct* arr[i];
       suffProduct = suffProduct*arr[n-i-1];

       max= Math.max(max, Math.max(preProduct,suffProduct));
    }
    //Prints the max product of the subarray.
    System.out.println("Maximum product of sub array is : " + max);
  }
}
