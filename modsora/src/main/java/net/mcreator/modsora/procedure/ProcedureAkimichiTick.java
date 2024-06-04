package net.mcreator.modsora.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.modsora.potion.PotionAkimichiEffect;
import net.mcreator.modsora.item.ItemAnas;
import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;
import java.util.Collection;

@ElementsModsoraMod.ModElement.Tag
public class ProcedureAkimichiTick extends ElementsModsoraMod.ModElement {
	public ProcedureAkimichiTick(ElementsModsoraMod instance) {
		super(instance, 165);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AkimichiTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionAkimichiEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAnas.body, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
