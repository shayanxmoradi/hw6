package fotball.model;

import java.util.Date;

public class Contract {
    private Team team;
    private Date beginDate;
    private Date endDate;
    private Double baseContractFee;

    public Contract(Team team, Date beginDate, Date endDate, Double baseContractFee) {
        this.team = team;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.baseContractFee = baseContractFee;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Double getBaseContractFee() {
        return baseContractFee;
    }

    public void setBaseContractFee(Double baseContractFee) {
        this.baseContractFee = baseContractFee;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "team=" + team +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", baseContractFee=" + baseContractFee +
                '}';
    }
}
