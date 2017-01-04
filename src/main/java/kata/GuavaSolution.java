package kata;

import com.google.common.collect.Collections2;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Collection;
import java.util.List;

public class GuavaSolution {
    public List<String> filter(List<String> datas) {
        return Ordering
                .from((String a, String b) -> Ints.compare(a.length(), b.length()))
                .reverse()
                .sortedCopy(
                        Collections2.filter(datas, data -> data.length() >= 4));
    }
}