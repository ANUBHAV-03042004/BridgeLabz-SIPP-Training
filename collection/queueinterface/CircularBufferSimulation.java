package queueinterface;

class CircularBufferSimulation {
    static class MyCircularBuffer {
        int[] buffer;
        int size;
        int start = 0;
        int count = 0;

        public MyCircularBuffer(int size) {
            this.size = size;
            buffer = new int[size];
        }

        public void insert(int value) {
            buffer[(start + count) % size] = value;
            if (count < size) {
                count++;
            } else {
                start = (start + 1) % size; // Overwrite oldest
            }
        }

        public void display() {
            System.out.print("Buffer: [");
            for (int i = 0; i < count; i++) {
                System.out.print(buffer[(start + i) % size]);
                if (i < count - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        MyCircularBuffer cb = new MyCircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // [1, 2, 3]
        cb.insert(4);
        cb.display(); // [2, 3, 4]
        cb.insert(5);
        cb.display(); // [3, 4, 5]
    }
}