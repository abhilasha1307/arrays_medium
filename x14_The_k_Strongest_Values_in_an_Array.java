package ARRAYS_medium;

//see heap and priority heap solution 
//also other complexitites
import java.util.Arrays;

/*
============================================
PROBLEM:) 1471
============================================

Given an array of integers arr and an integer k.

A value arr[i] is said to be stronger than a value arr[j] if |arr[i] - m| > |arr[j] - m| where m is the median of the array.
If |arr[i] - m| == |arr[j] - m|, then arr[i] is said to be stronger than arr[j] if arr[i] > arr[j].

Return a list of the strongest k values in the array. return the answer in any arbitrary order.

Median is the middle value in an ordered integer list. More formally, if the length of the list is n, the median is the element in position ((n - 1) / 2) in the sorted list (0-indexed).

For arr = [6, -3, 7, 2, 11], n = 5 and the median is obtained by sorting the array arr = [-3, 2, 6, 7, 11] and the median is arr[m] where m = ((5 - 1) / 2) = 2. The median is 6.
For arr = [-7, 22, 17, 3], n = 4 and the median is obtained by sorting the array arr = [-7, 3, 17, 22] and the median is arr[m] where m = ((4 - 1) / 2) = 1. The median is 3.

1 <= arr.length <= 10^5
-10^5 <= arr[i] <= 10^5
1 <= k <= arr.length
*/

/*
=============================================
APPROACH:)
=============================================

Time : O(n*logn)  //try O(n*logk) or O(n)
Space : O(k) 
*/
public class x14_The_k_Strongest_Values_in_an_Array {

 public static int[] getStrongest(int[] arr, int k) {

  Arrays.sort(arr);
  int n = arr.length;
  int m = arr[(n - 1) / 2];

  int i = 0;
  int j = n - 1;
  int p = 0;
  int[] res = new int[k];

  while (p < k) {
   if (m - arr[i] > arr[j] - m) {
    res[p++] = arr[i++];
   }

   else {
    res[p++] = arr[j--];
   }
  }

  return res;

 }

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 3, 4, 5 };
  int k = 2;

  int[] result = getStrongest(arr, k);

  for (int n : result) {
   System.out.print(n + " ");
  }
  System.out.println();
 }

}
