
package net.mcreator.modsora.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.modsora.creativetab.TabModSora;
import net.mcreator.modsora.ElementsModsoraMod;

@ElementsModsoraMod.ModElement.Tag
public class ItemUltimateKazekage extends ElementsModsoraMod.ModElement {
	@GameRegistry.ObjectHolder("modsora:ultimate_kazekage")
	public static final Item block = null;
	public ItemUltimateKazekage(ElementsModsoraMod instance) {
		super(instance, 199);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("modsora:ultimate_kazekage", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("ultimate_kazekage");
			setRegistryName("ultimate_kazekage");
			setCreativeTab(TabModSora.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
