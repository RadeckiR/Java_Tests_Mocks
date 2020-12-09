package put.io.patterns.implement;

public class SystemInfoObserver implements SystemStateObserver {

    public void update(SystemMonitor monitor) {
        update(monitor.getLastSystemState());
    }

    public void update(SystemState newState) {
        // Print information to the console
        System.out.println("============================================");
        System.out.println(String.format("CPU Load: %2.2f%%", newState.getCpu()));
        System.out.println(String.format("CPU temperature: %.2f C", newState.getCpuTemp()));
        System.out.println(String.format("Available memory: %.2f MB", newState.getAvailableMemory()));
        System.out.println(String.format("USB devices: %d", newState.getUsbDevices()));
    }
}
