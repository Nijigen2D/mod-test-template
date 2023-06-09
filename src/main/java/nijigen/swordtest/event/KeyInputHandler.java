package nijigen.swordtest.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import nijigen.swordtest.networking.ModMessages;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_CUM = "key.category.modtest.cum";
    public static final String KEY_CUM = "key.modtest.cum";
    public static KeyBinding cumKey;
    private static int yes;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(cumKey.isPressed() && yes == 1) {
                yes = 0;
                ClientPlayNetworking.send(ModMessages.CUMMING_ID, PacketByteBufs.create());
            }
            if(!cumKey.isPressed()) {
                yes = 1;
            }
        });
    }

    public static void register() {
        cumKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_CUM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_X,
                KEY_CATEGORY_CUM
        ));
        registerKeyInputs();
    }
}
