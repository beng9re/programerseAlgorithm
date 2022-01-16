package dfs_and_bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class WordChange {
	class Word{
		int move;
		String word;
		public Word(int move, String word) {
			this.move = move;
			this.word = word;
		}
	}


	public int solution(String begin, String target, String[] words) {
		Queue<Word> jobQue = new ArrayDeque<>();
		boolean[] visit = new boolean[words.length];

		jobQue.add(new Word(0, begin));

		while (!jobQue.isEmpty()) {
			Word wordInfo = jobQue.poll();
			if (wordInfo.word.equals(target)) {
				return wordInfo.move;
			}

			for (int i = 0; i < words.length; i++) {
				if (changeAbleWord(wordInfo.word,words[i]) && !visit[i]) {
					visit[i] = true;
					jobQue.add(new Word(wordInfo.move+1, words[i]));
				}
			}
		}

		return 0;
	}

	private boolean changeAbleWord(String source,String target) {
		int matchCount = 0;
		for (int i = 0; i < source.length(); i++) {
			String sourceOne = source.substring(i,i+1);
			if (sourceOne.equals(target.substring(i,i+1))) {
				matchCount++;
			}
		}
		return matchCount == source.length() - 1;
	}

}


