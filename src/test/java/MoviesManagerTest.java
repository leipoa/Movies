
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MoviesManagerTest {

    @Test
    public void testAdd() {
        MoviesManager manager = new MoviesManager();

        manager.add("1");

        String[] expected = {"1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");

        String[] expected = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastBelowLimit() {
        MoviesManager manager = new MoviesManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");


        String[] expected = {"9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastAboveLimit() {
        MoviesManager manager = new MoviesManager(11);

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");

        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}
