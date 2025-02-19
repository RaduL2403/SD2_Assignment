package griffith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
    
public class GradesTest {

    
    @Test
    public void testGradesMax() {
        int[] grades1 = {70, 85, 90, 100};
        int[] grades2 = {5, 0, 5, 11};
        int[] grades3 = {};
        
        assertEquals(100, Grades.gradesMax(grades1));
        assertEquals(11, Grades.gradesMax(grades2));
        assertThrows(IllegalArgumentException.class, () -> Grades.gradesMax(grades3));
    }

    @Test
    public void testGradesTotal() {
        int[] grades1 = {10, 20, 30};
        int[] grades2 = {7, 3, 0, 5};
        int[] grades3 = {};
        
        assertEquals(60, Grades.gradesTotal(grades1));
        assertEquals(15, Grades.gradesTotal(grades2));
        assertEquals(0, Grades.gradesTotal(grades3));
    }

    @Test
    public void testGradesAverage() {
        int[] grades1 = {10, 20, 30, 40};
        int[] grades2 = {10, 26, 30};
        int[] grades3 = {};
        
        assertEquals(25.0, Grades.gradesAverage(grades1), 0.001);
        assertEquals(22.0, Grades.gradesAverage(grades2), 0.001);
        assertThrows(IllegalArgumentException.class, () -> Grades.gradesAverage(grades3));
    }

    @Test
    public void testCountFails() {
        int[] grades1 = {10, 50, 60, 20};
        int[] grades2 = {5, 15, 25, 35};
        int[] grades3 = {};
        
        assertEquals(2, Grades.countFails(grades1, 40));
        assertEquals(3, Grades.countFails(grades2, 30));
        assertEquals(0, Grades.countFails(grades3, 50));
    }
}
