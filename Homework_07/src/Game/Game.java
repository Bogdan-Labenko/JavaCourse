package Game;

public class Game {
    public enum Genre {
        ACTION, SPORT, RACE
    }
    public enum GameType {
        VIRTUAL, PHYSICAL
    }
    private final String name;
    private final Genre genre;
    final GameType type;

    Game(String name, Genre genre, GameType type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public Genre getGenre(){
        return genre;
    }
    public GameType getType(){
        return type;
    }
    public static GameDisk getGameDisk(String name, Genre genre, String description){
        return new GameDisk(name, genre, description);
    }
    public static VirtualGame getVirtualGame(String name, Genre genre, float rating){
        return new VirtualGame(name, genre, rating);
    }
    public static class GameDisk{
        final String description;
        final Game data;

        GameDisk(String name, Genre genre, String description){
            this.description = description;
            data = new Game(name, genre, GameType.PHYSICAL);
        }
        public String getDescription(){
            return description;
        }
        public Game getData(){
            return data;
        }
    }
    public static class VirtualGame{
        float rating;
        final Game data;

        VirtualGame(String name, Genre genre, float rating){
            this.rating = rating;
            data = new Game(name, genre, GameType.VIRTUAL);
        }
        public float getRating(){
            return rating;
        }
        public void setRating(int rating){
            this.rating = rating;
        }
        public Game getData(){
            return data;
        }
    }
}
