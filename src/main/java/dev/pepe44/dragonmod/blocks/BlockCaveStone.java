package dev.pepe44.dragonmod.blocks;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCaveStone extends Block {

    public final AxisAlignedBB FOUNTAIN = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.1825D, 0.8125D, 0.8125D);

    public BlockCaveStone() {
        super(Material.ROCK);
        setTranslationKey(DragonModConstants.MODID + ".cavestone");
        setCreativeTab(DragonMod.creativeTabb);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public AxisAlignedBB getBountingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FOUNTAIN;
    }
}
