package org.app;

import java.util.*;


class SushiOrderManager {
    private Map<Integer, Queue<String>> orders;
    private Integer lastSeatId = -1;
    private int totalSize;
    private Integer lastSeatIdOrder = 0;
    private Set<Integer> clientIdsWithOrders;

    public SushiOrderManager() {
        orders = new TreeMap();
        clientIdsWithOrders = new TreeSet();
    }

    public void addOrder(ArrayList<SushiOrder> request) {
        for(SushiOrder sushiOrder: request){
            Queue<String> queue = orders.get(sushiOrder.getSeatId());
            if(queue==null){
                queue = new LinkedList();
                orders.put(sushiOrder.getSeatId(), queue);
            }
            queue.addAll(sushiOrder.getMenuItemIds());
            if(!queue.isEmpty()){
                clientIdsWithOrders.add(sushiOrder.getSeatId());
            }
            totalSize += sushiOrder.getMenuItemIds().size();
        }
    }

    // return next roll object in the format
    // new SushiItem(/*seatId*/ 1, /*menuItemId*/ "tuna");
    // or null if no order is pending
    public SushiItem nextItem() {
        System.out.println("@@@@@orders="+orders);
        /*if(lastSeatId==16){
          lastSeatId = 0;
        }*/

        Iterator<Integer> itr = clientIdsWithOrders.iterator();
        boolean switched = false;
        while(itr.hasNext()){
            Integer tmp = itr.next();
            if(tmp>lastSeatId){
                lastSeatId = tmp;
                switched = true;
                break;
            }
        }
        if(!switched){
            itr = clientIdsWithOrders.iterator();
            if(itr.hasNext()){
                lastSeatId = itr.next();
            } else {
                return null;
            }

        }



        int stepsCount=0;
        // while(totalSize!=0 || stepsCount!=orders.size()){
        while(totalSize!=0){

            Queue<String> queue = orders.get(lastSeatId);

            //stepsCount++;

            if(queue!=null && !queue.isEmpty()){
                String menuItemId = queue.remove();
                if(queue.isEmpty()){
                    clientIdsWithOrders.remove(lastSeatId);
                }
                totalSize--;

                String text = "!!!!seat Id: "+lastSeatId;
                text+=", menuItemId: "+menuItemId+"!!!!";
                System.out.println(text);

                return new SushiItem(lastSeatId, menuItemId);
            }
            if(itr.hasNext()){
                lastSeatId=itr.next();
            } else {
                itr = clientIdsWithOrders.iterator();
                lastSeatId = itr.next();
            }


        }
        return null;
    }
}

