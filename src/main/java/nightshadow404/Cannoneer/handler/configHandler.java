package nightshadow404.Cannoneer.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import nightshadow404.Cannoneer.reference.reference;

import java.io.File;

public class configHandler {

    public static Configuration configuration;
    public static int testInt = 0;

    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            int cannonPower = configuration.get(Configuration.CATEGORY_GENERAL, "powerMultiplier", 2, "This is the cannon power multiplier").getInt(2);
        }

        catch (Exception e){

        }

        finally {
            if (configuration.hasChanged())
            {
                configuration.save();
            }

        }

    }


    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(reference.Mod_ID));
        {
            loadConfiguration();
        }
    }


    public void loadConfiguration()
    {
        testInt = configuration.getInt("powerMultiplier", Configuration.CATEGORY_GENERAL, 2, 1, 3,  "This is the cannon power multiplier");

        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }

}
