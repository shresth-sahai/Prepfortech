// Using Bit Manipulation

public boolean isPowerOfTwo(int n) {
        if(n>0 && (n & (n-1))==0){
            return true;
        }else{
            return false;
        }
    }
