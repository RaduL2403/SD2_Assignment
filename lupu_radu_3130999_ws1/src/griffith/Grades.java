//Radu Lupu 3130999
package griffith;

public class Grades {
    
    //method to find the highest grade
    public static int gradesMax(int[] grades) {

        //checking if the array is empty
        if (grades.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = grades[0];    //initializing the max variable with the first element of the array

        //loop to find the highest grade
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    //method to find the total grades
    public static int gradesTotal(int[] grades) {
        int total = 0;  //initializing the total variable with 0

        //loop to find the total grades
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    //method to find the average grades
    public static double gradesAverage(int[] grades) {
        //checking if the array is empty
        if (grades.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double total = gradesTotal(grades); //calling the gradesTotal method to find the total grades
        return total / grades.length;
    }

    //method to find the count of fails
    public static int countFails(int[] grades, int minGrade) {
        int count = 0;

        //loop to find the count of fails
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    }

}
