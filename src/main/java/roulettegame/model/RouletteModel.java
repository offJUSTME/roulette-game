package roulettegame.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class RouletteModel {

    /**
     * Zöld számok
     */
    public int r0 = 0;

    /**
     * Piros számok
     */
    public int r1 = 1, r3 = 3, r5 = 5, r7 = 7, r9 = 9,
               r12 = 12, r14 = 14, r16 = 16, r18 = 18, r19 = 19,
               r21 = 21, r23 = 23, r25 = 25, r27 = 27, r30 = 30,
               r32 = 32, r34 = 34, r36 = 36, r37 = 37;

    public int[] redNumbers = { r1, r3, r5, r7, r9,
                                r12, r14, r16, r18, r19,
                                r21, r23, r25, r27, r30,
                                r32, r34, r36, r37 };

    /**
     * Fekete számok
     */
    public int r2 = 2, r4 = 4, r6 = 6, r8 = 8, r10 = 10,
               r11 = 11, r13 = 13, r15 = 15, r17 = 17, r20 = 20,
            r22 = 22, r24 = 24, r26 = 26, r28 = 28, r29 = 29,
            r31 = 31, r33 = 33,r35 = 35;

    public int[] blackNumbers = { r2, r4, r6, r8, r10,
                                    r11, r13, r15, r17, r20,
                                    r22, r24, r26, r28, r29,
                                    r31, r33, r35 };

    /**
     * Az aktuális kipörgetett szám.
     */
    public int percentNumber;

    /**
     * A függvény egy cserét hajt végre, ami egyel további érték átadást jelent.
     * A függvény egy pörgetésnek felel meg.
     */
    public double oneSpin() {
        int trash;

        trash = r34;
        r34 = r37;
        r37 = r6;
        r6 = r27;
        r27 = r13;
        r13 = r36;
        r36 = r11;
        r11 = r30;
        r30 = r8;
        r8 = r23;
        r23 = r10;
        r10 = r5;
        r5 = r24;
        r24 = r16;
        r16 = r33;
        r33 = r1;
        r1 = r20;
        r20 = r14;
        r14 = r31;
        r31 = r9;
        r9 = r22;
        r22 = r18;
        r18 = r29;
        r29 = r7;
        r7 = r28;
        r28 = r12;
        r12 = r35;
        r35 = r3;
        r3 = r26;
        r26 = r0;
        r0 = r32;
        r32 = r15;
        r15 = r19;
        r19 = r4;
        r4 = r21;
        r21 = r2;
        r2 = r25;
        r25 = r17;
        r17 = trash;

        percentNumber = r34;

        return percentNumber;
    }

    /**
     * A metódus egy random számot generál és integer értékként adja vissza.
     */
    public int randGen() {
        Random rand = new Random();
        return rand.nextInt(72);
    }

    /**
     * A függvény az oneSpin() függvényt futtatja egy random érték alapján.
     */
    public void spinRandom(int rand) {
        for (int i = 0; i < rand; i++) {
            oneSpin();
        }
    }

    /**
     * A függvény visszaadja, hogy milyen színű az adott nyertes szám.
     */
    public String whatColourIs(int n) {
        String red = "piros";
        String black = "fekete";
        String green = "zöld";

        for (int i = 0; i < redNumbers.length - 1; i++) {
            if (i == n) { return red; }
        }

        for (int i = 0; i < blackNumbers.length - 1; i++) {
            if (i == n) { return red; }
        }

        return green;
    }

}
