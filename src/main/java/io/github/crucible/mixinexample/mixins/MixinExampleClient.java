package io.github.crucible.mixinexample.mixins;

import net.minecraft.client.Minecraft;
import org.lwjgl.LWJGLException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Minecraft.class)
public class MixinExampleClient {

    /**
     * @author juanmuscaria
     */
    @Overwrite
    private void startGame() {
        throw new RuntimeException("Tada!");
    }
}
