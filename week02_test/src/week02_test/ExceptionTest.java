package week02_test;

import week02_test.ExceptionTest.TestException;

public class ExceptionTest {
	class TestException extends Exception {
	}

	public void runTest() throws TestException {
	}

	public void test() throws RuntimeException /* Point X */, TestException {
		runTest();
	}
}