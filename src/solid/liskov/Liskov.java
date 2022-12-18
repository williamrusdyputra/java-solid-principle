package solid.liskov;

public class Liskov {

    /*
        - Square cannot extend rectangle because they have different properties, square has 4 sides to be the same,
          also the method of getting area is different
        - The problem arise when we substitute Rectangle with Square somewhere, we will get the wrong validation
          (imagine if we have code test where the area of rectangle is 2x3=6, when we change to Square it will become
           3x3=9, because when we set/update the length/breadth, it will follow whichever comes last)

        Fix:
        - Create separate class for rectangle and square
        - Basically, do not do inheritance for classes that cannot be substituted
     */
    public class Rectangle {

        private int length;
        private int breadth;

        public int getLength() {
            return length;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public int getBreadth() {
            return breadth;
        }
        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
        public int getArea() {
            return this.length * this.breadth;
        }
    }

    public class Square extends Rectangle {

        @Override
        public void setBreadth(int breadth) {
            super.setBreadth(breadth);
            super.setLength(breadth);
        }
        @Override
        public void setLength(int length) {
            super.setLength(length);
            super.setBreadth(length);
        }
    }
}
