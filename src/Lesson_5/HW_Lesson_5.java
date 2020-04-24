package Lesson_5;

public class HW_Lesson_5 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[] {
            new Employee("Иванов Дмитрий, ", "главный инженер, ", "ivandm@mailbox.com, ",
                    "89231231289, ", 60000, 50),
            new Employee("Королев Сергей, ", "программист, ", "korser@gmail.com, ",
                    "89234561222, ", 100000, 45),
            new Employee("Зайцева Ирина, ", "PR-менеджер, ", "irinaz@mailbox.com, ",
                    "89231233380, ", 50000, 41),
            new Employee("Макарова Дарья, ", "секретарь, ", "daryam@mail.ru, ",
                    "89258974136, ", 20000, 20),
            new Employee("Ованесян Гарик, ", "водитель, ", "ovanesg@yandex.ru, ",
                    "89282541247, ", 20000, 36)
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }

    }

}
