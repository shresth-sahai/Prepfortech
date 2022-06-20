// https://leetcode.com/problems/calculate-amount-paid-in-taxes/

class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double res=0;
        int prev=0;
        for(int[] bracket:brackets){
            int upper = bracket[0], percent=bracket[1];
            if(income >= upper){
                res+= (upper-prev)*percent/100d;
                prev = upper;
            }else{
                res+= (income-prev)*percent/100d;
                return res;
            }
        }
        return res;
    }
}
