public class BombEnemy{
	public int maxKilledEnemies(char [][]grid){
		if(grid==null)return 0;
		int row=grid.length;
		int column=grid[0].length;
		int res=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(grid[i][j]==0)
					res=res>findMax(i,j,grid)?res:findMax(i,j,grid);
			}
		}
		return res;
	}
	
	public int findMax(int m, int n, char [][]grid){
		int num=0;
		for(int i=m;i<grid.length&&grid[i][n]!='Y';i++){
			if(grid[i][n]=='X')num++;
			
		}  
		for(int i=m;i>=0&&grid[i][n]!='Y';i--){
			if(grid[i][n]=='X')num++;
		} 
		for(int j=n;j<grid[0].length&&grid[m][j]!='Y';j++){
			if(grid[m][j]=='X')num++;
			
		}
		for(int j=n;j>=0&&grid[m][j]!='Y';j--){
			if(grid[m][j]=='X')num++;
		}
		return num;
	}

	public static void main(String []args){
		char[][]grid={
			{0,'X',0,0},
			{'Y',0,'Y','X'},
			{0,'X',0,0}
		};
		BombEnemy b=new BombEnemy();
		System.out.println(b.maxKilledEnemies(grid));
	}
}
/* We have a 2D grid. Each cell is either a wall, an enemy or empty.
 * For example (0-empty, X-enemy, Y-wall):

0 X 0 0
X 0 Y X
0 X 0 0
You have one bomb and you want to kill as many as possible enemies with it. The bomb will kill all the enemies in the same row and column from the planted point until it hits the wall since the wall is too strong to be destroyed.
Given such a grid, return the maximum enemies you can kill with one bomb.
Note that you can only put the bomb at empty cell.
In the example, if you put a bomb at (1,1) you will kill 3 enemies which is the best you can get. You can not kill the guy behind the wall at (1,3).
*/