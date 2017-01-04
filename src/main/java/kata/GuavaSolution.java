package kata;

import com.google.common.collect.Collections2;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Collection;
import java.util.List;

public class GuavaSolution {
    public List<String> filter(List<String> datas) {
        Collection<String> filtered = Collections2.filter(datas, item -> item.length() >= 4);

        Ordering<String> orderByLenght = new OrderingByLenght();
        List<String> outputs = orderByLenght.compound(Ordering.natural()).sortedCopy(filtered);

        return outputs;
    }
}

class OrderingByLenght extends Ordering<String> {
    @Override
    public final int compare(final String firstItem, final String secondItem) {
        return Ints.compare(secondItem.length(), firstItem.length());
    }
}

