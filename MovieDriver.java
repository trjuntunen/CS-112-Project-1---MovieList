/* 
MovieDriver class, main file of movie program.
Author: Teddy Juntunen 
*/

public class MovieDriver {

	public static void main(String[] args) {

		// 3 movie objects, one with default budget of 0
		Movie movie1 = new Movie("Airplane!", 88, 3500000);
		Movie movie2 = new Movie("Monsters, Inc.", 92, 115000000);
		Movie movie3 = new Movie("Star Wars", 125);

		System.out.print(movie1.toString());
		System.out.print(movie2.toString());
		System.out.print(movie3.toString());

	}

}