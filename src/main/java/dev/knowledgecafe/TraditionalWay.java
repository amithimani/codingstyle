package dev.knowledgecafe;

import java.util.List;

public class TraditionalWay {

    public boolean searchString(List<String> stringList, String searchString){
        for (String str : stringList) {
            if (str.equals(searchString)) {
                return true;
            }
        }
        return false;
    }
}
