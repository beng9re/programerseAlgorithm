package dfs_and_bfs;

public class NandM {

	private int[] num;
	private boolean[] visit;
	private int roof;
	private int number;

	public void solution (int n, int m) {
		visit = new boolean[n]; // 결정 트리가 됨
		num = new int[m];
		roof = m;
		number = n;

		dfs(0);
	}

	private void dfs(int idx) {
		if (idx == roof) {
			for (int su :num) {
				System.out.print(su);

			}
			System.out.println();
			return;
		}

		for (int i = 0; i < number; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				num[idx] = i+1;
				dfs(idx+1);
				visit[i] = false;

			}
		}
	}

	public static void main(String[] args) {
		new NandM().solution(4,4);

	}
}
