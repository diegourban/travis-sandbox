package br.com.travis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SistemaTest {
	
	private Sistema sistema;
	
	@Before
	public void beforeTest() {
		sistema = new Sistema();
	}
	
	@Test
	public void exibeHelloTravis() {
		String hello = sistema.getHelloTravis();
		Assert.assertEquals("Hello Travis", hello);
	}

}
