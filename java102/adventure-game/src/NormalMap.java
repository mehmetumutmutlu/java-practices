public abstract class NormalMap extends Map{
    public NormalMap(Player player, String title) {
        super(player, title);
    }

    @Override
    public boolean onMap() {
        return false;
    }
}
