package put.io.patterns.implement;

public class SystemCoolerObserver implements SystemStateObserver {

    public void update(SystemMonitor monitor) {
        update(monitor.getLastSystemState());
    }

    public void update(SystemState newState) {
        // Increase CPU cooling if the temperature is to high
        if (newState.getCpuTemp() > 60.00){
            System.out.println("> Increasing cooling of the CPU...");
        }
    }

}
