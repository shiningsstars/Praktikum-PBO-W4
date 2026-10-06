public class ManagerTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee(
                "Hasya Nadana",
                4000000,
                1,
                6,
                2007
        );

        staff[1] = new Manager(
                "Yoon Jeonghan",
                2500000,
                1,
                10,
                1995
        );

        staff[2] = new Employee(
                "Aoyagi Toya",
                2700000,
                1,
                11,
                1997
        );

        // Semua employee naik salary 5%
        // Manager menggunakan method override-nya
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        System.out.println("Sebelum sorting:");

        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }

        // Sorting
        Sortable.shell_sort(staff);

        System.out.println("\nSetelah sorting:");

        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}