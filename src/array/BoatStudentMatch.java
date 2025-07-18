package src.array;
import java.util.*;

 class BoatStudentSort {

    public static void main(String[] args) {
        List<Integer> boat = Arrays.asList(3, 1, 4, 2);
        List<Integer> students = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> sortedStudents = Arrays.asList(1, 2, 3, 4);

        int iteration = 0;

        while (!students.equals(sortedStudents)) {
            iteration++;
            List<Integer> newOrder = new ArrayList<>(Collections.nCopies(boat.size(), 0));

            // Place students according to boat order
            for (int i = 0; i < boat.size(); i++) {
                int target = boat.get(i);
                int index = students.indexOf(target);
                if (index != -1) {
                    newOrder.set(i, students.get(index));
                }
            }

            // Fill empty spots with unplaced students
            Set<Integer> placed = new HashSet<>(newOrder);
            int pos = 0;
            for (int val : students) {
                if (!placed.contains(val)) {
                    while (newOrder.get(pos) != 0) pos++;
                    newOrder.set(pos, val);
                    placed.add(val);
                }
            }

            students = newOrder;

            System.out.println("Iteration " + iteration + ": " + students);
        }

        System.out.println("\nFinal sorted student list: " + students);
        System.out.println("Total iterations required: " + iteration);
    }
}
