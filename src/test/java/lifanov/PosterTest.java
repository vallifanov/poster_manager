package lifanov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
    String[] films = new String[]{
            "Бладшот",
            "Вперёд",
            "Отель 'Белград'",
            "Джентельмены",
            "Человек-Невидимка",
            "Тролли. Мировой тур",
            "Номер один",
            "Алая ведьма",
            "Падение Луны",
            "Не смотрите наверх",
            "Лулу и Бригс"
    };

    @Test
    public void addFilm() {
        Poster fil = new Poster();

        String[] expected = {"Бладшот", "Вперёд", "Отель 'Белград'", "Джентельмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один", "Алая ведьма", "Падение Луны", "Не смотрите наверх", "Лулу и Бригс", "Морбиус"};
        String[] actual = fil.addFilm(films);

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        Poster fil = new Poster();

        fil.findAll(films);

        String[] expected = {"Бладшот", "Вперёд", "Отель 'Белград'", "Джентельмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один", "Алая ведьма", "Падение Луны", "Не смотрите наверх", "Лулу и Бригс"};
        String[] actual = fil.findAll(films);

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        Poster fil = new Poster(10);
        fil.findLast(films);

        String[] expected = {"Лулу и Бригс", "Не смотрите наверх", "Падение Луны", "Алая ведьма", "Номер один", "Тролли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель 'Белград'", "Вперёд"};
        String[] actual = fil.findLast(films);

        assertArrayEquals(expected, actual);
    }
}