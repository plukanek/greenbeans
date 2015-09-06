package greensopinion.finance.services.web;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WebResponseTest {
	@Test
	public void create() {
		WebResponse webResponse = new WebResponse(3, "123");
		assertEquals(3, webResponse.getResponseCode());
		assertEquals("123", webResponse.getEntity());
	}
}