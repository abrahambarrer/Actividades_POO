import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Section seccion = new Section(4);
        seccion.addStudent();
        seccion.addStudent();
        seccion.addStudent();
        seccion.addStudent();
        System.out.println("Edad maxima general: " + seccion.searchMax());
        System.out.println("Edad maxima masculino: " + seccion.searchMax("Male"));
        Student[] male = new Student[2];
        Student[] female = new Student[2];
        System.out.println("Numero de estudiantes femeninos: " + seccion.splitStudents(male, female));*/

        Scanner in new Scanner(System.in);
        Section lis301 = new Section);
        int opcion;

        do{
            System.out.println("1) Agregar\n2) Buscar\n3) Borrar\n4) Imprimir por genero\n5) Imprimir todos\n6) Salir")
            opcion = in.nextInt();

            switch (opcion){
                case 1: // Agregar estudiante
                    System.out.println("Ingresa Id, Nombre, Edad, Genero");
                    Student st = new Student(in.next(), in.nextInt(), in.nextInt(), in.next());
                    lis301.addStudent(st);
                    break;
                case 2: // Buscar estudiante
                    System.out.println("Ingresa Id a buscar");
                    lis301.searchStudent(in.nextInt());
                    break;
                case 3: // Borrar estudiante
                    System.out.println("Ingresa Id de estudiante");
                    break;
                case 4: // Imprimir por genero
                    break;
                case 5: // Imprimir todos
                    System.out.println(lis301.toString());
                    break;
                case 6: // Salir
                    break;
                default:
                    break;
            } while (opcion != 6);
        }
        
    }
}
