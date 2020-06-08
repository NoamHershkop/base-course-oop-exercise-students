package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
        super(pilotName, mission, lastRepair, readyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String getCamType() {
        return this.cameraType;
    }

    @Override
    public String getVehicleName() {
        return "Zik";
    }

    @Override
    public String getObjective() {
        BdaMission currMission = (BdaMission)this.getMission();
        return currMission.getObjective();
    }

    @Override
    public String getSensorType() {
        return this.sensorType;
    }

    @Override
    public String getRegion() {
        IntelligenceMission currMission = (IntelligenceMission)this.getMission();
        return currMission.getRegion();
    }

    @Override
    public void check() {
        final int REPAIR_TIME = 100;
        if(this.getHoursOfFlightSinceLastRepair() > REPAIR_TIME){
            this.repair();
        }
    }
}
