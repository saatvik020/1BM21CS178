class Thread1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("BMS College of Engineering");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                System.out.println("CSE");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Threads {
    public static void main(String args[]) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}