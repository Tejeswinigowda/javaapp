package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConcat {

	@Test
	void test() {
		Junit test=new Junit();
		String result=test.concatenate("one", "two");
		assertEquals("onetwo",result);
	}

}
