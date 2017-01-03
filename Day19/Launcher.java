import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Launcher{

    public static void main (String[] args){
        Launcher m = new Launcher();
        List<Apple> apples= new ArrayList<>();
        apples.add (new Apple(120, "green"));
        apples.add (new Apple(160, "red"));
        apples.add (new Apple("green"));
        
        List<Apple> result = m.filterApples(apples, ((Apple apple) -> apple.getWeight() > 150));
        System.out.println("Heavy apples in List " + Arrays.asList(result));
        //result = m.filterApples(apples, new AppleGreenColourPredicate());
        result = m.filterApples(apples, (Apple apple) -> "green".equals(apple.getColour()));
        System.out.println("Green Apples in List " + Arrays.asList(result));
    }

    public List<Apple> filterApples(List<Apple> apples,  ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: apples){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    /*
        //List<Apple> result = m.filterGreenApples(apples);
        //System.out.println(Arrays.asList(result));
        //List<Apple> result = m.filterAppleByColour(apples, "green");
        //System.out.println("Green Apples in List " + Arrays.asList(result));
        //result = m.filterAppleByColour(apples, "red");
        //System.out.println("Red Apples in List " + Arrays.asList(result));
        List<Apple> result = m.filterApplyByWeightGreaterThan(apples, 150);
        System.out.println("Green apples in List " + Arrays.asList(result));
        result = m.filterAppleOnEverySingleAttribute(apples, "green",0, true);
        System.out.println("Heavy apples in List " + Arrays.asList(result));

    }
    public List<Apple> filterGreenApples (List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if("green".equals(apple.getColour())){
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterAppleByColour(List<Apple> inventory, String colour){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if(colour.equals(apple.getColour())){
                result.add(apple);
            }
        }
        return result;
    }
    public List<Apple> filterApplyByWeightGreaterThan(List<Apple> inventory, Integer weight){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }
    public List<Apple> filterAppleOnEverySingleAttribute(List<Apple> inventory, String colour, Integer weight, boolean flag){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if(flag && apple.getColour().equals(colour) || !flag && apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }
    */
}
class AppleHeavyWeightPredicate implements ApplePredicate{

@Override
    
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }
}


class AppleGreenColourPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){
        return "green".equals(apple.getColour());
    }
}
