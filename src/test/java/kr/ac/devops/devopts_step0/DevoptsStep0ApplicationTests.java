package kr.ac.devops.devopts_step0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevoptsStep0ApplicationTests {

	@Test
	void contextLoads() {
	}

	int add(int i, int j){
		return i+j;
	}
	//gradle build할때 테스트 확인하자
	@Test
	void addTest1(){
		int result =add(10,20);
		assertEquals(30, result);
	}

	// @Test
	// void addTest2(){
	// 	int result =add(10,20);
	// 	assertEquals(20, result);
	// }
}
