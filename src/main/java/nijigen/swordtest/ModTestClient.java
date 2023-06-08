package nijigen.swordtest;

import net.fabricmc.api.ClientModInitializer;
import nijigen.swordtest.event.KeyInputHandler;
import nijigen.swordtest.networking.ModMessages;

public class ModTestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();

        ModMessages.registerS2CPackets();

    }
}
