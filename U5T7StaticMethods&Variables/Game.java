public class Game {

    private String name;

    private static int librarySize = 0;

    private static int totalPlaytime = 0;
    private int playTime = 0;

    private static Game mostPlayed;
    private int mostPlayedHours = 0;

    public Game(String name){
        this.name = name;

        librarySize ++;
    }

    public void addHours(int hours){
        playTime += hours;
        totalPlaytime += hours;

        if (hours > mostPlayedHours){
            mostPlayed = this;
            mostPlayedHours = hours;
        }
    }

    public String gameInfo(){
        return "Name: " + name + "\nHours played: " + playTime;
    }

    public static String libraryInfo(){
        return "Total hours played: " + totalPlaytime + "\nNumber of games: " + librarySize + "\nMost played game:\n" + mostPlayed.gameInfo();
    }


}
