import java.util.*;

class RideSharingSystem {

    Queue<Integer> riders;
    Queue<Integer> drivers;
    Set<Integer> activeRiders;

    public RideSharingSystem() {
        riders = new LinkedList<>();
        drivers = new LinkedList<>();
        activeRiders = new HashSet<>();
    }

    public void addRider(int riderId) {
        riders.add(riderId);
        activeRiders.add(riderId);
    }

    public void addDriver(int driverId) {
        drivers.add(driverId);
    }

    public void cancelRider(int riderId) {
        activeRiders.remove(riderId);
    }

    public int[] matchDriverWithRider() {

        // Step 1: remove cancelled riders
        while (!riders.isEmpty() && !activeRiders.contains(riders.peek())) {
            riders.poll();
        }

        // Step 2: match if possible
        if (!riders.isEmpty() && !drivers.isEmpty()) {
            int rider = riders.poll();
            int driver = drivers.poll();

            activeRiders.remove(rider);

            return new int[]{driver, rider};
        }

        // Step 3: no match
        return new int[]{-1, -1};
    }

    // MAIN METHOD
    public static void RideSharingSys(String[] args) {
        RideSharingSystem system = new RideSharingSystem();

        system.addRider(3);
        system.addDriver(2);
        system.addRider(1);

        System.out.println(Arrays.toString(system.matchDriverWithRider())); // [2, 3]

        system.addDriver(5);
        system.cancelRider(3);

        System.out.println(Arrays.toString(system.matchDriverWithRider())); // [5, 1]
        System.out.println(Arrays.toString(system.matchDriverWithRider())); // [-1, -1]
    }
}