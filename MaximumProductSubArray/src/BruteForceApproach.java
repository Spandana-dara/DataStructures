/**
 * This class represents brute force approach to find Maximum Product SubArray.
 * The time complexity of the given solution is O(n^2).
 */
public class BruteForceApproach {

  /**
   * Main method to execute the program.
   * @param args command-line arguments.
   */
  public static void main(String[] args){
    int[] arr ={2,3,-2,4};
    int max = Integer.MIN_VALUE;
    int n=arr.length;
    int i,j;
    int product;
    //This loop generates all subarrays from the given array and finds
    // the product of each subarray.
    // It also calculates max product.
    for(i=0;i<n;i++){
      product =1;
      for(j=i;j<n;j++){
        product = product*arr[j];
        if(product>max){
          max=product;
        }
      }
    }
    //Prints the max product of the subarray.
    System.out.println("Maximum product of sub array is : " + max);
  }

}
