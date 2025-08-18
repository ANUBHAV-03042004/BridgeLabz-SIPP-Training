package flightpriceanalyzer;

import java.util.Comparator;

class Flight {
 String flightNo;
 int price;
 int duration; // in minutes

 public Flight(String flightNo, int price, int duration) {
     this.flightNo = flightNo;
     this.price = price;
     this.duration = duration;
 }

 @Override
 public String toString() {
     return "Flight{" + flightNo + ", Price=" + price + ", Duration=" + duration + " mins}";
 }
}

//Custom Comparator
class FlightComparator implements Comparator<Flight> {
 @Override
 public int compare(Flight f1, Flight f2) {
     if (f1.price == f2.price) {
         return Integer.compare(f1.duration, f2.duration);
     }
     return Integer.compare(f1.price, f2.price);
 }
}