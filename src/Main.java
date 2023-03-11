
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        FirstNumbersIterator iter= new FirstNumbersIterator(15, 55);
//        iter.addNumbers(scanner);




        Student[] s = new Student[6];
        s[0] = new Student(1, "Darek", "Konieczny");
        s[1] = new Student(2, "Maria", "Nowak");
        s[2] = new Student(3, "Tadeusz", "Zawadzki");
        s[3] = new Student(4, "Mirosław", "Moczydło");
        s[4] = new Student(5, "Karolina", "Matejko");
        s[5] = new Student(6, "Wiktoria", "Perkowska");



        System.out.println("===========================================================================================================");

        System.out.println("Wyświetlam liste studentów");
        printStudents(s);
        addgrades(s);
        printStudents(s);

        System.out.println("===========================================================================================================");

        System.out.println("Lista sredniej ocen studentow z ocenami pozytywnymi");
        avaragegrades(s);

        System.out.println("===========================================================================================================");

        System.out.println("Lista studentow z ocena niedostateczna");
        badgradesstudents(s);

    }

    public static void printStudents(Student[] s) {
        ArrayIterator<Student> arrayIterator = new ArrayIterator<>(s);
        while (arrayIterator.hasNext()) {
            Student student = arrayIterator.next();
            System.out.println(student);
        }
    }

    public static void addgrades(Student[]s){
        ArrayIterator<Student> arrayIterator = new ArrayIterator<>(s);
        Random gen = new Random();
        while (arrayIterator.hasNext()){
            Student student =arrayIterator.next();
            for (int i=0;i<s.length;i++){
                if (student.getIndex() == s[i].getIndex()){
                    double addg =Math.round(  5.5 - (gen.nextDouble() * 3.5));
                    student.setGrades(addg);
                }
            }
        }
    }

        public static void avaragegrades(Student[] s){
            double grade = 0.0;
            int temp = 0;
            ArrayIterator<Student> arrayIterator = new ArrayIterator<>(s);
            Predicate <Student> predicate = new Predicate<Student>() {

                @Override
                public boolean accept(Student arg) {
                    return arg.getGrades()>=3;
                }
            };

            FilterIterator<Student> filterIterator = new FilterIterator<>(arrayIterator,predicate);
            while(filterIterator.hasNext()){
                grade += filterIterator.next().getGrades();
                temp++;
            }
            double average = Math.round(grade/temp);
            System.out.println("Srednia ocena studentow z pozytywna oceną: "+average);
        }

    public static void badgradesstudents(Student[] s){
        ArrayIterator<Student> arrayIterator = new ArrayIterator<>(s);
        Predicate<Student> predicate = (arg) -> arg.getGrades()==2;
        FilterIterator<Student> filterIterator = new FilterIterator<>(arrayIterator,predicate);
        while(filterIterator.hasNext()){
            Student student = filterIterator.next();
            System.out.println(student);
        }
    }






    }
