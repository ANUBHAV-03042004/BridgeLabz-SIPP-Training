package logisticsroutetracker;

import java.io.*;
import java.util.*;
// ---------------- Custom Linked List ----------------
class RouteLinkedList<T extends Checkpoint> implements Serializable {
    private static class Node<T> implements Serializable {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.getCheckpointId().equals(checkpointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.getCheckpointId().equals(checkpointId)) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.getDistanceFromLast();
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean consistencyCheck() {
        boolean hasDelivery = false, hasFuel = false;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (temp.data instanceof FuelCheckpoint) hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node<T> temp = head;
        int count = 1;
        while (temp != null) {
            System.out.println(count++ + ". " + temp.data);
            temp = temp.next;
        }
    }
}
