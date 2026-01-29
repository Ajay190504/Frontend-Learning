package objectClass.methods;

class AllObjectMethods implements Cloneable {

    int id;
    String name;

    AllObjectMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 1️) toString()
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    // 2️) equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        AllObjectMethods other = (AllObjectMethods) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // 3️) hashCode()
    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    // 4️) finalize() (Deprecated, demo only)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) throws Exception {

        AllObjectMethods obj1 = new AllObjectMethods(1, "Ajay");
        AllObjectMethods obj2 = new AllObjectMethods(1, "Ajay");

        // toString()
        System.out.println("toString(): " + obj1);

        // equals()
        System.out.println("equals(): " + obj1.equals(obj2));

        // hashCode()
        System.out.println("hashCode obj1: " + obj1.hashCode());
        System.out.println("hashCode obj2: " + obj2.hashCode());

        // getClass()
        System.out.println("getClass(): " + obj1.getClass().getName());

        // clone()
        AllObjectMethods obj3 = (AllObjectMethods) obj1.clone();
        System.out.println("clone(): " + obj3);

        // == vs equals
        System.out.println("== operator: " + (obj1 == obj2));
        System.out.println("equals(): " + obj1.equals(obj2));

        // wait(), notify(), notifyAll() demo
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread-1 waiting...");
                    lock.wait();
                    System.out.println("Thread-1 resumed!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread-2 notifying...");
                lock.notify();
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();

        // finalize demo
        obj1 = null;
        obj2 = null;
        System.gc();
    }
}
