package heap;

import static org.assertj.core.api.Assertions.*;

import heap.MoreHot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoreHotTest {


	@Test
	@DisplayName("[1, 2, 3, 9, 10, 12] 에  K7 대해서 2를 반환한다")
	public void firstTest() {
		MoreHot moreHot = new MoreHot();

		assertThat(moreHot.solution(new int[]{1, 2, 3, 9, 10, 12},7)).isEqualTo(2);
		assertThat(moreHot.solution(new int[]{1,2},3)).isEqualTo(1);
		assertThat(moreHot.solution(new int[]{0, 0, 5, 5, 5},2)).isEqualTo(2);



	}

}
