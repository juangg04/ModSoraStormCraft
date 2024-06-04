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