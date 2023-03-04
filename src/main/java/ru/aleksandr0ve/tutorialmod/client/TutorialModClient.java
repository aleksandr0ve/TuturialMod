package ru.aleksandr0ve.tutorialmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import ru.aleksandr0ve.tutorialmod.event.KeyInputHandler;

@Environment(EnvType.CLIENT)
public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
