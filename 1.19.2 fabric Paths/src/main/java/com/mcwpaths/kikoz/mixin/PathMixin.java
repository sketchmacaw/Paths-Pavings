package com.mcwpaths.kikoz.mixin;

import com.mcwpaths.kikoz.MacawsPaths;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class PathMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

        MacawsPaths.LOGGER.info("This line is printed by the mod mixin!");
    }
}