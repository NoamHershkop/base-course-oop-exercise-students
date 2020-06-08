package Missions;


import Entities.Coordinates;

public abstract class Mission{
    private Coordinates missionCoordinates;

    public Mission(Coordinates missionCoordinates) {
        this.missionCoordinates = missionCoordinates;
    }

    public Coordinates getMissionCoordinates() {
        return missionCoordinates;
    }

    public void setMissionCoordinates(Coordinates missionCoordinates) {
        this.missionCoordinates = missionCoordinates;
    }

    public void begin(){
        System.out.println("Beginning mission!");
    }
    public void cancel(){
        System.out.println("Canceling mission!");
    }
    public void finish(){
        System.out.println("Finishing mission!");
    }
}
