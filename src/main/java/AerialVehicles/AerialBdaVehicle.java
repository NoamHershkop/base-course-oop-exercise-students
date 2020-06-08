package AerialVehicles;

public interface AerialBdaVehicle {
    default String preformBda(){
        return getPilotName() + ": " + getVehicleName() + " taking pictures of " + getObjective() + " with: " + getCamType() + " camera";
    }

    String getCamType();
    String getPilotName();
    String getVehicleName();
    String getObjective();
}
