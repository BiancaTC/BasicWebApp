package com.develogical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("name")) {
            return "test-sei-btc18";
        }

        if (query.toLowerCase().contains("largest")) {
            String sub = String.valueOf(query.subSequence(query.indexOf(":") + 1, query.length()));
            List<String> st_nums = Arrays.asList(sub.split(", "));
            List<Integer> nums = st_nums.stream().map(Integer::parseInt).collect(Collectors.toList());

            return Collections.max(nums).toString();
        }
        return "";
    }
}
