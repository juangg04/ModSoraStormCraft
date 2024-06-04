
package net.mcreator.modsora.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.modsora.item.ItemIcon;
import net.mcreator.modsora.ElementsModsoraMod;

@ElementsModsoraMod.ModElement.Tag
public class TabModSora extends ElementsModsoraMod.ModElement {
	public TabModSora(ElementsModsoraMod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmod_sora") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
