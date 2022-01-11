package exhaustiveSearch.Carpet;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.PackageUtils;

import static org.assertj.core.api.Assertions.*;

class CarpetTest {

	@Test
	public void test() {
		Carpet carpet = new Carpet();
		assertThat(carpet.solution(10,2)).isEqualTo(new int[]{4,3});
		assertThat(carpet.solution(8,1)).isEqualTo(new int[]{3,3});
		assertThat(carpet.solution(24,24)).isEqualTo(new int[]{8,6});
	}



}