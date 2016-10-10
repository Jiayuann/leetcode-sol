import java.util.*;
public class CourseSchedule{
	public boolean courseSchedule(int courses,int [][]prerequisites){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(prerequisites[0][0],prerequisites[0][1]);
		for(int i=1;i<prerequisites.length;i++){
			if(!map.containsKey(prerequisites[i][1])){
				map.put(prerequisites[i][0],prerequisites[i][1]);
			}else{
				return false;
			}
		}
		if(map.size()==courses-1)
			return true;
		else
			return false;
	}
	public static void main(String []args){
			int [][]prerequisite={{0,1},{1,0}};
			System.out.println(new CourseSchedule().courseSchedule(2,prerequisite));
	}
}
/* There are a total of n courses you have to take, labeled from 0 to n - 1.
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, 
 * which is expressed as a pair: [0,1]
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * For example:
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
 * 2, [[1,0],[0,1]]
 * 4 0,2 2,3 3,0
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * Note:
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
 */
