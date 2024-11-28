package de.dhbw.ravensburg.javazoo.exeptions;

public class MaleBirdsCannotLayEggsException extends Exception {
    public MaleBirdsCannotLayEggsException(String fehlermeldung) {
        System.err.println(fehlermeldung);
    }
}
