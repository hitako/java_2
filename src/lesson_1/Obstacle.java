package lesson_1;

abstract class Obstacle {
    protected int obstacleValue;

    public Obstacle(int obstacleValue) {
        this.obstacleValue = obstacleValue;
    }

    public int getObstacleValue() {
        return obstacleValue;
    }

    public void setObstacleValue(int obstacleValue) {
        this.obstacleValue = obstacleValue;
    }
}
