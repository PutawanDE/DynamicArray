package com.DataStructure.main;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArr = new DynamicArray(25);
        for (int i = 0; i < 51; i++) {
            dynamicArr.pushBack(i);
        }
        for (int i = 0; i < 27; i++) {
            dynamicArr.popBack();
        }
//        dynamicArr.add(50, 500);
        dynamicArr.printAll();
    }
}
