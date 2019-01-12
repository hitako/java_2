package lesson_1;

public class Team {
    private String teamName;
    private Participant[] participants;

    public Team(String teamName, Participant[] participants) {
        this.teamName = teamName;
        this.participants = participants;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

    public String getTeamName() {
        return teamName;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void showResults() {
        System.out.println("Представляем результаты команды " + this.teamName);
        for(Participant participant: this.participants) {
            System.out.println("Член команды " + participant.getName() + (participant.isDistanceDone() ? " прошел дистанцию" : " не прошел дистанцию" ) );
        }
    }
}
