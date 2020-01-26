package zadanie1;

class Divisibility extends Thread{
    public void run() {
        for (int i=0;i<=100;i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        for (int i=101;i<=200;i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        for (int i=201;i<=300;i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        for (int i=301;i<=400;i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
        for (int i=401;i<=500;i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Divisibility d = new Divisibility();
        d.start();
    }

}