// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelRika extends ModelBase {
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone;
	private final ModelRenderer bone7;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone10;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone12;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone13;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;

	public ModelRika() {
		textureWidth = 256;
		textureHeight = 256;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -5.0F, 4.0F);
		bone3.cubeList.add(new ModelBox(bone3, 57, 57, -6.0F, -6.0F, -3.0F, 12, 11, 13, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 70, -7.0F, -7.0F, -3.5F, 14, 3, 14, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 45, 0, -8.0F, -10.0F, -3.75F, 16, 3, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 55, 20, -9.0F, -25.0F, -3.75F, 18, 15, 15, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 29.0F, -4.0F);
		bone3.addChild(bone2);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -25.0F, 1.0F);
		bone2.addChild(Tail);

		Tail_r1 = new ModelRenderer(this);
		Tail_r1.setRotationPoint(0.0F, 8.0F, 1.5F);
		Tail.addChild(Tail_r1);
		setRotationAngle(Tail_r1, 0.9163F, 0.0F, 0.0F);
		Tail_r1.cubeList.add(new ModelBox(Tail_r1, 0, 0, -5.0F, -6.0F, -12.5F, 10, 10, 25, 0.25F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 13.5F, -4.0F);
		Tail.addChild(bone6);

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(0.0F, 4.0F, 1.0F);
		bone6.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.5672F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 86, 81, -5.0F, -7.5F, -5.0F, 10, 15, 10, 0.5F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 11.5F, 3.0F);
		bone6.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 35, -5.0F, -10.0F, -1.0F, 10, 10, 25, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -4.0F, 23.5F);
		bone.addChild(bone7);

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.2618F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 42, 81, -4.0F, -5.0F, -1.5F, 8, 8, 14, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -5.3659F, 11.1619F);
		bone7.addChild(bone8);

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone8.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.5672F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 106, 6, -3.0F, -5.0F, -5.5F, 6, 6, 12, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -5.2538F, 9.0942F);
		bone8.addChild(bone9);

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.0F, -1.0F, 2.0F);
		bone9.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 1.0908F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 116, 69, -2.0F, -3.0F, -4.0F, 4, 4, 12, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -7.9929F, 5.1157F);
		bone9.addChild(bone10);

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, -5.0F, 2.0F);
		bone10.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.6981F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 120, 94, -1.0F, 1.0F, -6.0F, 2, 2, 12, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-9.0F, -48.0F, 7.0F);
		bone2.addChild(bone4);
		setRotationAngle(bone4, 0.1309F, 0.0F, 0.5236F);
		bone4.cubeList.add(new ModelBox(bone4, 96, 106, -8.0F, -4.0F, -3.0F, 8, 23, 8, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-5.8185F, 17.0915F, 0.6462F);
		bone4.addChild(bone12);

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(0.0F, 21.0F, 0.0F);
		bone12.addChild(bone12_r1);
		setRotationAngle(bone12_r1, -0.9031F, -0.2217F, 0.2719F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 64, 106, -7.1815F, -17.0915F, -20.6462F, 8, 23, 8, 0.0F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 114, 24, -4.1815F, 2.9085F, -22.6462F, 2, 8, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.0F, 9.0F, -15.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, -0.0436F, 0.0F, 0.0F);

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(1.0F, 12.0F, 15.0F);
		bone13.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -0.9031F, -0.2217F, 0.2719F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 64, 103, -9.1815F, 2.9085F, -14.6462F, 2, 8, 2, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 106, 24, -9.1815F, 2.9085F, -17.6462F, 2, 8, 2, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 107, 69, -9.1815F, 2.9085F, -20.6462F, 2, 8, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(9.0F, -48.0F, 7.0F);
		bone2.addChild(bone5);
		setRotationAngle(bone5, 0.0685F, 0.026F, -0.5088F);
		bone5.cubeList.add(new ModelBox(bone5, 32, 103, 0.0F, -4.0F, -3.0F, 8, 23, 8, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(5.8479F, 14.936F, 0.3304F);
		bone5.addChild(bone11);

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone11.addChild(bone11_r1);
		setRotationAngle(bone11_r1, -0.8959F, 0.1945F, -0.237F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 0, 87, -0.8479F, -16.936F, -20.3304F, 8, 23, 8, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 80, 81, 7.1521F, 3.064F, -14.3304F, 2, 8, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 88, 81, 7.1521F, 3.064F, -17.3304F, 2, 8, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 92, 0, 7.1521F, 3.064F, -20.3304F, 2, 8, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 32, 94, 2.1521F, 3.064F, -22.3304F, 2, 8, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -54.0F, 3.0F);
		bone2.addChild(head);
		head.cubeList.add(new ModelBox(head, 94, 50, -6.0F, -10.0F, -8.0F, 12, 10, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 118, -5.0F, -9.0F, 1.0F, 10, 9, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 97, 139, -0.75F, -14.5F, 5.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 72, 81, -0.75F, -6.5F, 21.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 45, 35, 3.25F, -6.5F, 20.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 136, 85, 3.25F, -14.5F, 4.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 45, -4.75F, -6.5F, 20.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 136, 39, -4.75F, -14.5F, 4.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 45, -6.75F, -3.5F, 17.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 134, -6.75F, -11.5F, 1.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 35, -2.75F, -3.5F, 17.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 121, -2.75F, -11.5F, 1.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 13, 1.25F, -3.5F, 17.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 128, 108, 1.25F, -11.5F, 1.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 13, 5.25F, -3.5F, 17.25F, 2, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 121, 24, 5.25F, -11.5F, 1.0F, 2, 2, 11, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 45, 50, -6.0F, 4.0F, -7.0F, 12, 2, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 107, 0, -5.0F, 3.0F, -7.0F, 10, 1, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 24, 87, -5.0F, 0.0F, -8.0F, 10, 2, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -5.0F, -9.0F, -9.0F, 10, 9, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 10, -5.0F, 4.0F, -8.0F, 10, 2, 1, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(6.0F, -7.0F, -5.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.4363F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 121, 37, -1.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 130, 0, -5.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 15, 134, -9.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 136, 13, -13.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(6.0F, 4.5F, 18.25F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.1309F, 0.0F, 0.0F);
		head_r2.cubeList.add(new ModelBox(head_r2, 8, 13, -1.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));
		head_r2.cubeList.add(new ModelBox(head_r2, 0, 35, -5.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));
		head_r2.cubeList.add(new ModelBox(head_r2, 16, 35, -9.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));
		head_r2.cubeList.add(new ModelBox(head_r2, 45, 0, -13.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(6.0F, -10.5F, 11.5F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.829F, 0.0F, 0.0F);
		head_r3.cubeList.add(new ModelBox(head_r3, 92, 0, -1.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));
		head_r3.cubeList.add(new ModelBox(head_r3, 117, 126, -5.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));
		head_r3.cubeList.add(new ModelBox(head_r3, 0, 132, -9.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));
		head_r3.cubeList.add(new ModelBox(head_r3, 41, 134, -13.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-4.0F, -10.0F, -2.5F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.4363F, 0.0F, 0.0F);
		head_r4.cubeList.add(new ModelBox(head_r4, 136, 52, -1.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));
		head_r4.cubeList.add(new ModelBox(head_r4, 56, 137, 7.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-4.0F, 1.5F, 21.25F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.1309F, 0.0F, 0.0F);
		head_r5.cubeList.add(new ModelBox(head_r5, 16, 45, -1.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));
		head_r5.cubeList.add(new ModelBox(head_r5, 0, 70, 7.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-4.0F, -13.5F, 14.5F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, -0.829F, 0.0F, 0.0F);
		head_r6.cubeList.add(new ModelBox(head_r6, 136, 26, -1.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));
		head_r6.cubeList.add(new ModelBox(head_r6, 136, 65, 7.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0F, 1.5F, 22.25F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.1309F, 0.0F, 0.0F);
		head_r7.cubeList.add(new ModelBox(head_r7, 42, 70, -1.0F, -1.0F, -1.0F, 2, 8, 2, 0.0F, false));

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(0.0F, -13.5F, 15.5F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, -0.829F, 0.0F, 0.0F);
		head_r8.cubeList.add(new ModelBox(head_r8, 82, 137, -1.0F, -1.0F, -0.5F, 2, 2, 11, 0.0F, false));

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(0.0F, -10.0F, -1.5F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, 0.4363F, 0.0F, 0.0F);
		head_r9.cubeList.add(new ModelBox(head_r9, 112, 141, -1.0F, -1.0F, -2.5F, 2, 2, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
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