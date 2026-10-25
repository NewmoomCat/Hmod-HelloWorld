public class HelloWorldListener extends PluginListener{
    @Override
    public void onLogin(Player player) {
        player.sendMessage(Colors.LightBlue + "Welcome " + player.getName());
    }

    @Override
    public boolean onCommand(Player player, String[] split) {
        if (split[0].equalsIgnoreCase("hello")) {
            player.sendMessage(Colors.LightGreen + "Hello World");
            return true;
        }
        return false;
    }
}
