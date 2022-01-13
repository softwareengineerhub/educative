package com.app04.stack.ch00;

public class MakeStringBalancedSolution {


    public static String solve(String angles) {
        String tmpAngles = angles;
        while(angles.contains("<>")) {
            angles = angles.replaceAll("<>", "");
        }

        char[] data = angles.toCharArray();
        int openedCount = 0;
        int closedCount = 0;
        for(char c: data) {
            if (c == '<') {
                openedCount++;
            } else {
                closedCount++;
            }
        }
        System.out.println("ang="+angles);

        String head = "";
        String tail = "";

        for(int i=0;i<closedCount;i++) {
            tail+='<';
        }
        System.out.println("tail="+tail);


        for(int i=0;i<openedCount;i++) {
            head+='>';
        }
        System.out.println("head="+head);

        String res = tail+tmpAngles+head;
        System.out.println("res="+res);
        return res;
    }


    public static void main(String[] args) {
        final String result = solve("<<<>>>>>>>>><<>>>>><<<<<<<<<<><<<<<<>>");

        System.out.println("<<<<<<<<<<<<>>>>>>>>><<>>>>><<<<<<<<<<><<<<<<>>>>>>>>>>>>>>>".equals(result) ? "Passed." : "Failed.");
    }
}
