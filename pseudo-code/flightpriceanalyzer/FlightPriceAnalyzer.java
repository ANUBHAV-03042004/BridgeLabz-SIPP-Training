package flightpriceanalyzer;
import java.util.*;

public class FlightPriceAnalyzer {
 // Merge Sort
 public static void mergeSort(List<Flight> flights, Comparator<Flight> comp) {
     if (flights.size() <= 1) return;
     int mid = flights.size() / 2;
     List<Flight> left = new ArrayList<>(flights.subList(0, mid));
     List<Flight> right = new ArrayList<>(flights.subList(mid, flights.size()));

     mergeSort(left, comp);
     mergeSort(right, comp);

     merge(flights, left, right, comp);
 }

 private static void merge(List<Flight> flights, List<Flight> left, List<Flight> right, Comparator<Flight> comp) {
     int i = 0, j = 0, k = 0;
     while (i < left.size() && j < right.size()) {
         if (comp.compare(left.get(i), right.get(j)) <= 0) {
             flights.set(k++, left.get(i++));
         } else {
             flights.set(k++, right.get(j++));
         }
     }
     while (i < left.size()) flights.set(k++, left.get(i++));
     while (j < right.size()) flights.set(k++, right.get(j++));
 }

 public static void main(String[] args) {
     List<Flight> flights = new ArrayList<>();
     flights.add(new Flight("AI101", 5000, 120));
     flights.add(new Flight("AI102", 3000, 180));
     flights.add(new Flight("AI103", 5000, 90));
     flights.add(new Flight("AI104", 4000, 150));

     System.out.println("Before Sorting: " + flights);
     mergeSort(flights, new FlightComparator());
     System.out.println("After Sorting: " + flights);
 }
}
