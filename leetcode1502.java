//A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
//Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {   
        Arrays.sort(arr);
        boolean check=true;
        int d=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=d){
                check=false;
                break;
            }
        }
        return check;
    }
        
    
}
