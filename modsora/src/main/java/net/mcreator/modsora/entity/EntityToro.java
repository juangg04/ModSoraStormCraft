
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
public class EntityToro extends ElementsModsoraMod.ModElement {
	public static final int ENTITYID = 20;
	public static final int ENTITYID_RANGED = 21;
	public EntityToro(ElementsModsoraMod instance) {
		super(instance, 170);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("modsora", "toro"), ENTITYID)
				.name("toro").tracker(64, 3, true).egg(-1, -1).build());
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
			return new RenderLiving(renderManager, new Modelanimal2(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("modsora:textures/animal2.png");
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
	public static class Modelanimal2 extends ModelBase {
		private final ModelRenderer unknown_bone;
		private final ModelRenderer unknown_bone_r1;
		private final ModelRenderer unknown_bone_r2;
		private final ModelRenderer unknown_bone_r3;
		private final ModelRenderer unknown_bone_r4;
		private final ModelRenderer unknown_bone_r5;
		private final ModelRenderer unknown_bone_r6;
		private final ModelRenderer unknown_bone_r7;
		private final ModelRenderer unknown_bone_r8;
		private final ModelRenderer unknown_bone_r9;
		private final ModelRenderer unknown_bone_r10;
		private final ModelRenderer unknown_bone_r11;
		private final ModelRenderer unknown_bone_r12;
		private final ModelRenderer unknown_bone_r13;
		public Modelanimal2() {
			textureWidth = 128;
			textureHeight = 128;
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 64, 71, -6.0F, -12.0F, 7.0F, 3, 9, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 71, 4.0F, -12.0F, 7.0F, 3, 9, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 17, 69, 5.0F, -14.0F, -5.0F, 3, 11, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 77, 46, 5.0F, -2.0F, -6.0F, 3, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 76, 71, -8.0F, -2.0F, -6.0F, 3, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 44, -8.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 3, 42, -6.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 40, 5.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 35, 22, 7.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 4, 28, 4.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 28, 6.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 27, 22, -4.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 5, 0, -6.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 77, 7, -6.0F, -2.0F, 6.0F, 3, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 37, 77, 4.0F, -2.0F, 6.0F, 3, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 67, 49, -8.0F, -14.0F, -5.0F, 3, 11, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -6.0F, -16.0F, -10.0F, 12, 11, 11, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 39, 15, -4.0F, -19.0F, -15.0F, 8, 8, 7, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 44, 65, -2.0F, -14.0F, -16.0F, 4, 3, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 56, 30, -5.0F, -20.0F, -17.0F, 10, 4, 4, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 53, -7.0F, -15.0F, -9.0F, 1, 9, 9, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 47, 47, 6.0F, -15.0F, -9.0F, 1, 9, 9, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 27, 31, -5.0F, -17.0F, -9.0F, 10, 1, 9, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 22, -4.0F, -14.0F, 1.0F, 9, 9, 9, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 11, 54, -4.0F, -15.0F, 1.0F, 9, 1, 6, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 50, 65, -5.0F, -14.0F, 1.0F, 1, 8, 6, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 36, 63, 5.0F, -14.0F, 1.0F, 1, 8, 6, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 35, 0, -3.0F, -13.0F, 10.0F, 7, 8, 1, 0.0F, false));
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, -0.5236F, 0.0F, 0.0F);
			unknown_bone_r1.cubeList.add(new ModelBox(unknown_bone_r1, 27, 22, -1.0F, -16.5622F, 3.1699F, 2, 3, 4, 0.0F, false));
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.3491F, 0.0F, 0.0F);
			unknown_bone_r2.cubeList.add(new ModelBox(unknown_bone_r2, 30, 41, 8.0F, -22.0841F, -15.8796F, 4, 4, 9, 0.0F, false));
			unknown_bone_r2.cubeList.add(new ModelBox(unknown_bone_r2, 46, 0, -12.0F, -22.0841F, -15.8796F, 4, 4, 9, 0.0F, false));
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 0.0F, 0.0F, -0.6981F);
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 23, 41, -4.4628F, -9.981F, -8.0F, 5, 2, 2, 0.0F, false));
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, 0.5236F, 0.0F, 0.0F);
			unknown_bone_r4.cubeList.add(new ModelBox(unknown_bone_r4, 0, 40, -4.0F, -15.732F, -5.3398F, 8, 6, 7, 0.0F, false));
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.1745F, -0.6109F, -0.0873F);
			unknown_bone_r5.cubeList.add(new ModelBox(unknown_bone_r5, 20, 61, -8.7707F, -18.0935F, -23.7106F, 7, 4, 4, 0.0F, false));
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.0F, 0.0F, 0.1745F);
			unknown_bone_r6.cubeList.add(new ModelBox(unknown_bone_r6, 63, 63, 0.8871F, -20.2902F, -17.0F, 7, 4, 4, 0.0F, false));
			unknown_bone_r7 = new ModelRenderer(this);
			unknown_bone_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r7);
			setRotationAngle(unknown_bone_r7, 0.0873F, 0.4363F, 0.0F);
			unknown_bone_r7.cubeList.add(new ModelBox(unknown_bone_r7, 58, 41, -1.2045F, -17.4801F, -24.4549F, 7, 4, 4, 0.0F, false));
			unknown_bone_r8 = new ModelRenderer(this);
			unknown_bone_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r8);
			setRotationAngle(unknown_bone_r8, 0.0F, 0.0F, -0.1745F);
			unknown_bone_r8.cubeList.add(new ModelBox(unknown_bone_r8, 62, 13, -7.8643F, -20.4632F, -17.0F, 7, 4, 4, 0.0F, false));
			unknown_bone_r9 = new ModelRenderer(this);
			unknown_bone_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r9);
			setRotationAngle(unknown_bone_r9, 0.7854F, 0.0F, 0.0F);
			unknown_bone_r9.cubeList.add(new ModelBox(unknown_bone_r9, 0, 22, 1.0F, -27.725F, -0.2697F, 2, 4, 2, 0.0F, false));
			unknown_bone_r9.cubeList.add(new ModelBox(unknown_bone_r9, 0, 22, 1.0F, -27.725F, -0.2697F, 2, 4, 2, 0.0F, false));
			unknown_bone_r10 = new ModelRenderer(this);
			unknown_bone_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r10);
			setRotationAngle(unknown_bone_r10, 0.2618F, 0.0F, 0.0F);
			unknown_bone_r10.cubeList.add(new ModelBox(unknown_bone_r10, 47, 41, -4.0F, -26.3108F, -10.1692F, 2, 4, 2, 0.0F, false));
			unknown_bone_r10.cubeList.add(new ModelBox(unknown_bone_r10, 29, 75, -1.0F, -7.38F, 14.3194F, 2, 8, 2, 0.0F, false));
			unknown_bone_r11 = new ModelRenderer(this);
			unknown_bone_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r11);
			setRotationAngle(unknown_bone_r11, 0.0F, 0.0F, -0.4363F);
			unknown_bone_r11.cubeList.add(new ModelBox(unknown_bone_r11, 0, 0, 9.9215F, -15.1354F, -13.0F, 1, 8, 3, 0.0F, false));
			unknown_bone_r12 = new ModelRenderer(this);
			unknown_bone_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r12);
			setRotationAngle(unknown_bone_r12, 0.0F, 0.0F, 0.4363F);
			unknown_bone_r12.cubeList.add(new ModelBox(unknown_bone_r12, 72, 0, -10.4989F, -14.2291F, -13.0F, 1, 7, 3, 0.0F, false));
			unknown_bone_r13 = new ModelRenderer(this);
			unknown_bone_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r13);
			setRotationAngle(unknown_bone_r13, -0.3491F, 0.0F, 0.0F);
			unknown_bone_r13.cubeList.add(new ModelBox(unknown_bone_r13, 35, 54, 4.0F, -6.6816F, 5.37F, 3, 3, 3, 0.0F, false));
			unknown_bone_r13.cubeList.add(new ModelBox(unknown_bone_r13, 69, 21, -6.0F, -6.6816F, 5.37F, 3, 3, 3, 0.0F, false));
			unknown_bone_r13.cubeList.add(new ModelBox(unknown_bone_r13, 76, 76, -8.0F, -2.5774F, -5.9063F, 3, 3, 3, 0.0F, false));
			unknown_bone_r13.cubeList.add(new ModelBox(unknown_bone_r13, 76, 38, 5.0F, -2.5774F, -5.9063F, 3, 3, 3, 0.0F, false));
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
