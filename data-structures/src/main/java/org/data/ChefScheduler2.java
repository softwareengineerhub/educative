package org.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChefScheduler2 {

    public static boolean schedulable(HashMap<String, ArrayList<String>> requests) {
        Map<String, List<String>> hardWorkers = new HashMap();
        Map<String, List<String>> workersByDay = new HashMap();
        init(requests, hardWorkers, workersByDay);

        System.out.println("hardWorkers: "+hardWorkers.keySet());

        //  boolean flag = true;
        for (String day : workersByDay.keySet()) {
            if (workersByDay.get(day).size() < 2) {
                return false;
            }
        }




        if (!hardWorkers.isEmpty()) {
            for (String user : hardWorkers.keySet()) {
                int count = 0;
                List<String> myList = hardWorkers.get(user);
                for (String day : myList) {
                    List<String> otherList = workersByDay.get(day);
                    if (otherList.size() > 2) {
                        count++;
                    }
                }

                if (myList.size() - count > 5) {
                    return false;
                }
            }

        }

        return true;
    }

    private static void init(HashMap<String, ArrayList<String>> requests, Map<String, List<String>> hardWorkers, Map<String, List<String>> workersByDay) {
        List<String> weekList = new ArrayList();
        weekList.add("mon");
        weekList.add("tue");
        weekList.add("wed");
        weekList.add("thu");
        weekList.add("fri");
        weekList.add("sat");
        weekList.add("sun");

        for (String user : requests.keySet()) {
            ArrayList<String> tmp = new ArrayList();
            ArrayList<String> list = requests.get(user);
            for (String s : weekList) {
                if (!list.contains(s)) {
                    tmp.add(s);
                }
            }
            requests.put(user, tmp);

            if (tmp.size() > 5) {
                hardWorkers.put(user, tmp);
            }

            initWorkersByDay(user, requests.get(user), workersByDay);
        }
        System.out.println("---------------------");
        for (String day : weekList) {
            System.out.println(day + ":" + workersByDay.get(day));
        }
        System.out.println("---------------------");
    }

    private static void initWorkersByDay(String user, ArrayList<String> days, Map<String, List<String>> workersByDay) {
        for (String day : days) {
            if (!workersByDay.containsKey(day)) {
                workersByDay.put(day, new ArrayList());
            }
            List<String> list = workersByDay.get(day);
            list.add(user);
        }
    }
}