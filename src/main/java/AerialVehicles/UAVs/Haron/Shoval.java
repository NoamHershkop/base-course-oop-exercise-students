package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Shoval extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String missleType;
    private int missleNum;
    private String cameraType;

    public Shoval(String cameraType, int missleNum, String missleType, String sensorType, String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
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
        return "Shoval";
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
        final int REPAIR_TIME = 150;
        if(this.getHoursOfFlightSinceLastRepair() > REPAIR_TIME){
            this.repair();
        }
    }
}

