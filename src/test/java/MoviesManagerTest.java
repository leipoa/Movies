
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MoviesManagerTest {

    @Test
    public void testAdd() {
        MoviesManager manager = new MoviesManager();

        manager.add("1");

        String[] expected = { "1" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");

        String[] expected = {"3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
