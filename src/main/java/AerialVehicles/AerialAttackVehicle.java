package AerialVehicles;

import AerialVehicles.AerialVehicle;
import Missions.AttackMission;

public interface AerialAttackVehicle {
    public default String attack(){
        return getPilotName() + ": " +getVehicleName() + " Attacking " + getTarget() +" with: " + getMissleType() + "X" + getMissleNum();
    }
    int getMissleNum();
    String getMissleType();
    String getPilotName();
    String getTarget();
    String getVehicleName();
}
