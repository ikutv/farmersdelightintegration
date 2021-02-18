package mod.ikutv.farmersdelightintegration;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FarmersDelightIntegration.MODID)
public final class FarmersDelightIntegration {

    public static final String MODID = "farmersdelightintegration";

    private static final Logger LOGGER = LogManager.getLogger();

    public FarmersDelightIntegration() {
        LOGGER.debug("Farmer's Delight Integration Loaded!");
    }

}