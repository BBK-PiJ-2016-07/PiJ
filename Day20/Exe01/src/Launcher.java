/**
 * Created by Bilal on 07/12/2016.
 */
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class Launcher {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6);

        final List<Dish> menu =
                Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                        new Dish("beef", false, 700, Dish.Type.MEAT),
                        new Dish("chicken", false, 400, Dish.Type.MEAT),
                        new Dish("french fries", true, 530, Dish.Type.OTHER),
                        new Dish("rice", true, 350, Dish.Type.OTHER),
                        new Dish("season fruit", true, 120, Dish.Type.OTHER),
                        new Dish("pizza", true, 550, Dish.Type.OTHER),
                        new Dish("prawns", false, 400, Dish.Type.FISH),
                        new Dish("salmon", false, 450, Dish.Type.FISH));

    // exercise 1
    List<Dish> dishes =
            menu.stream()
            .filter((Dish d) -> d.getType() == Dish.Type.MEAT)
            .limit(2)
            .collect(toList());
    System.out.println(dishes);

    // exercise 2
    int count =
            menu.stream().map(d -> 1)
            .reduce(0, (a,b) -> a + b);
    System.out.println("Number of Items in the Menu are: "+ count);

    double result =
            numbers1
            .stream()
            .map(a -> a * 2.0)
            .reduce(1.0,(a,b) -> a * b);

    System.out.println(result);




    }
}
