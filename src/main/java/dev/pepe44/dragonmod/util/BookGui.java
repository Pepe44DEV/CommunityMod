package dev.pepe44.dragonmod.util;

import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;


public class BookGui extends GuiScreen {

        private final int bookImageHeight = 256;
        private final int bookImageWidth = 192;
        private int currPage = 0;
        private static final int bookTotalPages = 4;
        private static ResourceLocation[] bookPageTextures =
                new ResourceLocation[bookTotalPages];
        private static String[] stringPageText = new String[bookTotalPages];
        private GuiButton buttonDone;
        private NextPageButton buttonNextPage;
        private NextPageButton buttonPreviousPage;

        public BookGui()
        {

            bookPageTextures[0] = new ResourceLocation(

                    DragonModConstants.MODID+":textures/gui/cover.png");

            bookPageTextures[1] = new ResourceLocation(

                    DragonModConstants.MODID+":textures/gui/book.png");

            bookPageTextures[2] = new ResourceLocation(

                    DragonModConstants.MODID+":textures/gui/nightshade.png");

            bookPageTextures[3] = new ResourceLocation(
                    DragonModConstants.MODID+":textures/gui/book.png");

            stringPageText[0] = "";

            stringPageText[1] = "\n\nThis Is The Dragon Book \n\n You get Informations about all Dragons in this Book";

            stringPageText[2]="";
            stringPageText[3]="";
        }

        /**
         * Adds the buttons (and other controls) to the screen in question.
         */
        @Override
        public void initGui()
        {
            // DEBUG
            System.out.println("GuiMysteriousStranger initGUI()");
            buttonList.clear();
            Keyboard.enableRepeatEvents(true);

            buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight,

                    98, 20, I18n.format("gui.done", new Object[0]));

            buttonList.add(buttonDone);
            int offsetFromScreenLeft = (width - bookImageWidth) / 2;
            buttonList.add(buttonNextPage = new NextPageButton(1,

                    offsetFromScreenLeft + 140, 200, true));
            buttonList.add(buttonPreviousPage = new NextPageButton(2,

                    offsetFromScreenLeft + 38, 200, false));
        }

        /**
         * Called from the main game loop to update the screen.
         */
        @Override
        public void updateScreen()
        {
            buttonDone.visible = (currPage == bookTotalPages - 1);
            buttonNextPage.visible = (currPage < bookTotalPages - 1);
            buttonPreviousPage.visible = currPage > 0;
        }

        /**
         * Draws the screen and all the components in it.
         */
        @Override
        public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if (currPage == 0)
            {
                mc.getTextureManager().bindTexture(bookPageTextures[0]);
            }
            else if (currPage == 1)
            {
                mc.getTextureManager().bindTexture(bookPageTextures[1]);
            }
            else if (currPage == 2)
            {
                mc.getTextureManager().bindTexture(bookPageTextures[2]);
            }
            else if (currPage == 3)
            {
                mc.getTextureManager().bindTexture(bookPageTextures[1]);
            }
            int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
            drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth,

                    bookImageHeight);
            int widthOfString;
            String stringPageIndicator = I18n.format("book.pageIndicator",

                    new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});

            widthOfString = fontRenderer.getStringWidth(stringPageIndicator);
            fontRenderer.drawString(stringPageIndicator,

                    offsetFromScreenLeft - widthOfString + bookImageWidth - 44,

                    18, 0);

            fontRenderer.drawSplitString(stringPageText[currPage],

                    offsetFromScreenLeft + 36, 34, 116, 0);

            super.drawScreen(parWidth, parHeight, p_73863_3_);

        }

        /**
         * Called when a mouse button is pressed and the mouse is moved around.

         * Parameters are : mouseX, mouseY, lastButtonClicked &

         * timeSinceMouseClick.
         */
        @Override
        protected void mouseClickMove(int parMouseX, int parMouseY,

                                      int parLastButtonClicked, long parTimeSinceMouseClick)

        {

        }

        @Override
        protected void actionPerformed(GuiButton parButton)
        {
            if (parButton == buttonDone)
            {
                // You can send a packet to server here if you need server to do

                // something
                mc.displayGuiScreen((GuiScreen)null);
            }
            else if (parButton == buttonNextPage)
            {
                if (currPage < bookTotalPages - 1)
                {
                    ++currPage;
                }
            }
            else if (parButton == buttonPreviousPage)
            {
                if (currPage > 0)
                {
                    --currPage;
                }
            }
        }

        /**
         * Called when the screen is unloaded. Used to disable keyboard repeat

         * events
         */
        @Override
        public void onGuiClosed()
        {

        }

        /**
         * Returns true if this GUI should pause the game when it is displayed in

         * single-player
         */
        @Override
        public boolean doesGuiPauseGame()
        {
            return true;
        }

        @SideOnly(Side.CLIENT)
        static class NextPageButton extends GuiButton
        {
            private final boolean isNextButton;

            public NextPageButton(int parButtonId, int parPosX, int parPosY,

                                  boolean parIsNextButton)
            {
                super(parButtonId, parPosX, parPosY, 23, 13, "");
                isNextButton = parIsNextButton;
            }

            public void drawButton(Minecraft mc, int parX, int parY)
            {
                if (visible)
                {
                    boolean isButtonPressed = (parX >= parX

                            && parY >= parY

                            && parX < parX + width

                            && parY < parY + height);

                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    mc.getTextureManager().bindTexture(bookPageTextures[1]);
                    int textureX = 0;
                    int textureY = 192;

                    if (isButtonPressed)
                    {
                        textureX += 23;
                    }

                    if (!isNextButton)
                    {
                        textureY += 13;
                    }

                    drawTexturedModalRect(parX, parY,

                            textureX, textureY,

                            23, 13);
                }
            }
        }
    }






