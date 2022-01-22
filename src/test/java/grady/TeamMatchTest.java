package grady;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeamMatchTest {
	@Test
 	public void test() {
		TeamMatch teamMatch = new TeamMatch();
		assertEquals(teamMatch.solution(new int[]{5,3,4,6,2,1}),4);
		assertEquals(teamMatch.solution(new int[]{6,2,3,4,1,5}),3);
	}

}