package net.mcreator.modsora.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Map;

@ElementsModsoraMod.ModElement.Tag
public class ProcedureKatanaNaranjaToolInHandTick extends ElementsModsoraMod.ModElement {
	public ProcedureKatanaNaranjaToolInHandTick(ElementsModsoraMod instance) {
		super(instance, 87);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KatanaNaranjaToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 60, (int) 5));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, (int) 60, (int) 10));
	}
}
