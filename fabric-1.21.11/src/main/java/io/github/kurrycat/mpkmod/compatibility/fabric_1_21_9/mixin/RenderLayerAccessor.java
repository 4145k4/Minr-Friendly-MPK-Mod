package io.github.kurrycat.mpkmod.compatibility.fabric_1_21_9.mixin;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderSetup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RenderLayer.class)
public interface RenderLayerAccessor {
    @Invoker("of")
    static RenderLayer invokeOf(String name, RenderSetup renderSetup) {
        throw new AssertionError();
    }
}
