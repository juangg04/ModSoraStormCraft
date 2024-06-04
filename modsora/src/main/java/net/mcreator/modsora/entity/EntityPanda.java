
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
public class EntityPanda extends ElementsModsoraMod.ModElement {
	public static final int ENTITYID = 16;
	public static final int ENTITYID_RANGED = 17;
	public EntityPanda(ElementsModsoraMod instance) {
		super(instance, 168);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("modsora", "panda"), ENTITYID)
				.name("panda").tracker(64, 3, true).egg(-1, -1).build());
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
			return new RenderLiving(renderManager, new Modelanimal1(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("modsora:textures/animal1.png");
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
	public static class Modelanimal1 extends ModelBase {
		private final ModelRenderer unknown_bone;
		private final ModelRenderer unknown_bone_r1;
		private final ModelRenderer unknown_bone_r2;
		private final ModelRenderer unknown_bone_r3;
		private final ModelRenderer unknown_bone_r4;
		private final ModelRenderer unknown_bone_r5;
		private final ModelRenderer unknown_bone_r6;
		public Modelanimal1() {
			textureWidth = 64;
			textureHeight = 64;
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -7.0F, -6.0F, -1.0F, 3, 6, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, 4.0F, -6.0F, -1.0F, 3, 6, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 13, 0, -5.0F, -7.0F, -3.0F, 10, 4, 7, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 12, 0, -4.0F, -7.0F, 4.0F, 8, 4, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 15, 0, -4.0F, -7.0F, -4.0F, 8, 4, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 3, 4, -5.0F, -16.0F, -4.0F, 10, 8, 9, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 38, 51, -3.0F, -22.0F, -3.0F, 6, 6, 7, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 54, 0, -1.0F, -21.0F, 4.0F, 2, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 38, 51, -4.0F, -23.0F, 1.0F, 2, 2, 2, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 38, 51, 2.0F, -23.0F, 1.0F, 2, 2, 2, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 12, 0, -4.0F, -16.0F, -5.0F, 8, 8, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 12, 0, -4.0F, -16.0F, 5.0F, 8, 8, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 25, -5.0F, -8.0F, -4.0F, 10, 1, 9, 0.0F, false));
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, 0.4363F, 0.0F);
			unknown_bone_r1.cubeList.add(new ModelBox(unknown_bone_r1, 50, 0, 0.1874F, -15.0F, 5.1548F, 2, 2, 5, 0.0F, false));
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.0F, -0.5236F, 0.0F);
			unknown_bone_r2.cubeList.add(new ModelBox(unknown_bone_r2, 52, 0, -0.4019F, -15.0F, 6.2321F, 2, 2, 4, 0.0F, false));
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, -0.8727F, 0.0F, -0.5236F);
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 0, 10.2942F, -4.5837F, -5.2604F, 3, 6, 3, 0.0F, false));
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.0F, 0.0F, -0.5236F);
			unknown_bone_r4.cubeList.add(new ModelBox(unknown_bone_r4, 0, 0, 10.4282F, -11.134F, -1.0F, 3, 6, 3, 0.0F, false));
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, -0.6981F, 0.0F, 0.6109F);
			unknown_bone_r5.cubeList.add(new ModelBox(unknown_bone_r5, 0, 0, -13.9529F, -4.3938F, -4.1745F, 3, 6, 3, 0.0F, false));
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.0F, 0.0F, 0.6109F);
			unknown_bone_r6.cubeList.add(new ModelBox(unknown_bone_r6, 0, 0, -14.281F, -9.9449F, -1.0F, 3, 6, 3, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			unknown_bone.render(f5);
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
