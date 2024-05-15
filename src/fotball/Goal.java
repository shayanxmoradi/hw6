package fotball;

import java.sql.Time;

public class Goal {
  private Time time;
  private Player goalMaker;

    public Goal(Time time, Player goalMaker) {
        this.time = time;
        this.goalMaker = goalMaker;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Player getGoalMaker() {
        return goalMaker;
    }

    public void setGoalMaker(Player goalMaker) {
        this.goalMaker = goalMaker;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "time=" + time +
                ", goalMaker=" + goalMaker +
                '}';
    }
}
