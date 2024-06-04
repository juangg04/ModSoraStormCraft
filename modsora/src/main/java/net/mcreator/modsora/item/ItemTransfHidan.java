
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

import net.mcreator.modsora.procedure.ProcedureTransfHidanBodyTickEvent;
import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.HashMap;

@ElementsModsoraMod.ModElement.Tag
public class ItemTransfHidan extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:transf_hidanhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("modsora:transf_hidanbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("modsora:transf_hidanlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("modsora:transf_hidanboots")
	public static final Item boots = null;
	public ItemTransfHidan(ElementsModsoraMod instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRANSF_HIDAN", "modsora:hidan_", 0, new int[]{15, 0, 20, 15}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("transf_hidanhelmet")
				.setRegistryName("transf_hidanhelmet").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureTransfHidanBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("transf_hidanbody").setRegistryName("transf_hidanbody").setCreativeTab(TabModSora.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("transf_hidanboots")
				.setRegistryName("transf_hidanboots").setCreativeTab(TabModSora.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("modsora:transf_hidanhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("modsora:transf_hidanbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("modsora:transf_hidanboots", "inventory"));
	}
}
