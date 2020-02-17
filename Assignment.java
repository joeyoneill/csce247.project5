public class Assignment {

	private String title;
	private String description;
	private String topic;
	private int points;
	
	/**
	 * Assignment Constructor
	 * @param title
	 * @param description
	 * @param topic
	 * @param points
	 */
	public Assignment(String title, String description, String topic, int points) {
		this.title = title;
		this.description = description;
		this.topic = topic;
		this.points = points;
	}
	
	/**
	 * Returns a string of the title, description, and topic of the Assignment
	 */
	public String toString() {
		return title + ": " + description + ", covers: " + topic;
	}
}