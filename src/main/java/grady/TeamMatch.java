package grady;

import java.util.ArrayList;

public class TeamMatch {
	private static class TemaList {
		private int maxValue = -1;
		private ArrayList<Integer> matchTeam = new ArrayList<>();

		public void add(int value) {
			if (maxValue < value) {
				maxValue = value;
			}
			matchTeam.add(value);
		}

		TemaList(int value) {
			this.add(value);
		}

	}


	public int solution(int[] stats) {
		ArrayList<TemaList> teamMate = new ArrayList<>();
		for (int star :stats) {
			boolean putFlag = false;
			if (teamMate.size() != 0) {
				for (TemaList temaList : teamMate) {
					if (temaList.maxValue < star) {
						temaList.add(star);
						putFlag = true;
						break;
					}
				}
				teamMate.sort((o1, o2) -> o1.maxValue - o2.maxValue);
			}
			if(!putFlag) {
				teamMate.add(new TemaList(star));
			}
		}

		return teamMate.size();
	}

}
