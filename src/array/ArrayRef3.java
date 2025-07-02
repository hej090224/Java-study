package array;

public class ArrayRef3 {
    public static void main(String[] args) {

        int[] students;
        students = new int[]{90, 80, 70, 60, 50};

        System.out.println(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수: " + students[i]);
        }
    }
}
