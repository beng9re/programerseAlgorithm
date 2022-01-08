import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class DiskControllerTest {

	@Test
	@DisplayName("[[0, 3], [1, 9], [2, 6]] 입력시 9 반환" )
	public void firstTest() {
		DiskController di =  new DiskController();
		//

		assertThat(di.solution(new int[][]{{0, 3}, {4, 4}, {5, 3}, {4, 1}})).isEqualTo(3);
		assertThat(di.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);
		assertThat(di.solution(new int[][]{{1, 9}, {1, 4}, {1, 5}, {1, 7}, {1, 3}})).isEqualTo(13);
		assertThat(di.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}})).isEqualTo(13);
		assertThat(di.solution(new int[][]{{0, 3}, {0, 1}, {4, 7}})).isEqualTo(4);
		assertThat(di.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}})).isEqualTo(13);
		assertThat(di.solution(new int[][]{{0, 1}, {0, 1}, {1, 0}})).isEqualTo(1);
		assertThat(di.solution(new int[][]{{0, 5}, {1, 2}, {5, 5}})).isEqualTo(6);
		assertThat(di.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}})).isEqualTo(13);
		assertThat(di.solution(new int[][]{{0, 1}, {1, 2}, {500, 6}})).isEqualTo(3);
		assertThat(di.solution(new int[][]{{0, 10}, {4, 10}, {5, 11}, {15, 2}})).isEqualTo(15);
		assertThat(di.solution(new int[][]{{0, 10}})).isEqualTo(10);
		assertThat(di.solution(new int[][]{{1, 10}, {3, 3}, {10, 3}})).isEqualTo(9);
		assertThat(di.solution(new int[][]{{0, 10}, {2, 3}, {9, 3}})).isEqualTo(9);
		assertThat(di.solution(new int[][]{{0, 3}, {4, 3}, {10, 3}})).isEqualTo(3);
		assertThat(di.solution(new int[][]{{0, 10}, {2, 10}, {25, 10}, {25, 2}})).isEqualTo(10);
		assertThat(di.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}, {4, 3}})).isEqualTo(9);
		assertThat(di.solution(new int[][]{{0, 4}, {0, 3}, {0, 2}, {0, 1}})).isEqualTo(5);
		assertThat(di.solution(new int[][]{{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}})).isEqualTo(72);
		assertThat(di.solution(new int[][]{{0, 10}, {4, 10}, {15, 2}, {5, 11}})).isEqualTo(15);
		assertThat(di.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);

	}


}