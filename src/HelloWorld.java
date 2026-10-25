import java.util.logging.Logger;

public class HelloWorld extends Plugin {
    private static final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void enable() {
        logger.info("HelloWorld");
    }

    @Override
    public void disable() {
    }

    @Override
    public void initialize() {
        HelloWorldListener listener = new HelloWorldListener();
        PluginLoader loader = etc.getLoader();

        loader.addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);
        loader.addListener(PluginLoader.Hook.LOGIN, listener, this, PluginListener.Priority.MEDIUM);
    }
}
