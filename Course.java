public class Course{
    private String unitName;
    private String unitcode;
    private double Score;
    public Course(String unitName, String unitcode, double Score) {
        this.unitName = unitName;
        this.unitcode = unitcode;
        this.Score = Score;
    }
    public String getGrade(){
        if(Score >=70) return "A";
        else if (Score >=60) return "B";
        else if (Score >=50) return "C";
        else if (Score >=40) return "D";
        return "E/Fail";
    }
    public void displayGrade(){
        System.out.println(unitcode+": "+unitName+" - Score: "+Score+" Grade: "+getGrade());
    }
}