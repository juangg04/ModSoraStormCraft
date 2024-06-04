
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
public class EntityPajaro extends ElementsModsoraMod.ModElement {
	public static final int ENTITYID = 18;
	public static final int ENTITYID_RANGED = 19;
	public EntityPajaro(ElementsModsoraMod instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("modsora", "pajaro"), ENTITYID)
				.name("pajaro").tracker(64, 3, true).egg(-1, -1).build());
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
			return new RenderLiving(renderManager, new Modelanimal3(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("modsora:textures/animal3.png");
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
	public static class Modelanimal3 extends ModelBase {
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
		private final ModelRenderer unknown_bone_r14;
		public Modelanimal3() {
			textureWidth = 64;
			textureHeight = 64;
			unknown_bone = new ModelRenderer(this);
			unknown_bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 44, -1.0F, -24.0F, -6.0F, 16, 7, 13, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, 8.0801F, -11.5456F, 4.0F, 5, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, 8.0801F, -11.5456F, -6.0F, 5, 2, 3, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, 6.0801F, -10.5456F, -5.0F, 2, 1, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, 6.0801F, -10.5456F, 5.0F, 2, 1, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 2, 47, 15.0F, -24.0F, -5.0F, 2, 6, 11, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 51, -1.0F, -26.0F, -5.0F, 17, 2, 11, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 49, 0.0F, -30.0F, 15.0F, 3, 2, 13, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 50, 3.0F, -29.0F, 15.0F, 13, 1, 13, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 50, 3.0F, -29.0F, -26.0F, 13, 1, 13, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 49, 0.0F, -30.0F, -26.0F, 3, 2, 13, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 58, -1.0F, -23.0F, 7.0F, 17, 5, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 58, -1.0F, -23.0F, -7.0F, 17, 5, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 25, -22.0F, -31.0F, -2.0F, 14, 5, 5, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -18.0F, -34.0F, -2.0F, 10, 3, 5, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -18.0F, -33.0F, -3.0F, 5, 10, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -18.0F, -33.0F, 3.0F, 5, 10, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -23.0F, -30.0F, 3.0F, 5, 4, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -23.0F, -30.0F, -3.0F, 5, 4, 1, 0.0F, false));
			unknown_bone.cubeList.add(new ModelBox(unknown_bone, 0, 0, -18.0F, -26.0F, -3.0F, 10, 3, 6, 0.0F, false));
			unknown_bone_r1 = new ModelRenderer(this);
			unknown_bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r1);
			setRotationAngle(unknown_bone_r1, 0.0F, 0.0F, 0.6981F);
			unknown_bone_r1.cubeList.add(new ModelBox(unknown_bone_r1, 0, 51, -25.5888F, -18.8703F, -3.0F, 15, 6, 7, 0.0F, false));
			unknown_bone_r2 = new ModelRenderer(this);
			unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r2);
			setRotationAngle(unknown_bone_r2, 0.0F, 0.0F, 0.4363F);
			unknown_bone_r2.cubeList.add(new ModelBox(unknown_bone_r2, 0, 0, -32.4337F, -15.9133F, -2.0F, 7, 3, 5, 0.0F, false));
			unknown_bone_r3 = new ModelRenderer(this);
			unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r3);
			setRotationAngle(unknown_bone_r3, 0.0F, 0.0F, -0.5236F);
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 0, -6.1436F, -37.1244F, 3.0F, 8, 2, 1, 0.0F, false));
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 0, -6.1436F, -37.1244F, -3.0F, 8, 2, 1, 0.0F, false));
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 0, -7.1436F, -38.1244F, -2.0F, 9, 3, 5, 0.0F, false));
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 0, 7.1683F, -34.7018F, -2.0F, 8, 3, 5, 0.0F, false));
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 58, 23.0263F, -12.1699F, -7.0F, 17, 2, 4, 0.0F, false));
			unknown_bone_r3.cubeList.add(new ModelBox(unknown_bone_r3, 0, 58, 23.0263F, -12.1699F, 4.0F, 17, 2, 4, 0.0F, false));
			unknown_bone_r4 = new ModelRenderer(this);
			unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r4);
			setRotationAngle(unknown_bone_r4, -0.6109F, 0.0F, 0.0F);
			unknown_bone_r4.cubeList.add(new ModelBox(unknown_bone_r4, 0, 51, 3.0F, -16.3069F, -28.4835F, 13, 1, 12, 0.0F, false));
			unknown_bone_r4.cubeList.add(new ModelBox(unknown_bone_r4, 0, 47, 0.0F, -17.3069F, -28.4835F, 3, 2, 15, 0.0F, false));
			unknown_bone_r5 = new ModelRenderer(this);
			unknown_bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r5);
			setRotationAngle(unknown_bone_r5, 0.6109F, 0.0F, 0.0F);
			unknown_bone_r5.cubeList.add(new ModelBox(unknown_bone_r5, 0, 50, 3.0F, -15.1171F, 16.8298F, 13, 1, 13, 0.0F, false));
			unknown_bone_r5.cubeList.add(new ModelBox(unknown_bone_r5, 0, 47, 0.0F, -16.1171F, 14.8298F, 3, 2, 15, 0.0F, false));
			unknown_bone_r6 = new ModelRenderer(this);
			unknown_bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r6);
			setRotationAngle(unknown_bone_r6, 0.0F, -0.3491F, 0.0F);
			unknown_bone_r6.cubeList.add(new ModelBox(unknown_bone_r6, 0, 51, -5.6382F, -29.0F, -35.9479F, 12, 1, 12, 0.0F, false));
			unknown_bone_r6.cubeList.add(new ModelBox(unknown_bone_r6, 0, 49, -8.4572F, -30.0F, -35.9218F, 3, 2, 13, 0.0F, false));
			unknown_bone_r7 = new ModelRenderer(this);
			unknown_bone_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r7);
			setRotationAngle(unknown_bone_r7, 0.0F, 0.2618F, 0.0F);
			unknown_bone_r7.cubeList.add(new ModelBox(unknown_bone_r7, 0, 51, -3.8637F, -29.0F, 26.9647F, 12, 1, 12, 0.0F, false));
			unknown_bone_r7.cubeList.add(new ModelBox(unknown_bone_r7, 0, 49, -6.7615F, -30.0F, 26.1883F, 3, 2, 13, 0.0F, false));
			unknown_bone_r8 = new ModelRenderer(this);
			unknown_bone_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r8);
			setRotationAngle(unknown_bone_r8, 0.0F, 0.0F, -0.4363F);
			unknown_bone_r8.cubeList.add(new ModelBox(unknown_bone_r8, 0, 55, 23.4489F, -13.0762F, -3.0F, 18, 2, 7, 0.0F, false));
			unknown_bone_r9 = new ModelRenderer(this);
			unknown_bone_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r9);
			setRotationAngle(unknown_bone_r9, 0.0F, 0.0F, 0.3491F);
			unknown_bone_r9.cubeList.add(new ModelBox(unknown_bone_r9, 14, 49, 5.2494F, -20.9281F, -6.0F, 3, 7, 3, 0.0F, false));
			unknown_bone_r9.cubeList.add(new ModelBox(unknown_bone_r9, 17, 51, 5.2494F, -20.9281F, 4.0F, 3, 7, 3, 0.0F, false));
			unknown_bone_r10 = new ModelRenderer(this);
			unknown_bone_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r10);
			setRotationAngle(unknown_bone_r10, 0.0F, -0.5236F, 0.0F);
			unknown_bone_r10.cubeList.add(new ModelBox(unknown_bone_r10, 0, 0, 3.3616F, -10.5456F, -11.3927F, 4, 1, 1, 0.0F, false));
			unknown_bone_r10.cubeList.add(new ModelBox(unknown_bone_r10, 0, 0, 8.3616F, -10.5456F, -2.7325F, 4, 1, 1, 0.0F, false));
			unknown_bone_r11 = new ModelRenderer(this);
			unknown_bone_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r11);
			setRotationAngle(unknown_bone_r11, 0.0F, 0.4363F, 0.0F);
			unknown_bone_r11.cubeList.add(new ModelBox(unknown_bone_r11, 0, 0, 8.0371F, -10.5456F, 1.2588F, 4, 1, 1, 0.0F, false));
			unknown_bone_r11.cubeList.add(new ModelBox(unknown_bone_r11, 0, 0, 3.811F, -10.5456F, 10.3218F, 4, 1, 1, 0.0F, false));
			unknown_bone_r12 = new ModelRenderer(this);
			unknown_bone_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r12);
			setRotationAngle(unknown_bone_r12, -0.4363F, 0.0F, 0.0F);
			unknown_bone_r12.cubeList.add(new ModelBox(unknown_bone_r12, 52, 0, 11.0F, -30.8065F, -8.9326F, 3, 8, 3, 0.0F, false));
			unknown_bone_r13 = new ModelRenderer(this);
			unknown_bone_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r13);
			setRotationAngle(unknown_bone_r13, 0.7854F, 0.0F, 0.0F);
			unknown_bone_r13.cubeList.add(new ModelBox(unknown_bone_r13, 52, 0, -6.0F, -25.798F, 14.3095F, 3, 8, 3, 0.0F, false));
			unknown_bone_r14 = new ModelRenderer(this);
			unknown_bone_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			unknown_bone.addChild(unknown_bone_r14);
			setRotationAngle(unknown_bone_r14, 0.2618F, 0.0F, 0.0F);
			unknown_bone_r14.cubeList.add(new ModelBox(unknown_bone_r14, 52, 0, 1.0F, -16.2235F, 5.8978F, 3, 5, 3, 0.0F, false));
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
