package dev.knowledgecafe;

import java.util.List;

public class FunctionalWay {

    public boolean searchString(List<String> stringList, String searchString) {
        return stringList.stream().anyMatch(str -> str.equals(searchString));
    }
}
