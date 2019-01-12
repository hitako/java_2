package lesson_1;

public class Participant implements Wallable, Waterable, Sprintable{
    private String name;
    private int maxWaterDistance;
    private int maxSprintDistance;
    private int maxWallHeight;
    private boolean distanceDone = true;

    public Participant(String name, int maxWaterDistance, int maxSprintDistance, int maxWallHeight) {
        this.name = name;
        this.maxWaterDistance = maxWaterDistance;
        this.maxSprintDistance = maxSprintDistance;
        this.maxWallHeight = maxWallHeight;
    }

    public boolean isDistanceDone() {
        return distanceDone;
    }

    public void setDistanceDone(boolean distanceDone) {
        this.distanceDone = distanceDone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxWaterDistance(int maxWaterDistance) {
        this.maxWaterDistance = maxWaterDistance;
    }

    public void setMaxSprintDistance(int maxSprintDistance) {
        this.maxSprintDistance = maxSprintDistance;
    }

    public void setMaxWallHeight(int maxWallHeight) {
        this.maxWallHeight = maxWallHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxWaterDistance() {
        return maxWaterDistance;
    }

    public int getMaxSprintDistance() {
        return maxSprintDistance;
    }

    public int getMaxWallHeight() {
        return maxWallHeight;
    }
}
