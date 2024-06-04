
package net.mcreator.modsora.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.modsora.ElementsModsoraMod;

import java.util.Iterator;
import java.util.ArrayList;

@ElementsModsoraMod.ModElement.Tag
public class EntityClonAceite extends ElementsModsoraMod.ModElement {
	public static final int ENTITYID = 22;
	public static final int ENTITYID_RANGED = 23;
	public EntityClonAceite(ElementsModsoraMod instance) {
		super(instance, 208);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("modsora", "clon_aceite"), ENTITYID).name("clon_aceite").tracker(64, 3, true).egg(-1, -1).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
		EntityRegistry.addSpawn(EntityCustom.class, 20, 4, 4, EnumCreatureType.MONSTER, spawnBiomes);
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new ModelNinoGordo(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("modsora:textures/hozuki.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.2, false));
			this.tasks.addTask(2, new EntityAIWander(this, 1));
			this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.tasks.addTask(5, new EntityAISwimming(this));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelNinoGordo extends ModelBase {
		private final ModelRenderer bb_main;
		public ModelNinoGordo() {
			textureWidth = 64;
			textureHeight = 64;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, 0.0F, -12.0F, -1.0F, 4, 12, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 16, 36, -4.0F, -12.0F, -1.0F, 4, 12, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -24.0F, -3.0F, 12, 12, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 36, 6.0F, -24.0F, -1.0F, 4, 12, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 32, 20, -10.0F, -24.0F, -1.0F, 4, 12, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 20, -4.0F, -32.0F, -3.0F, 8, 8, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 32, 0, -6.0F, -12.0F, 5.0F, 12, 5, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 28, 45, 6.0F, -12.0F, -3.0F, 0, 5, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 46, 45, -6.0F, -12.0F, -3.0F, 0, 5, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 26, 58, 2.0F, -12.0F, -3.0F, 4, 5, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 43, 59, -6.0F, -12.0F, -3.0F, 4, 5, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 50, 19, 1.0F, -12.0F, -3.0F, 1, 4, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 51, 48, 0.0F, -12.0F, -3.0F, 1, 3, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 53, -1.0F, -12.0F, -3.0F, 1, 3, 0, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 4, 52, -2.0F, -12.0F, -3.0F, 1, 4, 0, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bb_main.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
