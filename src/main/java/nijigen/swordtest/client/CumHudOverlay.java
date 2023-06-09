package nijigen.swordtest.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.util.IEntityDataSaver;

public class CumHudOverlay implements HudRenderCallback {
    private static final Identifier FILLED_CUM = new Identifier(ModTest.MOD_ID,
            "textures/cum/filled_cum.png");
    private static final Identifier EMPTY_CUM = new Identifier(ModTest.MOD_ID,
            "textures/cum/empty_cum.png");
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if(client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width/2;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        RenderSystem.setShaderTexture(0, EMPTY_CUM);
        for(int i = 0; i < 10; i++) {
            DrawableHelper.drawTexture(matrixStack, x - 94 + (i * 9), y - 54, 0, 0, 0, 12, 12, 12, 12);
        }

        RenderSystem.setShaderTexture(0, FILLED_CUM);
        for(int i = 0; i < 10; i++) {
            if(((IEntityDataSaver) MinecraftClient.getInstance().player).getPersistentData().getInt("cum") > i) {
                DrawableHelper.drawTexture(matrixStack, x - 94 + (i * 9), y - 54, 0, 0, 0, 12, 12, 12, 12);
            } else {
                break;
            }
        }
    }

}
