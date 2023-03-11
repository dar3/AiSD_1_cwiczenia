//import java.util.Iterator;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//public class FirstNumbersIterator implements Iterator<Integer> {
//    private int startpoint;
//    private int endpoint;
//    private int currentpoint;
//
//    public FirstNumbersIterator(int startpoint, int endpoint) {
//        this.startpoint = startpoint;
//        this.endpoint = endpoint;
//        this.currentpoint = currentpoint;
//    }
//
//
//    public void addNumbers(Scanner scanner) {
//        FilterIterator<Student> filterIterator = new FilterIterator<>(arrayIterator,predicate);
//        System.out.print("Podaj liczbę pierwszą do zakresu: ");
//        while (filterIterator.hasNext()) {
//            System.out.print("Podaj liczbę pierwszą do zakresu: ");
//            int newNumber = scanner.nextInt();
//            if (newNumber%newNumber==0 && newNumber%1==0) {
//                System.out.println("Obecna liczba pasuje");
//            }
//            else {
//                System.out.println("Obecna liczba nie pasuje");
//            }
//        }
//    }
//
//    @Override
//    public boolean hasNext() {
//        return false;
//    }
//
//    @Override
//    public Integer next() {
//        return null;
//    }
//}
