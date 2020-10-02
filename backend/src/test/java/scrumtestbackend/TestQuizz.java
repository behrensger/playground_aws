package scrumtestbackend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.openaqua.scrumtestbackend.entities.Quizz;

class TestQuizz {

	@Test
	void test() {
		Quizz q = new Quizz();
		assertEquals("", q.getDescription());
		q.setDescription("abc");
		assertEquals("abc", q.getDescription());
	}

}
