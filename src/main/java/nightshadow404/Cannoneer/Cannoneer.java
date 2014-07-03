package nightshadow404.Cannoneer;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import nightshadow404.Cannoneer.handler.configHandler;
import nightshadow404.Cannoneer.proxy.IProxy;
import nightshadow404.Cannoneer.reference.reference;


@Mod(modid = reference.Mod_ID, name = reference.Mod_NAME, version = reference.Mod_VERSION, guiFactory = reference.GUI_Factory_Class)


public class Cannoneer {

    @Mod.Instance(reference.Mod_ID)
    public static Cannoneer instance;

    @SidedProxy(clientSide = reference.Client_Proxy, serverSide = reference.Server_Proxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pre)
    {
        configHandler.init(pre.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent post)
    {

    }
}
