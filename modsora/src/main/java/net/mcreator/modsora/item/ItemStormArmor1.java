
package net.mcreator.modsora.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

@ElementsModsoraMod.ModElement.Tag
public class ItemStormArmor1 extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:storm_armor_1helmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_1body")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_1legs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_1boots")
	public static final Item boots = null;
	public ItemStormArmor1(ElementsModsoraMod instance) {
		super(instance, 240);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STORM_ARMOR_1", "modsora:paper_", 25, new int[]{8, 12, 15, 10}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("storm_armor_1helmet")
				.setRegistryName("storm_armor_1helmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("storm_armor_1body")
				.setRegistryName("storm_armor_1body").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("storm_armor_1legs")
				.setRegistryName("storm_armor_1legs").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("storm_armor_1boots")
				.setRegistryName("storm_armor_1boots").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:storm_armor_1helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:storm_armor_1body", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("modsora:storm_armor_1legs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("modsora:storm_armor_1boots", "inventory"));
	}
}
