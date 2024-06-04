// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelwings_4_Converted extends ModelBase {
	private final ModelRenderer group;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelwings_4_Converted() {
		textureWidth = 64;
		textureHeight = 64;

		group = new ModelRenderer(this);
		group.setRotationPoint(0.0F, 4.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-13.0F, 0.5F, 5.5F);
		group.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -2.7489F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -13.25F, -18.5F, -2.0F, 24, 29, 0, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(13.0F, 0.5F, 5.5F);
		group.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -13.0F, -18.5F, 2.0F, 24, 29, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
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