package netflix;

import javax.swing.JOptionPane;

public class movie_Netflix {
public static void main(String[] args) {
	Movie hi = new Movie("Endgame", 5);
	Movie bye = new Movie ("Infinity War", 5);
	Movie jo = new Movie ("Avengers", 4);
	Movie go = new Movie ("Age Of Ultron", 3);
	Movie kai = new Movie ("Titanic",3);
	String koi = hi.getTicketPrice();
	System.out.println(koi);
	NetflixQueue mom = new NetflixQueue();
	mom.addMovie(hi);
	mom.addMovie(bye);
	mom.addMovie(jo);
	mom.addMovie(go);
	mom.addMovie(kai);
	mom.printMovies();
	mom.sortMoviesByRating();
	Movie lol = mom.getBestMovie();
	Movie kol = mom.getMovie(1);
	JOptionPane.showMessageDialog(null, "The Best Movie is " +lol+ ".  The second best movie is"+ kol);
}
}
