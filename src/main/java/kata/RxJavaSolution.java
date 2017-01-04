package kata;

import java.util.List;

public class RxJavaSolution {
    public List<String> filter(List<String> datas) {
        return rx.Observable.from(datas)
                .filter(item->item.length() >= 4)
                .toSortedList((first, second) -> second.length() - first.length())
                .toBlocking()
                .single();
    }
}
