//191.Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
//we can use either the bit manipulations or the normal counting method using string.(Integer.toBinarystring().

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        String st= Integer.toBinaryString(n);
        for(int i=0;i<st.length();i++){
                    if(st.charAt(i)=='1'){
                        count+=1;
                    }
            }
        return count;
        }
}
