package kata;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    List<String> datas = listOf("Ant", "Bird", "Cat", "Dog", "Elephant", "Fish");

    @Test
    public void withSimpleSolution() {
        FirstSolution solution = new FirstSolution();
        List<String> outputs = solution.filter(datas);
        compareOutput(outputs);
    }

    @Test
    public void withJava8Solution() {
        Java8Solution solution = new Java8Solution();
        List<String> outputs = solution.filter(datas);
        compareOutput(outputs);
    }

    @Test
    public void withGuavaSolution() {
        GuavaSolution solution = new GuavaSolution();
        List<String> outputs = solution.filter(datas);
        compareOutput(outputs);
    }

    @Test
    public void withRxJavaSolution() {
        RxJavaSolution solution = new RxJavaSolution();
        List<String> outputs = solution.filter(datas);
        compareOutput(outputs);
    }



    private void compareOutput(List<String> outputs) {
        assertEquals(3, outputs.size());
        assertThat(outputs, contains("Elephant", "Bird", "Fish"));
    }

    private java.util.List<String> listOf(String ... datas) {
        return Arrays.asList(datas);
    }

}
