public class Exercise10 {

    // Point class
    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(x);
            sb.append(", ");
            sb.append(y);
            sb.append(")");
            return sb.toString();
        }
    }

    // Segment class
    static class Segment {
        private Point p1;
        private Point p2;

        public Segment(double x1, double y1, double x2, double y2) {
            this.p1 = new Point(x1, y1);
            this.p2 = new Point(x2, y2);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(p1.toString());
            sb.append(", ");
            sb.append(p2.toString());
            sb.append("]");
            return sb.toString();
        }
    }

    // Test
    public static void main(String[] args) {

        Point p = new Point(3, 5);
        System.out.println(p.toString());   // (3, 5)

        Segment s = new Segment(1, 2, 3, 4);
        System.out.println(s.toString());   // [(1, 2), (3, 4)]
    }
}
