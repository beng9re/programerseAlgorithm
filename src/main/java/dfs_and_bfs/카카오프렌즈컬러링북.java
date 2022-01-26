package dfs_and_bfs;

import java.util.ArrayDeque;
import java.util.Queue;




public class 카카오프렌즈컬러링북 {
	public static class Point{
		int x;
		int y;

		public Point(int pointX, int pointy) {
			this.x = pointX;
			this.y = pointy;
		}

	}

	int MAX_X;
	int MAX_Y;
	boolean visit[][];

	public int[] solution(int m, int n, int[][] picture) {
		MAX_X = m;
		MAX_Y = n;
		visit = new boolean[m][n];
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;


		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n ; y++) {
				if (picture[x][y] != 0 && visit[x][y] == false) {
					maxSizeOfOneArea = Math.max(maxSizeOfOneArea,bfs(x,y,picture));
					numberOfArea++;
				}

			}
		}

		return new int[]{numberOfArea,maxSizeOfOneArea};
	}

	public int bfs(int x, int y, int[][] picture) {
		int range = 1;
		int[] xp = {-1,0,1,0};
		int[] yp = {0,1,0,-1};

		// 색칠할 대상을 기준으로 탐색해준다.
		Queue<Point> queue = new ArrayDeque<>();
		visit[x][y] = true;
		queue.offer(new Point(x,y));
		while (queue.size() != 0) {
			Point point = queue.poll();
			for (int i = 0; i < 4; i++) {
				int pointX = point.x + xp[i];
				int pointy = point.y + yp[i];
				if (pointy < MAX_Y && pointX < MAX_X
						&& pointX >= 0
						&& pointy >= 0
						&& picture[pointX][pointy] == picture[point.x][point.y]
						&& visit[pointX][pointy] == false) {

					visit[pointX][pointy] = true;
					queue.offer(new Point(pointX,pointy));
					range++;
				}
			}

		}

		return range;
	}
}
