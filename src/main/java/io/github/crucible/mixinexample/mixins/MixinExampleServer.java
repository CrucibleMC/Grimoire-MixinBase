package io.github.crucible.mixinexample.mixins;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.dedicated.DedicatedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.io.IOException;

@Mixin(DedicatedServer.class)
public class MixinExampleServer {
    /**
     * @author juanmuscaria
     */
    @Overwrite
    protected boolean startServer() {
        throw new RuntimeException("Tada!");
    }

}
