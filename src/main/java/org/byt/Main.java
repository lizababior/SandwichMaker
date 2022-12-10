package org.byt;
/*
 This class was created to getfamiliar with Singleton.
 */
public class Main {
    public static void main(String[] args) {
        AssistantSingleton assis1 = AssistantSingleton.getInstance("lol");
        AssistantSingleton assis2 = AssistantSingleton.getInstance("no");

        System.out.println(assis1.hashCode());
        System.out.println(assis2.hashCode());

        System.out.println(assis2.getWorkingPoints());//result should be lol
    }
}
