class Solution {
    double power(double b, int e) {
        // code here
        if(e == 0) return 1.0;
        if(e<0){
            return 1/power(b,-e);
        }
        
        double call = power(b, e/2);
        
        if(e%2 == 0) return call * call;
        else return b * call * call;
    }
}