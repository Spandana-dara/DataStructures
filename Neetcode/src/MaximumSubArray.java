public class MaximumSubArray {

  public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    BruteForce bruteForce = new BruteForce();
    Kadanes kadanes = new Kadanes();
    int bruteMax = bruteForce.maxSubArray(arr);
    int kadanesMax = kadanes.maxSubArray(arr);
    System.out.println(bruteMax);
    System.out.println(kadanesMax);
  }

  public static class BruteForce {
    public int maxSubArray(int[] arr){
      int n = arr.length;
      int max = Integer.MIN_VALUE;
      int s = 0;
      for (int i = 0; i < n; i++) {
        s = 0;
        for (int j = i; j < n; j++) {
          s = s + arr[j];
          if (s > max) {
            max = s;
          }
        }
      }
      return max;
    }
  }

  public static class Kadanes {
    public int maxSubArray(int[] arr) {
      int s=arr[0], max = s;
      for(int i=1;i<arr.length;i++){
        s = arr[i] > s + arr[i] ? arr[i] : s+arr[i];
        if(s>max){
          max=s;
        }
      }
      return max;
    }
  }
}
