package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects * 3;

        // Изход:  "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);

    }
}
