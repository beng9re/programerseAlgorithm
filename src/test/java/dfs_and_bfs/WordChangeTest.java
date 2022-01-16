package dfs_and_bfs;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordChangeTest {





	@Test
	public void Test() {
		WordChange wordChange = new WordChange();
		String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"};
		String[] words2 = {"hot", "dot", "dog", "lot", "log"};



		assertThat(
			wordChange.solution("hit","cog",words1)
		).isEqualTo(4);

		assertThat(wordChange.solution("hit","cog",words2))
			.isEqualTo(0);
	}
}