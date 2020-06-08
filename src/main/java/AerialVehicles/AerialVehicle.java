package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    private String pilotName;
    private Mission mission;
    private int lastRepair;
    private boolean readyToFly;

    public AerialVehicle(String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.lastRepair = lastRepair;
        this.readyToFly = readyToFly;
    }

    public boolean isReadyToFly() {
        return readyToFly;
    }

    public void setReadyToFly(boolean readyToFly) {
        this.readyToFly = readyToFly;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return lastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int lastRepair) {
        this.lastRepair = lastRepair;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void flyTo(Coordinates coordinate){
        System.out.println("flying to " + coordinate.getLatitude() + " " + coordinate.getLongitude());
    }

    public void land(){
        System.out.println("Landing");
    }

    public abstract void check();

    public void repair(){
        this.setHoursOfFlightSinceLastRepair(0);
        this.setReadyToFly(true);
    }
}
