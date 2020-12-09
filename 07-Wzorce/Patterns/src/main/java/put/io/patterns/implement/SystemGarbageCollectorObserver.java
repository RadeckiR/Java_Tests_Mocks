package put.io.patterns.implement;

public class SystemGarbageCollectorObserver implements SystemStateObserver {

    public void update(SystemMonitor monitor) {
        update(monitor.getLastSystemState());
    }

    public void update(SystemState newState) {
        // Run garbage collector when out of memory
        if (newState.getAvailableMemory() < 200.00){
            System.out.println("> Running garbage collector...");
        }
    }

}
