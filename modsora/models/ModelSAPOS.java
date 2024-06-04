// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelSAPOS extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelSAPOS() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, 5.0F, -31.0F, -4.5F, 7, 7, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, 4.8F, -33.5F, 2.7F, 7, 4, 0, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 14, 12.2F, -30.5F, -5.0F, 0, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 16, 12.2F, -31.5F, -4.0F, 0, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 24, 12.2F, -32.5F, -3.0F, 0, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 26, 12.2F, -33.5F, -2.0F, 0, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 25, 9, 5.25F, -36.0F, -4.25F, 6, 5, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, 4.8F, -30.5F, -5.0F, 0, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, 4.8F, -31.5F, -4.0F, 0, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, 4.8F, -32.5F, -3.0F, 0, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, 4.8F, -33.5F, -2.0F, 0, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -12.0F, -31.0F, -4.5F, 7, 7, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 38, 52, -11.75F, -36.0F, -4.25F, 6, 5, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, -12.2F, -30.5F, -5.0F, 0, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, -12.2F, -31.5F, -4.0F, 0, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, -12.2F, -33.5F, -2.0F, 0, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, -12.2F, -32.5F, -3.0F, 0, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 14, -4.8F, -30.5F, -5.0F, 0, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 16, -4.8F, -31.5F, -4.0F, 0, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 24, -4.8F, -32.5F, -3.0F, 0, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 26, -4.8F, -33.5F, -2.0F, 0, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 0, -12.2F, -33.5F, 2.7F, 7, 4, 0, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.0036F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 3, -9.0F, -21.0F, 23.0F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 0, -9.0F, -33.0F, -19.0F, 1, 1, 5, 0.0F, false));
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