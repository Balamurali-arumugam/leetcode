import java.util.ArrayList;
import java.util.List;

public class l1023 {
    class Solution {
        public List<Boolean> camelMatch(String[] queries, String pattern) {
            List<Boolean> result = new ArrayList<>();

            for (int i = 0; i < queries.length; i++) {
                result.add(getMatch(queries[i], pattern));
            }

            return result;
        }

        public boolean getMatch(String query, String pattern) {
            int patternIndex = 0;
            int queryIndex = 0;

            while (queryIndex < query.length() && patternIndex < pattern.length()) {
                char q = query.charAt(queryIndex);
                char p = pattern.charAt(patternIndex);

                if (p == q) {
                    queryIndex++;
                    patternIndex++;
                } else if (!Character.isLowerCase(q)) {
                    return false;
                } else {
                    queryIndex++;
                }
            }

            while (queryIndex < query.length()) {
                if (!Character.isLowerCase(query.charAt(queryIndex))) {
                    return false;
                }
                queryIndex++;
            }

            if (patternIndex < pattern.length()) {
                return false;
            }

            return true;
        }
    }
}
