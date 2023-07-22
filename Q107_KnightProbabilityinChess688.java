// link to the question --> https://leetcode.com/problems/knight-probability-in-chessboard/description/

class Solution {
    double dp[][][];
    int dx[]={2,-2,1,-1,-1,-2,1,2};
    int dy[]={1,1,2,2,-2,-1,-2,-1};
    public double knightProbability(int n, int k, int r, int c) {
         dp=new double[n][n][k+1];
        return solve(r,c,n,k);
    }
    double solve(int r,int c,int n,int k){
        if(r>=n || r<0 ||c>=n ||c<0)return 0;
        if(k==0)return 1;// no more moves left and it is still inside board so return 1
        if(dp[r][c][k]!=0)return dp[r][c][k];
        double rate=0;
        for(int i=0;i<8;i++){
            int x=dx[i]+r;
            int y=dy[i]+c;
            rate+=0.125*solve(x,y,n,k-1);//basicallly we are dividing it by 8(1/8=0.125) because there are 8 possible moves for each position
        }
        return dp[r][c][k]=rate;

    }
}