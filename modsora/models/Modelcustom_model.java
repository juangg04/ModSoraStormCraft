// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.24F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -3.96F, -8.0F, -4.04F, 8, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -3.955F, -7.995F, -4.045F, 8, 8, 8, 0.5F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -0.24F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -3.96F, 0.12F, -2.02F, 8, 12, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.05F, 1.78F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -2.99F, -1.9F, -2.02F, 4, 12, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 32, -2.9875F, -1.8975F, -2.0225F, 4, 12, 4, 0.25F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.05F, 1.78F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 48, -0.97F, -1.9F, -2.02F, 4, 12, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 48, -0.9675F, -1.8975F, -2.0225F, 4, 12, 4, 0.25F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.919F, 11.88F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -1.98F, 0.12F, -2.02F, 4, 12, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, -1.9775F, 0.1225F, -2.0225F, 4, 12, 4, 0.25F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.919F, 11.88F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 48, -1.98F, 0.12F, -2.02F, 4, 12, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 48, -1.9775F, 0.1225F, -2.0225F, 4, 12, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
		RightLeg.render(f5);
		LeftLeg.render(f5);
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