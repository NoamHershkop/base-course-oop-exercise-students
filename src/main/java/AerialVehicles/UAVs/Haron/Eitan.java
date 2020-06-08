package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private String sensorType;
    private String missleType;
    private int missleNum;

    public Eitan(int missleNum, String missleType, String sensorType, String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
        super(pilotName, mission, lastRepair, readyToFly);
        this.missleNum = missleNum;
        this.sensorType = sensorType;
        this.missleType = missleType;
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
    public String getVehicleName() {
        return "Eitan";
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
