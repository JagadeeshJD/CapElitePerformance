//1523.Given two non-negative integers low and high.Return the count of odd numbers between low and high (inclusive).

//Solution
class Solution {
    public int countOdds(int low, int high) {
        int n=high-low+1;
        if(n%2==0){
            return n/2;
        }
        else if(low%2!=0 || high%2!=0){
            return (n/2)+1;
        }
        else{
            return (n-1)/2;
        }

    }
}
