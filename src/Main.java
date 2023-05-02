import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positivList = new ArrayList<>();
        for (int list : intList) { //выбор всех значений больше нуля
            if (list > 0) {
                positivList.add(list);
            }
        }
            List<Integer> evenNemberList = new ArrayList<>();
            for (int list : positivList) { // выбор всех четных чисел
                if (list % 2 == 0) {
                    evenNemberList.add(list);
                }
                }
                evenNemberList.sort(Comparator.naturalOrder()); // сортировка по возрастанию
                System.out.println("Работа с коллекцией");
                System.out.println(evenNemberList);

                System.out.println("Работа со стримами");
                StreamMain streamMain = new StreamMain();
                streamMain.start();
            }
        }
