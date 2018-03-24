package com.company;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("CREATED");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("STARTED");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("RESUMED");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("PAUSED");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(careTaker.length()-1));
        System.out.println("Previous saved State: " + originator.getState());
    }
}
