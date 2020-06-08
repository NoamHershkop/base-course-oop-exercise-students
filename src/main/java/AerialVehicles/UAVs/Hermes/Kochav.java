package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Kochav extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String missleType;
    private int missleNum;
    private String cameraType;

    public Kochav(int missleNum, String missleType, String cameraType, String sensorType, String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
        super(pilotName, mission, lastRepair, readyToFly);
        this.missleNum = missleNum;
        this.sensorType = sensorType;
        this.missleType = missleType;
        this.cameraType = cameraType;
    }

    @Override
    public int getMissleNum() {
        return this.missleNum;
    }

    @Override
    public String getMissleType() {
        return this.missleType;
    }

    @Override
    public String getTarget() {
        AttackMission currentMission = (AttackMission)this.getMission();
        return currentMission.getTarget();
    }

    @Override
    public String getCamType() {
        return this.cameraType;
    }

    @Override
    public String getVehicleName() {
        return "Kochav";
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
