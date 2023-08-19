public abstract class Map {
    private Player player;
    private String title;

    public Map(Player player, String title) {
        this.player = player;
        this.title = title;
    }

    public abstract boolean onMap();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
