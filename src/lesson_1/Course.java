package lesson_1;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        boolean breakFlag;
        for (Participant participant: team.getParticipants()) {

            if(!participant.isDistanceDone()) break;

            for(Obstacle obstacle: this.obstacles) {
                breakFlag = false;
                if(obstacle instanceof Wall) {
                    breakFlag = participant.getMaxWallHeight() < obstacle.getObstacleValue();

                } else if(obstacle instanceof Water) {
                    breakFlag = participant.getMaxWaterDistance() < obstacle.getObstacleValue();
                } else if(obstacle instanceof  Sprint) {
                    breakFlag = participant.getMaxSprintDistance() < obstacle.getObstacleValue();
                } else {
                    breakFlag = true;
                }
                if(breakFlag) {
                    participant.setDistanceDone(false);
                    break;
                }
            }
        }
    }
}
