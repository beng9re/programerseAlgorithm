package dfs_and_bfs;



import java.util.*;

public class TripAddress {


	ArrayList<String> paths = new ArrayList<>();
	boolean[] visit;

	public String[] solution(String[][] tickets) {

		visit = new boolean[tickets.length];
		dfs(tickets,"ICN","ICN",0);
		Collections.sort(paths);
		return paths.get(0).split(" ");
	}

	public void dfs(String[][] tickets,String start,String path,int count){
		if(tickets.length == count){
			paths.add(path);
			return;
		}
		for(int i = 0; i< tickets.length;i++){
			if(!visit[i] && tickets[i][0].equals(start)){
				//백트레킹
				visit[i] = true;
				dfs(tickets,tickets[i][1],path + " " + tickets[i][1],count+1);
				visit[i] = false;
			}
		}
	}
}
