
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
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.modsora.procedure.ProcedureMarcaHelmetTickEvent;
import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.HashMap;

@ElementsModsoraMod.ModElement.Tag
public class ItemMarcaCielo40 extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:marca_cielo_40helmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:marca_cielo_40body")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:marca_cielo_40legs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:marca_cielo_40boots")
	public static final Item boots = null;
	public ItemMarcaCielo40(ElementsModsoraMod instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MARCA_CIELO_40", "modsora:cursemarkpt2_", 0, new int[]{10, 0, 20, 20}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureMarcaHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("marca_cielo_40helmet").setRegistryName("marca_cielo_40helmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureMarcaHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("marca_cielo_40body").setRegistryName("marca_cielo_40body").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureMarcaHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("marca_cielo_40boots").setRegistryName("marca_cielo_40boots").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:marca_cielo_40helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:marca_cielo_40body", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("modsora:marca_cielo_40boots", "inventory"));
	}
}
