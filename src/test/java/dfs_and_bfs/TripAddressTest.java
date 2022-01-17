package dfs_and_bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TripAddressTest {

	@Test
	public void test() {
		TripAddress tripAddress  = new TripAddress();



		assertThat(tripAddress.solution(new String[][]
				{{"ICN", "BOO"}, {"ICN", "COO"}, {"COO", "DOO"}, {"DOO", "COO"}, {"BOO", "DOO"}, {"DOO", "BOO"}, {"BOO", "ICN"}, {"COO", "BOO"}}
		)).isEqualTo(new String[]
				{"ICN", "BOO", "DOO", "BOO", "ICN", "COO", "DOO", "COO", "BOO"}
		);

		assertThat(tripAddress.solution(new String[][]
				{{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}
		)).isEqualTo(new String[]
				{"ICN", "AAA", "ICN", "AAA", "ICN", "AAA"}
		);



		assertThat(tripAddress.solution(new String[][]
				{{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}
		)).isEqualTo(new String[]
				{"ICN", "AAA", "ICN", "AAA", "ICN", "AAA"}
		);




	}


}