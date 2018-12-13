package ReflectionAnalyzer;

import fillers.Fillers;
import sorters.Sorter;

import java.util.Comparator;

public class MyComparator implements Comparator<Sorter> {
@Override
    public int compare(Sorter sorterName1, Sorter sorterName2){
    int nameCompaire = sorterName1.getClass().getName().compareTo(sorterName2.getClass().getName());
    return nameCompaire;
}

}
