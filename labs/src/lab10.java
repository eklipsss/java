public class lab10 {
    public static class Triple<T> {
        private T data1;
        private T data2;
        private T data3;
        public Triple(T data1, T data2, T data3) {
            this.data1 = data1;
            this.data2 = data2;
            this.data3 = data3;
        }
        public void set_data1(T data1) { this.data1 = data1; }
        public void set_data2(T data2) { this.data2 = data2; }
        public void set_data3(T data3) { this.data3 = data3; }
        public T min() {
            if (data1 instanceof Comparable) {
                T min = data1;
                if (((Comparable) data2).compareTo(min) < 0)
                    min = data2;
                if (((Comparable) data3).compareTo(min) < 0)
                    min = data3;
                return min;
            } else
                throw new RuntimeException("Impossible to calculate min");

        }
        public T max() {
            if (data1 instanceof Comparable) {
                T max = data1;
                if (((Comparable) data2).compareTo(max) > 0)
                    max = data2;
                if (((Comparable) data3).compareTo(max) > 0)
                    max = data3;
                return max;
            } else
                throw new RuntimeException("Impossible to calculate max");

        }
        public double mean() {
            if (data1 instanceof Number) {
                return (((Number) data1).doubleValue() +
                        ((Number) data2).doubleValue() +
                        ((Number) (data3)).doubleValue()) / 3;
            } else
                throw new RuntimeException("Impossible to calculate mean");

        }
        public void print(){
            System.out.println("\nTriple: ");
            System.out.println("  first: " + data1);
            System.out.println("  second: " + data2);
            System.out.println("  third: " + data3);
        }
    }
    public static void print(Triple<?> instance) {
        instance.print();
        try {
            System.out.println("  -- min: " + instance.min());
            System.out.println("  -- max: " + instance.max());
            System.out.println("  -- mean: " + instance.mean());
        }
        catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Triple<Integer> trip1 = new Triple<>(1, 2, 3);
        print(trip1);
        trip1.set_data1(3);
        trip1.set_data2(2);
        trip1.set_data3(1);
        print(trip1);

        trip1.set_data3(0);
        print(trip1);

        Triple<String> trip2 = new Triple<>("a", "b", "c");
        print(trip2);
    }

}
