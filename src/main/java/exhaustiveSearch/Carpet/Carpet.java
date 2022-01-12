package exhaustiveSearch.Carpet;

import java.util.ArrayList;
import java.util.List;

public class Carpet {

	public int[] solution(int brown, int yellow) {
		int[] answer = {};
		int totalTile = brown + yellow;
		for (int y = 1; y < brown + 1 ; y++) {
			if (totalTile % y == 0) {
				int x = totalTile / y;
				int positionBlown = x * 2 + ((y - 2) * 2);
				int positionYellow = totalTile - positionBlown;
				if (positionBlown == brown && positionYellow == yellow) {
					return new int[]{x,y};
				}
			}
		}

		return answer;


	}
}
