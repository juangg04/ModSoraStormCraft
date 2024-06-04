
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

import net.mcreator.modsora.procedure.ProcedureKawakiArmorBodyTickEvent;
import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.HashMap;

@ElementsModsoraMod.ModElement.Tag
public class ItemKawakiArmor extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:kawaki_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:kawaki_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:kawaki_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:kawaki_armorboots")
	public static final Item boots = null;
	public ItemKawakiArmor(ElementsModsoraMod instance) {
		super(instance, 254);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("KAWAKI_ARMOR", "modsora:kawaki_", 0, new int[]{2, 5, 35, 35}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("kawaki_armorhelmet")
				.setRegistryName("kawaki_armorhelmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureKawakiArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("kawaki_armorbody").setRegistryName("kawaki_armorbody").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:kawaki_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:kawaki_armorbody", "inventory"));
	}
}
