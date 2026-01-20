package quiz.quiz2;

public class Film {
	
	String filmName;
	int releaseDate;
	
	void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	String getFilmName() {
		return this.filmName;
	}
	void setRleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	int getReleaseDate() {
		return this.releaseDate;
	}
	
	void print() {
		System.out.println(this.filmName);
		System.out.println(this.releaseDate);
	}
	
	String presequal() {
		return filmName + 2;
	}
	
}
