public class ToolStore extends NormalMap{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    public boolean onMap(){
        System.out.println("Welcome to the store!");
        return true;
    }
}
