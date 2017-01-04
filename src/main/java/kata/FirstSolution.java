package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FirstSolution {
    public List<String> filter(List<String> datas) {
        List<String> outputs = new ArrayList<>();
        for (String data: datas) {
            if(data.length() >= 4) {
                outputs.add(data);
            }
        }
        Collections.sort(outputs, new MyItem());
        return outputs;
    }
}

class MyItem implements Comparator<String>{

    @Override
    public int compare(String firstItem, String secondItem) {
        Integer first = Integer.valueOf(firstItem.length());
        Integer second = Integer.valueOf(secondItem.length());
        return second.compareTo(first);
    }
}
