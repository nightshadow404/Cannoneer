package nightshadow404.Cannoneer.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configHandler {
    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try{
            configuration.load();

            int cannonPower = configuration.get("Main", "powerMultiplier", 1, "This is the cannon power multiplier").getInt(1);
        }

        catch (Exception e){

        }

        finally {

            configuration.save();

        }

    }

}
