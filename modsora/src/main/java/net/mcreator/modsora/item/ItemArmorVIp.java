
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
public class ItemArmorVIp extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:armor_v_iphelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:armor_v_ipbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:armor_v_iplegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:armor_v_ipboots")
	public static final Item boots = null;
	public ItemArmorVIp(ElementsModsoraMod instance) {
		super(instance, 248);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ARMOR_V_IP", "modsora:amethyst_", 1000, new int[]{35, 35, 35, 35}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("armor_v_iphelmet")
				.setRegistryName("armor_v_iphelmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("armor_v_ipbody")
				.setRegistryName("armor_v_ipbody").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("armor_v_iplegs")
				.setRegistryName("armor_v_iplegs").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("armor_v_ipboots")
				.setRegistryName("armor_v_ipboots").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:armor_v_iphelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:armor_v_ipbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("modsora:armor_v_iplegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("modsora:armor_v_ipboots", "inventory"));
	}
}
