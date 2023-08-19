public class SafeHouse extends NormalMap{
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onMap(){
        System.out.println("You're in the safe house! Okay, you're in safe.");
        return true;
    }
}
