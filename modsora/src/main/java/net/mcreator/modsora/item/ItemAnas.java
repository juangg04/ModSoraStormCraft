
package net.mcreator.modsora.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.modsora.procedure.ProcedureAkimichiTick;
import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.HashMap;

@ElementsModsoraMod.ModElement.Tag
public class ItemAnas extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:anashelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:anasbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:anaslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:anasboots")
	public static final Item boots = null;
	public ItemAnas(ElementsModsoraMod instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ANAS", "modsora:sorarmor_", 0, new int[]{0, 0, 100, 0}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new Modelwings_4_Converted().group;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "modsora:textures/wings_4.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAkimichiTick.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("anasbody").setRegistryName("anasbody").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:anasbody", "inventory"));
	}
	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelwings_4_Converted extends ModelBase {
		private final ModelRenderer group;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		public Modelwings_4_Converted() {
			textureWidth = 64;
			textureHeight = 64;
			group = new ModelRenderer(this);
			group.setRotationPoint(0.0F, 4.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-13.0F, 0.5F, 5.5F);
			group.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -2.7489F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -13.25F, -18.5F, -2.0F, 24, 29, 0, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(13.0F, 0.5F, 5.5F);
			group.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -13.0F, -18.5F, 2.0F, 24, 29, 0, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			group.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
