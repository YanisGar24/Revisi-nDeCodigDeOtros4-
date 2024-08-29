
package com.generation;

import java.util.Scanner; //Faltaba importar Scanner

public class Codigo4 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); // Faltaba System.in

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // correcion de jugador2
    // Scanner s2 = new Scanner();
    String j2 = s.nextLine();

    if (j1 == j2) { // se elimina ) || Se usa equals.
      System.out.println("Empate");
    } else {
      int g = 2;
      switch (j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }
          break; // se agrega break

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
          break;

        case "tijeras":
          if (j2 == "papel") {
            g = 1;
          }
          break;
        default:
          System.out.println("Error: Introduzca piedra, papel o tijeras"); // correcion de error
      }
      System.out.println("Gana el jugador " + g);
    }

    s.close();

  }

}
