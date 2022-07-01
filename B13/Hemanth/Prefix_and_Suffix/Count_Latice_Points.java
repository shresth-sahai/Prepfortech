// https://leetcode.com/problems/count-lattice-points-inside-a-circle/

class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<circles.length;i++){
            int r = circles[i][2];
            int x = circles[i][0];
            int y = circles[i][1];
            for(int a=x-r;a<=x+r;a++){
                for(int b=y-r;b<=y+r;b++){
                    if(((x-a)*(x-a)+(y-b)*(y-b))<=r*r){
                        set.add(a*1000+b);
                    }
                }
            }
        }
        return set.size();
        
    }
}
