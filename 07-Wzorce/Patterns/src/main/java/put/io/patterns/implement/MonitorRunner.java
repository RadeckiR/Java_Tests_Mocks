package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();

        SystemStateObserver infObserver = new SystemInfoObserver();
        monitor.addSystemStateObserver(infObserver);
        SystemStateObserver garObserver = new SystemGarbageCollectorObserver();
        monitor.addSystemStateObserver(garObserver);
        SystemStateObserver coolObserver = new SystemCoolerObserver();
        monitor.addSystemStateObserver(coolObserver);
        SystemStateObserver devObserver = new USBDeviceObserver();
        monitor.addSystemStateObserver(devObserver);

        while (true) {
            monitor.probe();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
