
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

import net.mcreator.modsora.procedure.ProcedureBorutoArmorBodyTickEvent;
import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.HashMap;

@ElementsModsoraMod.ModElement.Tag
public class ItemBorutoArmor extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:boruto_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:boruto_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:boruto_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:boruto_armorboots")
	public static final Item boots = null;
	public ItemBorutoArmor(ElementsModsoraMod instance) {
		super(instance, 253);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BORUTO_ARMOR", "modsora:add_", 0, new int[]{0, 0, 35, 35}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("boruto_armorhelmet")
				.setRegistryName("boruto_armorhelmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBorutoArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("boruto_armorbody").setRegistryName("boruto_armorbody").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:boruto_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:boruto_armorbody", "inventory"));
	}
}
