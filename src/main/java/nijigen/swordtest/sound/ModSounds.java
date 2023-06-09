package nijigen.swordtest.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;


public class ModSounds {
    public static SoundEvent COOM_SOUND = registerSoundEvent("coom_sound");

    private static SoundEvent registerSoundEvent (String name) {
        Identifier id = new Identifier(ModTest.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerModSounds() {
        ModTest.LOGGER.info("Registering ModSounds for " + ModTest.MOD_ID);
    }
}
