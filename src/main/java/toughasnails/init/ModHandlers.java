/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.loading.FMLEnvironment;
import toughasnails.thirst.ThirstHandler;
import toughasnails.thirst.ThirstOverlayHandler;

public class ModHandlers
{
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new ThirstHandler());

        if (FMLEnvironment.dist == Dist.CLIENT)
        {
            MinecraftForge.EVENT_BUS.register(new ThirstOverlayHandler());
        }
    }
}
