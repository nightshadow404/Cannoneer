package nightshadow404.Cannoneer.client.GUI;


import net.minecraft.client.gui.Gui;
import nightshadow404.Cannoneer.handler.configHandler;
import nightshadow404.Cannoneer.reference.reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class CannoneerGUIConfig extends GuiConfig
{
    public CannoneerGUIConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
        new ConfigElement(configHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
        reference.Mod_ID,
        false,
        false,
        GuiConfig.getAbridgedConfigPath(configHandler.configuration.toString()));
    }
}

