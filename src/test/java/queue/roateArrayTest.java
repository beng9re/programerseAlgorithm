package queue;



import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class roateArrayTest {

	@Test
	public void test() {
		RoateArray roateArray = new RoateArray();
		assertThat(roateArray.solution(new int[]{7, 8, 10}, new int[]{10, 7, 8})).isTrue();
		assertThat(roateArray.solution(new int[]{4,3,2,1}, new int[]{5,4,1,2})).isFalse();
	}

}