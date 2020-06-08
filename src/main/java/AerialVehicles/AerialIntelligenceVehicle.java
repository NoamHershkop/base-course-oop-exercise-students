package AerialVehicles;

public interface AerialIntelligenceVehicle {
    default String collectIntelligence(){
        return getPilotName() + ": " + getVehicleName() + " Collecting Data in " + getRegion() + " with sensor type: " + getSensorType();
    }

    String getSensorType();
    String getPilotName();
    String getVehicleName();
    String getRegion();
}
