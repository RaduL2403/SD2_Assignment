package griffith;

public class Grades {
    
    public static int gradesMax(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static int gradesTotal(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    public static double gradesAverage(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double total = gradesTotal(grades);
        return total / grades.length;
    }


    public static int countFails(int[] grades, int minGrade) {
        int count = 0;
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    }

}
