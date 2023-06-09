package nijigen.swordtest;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import nijigen.swordtest.client.CumHudOverlay;
import nijigen.swordtest.event.ClientPlayConnectionJoin;
import nijigen.swordtest.event.KeyInputHandler;
import nijigen.swordtest.networking.ModMessages;

public class ModTestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();

        ClientPlayConnectionEvents.JOIN.register(new ClientPlayConnectionJoin());

        ModMessages.registerS2CPackets();

        HudRenderCallback.EVENT.register(new CumHudOverlay());

    }
}
