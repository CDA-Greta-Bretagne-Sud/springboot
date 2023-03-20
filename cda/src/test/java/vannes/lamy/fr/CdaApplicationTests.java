package vannes.lamy.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vannes.lamy.fr.service.BusinessService;

@SpringBootTest
class CdaApplicationTests {
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}
	@Test
	public void testGetCoucou() {

		String expected = "Coucou les cdas!";

		String result = bs.getCoucou().getValue();

		assertEquals(expected, result);
	}

}
