package exhaustiveSearch.Carpet;

import exhaustiveSearch.Carpet.단체사진찍기;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 단체사진찍기Test {


	@Test
	public void test() {
		assertThat(new 단체사진찍기()
				.solution(2,new String[] {"N~F=0", "R~T>2"}))
				.isEqualTo(3648);

		assertThat(new 단체사진찍기()
				.solution(2,new String[] {"M~C<2", "C~M>1"}))
				.isEqualTo(0);
	}

}