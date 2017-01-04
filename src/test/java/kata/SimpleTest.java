package kata;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void withSimpleSolution() {
        List<String> datas = listOf("Ant", "Bird", "Cat", "Dog", "Elephant", "Fish");
        FirstSolution solution = new FirstSolution();
        List<String> outputs = solution.filter(datas);
        assertEquals(3, outputs.size());
        assertThat(outputs, contains("Elephant", "Bird", "Fish"));
    }

    @Test
    public void withJava8Solution() {
        List<String> datas = listOf("Ant", "Bird", "Cat", "Dog", "Elephant", "Fish");
        Java8Solution solution = new Java8Solution();
        List<String> outputs = solution.filter(datas);
        assertEquals(3, outputs.size());
        assertThat(outputs, contains("Elephant", "Bird", "Fish"));
    }

    private java.util.List<String> listOf(String ... datas) {
        return Arrays.asList(datas);
    }

}
