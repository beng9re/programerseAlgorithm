package dfs_and_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 카카오프렌즈컬러링북Test {

	@Test
	public void test() {

		int [][] input = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0},{1, 0, 0, 1}, {0, 0, 0, 1},{0, 0, 0, 3},{0, 0, 0, 3}};
		int [][] input2 = new int[][]{{0, 1, 0}, {1, 1, 0}, {0, 0, 0}};



		assertThat(
				new 카카오프렌즈컬러링북().solution(6,4,input)
		).isEqualTo(new int[]{4,5});

		assertThat(
				new 카카오프렌즈컬러링북().solution(3,3,input2)
		).isEqualTo(new int[]{1,3});




	}

}