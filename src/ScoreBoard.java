public class ScoreBoard 
{
    private String Team1; 
    private String Team2;
    private int scoreTeam1;
    private int scoreTeam2;
    private int activeTeam = 1;  

    public void recordPlay(int pointScored)
    {
        if (pointScored == 0)
        {
            activeTeam++; 
        }
        else 
        {
            if (activeTeam % 2 == 1)
            {
                scoreTeam1 += pointScored; 
            }
            else 
            {
                scoreTeam2 += pointScored; 
            }
        }
    }
    
    public String getScore()
    {
        if (activeTeam % 2 == 1)
        {
            return (scoreTeam1 + "-" + scoreTeam2 + "-"+ Team1); 
        }
        else 
        {
            return (scoreTeam1 + "-" + scoreTeam2 + "-"+ Team2);
        }
    }
    
    public String getTeam1()
    {
        return Team1; 
    }
    public String getTeam2()
    {
        return Team2; 
    }
    public ScoreBoard (String T1, String T2)
    {
        Team1 = T1; 
        Team2 = T2; 
    }
    public ScoreBoard(){}

}
