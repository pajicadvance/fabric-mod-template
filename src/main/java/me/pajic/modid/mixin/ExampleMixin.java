package me.pajic.modid.mixin;

import me.pajic.modid.Main;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {

    @Inject(
            method = "<init>",
            at = @At("TAIL")
    )
    private static void onInit(CallbackInfo ci) {
        Main.debugLog("This is a debug message!");
    }
}
