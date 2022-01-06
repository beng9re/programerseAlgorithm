import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;



class DiskControllerTest {

	@Test
	@DisplayName("[[0, 3], [1, 9], [2, 6]] 입력시 9 반환" )
	public void firstTest() {
		DiskController di =  new DiskController();
		int [][] input = {{0, 3}, {1, 9}, {2, 6}};
		int v =  di.solution(input);

		assertThat(v).isEqualTo(9);

	}


}