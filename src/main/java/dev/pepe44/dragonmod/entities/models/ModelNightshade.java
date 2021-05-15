package dev.pepe44.dragonmod.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelNightshade extends ModelBase {
    public ModelRenderer field_110703_f;
    public ModelRenderer field_110690_C;
    public ModelRenderer field_110692_M;
    public ModelRenderer field_110694_O;
    public ModelRenderer field_110719_v;
    public ModelRenderer field_110718_w;
    public ModelRenderer field_110688_A;
    public ModelRenderer field_110684_D;
    public ModelRenderer field_110689_B;
    public ModelRenderer field_110685_E;
    public ModelRenderer field_110717_i;
    public ModelRenderer field_110715_k;
    public ModelRenderer field_110713_m;
    public ModelRenderer field_110711_o;
    public ModelRenderer field_110722_x;
    public ModelRenderer field_110721_y;
    public ModelRenderer field_110720_z;
    public ModelRenderer field_110686_F;
    public ModelRenderer field_110703_f_1;
    public ModelRenderer field_110713_m_1;
    public ModelRenderer shape42;
    public ModelRenderer shape42_1;

    public ModelNightshade() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.field_110721_y = new ModelRenderer(this, 96, 43);
        this.field_110721_y.setRotationPoint(-4.0F, 17.9F, 11.0F);
        this.field_110721_y.addBox(-1.3F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.field_110703_f_1 = new ModelRenderer(this, 0, 12);
        this.field_110703_f_1.setRotationPoint(-6.2F, 1.5F, -7.6F);
        this.field_110703_f_1.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(field_110703_f_1, -0.6632251157578453F, 0.0F, 0.0F);
        this.shape42 = new ModelRenderer(this, 0, 0);
        this.shape42.setRotationPoint(5.4F, 8.8F, 0.0F);
        this.shape42.addBox(0.0F, 1.0F, -5.0F, 33, 0, 23, 0.3F);
        this.setRotateAngle(shape42, 0.0F, 0.0F, 0.2700024352835228F);
        this.field_110689_B = new ModelRenderer(this, 44, 41);
        this.field_110689_B.setRotationPoint(4.3F, 16.0F, -8.0F);
        this.field_110689_B.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.field_110686_F = new ModelRenderer(this, 60, 51);
        this.field_110686_F.setRotationPoint(-4.4F, 16.0F, -8.0F);
        this.field_110686_F.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.field_110719_v = new ModelRenderer(this, 78, 43);
        this.field_110719_v.setRotationPoint(4.3F, 17.6F, 11.0F);
        this.field_110719_v.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.field_110703_f = new ModelRenderer(this, 0, 12);
        this.field_110703_f.setRotationPoint(6.2F, 9.6F, -15.4F);
        this.field_110703_f.addBox(-2.0F, -14.5F, 4.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(field_110703_f, -0.5393067388662478F, 0.0F, -0.017453292519943295F);
        this.field_110685_E = new ModelRenderer(this, 60, 41);
        this.field_110685_E.setRotationPoint(-4.4F, 16.0F, -8.0F);
        this.field_110685_E.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.field_110690_C = new ModelRenderer(this, 44, 51);
        this.field_110690_C.setRotationPoint(4.3F, 16.0F, -8.0F);
        this.field_110690_C.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.shape42_1 = new ModelRenderer(this, 0, 0);
        this.shape42_1.setRotationPoint(-5.3F, 9.8F, -5.1F);
        this.shape42_1.addBox(0.0F, 0.0F, 0.0F, 33, 0, 23, 0.3F);
        this.setRotateAngle(shape42_1, 0.0F, 0.0F, -3.383320754991008F);
        this.field_110713_m_1 = new ModelRenderer(this, 38, 7);
        this.field_110713_m_1.setRotationPoint(-1.5F, 9.4F, 23.0F);
        this.field_110713_m_1.addBox(0.0F, 0.0F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(field_110713_m_1, -0.45378560551852565F, 0.017453292519943295F, 0.0F);
        this.field_110715_k = new ModelRenderer(this, 0, 34);
        this.field_110715_k.setRotationPoint(0.0F, 13.7F, 9.0F);
        this.field_110715_k.addBox(-5.0F, -8.0F, -18.9F, 10, 10, 24, 0.0F);
        this.field_110717_i = new ModelRenderer(this, 80, 12);
        this.field_110717_i.setRotationPoint(0.0F, 14.2F, -10.0F);
        this.field_110717_i.addBox(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.1F);
        this.field_110692_M = new ModelRenderer(this, 74, 0);
        this.field_110692_M.setRotationPoint(5.0F, 3.0F, 2.0F);
        this.field_110692_M.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
        this.field_110713_m = new ModelRenderer(this, 38, 7);
        this.field_110713_m.setRotationPoint(0.0F, 10.2F, 10.3F);
        this.field_110713_m.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(field_110713_m, -0.017453292519943295F, 0.0F, 0.03490658503988659F);
        this.field_110694_O = new ModelRenderer(this, 74, 4);
        this.field_110694_O.setRotationPoint(-5.0F, 3.0F, 2.0F);
        this.field_110694_O.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
        this.field_110722_x = new ModelRenderer(this, 96, 29);
        this.field_110722_x.setRotationPoint(-4.3F, 13.2F, 11.0F);
        this.field_110722_x.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.field_110688_A = new ModelRenderer(this, 44, 29);
        this.field_110688_A.setRotationPoint(4.4F, 13.2F, -8.0F);
        this.field_110688_A.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.field_110684_D = new ModelRenderer(this, 60, 29);
        this.field_110684_D.setRotationPoint(-4.4F, 13.2F, -8.0F);
        this.field_110684_D.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.field_110711_o = new ModelRenderer(this, 78, 29);
        this.field_110711_o.setRotationPoint(4.3F, 13.2F, 11.0F);
        this.field_110711_o.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.field_110720_z = new ModelRenderer(this, 96, 51);
        this.field_110720_z.setRotationPoint(-4.0F, 17.1F, 11.0F);
        this.field_110720_z.addBox(-1.6F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.field_110718_w = new ModelRenderer(this, 78, 51);
        this.field_110718_w.setRotationPoint(4.3F, 17.0F, 11.0F);
        this.field_110718_w.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110721_y.offsetX, this.field_110721_y.offsetY, this.field_110721_y.offsetZ);
        GlStateManager.translate(this.field_110721_y.rotationPointX * f5, this.field_110721_y.rotationPointY * f5, this.field_110721_y.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.8D, 1.0D);
        GlStateManager.translate(-this.field_110721_y.offsetX, -this.field_110721_y.offsetY, -this.field_110721_y.offsetZ);
        GlStateManager.translate(-this.field_110721_y.rotationPointX * f5, -this.field_110721_y.rotationPointY * f5, -this.field_110721_y.rotationPointZ * f5);
        this.field_110721_y.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110703_f_1.offsetX, this.field_110703_f_1.offsetY, this.field_110703_f_1.offsetZ);
        GlStateManager.translate(this.field_110703_f_1.rotationPointX * f5, this.field_110703_f_1.rotationPointY * f5, this.field_110703_f_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.8D, 0.7D);
        GlStateManager.translate(-this.field_110703_f_1.offsetX, -this.field_110703_f_1.offsetY, -this.field_110703_f_1.offsetZ);
        GlStateManager.translate(-this.field_110703_f_1.rotationPointX * f5, -this.field_110703_f_1.rotationPointY * f5, -this.field_110703_f_1.rotationPointZ * f5);
        this.field_110703_f_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape42.offsetX, this.shape42.offsetY, this.shape42.offsetZ);
        GlStateManager.translate(this.shape42.rotationPointX * f5, this.shape42.rotationPointY * f5, this.shape42.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.2D, 1.0D);
        GlStateManager.translate(-this.shape42.offsetX, -this.shape42.offsetY, -this.shape42.offsetZ);
        GlStateManager.translate(-this.shape42.rotationPointX * f5, -this.shape42.rotationPointY * f5, -this.shape42.rotationPointZ * f5);
        this.shape42.render(f5);
        GlStateManager.popMatrix();
        this.field_110689_B.render(f5);
        this.field_110686_F.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110719_v.offsetX, this.field_110719_v.offsetY, this.field_110719_v.offsetZ);
        GlStateManager.translate(this.field_110719_v.rotationPointX * f5, this.field_110719_v.rotationPointY * f5, this.field_110719_v.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.8D, 1.0D);
        GlStateManager.translate(-this.field_110719_v.offsetX, -this.field_110719_v.offsetY, -this.field_110719_v.offsetZ);
        GlStateManager.translate(-this.field_110719_v.rotationPointX * f5, -this.field_110719_v.rotationPointY * f5, -this.field_110719_v.rotationPointZ * f5);
        this.field_110719_v.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110703_f.offsetX, this.field_110703_f.offsetY, this.field_110703_f.offsetZ);
        GlStateManager.translate(this.field_110703_f.rotationPointX * f5, this.field_110703_f.rotationPointY * f5, this.field_110703_f.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.8D, 0.7D);
        GlStateManager.translate(-this.field_110703_f.offsetX, -this.field_110703_f.offsetY, -this.field_110703_f.offsetZ);
        GlStateManager.translate(-this.field_110703_f.rotationPointX * f5, -this.field_110703_f.rotationPointY * f5, -this.field_110703_f.rotationPointZ * f5);
        this.field_110703_f.render(f5);
        GlStateManager.popMatrix();
        this.field_110685_E.render(f5);
        this.field_110690_C.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape42_1.offsetX, this.shape42_1.offsetY, this.shape42_1.offsetZ);
        GlStateManager.translate(this.shape42_1.rotationPointX * f5, this.shape42_1.rotationPointY * f5, this.shape42_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.3D, 1.0D);
        GlStateManager.translate(-this.shape42_1.offsetX, -this.shape42_1.offsetY, -this.shape42_1.offsetZ);
        GlStateManager.translate(-this.shape42_1.rotationPointX * f5, -this.shape42_1.rotationPointY * f5, -this.shape42_1.rotationPointZ * f5);
        this.shape42_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110713_m_1.offsetX, this.field_110713_m_1.offsetY, this.field_110713_m_1.offsetZ);
        GlStateManager.translate(this.field_110713_m_1.rotationPointX * f5, this.field_110713_m_1.rotationPointY * f5, this.field_110713_m_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.4D, 1.4D);
        GlStateManager.translate(-this.field_110713_m_1.offsetX, -this.field_110713_m_1.offsetY, -this.field_110713_m_1.offsetZ);
        GlStateManager.translate(-this.field_110713_m_1.rotationPointX * f5, -this.field_110713_m_1.rotationPointY * f5, -this.field_110713_m_1.rotationPointZ * f5);
        this.field_110713_m_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110715_k.offsetX, this.field_110715_k.offsetY, this.field_110715_k.offsetZ);
        GlStateManager.translate(this.field_110715_k.rotationPointX * f5, this.field_110715_k.rotationPointY * f5, this.field_110715_k.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 0.6D, 1.1D);
        GlStateManager.translate(-this.field_110715_k.offsetX, -this.field_110715_k.offsetY, -this.field_110715_k.offsetZ);
        GlStateManager.translate(-this.field_110715_k.rotationPointX * f5, -this.field_110715_k.rotationPointY * f5, -this.field_110715_k.rotationPointZ * f5);
        this.field_110715_k.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110717_i.offsetX, this.field_110717_i.offsetY, this.field_110717_i.offsetZ);
        GlStateManager.translate(this.field_110717_i.rotationPointX * f5, this.field_110717_i.rotationPointY * f5, this.field_110717_i.rotationPointZ * f5);
        GlStateManager.scale(2.4D, 0.9D, 1.0D);
        GlStateManager.translate(-this.field_110717_i.offsetX, -this.field_110717_i.offsetY, -this.field_110717_i.offsetZ);
        GlStateManager.translate(-this.field_110717_i.rotationPointX * f5, -this.field_110717_i.rotationPointY * f5, -this.field_110717_i.rotationPointZ * f5);
        this.field_110717_i.render(f5);
        GlStateManager.popMatrix();
        this.field_110692_M.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110713_m.offsetX, this.field_110713_m.offsetY, this.field_110713_m.offsetZ);
        GlStateManager.translate(this.field_110713_m.rotationPointX * f5, this.field_110713_m.rotationPointY * f5, this.field_110713_m.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.4D, 1.4D);
        GlStateManager.translate(-this.field_110713_m.offsetX, -this.field_110713_m.offsetY, -this.field_110713_m.offsetZ);
        GlStateManager.translate(-this.field_110713_m.rotationPointX * f5, -this.field_110713_m.rotationPointY * f5, -this.field_110713_m.rotationPointZ * f5);
        this.field_110713_m.render(f5);
        GlStateManager.popMatrix();
        this.field_110694_O.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110722_x.offsetX, this.field_110722_x.offsetY, this.field_110722_x.offsetZ);
        GlStateManager.translate(this.field_110722_x.rotationPointX * f5, this.field_110722_x.rotationPointY * f5, this.field_110722_x.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.field_110722_x.offsetX, -this.field_110722_x.offsetY, -this.field_110722_x.offsetZ);
        GlStateManager.translate(-this.field_110722_x.rotationPointX * f5, -this.field_110722_x.rotationPointY * f5, -this.field_110722_x.rotationPointZ * f5);
        this.field_110722_x.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110688_A.offsetX, this.field_110688_A.offsetY, this.field_110688_A.offsetZ);
        GlStateManager.translate(this.field_110688_A.rotationPointX * f5, this.field_110688_A.rotationPointY * f5, this.field_110688_A.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.field_110688_A.offsetX, -this.field_110688_A.offsetY, -this.field_110688_A.offsetZ);
        GlStateManager.translate(-this.field_110688_A.rotationPointX * f5, -this.field_110688_A.rotationPointY * f5, -this.field_110688_A.rotationPointZ * f5);
        this.field_110688_A.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110684_D.offsetX, this.field_110684_D.offsetY, this.field_110684_D.offsetZ);
        GlStateManager.translate(this.field_110684_D.rotationPointX * f5, this.field_110684_D.rotationPointY * f5, this.field_110684_D.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.field_110684_D.offsetX, -this.field_110684_D.offsetY, -this.field_110684_D.offsetZ);
        GlStateManager.translate(-this.field_110684_D.rotationPointX * f5, -this.field_110684_D.rotationPointY * f5, -this.field_110684_D.rotationPointZ * f5);
        this.field_110684_D.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110711_o.offsetX, this.field_110711_o.offsetY, this.field_110711_o.offsetZ);
        GlStateManager.translate(this.field_110711_o.rotationPointX * f5, this.field_110711_o.rotationPointY * f5, this.field_110711_o.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.field_110711_o.offsetX, -this.field_110711_o.offsetY, -this.field_110711_o.offsetZ);
        GlStateManager.translate(-this.field_110711_o.rotationPointX * f5, -this.field_110711_o.rotationPointY * f5, -this.field_110711_o.rotationPointZ * f5);
        this.field_110711_o.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110720_z.offsetX, this.field_110720_z.offsetY, this.field_110720_z.offsetZ);
        GlStateManager.translate(this.field_110720_z.rotationPointX * f5, this.field_110720_z.rotationPointY * f5, this.field_110720_z.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.9D, 1.0D);
        GlStateManager.translate(-this.field_110720_z.offsetX, -this.field_110720_z.offsetY, -this.field_110720_z.offsetZ);
        GlStateManager.translate(-this.field_110720_z.rotationPointX * f5, -this.field_110720_z.rotationPointY * f5, -this.field_110720_z.rotationPointZ * f5);
        this.field_110720_z.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_110718_w.offsetX, this.field_110718_w.offsetY, this.field_110718_w.offsetZ);
        GlStateManager.translate(this.field_110718_w.rotationPointX * f5, this.field_110718_w.rotationPointY * f5, this.field_110718_w.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.9D, 1.0D);
        GlStateManager.translate(-this.field_110718_w.offsetX, -this.field_110718_w.offsetY, -this.field_110718_w.offsetZ);
        GlStateManager.translate(-this.field_110718_w.rotationPointX * f5, -this.field_110718_w.rotationPointY * f5, -this.field_110718_w.rotationPointZ * f5);
        this.field_110718_w.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        //left for
        this.field_110688_A.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110689_B.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110690_C.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        //left behind
        this.field_110711_o.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110719_v.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110718_w.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        //right for
        this.field_110684_D.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110685_E.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110686_F.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        //right bheind
        this.field_110722_x.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110721_y.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.field_110720_z.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        //this.shape42.rotateAngleZ = MathHelper.cos(limbSwing * 0.6652F) * 0.5F * limbSwingAmount;
        //this.shape42_1.rotateAngleZ = MathHelper.cos(limbSwing * 0.0F) + 220F * limbSwingAmount;

    }
}

//field_110688_A
//field_110689_B
//field_110690_C