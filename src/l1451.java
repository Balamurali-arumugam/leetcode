import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class l1451
{
    public String arrangeWords(String text) {
        Map<Integer, List<String>> map = new TreeMap<>();

        for(String value : text.split(" ")){
            int length = value.length();
            List<String> valList =  map.getOrDefault(length,new LinkedList<>());
            valList.add(value.toLowerCase());
            map.put(length,valList);
        }

        StringBuilder sb = new StringBuilder();

        map.forEach((k,v) -> {
            v.forEach(j -> {
                sb.append(j +" ");
            });
        });
        Character c = sb.charAt(0);
        sb.setCharAt(0,Character.toUpperCase(c));

        return sb.substring(0,sb.length()-1);
    }
}
