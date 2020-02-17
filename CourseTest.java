import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CourseTest {
	
	@Test
	void testCourseConstructor() {
		Course testCourse = new Course("Name", "Title");
		assertEquals(testCourse.toString(), "Name: Title");
	}
	
	@Test
	void testGetAssignmentWeights() {
		Course testCourse = new Course("Name", "Title");
		testCourse.addAssignment("Title", "Description", "Topic", 10);
		double testWeights = testCourse.getAssignmentWeights();
		assertEquals(100, testWeights);
	}
	
	@Test
	void testAssignmentConstructor() {
		Assignment testAssignment = new Assignment("Title", "Description", "Topic", 10);
		assertEquals(testAssignment.toString(), "Title: Description, covers: Topic");
	}
	
	@Test
	void testGrowArray_oneGrowth() {
		Course testCourse = new Course("Name", "Title");
		testCourse.addAssignment("Title1", "Description", "Topic", 10);
		testCourse.addAssignment("Title2", "Description", "Topic", 10);
		testCourse.addAssignment("Title3", "Description", "Topic", 10);
		testCourse.addAssignment("Title4", "Description", "Topic", 10);
		testCourse.addAssignment("Title5", "Description", "Topic", 10);
		testCourse.addAssignment("Title6", "Description", "Topic", 10);
		double checkValue = 100 / 6;
		assertEquals(testCourse.getAssignmentWeights(), checkValue);
	}
	
	@Test
	void testGrowArray_secondGrowth() {
		Course testCourse = new Course("Name", "Title");
		testCourse.addAssignment("Title01", "Description", "Topic", 10);
		testCourse.addAssignment("Title02", "Description", "Topic", 10);
		testCourse.addAssignment("Title03", "Description", "Topic", 10);
		testCourse.addAssignment("Title04", "Description", "Topic", 10);
		testCourse.addAssignment("Title05", "Description", "Topic", 10);
		testCourse.addAssignment("Title06", "Description", "Topic", 10);
		testCourse.addAssignment("Title07", "Description", "Topic", 10);
		testCourse.addAssignment("Title08", "Description", "Topic", 10);
		testCourse.addAssignment("Title09", "Description", "Topic", 10);
		testCourse.addAssignment("Title10", "Description", "Topic", 10);
		testCourse.addAssignment("Title11", "Description", "Topic", 10);
		double checkValue = 100 / 11;
		assertEquals(testCourse.getAssignmentWeights(), checkValue);
	}
	
	@Test
	void testIteratorHasNext() {
		Course testCourse = new Course("Name", "Title");
		testCourse.addAssignment("Title01", "Description", "Topic", 10);
		testCourse.addAssignment("Title02", "Description", "Topic", 10);
		CourseIterator assignmentIterator = testCourse.createIterator();
		assertTrue(assignmentIterator.hasNext());
	}
	
	@Test
	void testIteratorNext() {
		Course testCourse = new Course("Name", "Title");
		testCourse.addAssignment("Title", "Description", "Topic", 10);
		testCourse.addAssignment("Title", "Description", "Topic", 10);
		CourseIterator assignmentIterator = testCourse.createIterator();
		assertEquals(assignmentIterator.next().toString(), "Title: Description, covers: Topic");
	}

}
