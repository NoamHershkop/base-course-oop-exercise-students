package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;

public class F16 extends AerialVehicle implements AerialBdaVehicle, AerialAttackVehicle {
    private String missleType;
    private int missleNum;
    private String cameraType;

    public F16(String cameraType, int missleNum, String missleType, String pilotName, Mission mission, int lastRepair, boolean readyToFly) {
        super(pilotName, mission, lastRepair, readyToFly);
        this.missleType = missleType;
        this.missleNum = missleNum;
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
        AttackMission currMission = (AttackMission)this.getMission();
        return currMission.getTarget();
    }

    @Override
    public String getCamType() {
        return this.cameraType;
    }

    @Override
    public String getVehicleName() {
        return "F16";
    }

    @Override
    public String getObjective() {
        BdaMission currMission = (BdaMission)this.getMission();
        return currMission.getObjective();
    }

    @Override
    public void check() {
        final int REPAIR_TIME = 250;
        if(this.getHoursOfFlightSinceLastRepair() > REPAIR_TIME){
            this.repair();
        }
    }
}
