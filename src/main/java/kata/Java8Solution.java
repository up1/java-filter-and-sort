package kata;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Solution {
    public List<String> filter(List<String> datas) {
        List<String> outputs = datas.stream()
                .filter(s -> s.length() >= 4)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        return outputs;
    }
}
