public class Course {

	static final int BASE_SIZE = 5;
	private Assignment[] assignments;
	private int count = 0;
	private String name;
	private String title;
	
	/**
	 * Default Constructor for Course
	 * @param name
	 * @param title
	 */
	public Course(String name, String title) {
		assignments = new Assignment[BASE_SIZE];
		this.name = name;
		this.title = title;
	}
	
	/**
	 * Adds assignment into assignments array
	 * @param title
	 * @param description
	 * @param topic
	 * @param points
	 */
	public void addAssignment(String title, String description, String topic, int points) {
		Assignment temp = new Assignment(title, description, topic, points);
		if (count == assignments.length) {
			assignments = growArray(assignments);
			assignments[count] = temp;
			count++;
		}
		else {
			assignments[count] = temp;
			count++;
		}
	}
	
	/**
	 * Returns CourseIterator using the Assignment array
	 * @return CourseIterator(assignments)
	 */
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}
	
	/**
	 * Returns the weight of each assignment, equally weighted out of 100
	 * @return weight of each assignment out of 100
	 */
	public double getAssignmentWeights() {
		return 100 / count;
	}
	
	/**
	 * Returns a string of the name and title of the Course
	 */
	public String toString() {
		return name + ": " + title;
	}
	
	/**
	 * Takes in the first array and returns an array double its size
	 * @param first
	 * @return second array
	 */
	public Assignment[] growArray(Assignment[] first) {
		int newArraySize = (count + 1) * 2;
		Assignment[] second = new Assignment[newArraySize];
		
		for (int i = 0; i < first.length; i++) {
			second[i] = first[i];
		}
		
		return second;
	}
}