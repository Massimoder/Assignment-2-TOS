////////////////////////////////////////////////////////////////////
// MASSIMO DE ROSA 1201171
////////////////////////////////////////////////////////////////////
package it.unipd.tos;

public class TakeAwayBillException extends Exception {
  String message;

  TakeAwayBillException(String error) {
    message = error;
  }

  public String toString() {
    return "TakeAwayBillException Occurred: " + message;
  }
}