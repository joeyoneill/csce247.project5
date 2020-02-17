
public class CourseDriver {

	public static void main(String[] args) {
		Course csce247 = new Course("CSCE 247", "Software Engineering");
		csce247.addAssignment("Strategy Design Pattern", "Implement the Stragety Design Pattern to build robots", "Design Patterns", 10);
		csce247.addAssignment("Observer Design Pattern", "Implement the Observer Design Pattern to similate a baby cry", "Design Patterns", 10);
		csce247.addAssignment("Decorator Design Pattern", "Implement the Decorator Design Pattern to build Christmas trees", "Design Patterns", 10);
		csce247.addAssignment("Factory Design Pattern", "Implement the Factory Design Pattern to build cereal", "Design Patterns", 10);	
		csce247.addAssignment("Singleton Design Pattern", "Implement the Singleton Design Pattern to build a library", "Design Patterns", 10);
		csce247.addAssignment("Command Design Pattern", "Implement the Command Design Pattern to build a Document Editor", "Design Patterns", 10);
		csce247.addAssignment("Adapter Design Pattern", "Implement the Adapter Design Pattern to build a CD to Cassette Converter", "Design Patterns", 10);
		csce247.addAssignment("Template Design Pattern", "Implement the Template Design Pattern to simulate a worker", "Design Patterns", 10);
		csce247.addAssignment("Iterator Design Pattern", "Implement the Iterator Design Pattern to loop over assignments", "Design Patterns", 10);
		
		CourseIterator assignmentIterator = csce247.createIterator();
		
		System.out.println("******** " + csce247 + " ******** ");
		System.out.println("Assignment List:");
		while(assignmentIterator.hasNext()) {
			Assignment assignment = assignmentIterator.next();
			System.out.println("- " + assignment);
		}
		
		System.out.println("\nEach assignment has a weight of: " + csce247.getAssignmentWeights() + " %");
	}
}