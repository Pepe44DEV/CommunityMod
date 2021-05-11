package dev.pepe44.dragonmod.blocks;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFountain extends Block {
    public final AxisAlignedBB FOUNTAIN = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.1825D, 0.8125D, 0.8125D);

    public BlockFountain() {
        super(Material.ROCK);
        setTranslationKey(DragonModConstants.MODID + ".fountain");
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

    @Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(w.isRemote) {
            return true;
        }

        if (!(p.isSneaking())) {
            if (p.getHeldItem(hand).getItem() == Items.BUCKET) {
                p.sendMessage(new TextComponentString("Bucket"));
                p.inventory.setInventorySlotContents(p.inventory.currentItem, new ItemStack(Items.WATER_BUCKET));

            }else {
                p.sendMessage(new TextComponentString("debug"));
            }

        }

        return true;

    }


}
