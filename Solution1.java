//TC: Height of the tree
class Solution {
    public double myPow(double x, int n) {
        //base case
        if(n==0) return 1.0;

        //logic

        double result= myPow(x,n/2); //half the power to get rreult
        //chk for odd and even powers now
        if(n%2==0)
        {
            return result*result;
        }
        else //no is odd
        if(n<0) //pwer is negative
            return result*result*(1/x);
        else
            return result * result * x;

    }
}