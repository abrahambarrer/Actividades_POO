import java.util.Scanner;
import java.util.Arraylist;

public class Section {
    public String NRC;
    public ArrayList<Student> arrayStu;
    
    public int numStu;
    public Student[] arrayStu;

    public Section(){
        this.NRC = "21761";
        arrayStu = new ArrayList<>();
    }

    public void addStudent(Student st){
        arrayStu.add(st);
        System.out.println("Estudiante agregado Ok");
    }

    public void searchStudent(int id){
        for (int i = 0; i < arrayStu.size(); i++){
            if (id == arrayStu.get(i).getId()){
                System.out.println("Id: " + arrayStu.get(i).getId());
                System.out.println("Nombre: " + arrayStu.get(i).getNombre());
                System.out.println("Edad: " + arrayStu.get(i).getAge());
                System.out.println("Genero: " + arrayStu.get(i).getGender());
            }
        }

        for (Student student : arrayStu){

        }
    }

    @Override
    public String toString(){
        return "Section [NRC=" + NRC + ", arrayStu=" + arrayStu + "]";
    }

    /*public Section(int size) {
        arrayStu = new Student[size];
        numStu = 0;
    }


    public void addStudent(){
        if (numStu < arrayStu.length){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese genero: ");
            String genero = sc.nextLine();
            arrayStu[numStu] = new Student(nombre, id, edad, genero);
            numStu++;
            System.out.println("Estudiante agregado");
        }
        else
            System.out.println("La seccion de la EE esta llena");
    }

    public Student searchMax(){
        Student max = this.arrayStu[0];
        for (Student s : this.arrayStu) {
            if (s.getAge() < max.getAge())
                max = s;
        }
        return max;
    }

    public int searchMax(String gender){
        Student max = this.arrayStu[0];
        for (Student s : this.arrayStu) {
            if (max.getAge() < s.getAge() && s.getGender().equals(gender)){
                max = s;
            }
        }
        if (max.getGender().equals(gender))
            return max.getAge();
        else
            return -1; // No hay estudiantes femeninos
    }

    public int splitStudents(Student[] male, Student[] female){
        int i = 0;
        int j = 0;
        for (Student s : arrayStu) {
            if (s.getGender().equals("Female")){
                female[i] = s;
                i++;
            }
            else{
                male[j] = s;
                j++;
            }
        }
        return i;
    }*/
}
