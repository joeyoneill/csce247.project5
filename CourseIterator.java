import java.util.Iterator;

public class CourseIterator implements Iterator<Assignment> {

	private Assignment[] assignments;
	private int position = 0;
	
	/**
	 * Constructor for CourseIterator
	 * @param assignments
	 */
	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
	}
	
	/**
	 * Returns the next assignment, and null if it does not exist
	 */
	public Assignment next() {
		Assignment assignment = assignments[position];
		position = position + 1;
		return assignment;
	}
	
	/**
	 * Returns a boolean value if there are more assignments to iterate over
	 */
	public boolean hasNext() {
		if(position >= assignments.length || assignments[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}
}