package dev.knowledgecafe;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        int ramdomStringListSize = 10000000;
        List myList = getList(ramdomStringListSize);
        //Functional way
        Long startTimeFunctional = System.currentTimeMillis();
        boolean willbeFalse = new FunctionalWay().searchString(myList, "abc");
        Long endTimeFunctional = System.currentTimeMillis();

        Long startTimeTraditional = System.currentTimeMillis();
        boolean willbeFalseTradtional = new FunctionalWay().searchString(myList, "abc");
        Long endTimeTraditional = System.currentTimeMillis();

        logger.info("Total time for Functional way in ms =" + (endTimeFunctional-startTimeFunctional) + "  and Total time Traditional in ms = " + (endTimeTraditional - startTimeTraditional));

    }

    public static List<String> getList(int listSize){
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            myList.add(RandomStringUtils.random(5, true, true));
        }
        return myList ;

    }
}
