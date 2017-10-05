package com.damonkhan;

public class Main {

  public static void main(String[] args) {

//    int value = 3;
//
//    if (value == 1) {
//      System.out.println("value was 1");
//    } else if (value == 2) {
//      System.out.println("value was 2");
//    } else {
//      System.out.println("was neither 1 or 2");
//    }

    int switchValue = 4;

    switch (switchValue) {

      case 1:
        System.out.println("value was 1");
        break;

      case 2:
        System.out.println("value was 2");
        break;

      case 3: case 4: case 5:
        System.out.println("value was " +
                switchValue);
        break;

      default:
        System.out.println("value was neither 1 or 2");
    }

    int newValue = 6;

    switch (newValue) {

      case 1: case 2: case 3: case 4: case 5:
        System.out.println("value was " + newValue);
        break;

      default:
        System.out.println("value was less than 0 or greater than 5");

    }

    char letter = 'a';

    switch (letter) {

      case 'a':
        System.out.println("letter was 'a'");
        break;

      case 'b':
        System.out.println("letter was 'b'");
        break;

      case 'c':
        System.out.println("letter was 'c'");
        break;

      case 'd':
        System.out.println("letter was 'd'");
        break;

      case 'e':
        System.out.println("letter was e");
        break;

      default:
        System.out.println("letter not found");

    }


  }
}
