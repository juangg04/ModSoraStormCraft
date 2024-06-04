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
		unknown_bone_r1.cubeList
				.add(new ModelBox(unknown_bone_r1, 50, 0, 0.1874F, -15.0F, 5.1548F, 2, 2, 5, 0.0F, false));

		unknown_bone_r2 = new ModelRenderer(this);
		unknown_bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r2);
		setRotationAngle(unknown_bone_r2, 0.0F, -0.5236F, 0.0F);
		unknown_bone_r2.cubeList
				.add(new ModelBox(unknown_bone_r2, 52, 0, -0.4019F, -15.0F, 6.2321F, 2, 2, 4, 0.0F, false));

		unknown_bone_r3 = new ModelRenderer(this);
		unknown_bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r3);
		setRotationAngle(unknown_bone_r3, -0.8727F, 0.0F, -0.5236F);
		unknown_bone_r3.cubeList
				.add(new ModelBox(unknown_bone_r3, 0, 0, 10.2942F, -4.5837F, -5.2604F, 3, 6, 3, 0.0F, false));

		unknown_bone_r4 = new ModelRenderer(this);
		unknown_bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r4);
		setRotationAngle(unknown_bone_r4, 0.0F, 0.0F, -0.5236F);
		unknown_bone_r4.cubeList
				.add(new ModelBox(unknown_bone_r4, 0, 0, 10.4282F, -11.134F, -1.0F, 3, 6, 3, 0.0F, false));

		unknown_bone_r5 = new ModelRenderer(this);
		unknown_bone_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r5);
		setRotationAngle(unknown_bone_r5, -0.6981F, 0.0F, 0.6109F);
		unknown_bone_r5.cubeList
				.add(new ModelBox(unknown_bone_r5, 0, 0, -13.9529F, -4.3938F, -4.1745F, 3, 6, 3, 0.0F, false));

		unknown_bone_r6 = new ModelRenderer(this);
		unknown_bone_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		unknown_bone.addChild(unknown_bone_r6);
		setRotationAngle(unknown_bone_r6, 0.0F, 0.0F, 0.6109F);
		unknown_bone_r6.cubeList
				.add(new ModelBox(unknown_bone_r6, 0, 0, -14.281F, -9.9449F, -1.0F, 3, 6, 3, 0.0F, false));
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