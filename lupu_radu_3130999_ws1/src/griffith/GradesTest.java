//Radu Lupu 3130999
package griffith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
    
public class GradesTest {

    //Test method for highest grade
    @Test
    public void testGradesMax() {

        //test cases
        int[] grades1 = {70, 85, 90, 100};
        int[] grades2 = {5, 0, 5, 11};
        int[] grades3 = {};
        
        assertEquals(100, Grades.gradesMax(grades1));   //checking if the highest grade is 100
        assertEquals(11, Grades.gradesMax(grades2));    //checking if the highest grade is 11
        assertThrows(IllegalArgumentException.class, () -> Grades.gradesMax(grades3));  //checking if the IllegalArgumentException is thrown
    }


    //Test method for total grades
    @Test
    public void testGradesTotal() {

        //test cases
        int[] grades1 = {10, 20, 30};
        int[] grades2 = {7, 3, 0, 5};
        int[] grades3 = {};
        
        assertEquals(60, Grades.gradesTotal(grades1));  //checking if the total grades is 60
        assertEquals(15, Grades.gradesTotal(grades2));  //checking if the total grades is 15
        assertEquals(0, Grades.gradesTotal(grades3));   //checking if the total grades is 0
    }


    //Test method for average grades
    @Test
    public void testGradesAverage() {

        //test cases
        int[] grades1 = {10, 20, 30, 40};
        int[] grades2 = {10, 26, 30};
        int[] grades3 = {};
        
        assertEquals(25.0, Grades.gradesAverage(grades1), 0.001);   //checking if the average grade is 25.0
        assertEquals(22.0, Grades.gradesAverage(grades2), 0.001);   //checking if the average grade is 22.0
        assertThrows(IllegalArgumentException.class, () -> Grades.gradesAverage(grades3));  //checking if the IllegalArgumentException is thrown
    }


    //Test method for count of fails
    @Test
    public void testCountFails() {
        //test cases
        int[] grades1 = {10, 50, 60, 20};
        int[] grades2 = {5, 15, 25, 35};
        int[] grades3 = {};
        
        assertEquals(2, Grades.countFails(grades1, 40));    //checking if the count of fails is 2
        assertEquals(3, Grades.countFails(grades2, 30));    //checking if the count of fails is 3
        assertEquals(0, Grades.countFails(grades3, 50));    //checking if the count of fails is 0
    }
}
