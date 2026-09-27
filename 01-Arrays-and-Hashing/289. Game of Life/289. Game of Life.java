1class Solution {
2    public void gameOfLife(int[][] board) {
3        int[][] newBoard=new int[board.length][board[0].length];
4        for(int i=0;i<board.length;i++){
5            for(int j=0;j<board[0].length;j++){
6                int count1=countNeighbor1(board,i,j);
7                if(board[i][j]==1){
8                    if(count1<2 || count1>3) newBoard[i][j]=0;
9                    else newBoard[i][j]=1;
10                }
11                else{
12                    if(count1==3) newBoard[i][j]=1;
13                    else newBoard[i][j]=0;
14                }
15            }
16        }
17        for(int i=0;i<board.length;i++){
18            for(int j=0;j<board[0].length;j++){
19                board[i][j]=newBoard[i][j];
20            }
21        }
22        
23    }
24    private int countNeighbor1(int[][] board,int i,int j){
25        int count1=0;
26        for(int pi=-1;pi<=1;pi++){
27            for(int pj=-1;pj<=1;pj++){
28                if(pi==0 && pj==0) continue;
29                int ai=pi+i;
30                int aj=pj+j;
31                if(ai>=0 && ai<board.length && aj>=0 && aj<board[0].length && board[ai][aj]==1){
32                    count1++;
33                }
34            }
35        }
36        return count1;
37    }
38}