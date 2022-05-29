// Method - 1 : Using Built-in method

public int[] countBits(int n) {
        int res[] = new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            res[i] = Integer.bitCount(i);
        }
        return res;
}

// Method -2 : Without Built in method

public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<n+1;i++){
            if(i%2!=0){
                res[i] = res[i/2]+1;
            }else{
                res[i] = res[i/2];
            }
        }
        return res;
}
