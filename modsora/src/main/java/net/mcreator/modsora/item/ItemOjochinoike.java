
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
public class ItemOjochinoike extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:ojochinoikehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:ojochinoikebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:ojochinoikelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:ojochinoikeboots")
	public static final Item boots = null;
	public ItemOjochinoike(ElementsModsoraMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("OJOCHINOIKE", "modsora:ketsuryugan__", 0, new int[]{2, 5, 6, 10}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ojochinoikehelmet")
				.setRegistryName("ojochinoikehelmet").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:ojochinoikehelmet", "inventory"));
	}
}
