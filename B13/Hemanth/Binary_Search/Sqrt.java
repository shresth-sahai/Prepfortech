public int mySqrt(int x) {
        int l=1,h=x;
        int ans=1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid < x/mid){   
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return h;
    }

//TC : O(logn)
//SC : O(1)
