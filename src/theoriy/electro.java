package theoriy;

public class electro {
        private int id;

        public electro(int id) {
            this.id = id;
        }

        public void start() {
            Motor motor = new Motor(this);
            motor.startMotor();
            final int x = 1;

            class SomeClass {
                SomeClass() {
                }

                public void someMethod() {
                    System.out.println(x);
                    System.out.println(electro.this.id);
                }
            }

            SomeClass someObject = new SomeClass();
            this.test(someObject);
            System.out.println("Electrocar " + this.id + " is starting...");
        }

        private void test(Object object) {
        }

        private class Motor {
            private Motor(final electro var1) {
            }

            private void startMotor() {
                System.out.println("Motor is starting...");
            }
        }

        public static class Battery {
            public Battery() {
            }

            public void charge() {
                System.out.println("Battery is charging...");
            }
        }
    }


