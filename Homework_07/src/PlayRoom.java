import Game.Game;
import Game.Game.VirtualGame;
import Game.Game.GameDisk;
import Game.Game.Genre;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        GameDisk[] physicalGames = new GameDisk[]{
                Game.getGameDisk("Game1", Genre.ACTION, "Description1"),
                Game.getGameDisk("Game2", Genre.SPORT, "Description2"),
                Game.getGameDisk("Game3", Genre.RACE, "Description3"),
                Game.getGameDisk("Game4", Genre.ACTION, "Description4")
        };

        VirtualGame[] virtualGames = new VirtualGame[]{
                Game.getVirtualGame("Game5", Genre.ACTION, 3.5f),
                Game.getVirtualGame("Game6", Genre.SPORT, 4.7f),
                Game.getVirtualGame("Game7", Genre.RACE, 4.4f),
                Game.getVirtualGame("Game8", Genre.ACTION, 1.3f)
        };
        GameConsole console = new GameConsole(GameConsole.Brand.SONY, "XC123QeWR");
        Arrays.sort(physicalGames, new Comparator<GameDisk>() {
            @Override
            public int compare(GameDisk game1, GameDisk game2) {
                return game1.getData().getGenre().compareTo(game2.getData().getGenre());
            }
        });

        Arrays.sort(virtualGames, (game1, game2) -> Float.compare(game1.getRating(), game2.getRating()));
    }
}
