package quiz.quiz2;

public class FilmExam {

	public static void main(String[] args) {
		Film film1 = new Film();
		Film film2 = new Film();
		
		film1.setFilmName("겨울왕국");
		String filmName = film1.getFilmName();
		film2.setFilmName("테러");
		String filmName2 = film2.getFilmName();
		
		film1.setRleaseDate(2016);
		film2.setRleaseDate(2014);
		int filmDate1 = film1.getReleaseDate();
		int filmDate2 = film2.getReleaseDate();
		
		film1.print();
		film2.print();
		
		
		System.out.println(film1.presequal());
		
	}

}
