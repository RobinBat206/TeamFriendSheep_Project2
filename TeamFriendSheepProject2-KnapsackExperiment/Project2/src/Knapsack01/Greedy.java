package Knapsack01;

import General.knapsack;

import java.util.ArrayList;


public class Greedy {

    public int run(knapsack e){
        int title = e.getTitle();
        int capacity = e.getCapacity();
        int[] weight = e.getWeight();
        int[] value =e.getValue();
        int totalVal = 0;

        ArrayList<Integer> itemSelected = new ArrayList<>();

        int capacityLeft = capacity;

        while (capacityLeft > 0) {
            int max = Integer.MIN_VALUE;
            int indexMax = -1;

            // Find the index of the maximum value
            for (int i = 0; i < value.length; i++) {
                if (value[i] > max && !itemSelected.contains(i + 1) && capacityLeft >= weight[i]) {
                    max = value[i];
                    indexMax = i;
                }
            }

            if (indexMax == -1) {
                break;
            }

            totalVal += value[indexMax];
            // index in array is started with 0
            // Actual item index = index + 1
            itemSelected.add(indexMax + 1);
            capacityLeft -= weight[indexMax];

        }
        System.out.println("Result of Title " + title);
        System.out.println("Selected items: " + itemSelected);
        return totalVal;
    }

    public int run(int title, int capacity, int[] weight, int[] value){
        int totalVal = 0;

        ArrayList<Integer> itemSelected = new ArrayList<>();

        int capacityLeft = capacity;

        while (capacityLeft > 0) {
            int max = Integer.MIN_VALUE;
            int indexMax = -1;

            // Find the index of the maximum value
            for (int i = 0; i < value.length; i++) {
                if (value[i] > max && !itemSelected.contains(i + 1) && capacityLeft >= weight[i]) {
                    max = value[i];
                    indexMax = i;
                }
            }

            if (indexMax == -1) {
                break;
            }

            totalVal += value[indexMax];
            // index in array is started with 0
            // Actual item index = index + 1
            itemSelected.add(indexMax + 1);
            capacityLeft -= weight[indexMax];

        }
        System.out.println("Result of Title " + title);
        System.out.println("Selected items: " + itemSelected);
        return totalVal;
    }



}
