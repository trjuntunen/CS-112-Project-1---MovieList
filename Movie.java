/* 
Movie class with constructors and getters and setters
for movie objects.
Author: Teddy Juntunen 
*/

class Movie {
	
	// data members
	private String title;
	private int duration;
	private long budget;

	// constructor
	public Movie(String title, int duration, long budget) {
		this.title = title;
		this.duration = duration;
		this.budget = budget;
	}

	// constructor with default budget value of 0
	public Movie(String title, int duration) {
		this.title = title;
		this.duration = duration;
		this.budget = 0;
	}

	// method to get the title of a movie object
	public String getTitle() {
		return this.title;
	}
	// method to set the title of a movie object
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	// gets the duration of a movie object
	public int getDuration() {
		return this.duration;
	}
	// sets the duration of a movie object
	public void setDuration(int newDuration) {
		this.duration = newDuration;
	}

	// gets the budget of a movie
	public long getBudget() {
		return this.budget;
	}
	// sets the budget of a movie
	public void setBudget(long newBudget) {
		this.budget = newBudget;
	}
	// returns movie information as a string
	public String toString() {

		String length;

		if (duration > 120) {
			length = "long";
		} 
		else if (duration < 90) {
			length = "short";
		}
		else {
			length = "average";
		}
		
		return (title + " - Budget: " + "$" + budget + " Length: " + length + "\n");
	}

}