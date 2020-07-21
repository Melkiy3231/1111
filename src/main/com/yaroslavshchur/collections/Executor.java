package main.com.yaroslavshchur.collections;
import main.com.yaroslavshchur.collections.lists.DivisionByThree;
import main.com.yaroslavshchur.collections.lists.TaskWithFruit;
import main.com.yaroslavshchur.collections.comparator.NewComparator;
import main.com.yaroslavshchur.collections.lists.SimilarElements;
import java.util.Set;
import java.util.List;
public class Executor {
    public void executeApplication() {
        TaskWithFruit fruitsList = new TaskWithFruit();
        fruitsList.addValue("Mango", "Melon", "Orange", "Grape");
        fruitsList.replaceValue("Orange", "Grapefruit");
        fruitsList.print();
    }
 System.out.println("\n\t\t\t\t\t\tTASK #3");
        SimilarElements.checkElem();
}
