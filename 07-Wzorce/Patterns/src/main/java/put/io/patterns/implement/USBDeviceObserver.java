package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver {

    private int count = 0;

    public void update(SystemMonitor monitor) {
        update(monitor.getLastSystemState());
    }

    public void update(SystemState newState) {
        int temp = newState.getUsbDevices() - count;
        if (temp != 0) {
            count = newState.getUsbDevices();
            System.out.println(String.format("Liczba urządzeń USB %s o %d", temp > 0 ? "wzrosła" : "zmalała", Math.abs(temp)));
        }
    }
}
