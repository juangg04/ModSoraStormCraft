
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
public class ItemStormArmor2 extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:storm_armor_2helmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_2body")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_2legs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:storm_armor_2boots")
	public static final Item boots = null;
	public ItemStormArmor2(ElementsModsoraMod instance) {
		super(instance, 241);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STORM_ARMOR_2", "modsora:nether_", 1000, new int[]{16, 22, 25, 20}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("storm_armor_2helmet")
				.setRegistryName("storm_armor_2helmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("storm_armor_2body")
				.setRegistryName("storm_armor_2body").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("storm_armor_2legs")
				.setRegistryName("storm_armor_2legs").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("storm_armor_2boots")
				.setRegistryName("storm_armor_2boots").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:storm_armor_2helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:storm_armor_2body", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("modsora:storm_armor_2legs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("modsora:storm_armor_2boots", "inventory"));
	}
}
