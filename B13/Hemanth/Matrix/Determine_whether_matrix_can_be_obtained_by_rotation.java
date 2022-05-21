class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean[] c = {true,true,true,true};
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]) c[0] = false;
                if(mat[i][j]!=target[n-j-1][i]) c[1] = false;   // check for 90 degrees
                if(mat[i][j]!=target[n-i-1][n-j-1]) c[2]= false;  //check for 180 degrees
                if(mat[i][j]!=target[j][n-i-1]) c[3]=false; // check for 270 degrees
            }
        }
        return c[0] || c[1] || c[2] || c[3];
    }
}
