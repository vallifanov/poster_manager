package lifanov;

public class Poster {
    private String[] films;
    private int lastFilms;

    public Poster(String[] films) {
        this.films = films;
    }

    public Poster() {
    }

    public Poster(int lastFilms) {
        this.lastFilms = 10;
    }

    public String[] addFilm(String[] films) {
        String newFilm = new String("Морбиус");
        int length = films.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

        return films;
    }

    public String[] findAll(String[] films) {
        return films;
    }

    public String[] findLast(String[] films) {

        int fistMovies = films.length;
        if (fistMovies > lastFilms) {
            fistMovies = lastFilms;
        }

        String[] tmp = new String[fistMovies];
        for (int i = 0; i < fistMovies; i++) {
            int index = fistMovies - i;
            tmp [i] = films[index];
        }
        return tmp;
    }
}

