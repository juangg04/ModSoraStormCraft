// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelmanolo extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelmanolo() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 51, 27, 1.0F, -4.0F, -6.0F, 4, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 35, -14.0F, -4.0F, -6.0F, 4, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 27, 1.0F, -4.0F, 12.0F, 4, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 8, -14.0F, -4.0F, 12.0F, 4, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 27, -12.5F, -13.0F, -4.5F, 16, 6, 19, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.5F, -8.0F, -5.5F, 18, 6, 21, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.5F, -6.0F, -9.0F, 6, 4, 4, 0.0F, false));
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