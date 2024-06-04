// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelmk_saiken2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mk_saiken2"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public Modelmk_saiken2(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Doideras = body.addOrReplaceChild("Doideras", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition fogo = Doideras.addOrReplaceChild("fogo", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition fogo_r1 = fogo.addOrReplaceChild("fogo_r1",
				CubeListBuilder.create().texOffs(1241, 334).addBox(-17.0F, 16.0F, 0.0F, 4.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -18.0F, 2.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition fogo_r2 = fogo.addOrReplaceChild("fogo_r2",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 17.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-13.0F, -12.0F, 22.0F, -0.829F, 0.1309F, -0.2182F));

		PartDefinition fogo_r3 = fogo.addOrReplaceChild("fogo_r3",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 18.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-15.0F, -21.0F, 19.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition fogo_r4 = fogo.addOrReplaceChild("fogo_r4",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 16.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(20.0F, -22.0F, -1.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition fogo_r5 = fogo.addOrReplaceChild("fogo_r5",
				CubeListBuilder.create().texOffs(1241, 334).addBox(-17.0F, 17.0F, 0.0F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.0F, 11.0F, 3.0F, 0.0F, 0.0F, 1.2217F));

		PartDefinition fogo_r6 = fogo.addOrReplaceChild("fogo_r6",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(14.0F, 17.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-29.0F, 6.0F, -2.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition fogo_r7 = fogo.addOrReplaceChild("fogo_r7",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 18.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.0F, -12.0F, 16.0F, -0.6545F, -0.1309F, -0.1309F));

		PartDefinition fogo_r8 = fogo.addOrReplaceChild("fogo_r8",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 15.0F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.0F, -29.0F, 9.0F, -0.6545F, -0.3927F, 0.0F));

		PartDefinition fogo_r9 = fogo.addOrReplaceChild("fogo_r9",
				CubeListBuilder.create().texOffs(1241, 334).addBox(-17.0F, 15.0F, 0.0F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -26.0F, 9.0F, -0.6545F, 0.3927F, 0.0F));

		PartDefinition bone3 = Doideras.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition quinas = bone3.addOrReplaceChild("quinas", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition quina1 = quinas.addOrReplaceChild("quina1", CubeListBuilder.create(),
				PartPose.offset(-3.7519F, -12.135F, 3.4451F));

		PartDefinition quina1_r1 = quina1.addOrReplaceChild("quina1_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -0.4014F, 0.0F));

		PartDefinition quina1_r2 = quina1.addOrReplaceChild("quina1_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -1.2217F, 0.0F));

		PartDefinition quina1_r3 = quina1.addOrReplaceChild("quina1_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -0.7505F, 0.0F));

		PartDefinition quina1_r4 = quina1.addOrReplaceChild("quina1_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -0.925F, 0.0F));

		PartDefinition quina1_r5 = quina1.addOrReplaceChild("quina1_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -1.0996F, 0.0F));

		PartDefinition quina1_r6 = quina1.addOrReplaceChild("quina1_r6",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -0.576F, 0.0F));

		PartDefinition quina1_r7 = quina1.addOrReplaceChild("quina1_r7",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, -0.1745F, 0.0F));

		PartDefinition bone2 = quina1.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(3.7519F, 12.135F, -3.4451F));

		PartDefinition quinatop = quinas.addOrReplaceChild("quinatop", CubeListBuilder.create(),
				PartPose.offset(0.3329F, -23.865F, 4.4F));

		PartDefinition quinatop_r1 = quinatop.addOrReplaceChild("quinatop_r1",
				CubeListBuilder.create().texOffs(0, 951).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3665F, -1.5272F, 0.0F));

		PartDefinition quinatop_r2 = quinatop.addOrReplaceChild("quinatop_r2",
				CubeListBuilder.create().texOffs(0, 911).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3665F, -1.309F, 0.0F));

		PartDefinition quinatop_r3 = quinatop.addOrReplaceChild("quinatop_r3",
				CubeListBuilder.create().texOffs(0, 898).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3491F, -1.1345F, 0.0F));

		PartDefinition quinatop_r4 = quinatop.addOrReplaceChild("quinatop_r4",
				CubeListBuilder.create().texOffs(0, 885).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3491F, -0.8727F, 0.0F));

		PartDefinition quinatop_r5 = quinatop.addOrReplaceChild("quinatop_r5",
				CubeListBuilder.create().texOffs(0, 927).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3491F, -0.6545F, 0.0F));

		PartDefinition quinatop_r6 = quinatop.addOrReplaceChild("quinatop_r6",
				CubeListBuilder.create().texOffs(0, 912).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3491F, -0.4363F, 0.0F));

		PartDefinition quinatop_r7 = quinatop.addOrReplaceChild("quinatop_r7",
				CubeListBuilder.create().texOffs(0, 928).addBox(-0.6F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.3491F, -0.2182F, 0.0F));

		PartDefinition quinas2 = bone3.addOrReplaceChild("quinas2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition quina2 = quinas2.addOrReplaceChild("quina2", CubeListBuilder.create(),
				PartPose.offset(3.7519F, -12.135F, 3.4451F));

		PartDefinition quina2_r1 = quina2.addOrReplaceChild("quina2_r1", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.4014F, 0.0F));

		PartDefinition quina2_r2 = quina2.addOrReplaceChild("quina2_r2", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 1.2217F, 0.0F));

		PartDefinition quina2_r3 = quina2.addOrReplaceChild("quina2_r3", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.7505F, 0.0F));

		PartDefinition quina2_r4 = quina2.addOrReplaceChild("quina2_r4", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.925F, 0.0F));

		PartDefinition quina2_r5 = quina2.addOrReplaceChild("quina2_r5", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 1.0996F, 0.0F));

		PartDefinition quina2_r6 = quina2.addOrReplaceChild("quina2_r6", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.576F, 0.0F));

		PartDefinition quina2_r7 = quina2.addOrReplaceChild("quina2_r7", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, 0.0F, 0.0F, 0.6F, 11.0F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.1745F, 0.0F));

		PartDefinition bone4 = quina2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(-3.7519F, 12.135F, -3.4451F));

		PartDefinition quinatop2 = quinas2.addOrReplaceChild("quinatop2", CubeListBuilder.create(),
				PartPose.offset(-0.3329F, -23.865F, 4.4F));

		PartDefinition quinatop2_r1 = quinatop2.addOrReplaceChild("quinatop2_r1",
				CubeListBuilder.create().texOffs(0, 951).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3665F, 1.5272F, 0.0F));

		PartDefinition quinatop2_r2 = quinatop2.addOrReplaceChild("quinatop2_r2",
				CubeListBuilder.create().texOffs(0, 911).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3665F, 1.309F, 0.0F));

		PartDefinition quinatop2_r3 = quinatop2.addOrReplaceChild("quinatop2_r3",
				CubeListBuilder.create().texOffs(0, 898).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3491F, 1.1345F, 0.0F));

		PartDefinition quinatop2_r4 = quinatop2.addOrReplaceChild("quinatop2_r4",
				CubeListBuilder.create().texOffs(0, 885).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3491F, 0.8727F, 0.0F));

		PartDefinition quinatop2_r5 = quinatop2.addOrReplaceChild("quinatop2_r5",
				CubeListBuilder.create().texOffs(0, 927).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3491F, 0.6545F, 0.0F));

		PartDefinition quinatop2_r6 = quinatop2.addOrReplaceChild("quinatop2_r6",
				CubeListBuilder.create().texOffs(0, 912).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3491F, 0.4363F, 0.0F));

		PartDefinition quinatop2_r7 = quinatop2.addOrReplaceChild("quinatop2_r7",
				CubeListBuilder.create().texOffs(0, 928).mirror()
						.addBox(0.0F, -5.7F, 0.0F, 0.6F, 5.7F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.3491F, 0.2182F, 0.0F));

		PartDefinition bone = Doideras.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(0, 963).addBox(-4.6F, -5.7F, 0.0F, 8.6F, 5.7F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3329F, -23.865F, 4.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.6F, 0.0F, 0.0F, 8.6F, 11.0F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3329F, -12.135F, 3.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3",
				CubeListBuilder.create().texOffs(317, 899).addBox(1.5F, -2.0F, -2.0F, 0.6F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6894F, -27.6954F, -3.0859F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone_r4 = bone.addOrReplaceChild("bone_r4",
				CubeListBuilder.create().texOffs(317, 899).mirror()
						.addBox(-2.1F, -2.0F, -2.0F, 0.6F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6894F, -27.6954F, -3.0859F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone_r5 = bone.addOrReplaceChild("bone_r5",
				CubeListBuilder.create().texOffs(292, 7).addBox(-2.1F, -9.0F, -1.0F, 0.6F, 12.0F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7329F, -15.135F, 5.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone_r6 = bone.addOrReplaceChild("bone_r6",
				CubeListBuilder.create().texOffs(278, 8).addBox(-0.2671F, -12.135F, -5.1F, 0.6F, 12.0F, 9.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0227F));

		PartDefinition bone_r7 = bone.addOrReplaceChild("bone_r7",
				CubeListBuilder.create().texOffs(278, 8).mirror()
						.addBox(-0.3329F, -12.135F, -5.1F, 0.6F, 12.0F, 9.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0227F));

		PartDefinition bone_r8 = bone.addOrReplaceChild("bone_r8",
				CubeListBuilder.create().texOffs(359, 8).addBox(1.5F, -8.0F, -2.0F, 0.6F, 11.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, -3.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone_r9 = bone.addOrReplaceChild("bone_r9",
				CubeListBuilder.create().texOffs(359, 8).mirror()
						.addBox(-2.1F, -8.0F, -2.0F, 0.6F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -4.0F, -3.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone444 = body.addOrReplaceChild("bone444", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition bone441 = bone444.addOrReplaceChild("bone441", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-4.5608F, -0.4055F, -0.066F, 7.132F, 0.66F, 0.132F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.7552F, -20.1928F, 20.35F, 0.0F, 0.3927F, 0.3927F));

		PartDefinition bone441_r1 = bone441.addOrReplaceChild("bone441_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-5.28F, -0.462F, -0.198F, 2.376F, 0.792F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0592F, -1.2635F, 0.132F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bone441_r2 = bone441.addOrReplaceChild("bone441_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-5.28F, -0.33F, -0.198F, 2.376F, 0.66F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2472F, 0.8485F, 0.132F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone441_r3 = bone441.addOrReplaceChild("bone441_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.904F, -0.2F, -0.198F, 5.808F, 0.464F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(4.1852F, 0.5658F, 0.132F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone441_r4 = bone441.addOrReplaceChild("bone441_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.528F, -0.33F, -0.198F, 5.808F, 0.528F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.5112F, -0.0755F, 0.132F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone440 = bone444
				.addOrReplaceChild("bone440",
						CubeListBuilder.create().texOffs(0, 158).mirror()
								.addBox(-3.7727F, -0.3161F, -0.0541F, 5.3482F, 0.4412F, 0.1082F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(19.1952F, -15.4128F, 14.35F, 0.0F, 0.7418F, 0.5236F));

		PartDefinition bone440_r1 = bone440.addOrReplaceChild("bone440_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-4.3296F, -0.1788F, -0.1624F, 2.4483F, 0.5494F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0157F, -1.0196F, 0.1082F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bone440_r2 = bone440.addOrReplaceChild("bone440_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-4.3296F, -0.2706F, -0.1624F, 1.8483F, 0.3412F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.9899F, 0.7122F, 0.1082F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone440_r3 = bone440.addOrReplaceChild("bone440_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.3813F, 0.336F, -0.1624F, 4.7626F, 0.2805F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.399F, 0.4804F, 0.1082F, 0.0F, 0.0F, 0.48F));

		PartDefinition bone440_r4 = bone440.addOrReplaceChild("bone440_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.533F, -0.3706F, -0.1624F, 4.8626F, 0.333F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.2064F, -0.0455F, 0.1082F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone439 = bone444
				.addOrReplaceChild("bone439",
						CubeListBuilder.create().texOffs(0, 158).mirror()
								.addBox(-1.5756F, -0.3161F, -0.0541F, 5.3482F, 0.4412F, 0.1082F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(-19.1952F, -15.4128F, 14.35F, 0.0F, -0.7418F, -0.5236F));

		PartDefinition bone439_r1 = bone439.addOrReplaceChild("bone439_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.8813F, -0.1788F, -0.1624F, 2.4483F, 0.5494F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0157F, -1.0196F, 0.1082F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone439_r2 = bone439.addOrReplaceChild("bone439_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(2.4813F, -0.2706F, -0.1624F, 1.8483F, 0.3412F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.9899F, 0.7122F, 0.1082F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone439_r3 = bone439.addOrReplaceChild("bone439_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.3813F, 0.336F, -0.1624F, 4.7626F, 0.2805F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.399F, 0.4804F, 0.1082F, 0.0F, 0.0F, -0.48F));

		PartDefinition bone439_r4 = bone439.addOrReplaceChild("bone439_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-4.3296F, -0.3706F, -0.1624F, 4.8626F, 0.333F, 0.1082F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.2064F, -0.0455F, 0.1082F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone438 = bone444.addOrReplaceChild("bone438", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-2.5712F, -0.4055F, -0.066F, 7.132F, 0.66F, 0.132F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.7552F, -20.1928F, 20.35F, 0.0F, -0.3927F, -0.3927F));

		PartDefinition bone438_r1 = bone438.addOrReplaceChild("bone438_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(2.904F, -0.462F, -0.198F, 2.376F, 0.792F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.0592F, -1.2635F, 0.132F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone438_r2 = bone438.addOrReplaceChild("bone438_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(2.904F, -0.33F, -0.198F, 2.376F, 0.66F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.2472F, 0.8485F, 0.132F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone438_r3 = bone438.addOrReplaceChild("bone438_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.904F, -0.2F, -0.198F, 5.808F, 0.464F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.1852F, 0.5658F, 0.132F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone438_r4 = bone438.addOrReplaceChild("bone438_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-5.28F, -0.33F, -0.198F, 5.808F, 0.528F, 0.132F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.5112F, -0.0755F, 0.132F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone437 = bone444.addOrReplaceChild("bone437",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-1.7F, -36.5F, 20.3F, 5.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition bone437_r1 = bone437.addOrReplaceChild("bone437_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(2.2F, -0.35F, -0.15F, 1.8F, 0.6F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1F, -37.15F, 20.45F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone437_r2 = bone437.addOrReplaceChild("bone437_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(2.2F, -0.25F, -0.15F, 1.8F, 0.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -35.55F, 20.45F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone437_r3 = bone437.addOrReplaceChild("bone437_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.2F, 0.0F, -0.15F, 4.4F, 0.2F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2257F, -35.7642F, 20.45F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone437_r4 = bone437.addOrReplaceChild("bone437_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-4.0F, -0.25F, -0.15F, 4.4F, 0.4F, 0.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2F, -36.25F, 20.45F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone365 = bone444.addOrReplaceChild("bone365", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1745F, -1.309F, 0.0F));

		PartDefinition bone366 = bone365.addOrReplaceChild("bone366",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone366_r1 = bone366.addOrReplaceChild("bone366_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone366_r2 = bone366.addOrReplaceChild("bone366_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone366_r3 = bone366.addOrReplaceChild("bone366_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone366_r4 = bone366.addOrReplaceChild("bone366_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone367 = bone365.addOrReplaceChild("bone367",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone367_r1 = bone367.addOrReplaceChild("bone367_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone367_r2 = bone367.addOrReplaceChild("bone367_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone367_r3 = bone367.addOrReplaceChild("bone367_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone367_r4 = bone367.addOrReplaceChild("bone367_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone368 = bone365.addOrReplaceChild("bone368",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone368_r1 = bone368.addOrReplaceChild("bone368_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone368_r2 = bone368.addOrReplaceChild("bone368_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone368_r3 = bone368.addOrReplaceChild("bone368_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone368_r4 = bone368.addOrReplaceChild("bone368_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone369 = bone365.addOrReplaceChild("bone369",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone369_r1 = bone369.addOrReplaceChild("bone369_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone369_r2 = bone369.addOrReplaceChild("bone369_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone369_r3 = bone369.addOrReplaceChild("bone369_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone369_r4 = bone369.addOrReplaceChild("bone369_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone370 = bone365.addOrReplaceChild("bone370",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone370_r1 = bone370.addOrReplaceChild("bone370_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone370_r2 = bone370.addOrReplaceChild("bone370_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone370_r3 = bone370.addOrReplaceChild("bone370_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone370_r4 = bone370.addOrReplaceChild("bone370_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone371 = bone365.addOrReplaceChild("bone371",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone371_r1 = bone371.addOrReplaceChild("bone371_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone371_r2 = bone371.addOrReplaceChild("bone371_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone371_r3 = bone371.addOrReplaceChild("bone371_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone371_r4 = bone371.addOrReplaceChild("bone371_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone372 = bone365.addOrReplaceChild("bone372",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone372_r1 = bone372.addOrReplaceChild("bone372_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone372_r2 = bone372.addOrReplaceChild("bone372_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone372_r3 = bone372.addOrReplaceChild("bone372_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone372_r4 = bone372.addOrReplaceChild("bone372_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone373 = bone365.addOrReplaceChild("bone373",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone373_r1 = bone373.addOrReplaceChild("bone373_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone373_r2 = bone373.addOrReplaceChild("bone373_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone373_r3 = bone373.addOrReplaceChild("bone373_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone373_r4 = bone373.addOrReplaceChild("bone373_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone374 = bone365.addOrReplaceChild("bone374",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone374_r1 = bone374.addOrReplaceChild("bone374_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone374_r2 = bone374.addOrReplaceChild("bone374_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone374_r3 = bone374.addOrReplaceChild("bone374_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone374_r4 = bone374.addOrReplaceChild("bone374_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone375 = bone365.addOrReplaceChild("bone375",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone375_r1 = bone375.addOrReplaceChild("bone375_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone375_r2 = bone375.addOrReplaceChild("bone375_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone375_r3 = bone375.addOrReplaceChild("bone375_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone375_r4 = bone375.addOrReplaceChild("bone375_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone376 = bone365.addOrReplaceChild("bone376",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone376_r1 = bone376.addOrReplaceChild("bone376_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone376_r2 = bone376.addOrReplaceChild("bone376_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone376_r3 = bone376.addOrReplaceChild("bone376_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone376_r4 = bone376.addOrReplaceChild("bone376_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone377 = bone365.addOrReplaceChild("bone377",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone377_r1 = bone377.addOrReplaceChild("bone377_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone377_r2 = bone377.addOrReplaceChild("bone377_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone377_r3 = bone377.addOrReplaceChild("bone377_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone377_r4 = bone377.addOrReplaceChild("bone377_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone378 = bone365.addOrReplaceChild("bone378",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone378_r1 = bone378.addOrReplaceChild("bone378_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone378_r2 = bone378.addOrReplaceChild("bone378_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone378_r3 = bone378.addOrReplaceChild("bone378_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone378_r4 = bone378.addOrReplaceChild("bone378_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone379 = bone365.addOrReplaceChild("bone379",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone379_r1 = bone379.addOrReplaceChild("bone379_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone379_r2 = bone379.addOrReplaceChild("bone379_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone379_r3 = bone379.addOrReplaceChild("bone379_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone379_r4 = bone379.addOrReplaceChild("bone379_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone380 = bone365.addOrReplaceChild("bone380",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone380_r1 = bone380.addOrReplaceChild("bone380_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone380_r2 = bone380.addOrReplaceChild("bone380_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone380_r3 = bone380.addOrReplaceChild("bone380_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone380_r4 = bone380.addOrReplaceChild("bone380_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone381 = bone365.addOrReplaceChild("bone381", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone381_r1 = bone381.addOrReplaceChild("bone381_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone381_r2 = bone381.addOrReplaceChild("bone381_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone381_r3 = bone381.addOrReplaceChild("bone381_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone381_r4 = bone381.addOrReplaceChild("bone381_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone382 = bone365.addOrReplaceChild("bone382", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone382_r1 = bone382.addOrReplaceChild("bone382_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone382_r2 = bone382.addOrReplaceChild("bone382_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone382_r3 = bone382.addOrReplaceChild("bone382_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone382_r4 = bone382.addOrReplaceChild("bone382_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone383 = bone365.addOrReplaceChild("bone383",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone383_r1 = bone383.addOrReplaceChild("bone383_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone383_r2 = bone383.addOrReplaceChild("bone383_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone383_r3 = bone383.addOrReplaceChild("bone383_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone383_r4 = bone383.addOrReplaceChild("bone383_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone384 = bone365.addOrReplaceChild("bone384",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone384_r1 = bone384.addOrReplaceChild("bone384_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone384_r2 = bone384.addOrReplaceChild("bone384_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone384_r3 = bone384.addOrReplaceChild("bone384_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone384_r4 = bone384.addOrReplaceChild("bone384_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone385 = bone365.addOrReplaceChild("bone385", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone386 = bone385.addOrReplaceChild("bone386", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone387 = bone386.addOrReplaceChild("bone387", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon122 = bone387.addOrReplaceChild("hexadecagon122",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -3.0107F));

		PartDefinition hexadecagon122_r1 = hexadecagon122.addOrReplaceChild("hexadecagon122_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon122_r2 = hexadecagon122.addOrReplaceChild("hexadecagon122_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon122_r3 = hexadecagon122.addOrReplaceChild("hexadecagon122_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon122_r4 = hexadecagon122.addOrReplaceChild("hexadecagon122_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon123 = bone387.addOrReplaceChild("hexadecagon123",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.8798F));

		PartDefinition hexadecagon123_r1 = hexadecagon123.addOrReplaceChild("hexadecagon123_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon123_r2 = hexadecagon123.addOrReplaceChild("hexadecagon123_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon123_r3 = hexadecagon123.addOrReplaceChild("hexadecagon123_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon123_r4 = hexadecagon123.addOrReplaceChild("hexadecagon123_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon124 = bone387.addOrReplaceChild("hexadecagon124",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.7489F));

		PartDefinition hexadecagon124_r1 = hexadecagon124.addOrReplaceChild("hexadecagon124_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon124_r2 = hexadecagon124.addOrReplaceChild("hexadecagon124_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon124_r3 = hexadecagon124.addOrReplaceChild("hexadecagon124_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon124_r4 = hexadecagon124.addOrReplaceChild("hexadecagon124_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon125 = bone387.addOrReplaceChild("hexadecagon125",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.618F));

		PartDefinition hexadecagon125_r1 = hexadecagon125.addOrReplaceChild("hexadecagon125_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon125_r2 = hexadecagon125.addOrReplaceChild("hexadecagon125_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon125_r3 = hexadecagon125.addOrReplaceChild("hexadecagon125_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon125_r4 = hexadecagon125.addOrReplaceChild("hexadecagon125_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon126 = bone387.addOrReplaceChild("hexadecagon126",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.4871F));

		PartDefinition hexadecagon126_r1 = hexadecagon126.addOrReplaceChild("hexadecagon126_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon126_r2 = hexadecagon126.addOrReplaceChild("hexadecagon126_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon126_r3 = hexadecagon126.addOrReplaceChild("hexadecagon126_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon126_r4 = hexadecagon126.addOrReplaceChild("hexadecagon126_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon127 = bone387.addOrReplaceChild("hexadecagon127",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.3562F));

		PartDefinition hexadecagon127_r1 = hexadecagon127.addOrReplaceChild("hexadecagon127_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon127_r2 = hexadecagon127.addOrReplaceChild("hexadecagon127_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon127_r3 = hexadecagon127.addOrReplaceChild("hexadecagon127_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon127_r4 = hexadecagon127.addOrReplaceChild("hexadecagon127_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon128 = bone387.addOrReplaceChild("hexadecagon128",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.2253F));

		PartDefinition hexadecagon128_r1 = hexadecagon128.addOrReplaceChild("hexadecagon128_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon128_r2 = hexadecagon128.addOrReplaceChild("hexadecagon128_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon128_r3 = hexadecagon128.addOrReplaceChild("hexadecagon128_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon128_r4 = hexadecagon128.addOrReplaceChild("hexadecagon128_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon129 = bone387.addOrReplaceChild("hexadecagon129",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.0944F));

		PartDefinition hexadecagon129_r1 = hexadecagon129.addOrReplaceChild("hexadecagon129_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon129_r2 = hexadecagon129.addOrReplaceChild("hexadecagon129_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon129_r3 = hexadecagon129.addOrReplaceChild("hexadecagon129_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon129_r4 = hexadecagon129.addOrReplaceChild("hexadecagon129_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon130 = bone387.addOrReplaceChild("hexadecagon130",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.9635F));

		PartDefinition hexadecagon130_r1 = hexadecagon130.addOrReplaceChild("hexadecagon130_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon130_r2 = hexadecagon130.addOrReplaceChild("hexadecagon130_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon130_r3 = hexadecagon130.addOrReplaceChild("hexadecagon130_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon130_r4 = hexadecagon130.addOrReplaceChild("hexadecagon130_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon131 = bone387.addOrReplaceChild("hexadecagon131",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.8326F));

		PartDefinition hexadecagon131_r1 = hexadecagon131.addOrReplaceChild("hexadecagon131_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon131_r2 = hexadecagon131.addOrReplaceChild("hexadecagon131_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon131_r3 = hexadecagon131.addOrReplaceChild("hexadecagon131_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon131_r4 = hexadecagon131.addOrReplaceChild("hexadecagon131_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon132 = bone387.addOrReplaceChild("hexadecagon132",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.7017F));

		PartDefinition hexadecagon132_r1 = hexadecagon132.addOrReplaceChild("hexadecagon132_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon132_r2 = hexadecagon132.addOrReplaceChild("hexadecagon132_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon132_r3 = hexadecagon132.addOrReplaceChild("hexadecagon132_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon132_r4 = hexadecagon132.addOrReplaceChild("hexadecagon132_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon133 = bone387.addOrReplaceChild("hexadecagon133",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hexadecagon133_r1 = hexadecagon133.addOrReplaceChild("hexadecagon133_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon133_r2 = hexadecagon133.addOrReplaceChild("hexadecagon133_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon133_r3 = hexadecagon133.addOrReplaceChild("hexadecagon133_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon133_r4 = hexadecagon133.addOrReplaceChild("hexadecagon133_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon134 = bone387.addOrReplaceChild("hexadecagon134",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.4399F));

		PartDefinition hexadecagon134_r1 = hexadecagon134.addOrReplaceChild("hexadecagon134_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon134_r2 = hexadecagon134.addOrReplaceChild("hexadecagon134_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon134_r3 = hexadecagon134.addOrReplaceChild("hexadecagon134_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon134_r4 = hexadecagon134.addOrReplaceChild("hexadecagon134_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon135 = bone387.addOrReplaceChild("hexadecagon135",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.309F));

		PartDefinition hexadecagon135_r1 = hexadecagon135.addOrReplaceChild("hexadecagon135_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon135_r2 = hexadecagon135.addOrReplaceChild("hexadecagon135_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon135_r3 = hexadecagon135.addOrReplaceChild("hexadecagon135_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon135_r4 = hexadecagon135.addOrReplaceChild("hexadecagon135_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon136 = bone387.addOrReplaceChild("hexadecagon136",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.1781F));

		PartDefinition hexadecagon136_r1 = hexadecagon136.addOrReplaceChild("hexadecagon136_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon136_r2 = hexadecagon136.addOrReplaceChild("hexadecagon136_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon136_r3 = hexadecagon136.addOrReplaceChild("hexadecagon136_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon136_r4 = hexadecagon136.addOrReplaceChild("hexadecagon136_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon137 = bone387.addOrReplaceChild("hexadecagon137",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.0472F));

		PartDefinition hexadecagon137_r1 = hexadecagon137.addOrReplaceChild("hexadecagon137_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon137_r2 = hexadecagon137.addOrReplaceChild("hexadecagon137_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon137_r3 = hexadecagon137.addOrReplaceChild("hexadecagon137_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon137_r4 = hexadecagon137.addOrReplaceChild("hexadecagon137_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon138 = bone387.addOrReplaceChild("hexadecagon138",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.9163F));

		PartDefinition hexadecagon138_r1 = hexadecagon138.addOrReplaceChild("hexadecagon138_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon138_r2 = hexadecagon138.addOrReplaceChild("hexadecagon138_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon138_r3 = hexadecagon138.addOrReplaceChild("hexadecagon138_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon138_r4 = hexadecagon138.addOrReplaceChild("hexadecagon138_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon139 = bone387.addOrReplaceChild("hexadecagon139",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon139_r1 = hexadecagon139.addOrReplaceChild("hexadecagon139_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon139_r2 = hexadecagon139.addOrReplaceChild("hexadecagon139_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon139_r3 = hexadecagon139.addOrReplaceChild("hexadecagon139_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon139_r4 = hexadecagon139.addOrReplaceChild("hexadecagon139_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon140 = bone387.addOrReplaceChild("hexadecagon140",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.6545F));

		PartDefinition hexadecagon140_r1 = hexadecagon140.addOrReplaceChild("hexadecagon140_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon140_r2 = hexadecagon140.addOrReplaceChild("hexadecagon140_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon140_r3 = hexadecagon140.addOrReplaceChild("hexadecagon140_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon140_r4 = hexadecagon140.addOrReplaceChild("hexadecagon140_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon141 = bone387.addOrReplaceChild("hexadecagon141",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.5236F));

		PartDefinition hexadecagon141_r1 = hexadecagon141.addOrReplaceChild("hexadecagon141_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon141_r2 = hexadecagon141.addOrReplaceChild("hexadecagon141_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon141_r3 = hexadecagon141.addOrReplaceChild("hexadecagon141_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon141_r4 = hexadecagon141.addOrReplaceChild("hexadecagon141_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon142 = bone387.addOrReplaceChild("hexadecagon142",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon142_r1 = hexadecagon142.addOrReplaceChild("hexadecagon142_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon142_r2 = hexadecagon142.addOrReplaceChild("hexadecagon142_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon142_r3 = hexadecagon142.addOrReplaceChild("hexadecagon142_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon142_r4 = hexadecagon142.addOrReplaceChild("hexadecagon142_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon143 = bone387.addOrReplaceChild("hexadecagon143",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.2618F));

		PartDefinition hexadecagon143_r1 = hexadecagon143.addOrReplaceChild("hexadecagon143_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon143_r2 = hexadecagon143.addOrReplaceChild("hexadecagon143_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon143_r3 = hexadecagon143.addOrReplaceChild("hexadecagon143_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon143_r4 = hexadecagon143.addOrReplaceChild("hexadecagon143_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon144 = bone387.addOrReplaceChild("hexadecagon144",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hexadecagon144_r1 = hexadecagon144.addOrReplaceChild("hexadecagon144_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon144_r2 = hexadecagon144.addOrReplaceChild("hexadecagon144_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon144_r3 = hexadecagon144.addOrReplaceChild("hexadecagon144_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon144_r4 = hexadecagon144.addOrReplaceChild("hexadecagon144_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon145 = bone387.addOrReplaceChild("hexadecagon145",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon145_r1 = hexadecagon145.addOrReplaceChild("hexadecagon145_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon145_r2 = hexadecagon145.addOrReplaceChild("hexadecagon145_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon145_r3 = hexadecagon145.addOrReplaceChild("hexadecagon145_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon145_r4 = hexadecagon145.addOrReplaceChild("hexadecagon145_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone388 = bone385.addOrReplaceChild("bone388", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone389 = bone388.addOrReplaceChild("bone389", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone389_r1 = bone389.addOrReplaceChild("bone389_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone390 = bone388.addOrReplaceChild("bone390", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone390_r1 = bone390.addOrReplaceChild("bone390_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone391 = bone388.addOrReplaceChild("bone391", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone391_r1 = bone391.addOrReplaceChild("bone391_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone392 = bone388.addOrReplaceChild("bone392", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone392_r1 = bone392.addOrReplaceChild("bone392_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone393 = bone388.addOrReplaceChild("bone393", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone393_r1 = bone393.addOrReplaceChild("bone393_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone394 = bone388.addOrReplaceChild("bone394", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone394_r1 = bone394.addOrReplaceChild("bone394_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone395 = bone388.addOrReplaceChild("bone395", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone395_r1 = bone395.addOrReplaceChild("bone395_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone396 = bone388.addOrReplaceChild("bone396", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone396_r1 = bone396.addOrReplaceChild("bone396_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone397 = bone388.addOrReplaceChild("bone397", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone397_r1 = bone397.addOrReplaceChild("bone397_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone398 = bone388.addOrReplaceChild("bone398", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone398_r1 = bone398.addOrReplaceChild("bone398_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone399 = bone388.addOrReplaceChild("bone399", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone399_r1 = bone399.addOrReplaceChild("bone399_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone400 = bone388.addOrReplaceChild("bone400", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone400_r1 = bone400.addOrReplaceChild("bone400_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone401 = bone388.addOrReplaceChild("bone401", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone401_r1 = bone401.addOrReplaceChild("bone401_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone402 = bone388.addOrReplaceChild("bone402", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone402_r1 = bone402.addOrReplaceChild("bone402_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone403 = bone388.addOrReplaceChild("bone403", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone403_r1 = bone403.addOrReplaceChild("bone403_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone404 = bone388.addOrReplaceChild("bone404", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone404_r1 = bone404.addOrReplaceChild("bone404_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone405 = bone388.addOrReplaceChild("bone405", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone405_r1 = bone405.addOrReplaceChild("bone405_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone406 = bone388.addOrReplaceChild("bone406", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone406_r1 = bone406.addOrReplaceChild("bone406_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone407 = bone388.addOrReplaceChild("bone407", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone407_r1 = bone407.addOrReplaceChild("bone407_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone408 = bone388.addOrReplaceChild("bone408", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone408_r1 = bone408.addOrReplaceChild("bone408_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone409 = bone388.addOrReplaceChild("bone409", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone409_r1 = bone409.addOrReplaceChild("bone409_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone410 = bone388.addOrReplaceChild("bone410", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone410_r1 = bone410.addOrReplaceChild("bone410_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone411 = bone388.addOrReplaceChild("bone411", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone411_r1 = bone411.addOrReplaceChild("bone411_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone412 = bone388.addOrReplaceChild("bone412", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone412_r1 = bone412.addOrReplaceChild("bone412_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone413 = bone388.addOrReplaceChild("bone413", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone413_r1 = bone413.addOrReplaceChild("bone413_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone414 = bone388.addOrReplaceChild("bone414", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone414_r1 = bone414.addOrReplaceChild("bone414_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone415 = bone388.addOrReplaceChild("bone415", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone415_r1 = bone415.addOrReplaceChild("bone415_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone416 = bone388.addOrReplaceChild("bone416", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone416_r1 = bone416.addOrReplaceChild("bone416_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone417 = bone388.addOrReplaceChild("bone417", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone417_r1 = bone417.addOrReplaceChild("bone417_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone418 = bone388.addOrReplaceChild("bone418", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone418_r1 = bone418.addOrReplaceChild("bone418_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone419 = bone388.addOrReplaceChild("bone419", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone419_r1 = bone419.addOrReplaceChild("bone419_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone420 = bone388.addOrReplaceChild("bone420", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone420_r1 = bone420.addOrReplaceChild("bone420_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone421 = bone388.addOrReplaceChild("bone421", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone421_r1 = bone421.addOrReplaceChild("bone421_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone422 = bone388.addOrReplaceChild("bone422", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone422_r1 = bone422.addOrReplaceChild("bone422_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone423 = bone388.addOrReplaceChild("bone423", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone423_r1 = bone423.addOrReplaceChild("bone423_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone424 = bone388.addOrReplaceChild("bone424", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone424_r1 = bone424.addOrReplaceChild("bone424_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone425 = bone388.addOrReplaceChild("bone425", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone425_r1 = bone425.addOrReplaceChild("bone425_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone426 = bone388.addOrReplaceChild("bone426", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone426_r1 = bone426.addOrReplaceChild("bone426_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone427 = bone388.addOrReplaceChild("bone427", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone427_r1 = bone427.addOrReplaceChild("bone427_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone428 = bone388.addOrReplaceChild("bone428", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone428_r1 = bone428.addOrReplaceChild("bone428_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone429 = bone388.addOrReplaceChild("bone429", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone429_r1 = bone429.addOrReplaceChild("bone429_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone430 = bone388.addOrReplaceChild("bone430", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone430_r1 = bone430.addOrReplaceChild("bone430_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone431 = bone388.addOrReplaceChild("bone431", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone431_r1 = bone431.addOrReplaceChild("bone431_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone432 = bone388.addOrReplaceChild("bone432", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone432_r1 = bone432.addOrReplaceChild("bone432_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone433 = bone388.addOrReplaceChild("bone433", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone433_r1 = bone433.addOrReplaceChild("bone433_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone434 = bone388.addOrReplaceChild("bone434", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone434_r1 = bone434.addOrReplaceChild("bone434_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone435 = bone388.addOrReplaceChild("bone435", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone435_r1 = bone435.addOrReplaceChild("bone435_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone436 = bone388.addOrReplaceChild("bone436", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone436_r1 = bone436.addOrReplaceChild("bone436_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone293 = bone444.addOrReplaceChild("bone293", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1745F, 1.309F, 0.0F));

		PartDefinition bone294 = bone293.addOrReplaceChild("bone294",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone294_r1 = bone294.addOrReplaceChild("bone294_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone294_r2 = bone294.addOrReplaceChild("bone294_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone294_r3 = bone294.addOrReplaceChild("bone294_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone294_r4 = bone294.addOrReplaceChild("bone294_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone295 = bone293.addOrReplaceChild("bone295",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone295_r1 = bone295.addOrReplaceChild("bone295_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone295_r2 = bone295.addOrReplaceChild("bone295_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone295_r3 = bone295.addOrReplaceChild("bone295_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone295_r4 = bone295.addOrReplaceChild("bone295_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone296 = bone293.addOrReplaceChild("bone296",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone296_r1 = bone296.addOrReplaceChild("bone296_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone296_r2 = bone296.addOrReplaceChild("bone296_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone296_r3 = bone296.addOrReplaceChild("bone296_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone296_r4 = bone296.addOrReplaceChild("bone296_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone297 = bone293.addOrReplaceChild("bone297",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone297_r1 = bone297.addOrReplaceChild("bone297_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone297_r2 = bone297.addOrReplaceChild("bone297_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone297_r3 = bone297.addOrReplaceChild("bone297_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone297_r4 = bone297.addOrReplaceChild("bone297_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone298 = bone293.addOrReplaceChild("bone298",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone298_r1 = bone298.addOrReplaceChild("bone298_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone298_r2 = bone298.addOrReplaceChild("bone298_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone298_r3 = bone298.addOrReplaceChild("bone298_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone298_r4 = bone298.addOrReplaceChild("bone298_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone299 = bone293.addOrReplaceChild("bone299",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone299_r1 = bone299.addOrReplaceChild("bone299_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone299_r2 = bone299.addOrReplaceChild("bone299_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone299_r3 = bone299.addOrReplaceChild("bone299_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone299_r4 = bone299.addOrReplaceChild("bone299_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone300 = bone293.addOrReplaceChild("bone300",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone300_r1 = bone300.addOrReplaceChild("bone300_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone300_r2 = bone300.addOrReplaceChild("bone300_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone300_r3 = bone300.addOrReplaceChild("bone300_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone300_r4 = bone300.addOrReplaceChild("bone300_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone301 = bone293.addOrReplaceChild("bone301",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone301_r1 = bone301.addOrReplaceChild("bone301_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone301_r2 = bone301.addOrReplaceChild("bone301_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone301_r3 = bone301.addOrReplaceChild("bone301_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone301_r4 = bone301.addOrReplaceChild("bone301_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone302 = bone293.addOrReplaceChild("bone302",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone302_r1 = bone302.addOrReplaceChild("bone302_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone302_r2 = bone302.addOrReplaceChild("bone302_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone302_r3 = bone302.addOrReplaceChild("bone302_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone302_r4 = bone302.addOrReplaceChild("bone302_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone303 = bone293.addOrReplaceChild("bone303",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone303_r1 = bone303.addOrReplaceChild("bone303_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone303_r2 = bone303.addOrReplaceChild("bone303_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone303_r3 = bone303.addOrReplaceChild("bone303_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone303_r4 = bone303.addOrReplaceChild("bone303_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone304 = bone293.addOrReplaceChild("bone304",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone304_r1 = bone304.addOrReplaceChild("bone304_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone304_r2 = bone304.addOrReplaceChild("bone304_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone304_r3 = bone304.addOrReplaceChild("bone304_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone304_r4 = bone304.addOrReplaceChild("bone304_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone305 = bone293.addOrReplaceChild("bone305",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone305_r1 = bone305.addOrReplaceChild("bone305_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone305_r2 = bone305.addOrReplaceChild("bone305_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone305_r3 = bone305.addOrReplaceChild("bone305_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone305_r4 = bone305.addOrReplaceChild("bone305_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone306 = bone293.addOrReplaceChild("bone306",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone306_r1 = bone306.addOrReplaceChild("bone306_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone306_r2 = bone306.addOrReplaceChild("bone306_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone306_r3 = bone306.addOrReplaceChild("bone306_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone306_r4 = bone306.addOrReplaceChild("bone306_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone307 = bone293.addOrReplaceChild("bone307",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone307_r1 = bone307.addOrReplaceChild("bone307_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone307_r2 = bone307.addOrReplaceChild("bone307_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone307_r3 = bone307.addOrReplaceChild("bone307_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone307_r4 = bone307.addOrReplaceChild("bone307_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone308 = bone293.addOrReplaceChild("bone308",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone308_r1 = bone308.addOrReplaceChild("bone308_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone308_r2 = bone308.addOrReplaceChild("bone308_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone308_r3 = bone308.addOrReplaceChild("bone308_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone308_r4 = bone308.addOrReplaceChild("bone308_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone309 = bone293.addOrReplaceChild("bone309", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone309_r1 = bone309.addOrReplaceChild("bone309_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone309_r2 = bone309.addOrReplaceChild("bone309_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone309_r3 = bone309.addOrReplaceChild("bone309_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone309_r4 = bone309.addOrReplaceChild("bone309_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone310 = bone293.addOrReplaceChild("bone310", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone310_r1 = bone310.addOrReplaceChild("bone310_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone310_r2 = bone310.addOrReplaceChild("bone310_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone310_r3 = bone310.addOrReplaceChild("bone310_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone310_r4 = bone310.addOrReplaceChild("bone310_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone311 = bone293.addOrReplaceChild("bone311",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone311_r1 = bone311.addOrReplaceChild("bone311_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone311_r2 = bone311.addOrReplaceChild("bone311_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone311_r3 = bone311.addOrReplaceChild("bone311_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone311_r4 = bone311.addOrReplaceChild("bone311_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone312 = bone293.addOrReplaceChild("bone312",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone312_r1 = bone312.addOrReplaceChild("bone312_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone312_r2 = bone312.addOrReplaceChild("bone312_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone312_r3 = bone312.addOrReplaceChild("bone312_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone312_r4 = bone312.addOrReplaceChild("bone312_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone313 = bone293.addOrReplaceChild("bone313", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone314 = bone313.addOrReplaceChild("bone314", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone315 = bone314.addOrReplaceChild("bone315", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon98 = bone315.addOrReplaceChild("hexadecagon98",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 3.0107F));

		PartDefinition hexadecagon98_r1 = hexadecagon98.addOrReplaceChild("hexadecagon98_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon98_r2 = hexadecagon98.addOrReplaceChild("hexadecagon98_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon98_r3 = hexadecagon98.addOrReplaceChild("hexadecagon98_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon98_r4 = hexadecagon98.addOrReplaceChild("hexadecagon98_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon99 = bone315.addOrReplaceChild("hexadecagon99",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.8798F));

		PartDefinition hexadecagon99_r1 = hexadecagon99.addOrReplaceChild("hexadecagon99_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon99_r2 = hexadecagon99.addOrReplaceChild("hexadecagon99_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon99_r3 = hexadecagon99.addOrReplaceChild("hexadecagon99_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon99_r4 = hexadecagon99.addOrReplaceChild("hexadecagon99_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon100 = bone315.addOrReplaceChild("hexadecagon100",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.7489F));

		PartDefinition hexadecagon100_r1 = hexadecagon100.addOrReplaceChild("hexadecagon100_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon100_r2 = hexadecagon100.addOrReplaceChild("hexadecagon100_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon100_r3 = hexadecagon100.addOrReplaceChild("hexadecagon100_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon100_r4 = hexadecagon100.addOrReplaceChild("hexadecagon100_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon101 = bone315.addOrReplaceChild("hexadecagon101",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.618F));

		PartDefinition hexadecagon101_r1 = hexadecagon101.addOrReplaceChild("hexadecagon101_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon101_r2 = hexadecagon101.addOrReplaceChild("hexadecagon101_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon101_r3 = hexadecagon101.addOrReplaceChild("hexadecagon101_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon101_r4 = hexadecagon101.addOrReplaceChild("hexadecagon101_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon102 = bone315.addOrReplaceChild("hexadecagon102",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.4871F));

		PartDefinition hexadecagon102_r1 = hexadecagon102.addOrReplaceChild("hexadecagon102_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon102_r2 = hexadecagon102.addOrReplaceChild("hexadecagon102_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon102_r3 = hexadecagon102.addOrReplaceChild("hexadecagon102_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon102_r4 = hexadecagon102.addOrReplaceChild("hexadecagon102_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon103 = bone315.addOrReplaceChild("hexadecagon103",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.3562F));

		PartDefinition hexadecagon103_r1 = hexadecagon103.addOrReplaceChild("hexadecagon103_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon103_r2 = hexadecagon103.addOrReplaceChild("hexadecagon103_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon103_r3 = hexadecagon103.addOrReplaceChild("hexadecagon103_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon103_r4 = hexadecagon103.addOrReplaceChild("hexadecagon103_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon104 = bone315.addOrReplaceChild("hexadecagon104",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.2253F));

		PartDefinition hexadecagon104_r1 = hexadecagon104.addOrReplaceChild("hexadecagon104_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon104_r2 = hexadecagon104.addOrReplaceChild("hexadecagon104_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon104_r3 = hexadecagon104.addOrReplaceChild("hexadecagon104_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon104_r4 = hexadecagon104.addOrReplaceChild("hexadecagon104_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon105 = bone315.addOrReplaceChild("hexadecagon105",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.0944F));

		PartDefinition hexadecagon105_r1 = hexadecagon105.addOrReplaceChild("hexadecagon105_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon105_r2 = hexadecagon105.addOrReplaceChild("hexadecagon105_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon105_r3 = hexadecagon105.addOrReplaceChild("hexadecagon105_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon105_r4 = hexadecagon105.addOrReplaceChild("hexadecagon105_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon106 = bone315.addOrReplaceChild("hexadecagon106",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.9635F));

		PartDefinition hexadecagon106_r1 = hexadecagon106.addOrReplaceChild("hexadecagon106_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon106_r2 = hexadecagon106.addOrReplaceChild("hexadecagon106_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon106_r3 = hexadecagon106.addOrReplaceChild("hexadecagon106_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon106_r4 = hexadecagon106.addOrReplaceChild("hexadecagon106_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon107 = bone315.addOrReplaceChild("hexadecagon107",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.8326F));

		PartDefinition hexadecagon107_r1 = hexadecagon107.addOrReplaceChild("hexadecagon107_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon107_r2 = hexadecagon107.addOrReplaceChild("hexadecagon107_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon107_r3 = hexadecagon107.addOrReplaceChild("hexadecagon107_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon107_r4 = hexadecagon107.addOrReplaceChild("hexadecagon107_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon108 = bone315.addOrReplaceChild("hexadecagon108",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.7017F));

		PartDefinition hexadecagon108_r1 = hexadecagon108.addOrReplaceChild("hexadecagon108_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon108_r2 = hexadecagon108.addOrReplaceChild("hexadecagon108_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon108_r3 = hexadecagon108.addOrReplaceChild("hexadecagon108_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon108_r4 = hexadecagon108.addOrReplaceChild("hexadecagon108_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon109 = bone315.addOrReplaceChild("hexadecagon109",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon109_r1 = hexadecagon109.addOrReplaceChild("hexadecagon109_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon109_r2 = hexadecagon109.addOrReplaceChild("hexadecagon109_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon109_r3 = hexadecagon109.addOrReplaceChild("hexadecagon109_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon109_r4 = hexadecagon109.addOrReplaceChild("hexadecagon109_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon110 = bone315.addOrReplaceChild("hexadecagon110",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.4399F));

		PartDefinition hexadecagon110_r1 = hexadecagon110.addOrReplaceChild("hexadecagon110_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon110_r2 = hexadecagon110.addOrReplaceChild("hexadecagon110_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon110_r3 = hexadecagon110.addOrReplaceChild("hexadecagon110_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon110_r4 = hexadecagon110.addOrReplaceChild("hexadecagon110_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon111 = bone315.addOrReplaceChild("hexadecagon111",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.309F));

		PartDefinition hexadecagon111_r1 = hexadecagon111.addOrReplaceChild("hexadecagon111_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon111_r2 = hexadecagon111.addOrReplaceChild("hexadecagon111_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon111_r3 = hexadecagon111.addOrReplaceChild("hexadecagon111_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon111_r4 = hexadecagon111.addOrReplaceChild("hexadecagon111_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon112 = bone315.addOrReplaceChild("hexadecagon112",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.1781F));

		PartDefinition hexadecagon112_r1 = hexadecagon112.addOrReplaceChild("hexadecagon112_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon112_r2 = hexadecagon112.addOrReplaceChild("hexadecagon112_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon112_r3 = hexadecagon112.addOrReplaceChild("hexadecagon112_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon112_r4 = hexadecagon112.addOrReplaceChild("hexadecagon112_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon113 = bone315.addOrReplaceChild("hexadecagon113",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.0472F));

		PartDefinition hexadecagon113_r1 = hexadecagon113.addOrReplaceChild("hexadecagon113_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon113_r2 = hexadecagon113.addOrReplaceChild("hexadecagon113_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon113_r3 = hexadecagon113.addOrReplaceChild("hexadecagon113_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon113_r4 = hexadecagon113.addOrReplaceChild("hexadecagon113_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon114 = bone315.addOrReplaceChild("hexadecagon114",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.9163F));

		PartDefinition hexadecagon114_r1 = hexadecagon114.addOrReplaceChild("hexadecagon114_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon114_r2 = hexadecagon114.addOrReplaceChild("hexadecagon114_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon114_r3 = hexadecagon114.addOrReplaceChild("hexadecagon114_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon114_r4 = hexadecagon114.addOrReplaceChild("hexadecagon114_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon115 = bone315.addOrReplaceChild("hexadecagon115",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon115_r1 = hexadecagon115.addOrReplaceChild("hexadecagon115_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon115_r2 = hexadecagon115.addOrReplaceChild("hexadecagon115_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon115_r3 = hexadecagon115.addOrReplaceChild("hexadecagon115_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon115_r4 = hexadecagon115.addOrReplaceChild("hexadecagon115_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon116 = bone315.addOrReplaceChild("hexadecagon116",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.6545F));

		PartDefinition hexadecagon116_r1 = hexadecagon116.addOrReplaceChild("hexadecagon116_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon116_r2 = hexadecagon116.addOrReplaceChild("hexadecagon116_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon116_r3 = hexadecagon116.addOrReplaceChild("hexadecagon116_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon116_r4 = hexadecagon116.addOrReplaceChild("hexadecagon116_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon117 = bone315.addOrReplaceChild("hexadecagon117",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.5236F));

		PartDefinition hexadecagon117_r1 = hexadecagon117.addOrReplaceChild("hexadecagon117_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon117_r2 = hexadecagon117.addOrReplaceChild("hexadecagon117_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon117_r3 = hexadecagon117.addOrReplaceChild("hexadecagon117_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon117_r4 = hexadecagon117.addOrReplaceChild("hexadecagon117_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon118 = bone315.addOrReplaceChild("hexadecagon118",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon118_r1 = hexadecagon118.addOrReplaceChild("hexadecagon118_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon118_r2 = hexadecagon118.addOrReplaceChild("hexadecagon118_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon118_r3 = hexadecagon118.addOrReplaceChild("hexadecagon118_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon118_r4 = hexadecagon118.addOrReplaceChild("hexadecagon118_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon119 = bone315.addOrReplaceChild("hexadecagon119",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.2618F));

		PartDefinition hexadecagon119_r1 = hexadecagon119.addOrReplaceChild("hexadecagon119_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon119_r2 = hexadecagon119.addOrReplaceChild("hexadecagon119_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon119_r3 = hexadecagon119.addOrReplaceChild("hexadecagon119_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon119_r4 = hexadecagon119.addOrReplaceChild("hexadecagon119_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon120 = bone315.addOrReplaceChild("hexadecagon120",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hexadecagon120_r1 = hexadecagon120.addOrReplaceChild("hexadecagon120_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon120_r2 = hexadecagon120.addOrReplaceChild("hexadecagon120_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon120_r3 = hexadecagon120.addOrReplaceChild("hexadecagon120_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon120_r4 = hexadecagon120.addOrReplaceChild("hexadecagon120_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon121 = bone315.addOrReplaceChild("hexadecagon121",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon121_r1 = hexadecagon121.addOrReplaceChild("hexadecagon121_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon121_r2 = hexadecagon121.addOrReplaceChild("hexadecagon121_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon121_r3 = hexadecagon121.addOrReplaceChild("hexadecagon121_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon121_r4 = hexadecagon121.addOrReplaceChild("hexadecagon121_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone316 = bone313.addOrReplaceChild("bone316", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone317 = bone316.addOrReplaceChild("bone317", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone317_r1 = bone317.addOrReplaceChild("bone317_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone318 = bone316.addOrReplaceChild("bone318", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone318_r1 = bone318.addOrReplaceChild("bone318_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone319 = bone316.addOrReplaceChild("bone319", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone319_r1 = bone319.addOrReplaceChild("bone319_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone320 = bone316.addOrReplaceChild("bone320", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone320_r1 = bone320.addOrReplaceChild("bone320_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone321 = bone316.addOrReplaceChild("bone321", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone321_r1 = bone321.addOrReplaceChild("bone321_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone322 = bone316.addOrReplaceChild("bone322", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone322_r1 = bone322.addOrReplaceChild("bone322_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone323 = bone316.addOrReplaceChild("bone323", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone323_r1 = bone323.addOrReplaceChild("bone323_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone324 = bone316.addOrReplaceChild("bone324", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone324_r1 = bone324.addOrReplaceChild("bone324_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone325 = bone316.addOrReplaceChild("bone325", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone325_r1 = bone325.addOrReplaceChild("bone325_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone326 = bone316.addOrReplaceChild("bone326", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone326_r1 = bone326.addOrReplaceChild("bone326_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone327 = bone316.addOrReplaceChild("bone327", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone327_r1 = bone327.addOrReplaceChild("bone327_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone328 = bone316.addOrReplaceChild("bone328", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone328_r1 = bone328.addOrReplaceChild("bone328_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone329 = bone316.addOrReplaceChild("bone329", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone329_r1 = bone329.addOrReplaceChild("bone329_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone330 = bone316.addOrReplaceChild("bone330", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone330_r1 = bone330.addOrReplaceChild("bone330_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone331 = bone316.addOrReplaceChild("bone331", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone331_r1 = bone331.addOrReplaceChild("bone331_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone332 = bone316.addOrReplaceChild("bone332", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone332_r1 = bone332.addOrReplaceChild("bone332_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone333 = bone316.addOrReplaceChild("bone333", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone333_r1 = bone333.addOrReplaceChild("bone333_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone334 = bone316.addOrReplaceChild("bone334", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone334_r1 = bone334.addOrReplaceChild("bone334_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone335 = bone316.addOrReplaceChild("bone335", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone335_r1 = bone335.addOrReplaceChild("bone335_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone336 = bone316.addOrReplaceChild("bone336", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone336_r1 = bone336.addOrReplaceChild("bone336_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone337 = bone316.addOrReplaceChild("bone337", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone337_r1 = bone337.addOrReplaceChild("bone337_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone338 = bone316.addOrReplaceChild("bone338", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone338_r1 = bone338.addOrReplaceChild("bone338_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone339 = bone316.addOrReplaceChild("bone339", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone339_r1 = bone339.addOrReplaceChild("bone339_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone340 = bone316.addOrReplaceChild("bone340", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone340_r1 = bone340.addOrReplaceChild("bone340_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone341 = bone316.addOrReplaceChild("bone341", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone341_r1 = bone341.addOrReplaceChild("bone341_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone342 = bone316.addOrReplaceChild("bone342", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone342_r1 = bone342.addOrReplaceChild("bone342_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone343 = bone316.addOrReplaceChild("bone343", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone343_r1 = bone343.addOrReplaceChild("bone343_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone344 = bone316.addOrReplaceChild("bone344", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone344_r1 = bone344.addOrReplaceChild("bone344_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone345 = bone316.addOrReplaceChild("bone345", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone345_r1 = bone345.addOrReplaceChild("bone345_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone346 = bone316.addOrReplaceChild("bone346", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone346_r1 = bone346.addOrReplaceChild("bone346_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone347 = bone316.addOrReplaceChild("bone347", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone347_r1 = bone347.addOrReplaceChild("bone347_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone348 = bone316.addOrReplaceChild("bone348", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone348_r1 = bone348.addOrReplaceChild("bone348_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone349 = bone316.addOrReplaceChild("bone349", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone349_r1 = bone349.addOrReplaceChild("bone349_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone350 = bone316.addOrReplaceChild("bone350", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone350_r1 = bone350.addOrReplaceChild("bone350_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone351 = bone316.addOrReplaceChild("bone351", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone351_r1 = bone351.addOrReplaceChild("bone351_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone352 = bone316.addOrReplaceChild("bone352", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone352_r1 = bone352.addOrReplaceChild("bone352_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone353 = bone316.addOrReplaceChild("bone353", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone353_r1 = bone353.addOrReplaceChild("bone353_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone354 = bone316.addOrReplaceChild("bone354", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone354_r1 = bone354.addOrReplaceChild("bone354_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone355 = bone316.addOrReplaceChild("bone355", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone355_r1 = bone355.addOrReplaceChild("bone355_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone356 = bone316.addOrReplaceChild("bone356", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone356_r1 = bone356.addOrReplaceChild("bone356_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone357 = bone316.addOrReplaceChild("bone357", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone357_r1 = bone357.addOrReplaceChild("bone357_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone358 = bone316.addOrReplaceChild("bone358", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone358_r1 = bone358.addOrReplaceChild("bone358_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone359 = bone316.addOrReplaceChild("bone359", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone359_r1 = bone359.addOrReplaceChild("bone359_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone360 = bone316.addOrReplaceChild("bone360", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone360_r1 = bone360.addOrReplaceChild("bone360_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone361 = bone316.addOrReplaceChild("bone361", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone361_r1 = bone361.addOrReplaceChild("bone361_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone362 = bone316.addOrReplaceChild("bone362", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone362_r1 = bone362.addOrReplaceChild("bone362_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone363 = bone316.addOrReplaceChild("bone363", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone363_r1 = bone363.addOrReplaceChild("bone363_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone364 = bone316.addOrReplaceChild("bone364", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone364_r1 = bone364.addOrReplaceChild("bone364_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone149 = bone444.addOrReplaceChild("bone149", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition bone150 = bone149.addOrReplaceChild("bone150",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone150_r1 = bone150.addOrReplaceChild("bone150_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone150_r2 = bone150.addOrReplaceChild("bone150_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone150_r3 = bone150.addOrReplaceChild("bone150_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone150_r4 = bone150.addOrReplaceChild("bone150_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone151 = bone149.addOrReplaceChild("bone151",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone151_r1 = bone151.addOrReplaceChild("bone151_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone151_r2 = bone151.addOrReplaceChild("bone151_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone151_r3 = bone151.addOrReplaceChild("bone151_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone151_r4 = bone151.addOrReplaceChild("bone151_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone152 = bone149.addOrReplaceChild("bone152",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone152_r1 = bone152.addOrReplaceChild("bone152_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone152_r2 = bone152.addOrReplaceChild("bone152_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone152_r3 = bone152.addOrReplaceChild("bone152_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone152_r4 = bone152.addOrReplaceChild("bone152_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone153 = bone149.addOrReplaceChild("bone153",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone153_r1 = bone153.addOrReplaceChild("bone153_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone153_r2 = bone153.addOrReplaceChild("bone153_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone153_r3 = bone153.addOrReplaceChild("bone153_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone153_r4 = bone153.addOrReplaceChild("bone153_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone154 = bone149.addOrReplaceChild("bone154",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone154_r1 = bone154.addOrReplaceChild("bone154_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone154_r2 = bone154.addOrReplaceChild("bone154_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone154_r3 = bone154.addOrReplaceChild("bone154_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone154_r4 = bone154.addOrReplaceChild("bone154_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone155 = bone149.addOrReplaceChild("bone155",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone155_r1 = bone155.addOrReplaceChild("bone155_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone155_r2 = bone155.addOrReplaceChild("bone155_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone155_r3 = bone155.addOrReplaceChild("bone155_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone155_r4 = bone155.addOrReplaceChild("bone155_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone156 = bone149.addOrReplaceChild("bone156",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone156_r1 = bone156.addOrReplaceChild("bone156_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone156_r2 = bone156.addOrReplaceChild("bone156_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone156_r3 = bone156.addOrReplaceChild("bone156_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone156_r4 = bone156.addOrReplaceChild("bone156_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone157 = bone149.addOrReplaceChild("bone157",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone157_r1 = bone157.addOrReplaceChild("bone157_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone157_r2 = bone157.addOrReplaceChild("bone157_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone157_r3 = bone157.addOrReplaceChild("bone157_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone157_r4 = bone157.addOrReplaceChild("bone157_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone158 = bone149.addOrReplaceChild("bone158",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone158_r1 = bone158.addOrReplaceChild("bone158_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone158_r2 = bone158.addOrReplaceChild("bone158_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone158_r3 = bone158.addOrReplaceChild("bone158_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone158_r4 = bone158.addOrReplaceChild("bone158_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone159 = bone149.addOrReplaceChild("bone159",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone159_r1 = bone159.addOrReplaceChild("bone159_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone159_r2 = bone159.addOrReplaceChild("bone159_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone159_r3 = bone159.addOrReplaceChild("bone159_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone159_r4 = bone159.addOrReplaceChild("bone159_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone160 = bone149.addOrReplaceChild("bone160",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone160_r1 = bone160.addOrReplaceChild("bone160_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone160_r2 = bone160.addOrReplaceChild("bone160_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone160_r3 = bone160.addOrReplaceChild("bone160_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone160_r4 = bone160.addOrReplaceChild("bone160_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone161 = bone149.addOrReplaceChild("bone161",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone161_r1 = bone161.addOrReplaceChild("bone161_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone161_r2 = bone161.addOrReplaceChild("bone161_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone161_r3 = bone161.addOrReplaceChild("bone161_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone161_r4 = bone161.addOrReplaceChild("bone161_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone162 = bone149.addOrReplaceChild("bone162",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone162_r1 = bone162.addOrReplaceChild("bone162_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone162_r2 = bone162.addOrReplaceChild("bone162_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone162_r3 = bone162.addOrReplaceChild("bone162_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone162_r4 = bone162.addOrReplaceChild("bone162_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone163 = bone149.addOrReplaceChild("bone163",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone163_r1 = bone163.addOrReplaceChild("bone163_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone163_r2 = bone163.addOrReplaceChild("bone163_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone163_r3 = bone163.addOrReplaceChild("bone163_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone163_r4 = bone163.addOrReplaceChild("bone163_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone164 = bone149.addOrReplaceChild("bone164",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone164_r1 = bone164.addOrReplaceChild("bone164_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone164_r2 = bone164.addOrReplaceChild("bone164_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone164_r3 = bone164.addOrReplaceChild("bone164_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone164_r4 = bone164.addOrReplaceChild("bone164_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone165 = bone149.addOrReplaceChild("bone165", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone165_r1 = bone165.addOrReplaceChild("bone165_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone165_r2 = bone165.addOrReplaceChild("bone165_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone165_r3 = bone165.addOrReplaceChild("bone165_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone165_r4 = bone165.addOrReplaceChild("bone165_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone166 = bone149.addOrReplaceChild("bone166", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone166_r1 = bone166.addOrReplaceChild("bone166_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone166_r2 = bone166.addOrReplaceChild("bone166_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone166_r3 = bone166.addOrReplaceChild("bone166_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone166_r4 = bone166.addOrReplaceChild("bone166_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone167 = bone149.addOrReplaceChild("bone167",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone167_r1 = bone167.addOrReplaceChild("bone167_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone167_r2 = bone167.addOrReplaceChild("bone167_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone167_r3 = bone167.addOrReplaceChild("bone167_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone167_r4 = bone167.addOrReplaceChild("bone167_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone168 = bone149.addOrReplaceChild("bone168",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone168_r1 = bone168.addOrReplaceChild("bone168_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone168_r2 = bone168.addOrReplaceChild("bone168_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone168_r3 = bone168.addOrReplaceChild("bone168_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone168_r4 = bone168.addOrReplaceChild("bone168_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone169 = bone149.addOrReplaceChild("bone169", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone170 = bone169.addOrReplaceChild("bone170", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone171 = bone170.addOrReplaceChild("bone171", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon50 = bone171.addOrReplaceChild("hexadecagon50",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -3.0107F));

		PartDefinition hexadecagon50_r1 = hexadecagon50.addOrReplaceChild("hexadecagon50_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon50_r2 = hexadecagon50.addOrReplaceChild("hexadecagon50_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon50_r3 = hexadecagon50.addOrReplaceChild("hexadecagon50_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon50_r4 = hexadecagon50.addOrReplaceChild("hexadecagon50_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon51 = bone171.addOrReplaceChild("hexadecagon51",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.8798F));

		PartDefinition hexadecagon51_r1 = hexadecagon51.addOrReplaceChild("hexadecagon51_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon51_r2 = hexadecagon51.addOrReplaceChild("hexadecagon51_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon51_r3 = hexadecagon51.addOrReplaceChild("hexadecagon51_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon51_r4 = hexadecagon51.addOrReplaceChild("hexadecagon51_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon52 = bone171.addOrReplaceChild("hexadecagon52",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.7489F));

		PartDefinition hexadecagon52_r1 = hexadecagon52.addOrReplaceChild("hexadecagon52_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon52_r2 = hexadecagon52.addOrReplaceChild("hexadecagon52_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon52_r3 = hexadecagon52.addOrReplaceChild("hexadecagon52_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon52_r4 = hexadecagon52.addOrReplaceChild("hexadecagon52_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon53 = bone171.addOrReplaceChild("hexadecagon53",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.618F));

		PartDefinition hexadecagon53_r1 = hexadecagon53.addOrReplaceChild("hexadecagon53_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon53_r2 = hexadecagon53.addOrReplaceChild("hexadecagon53_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon53_r3 = hexadecagon53.addOrReplaceChild("hexadecagon53_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon53_r4 = hexadecagon53.addOrReplaceChild("hexadecagon53_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon54 = bone171.addOrReplaceChild("hexadecagon54",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.4871F));

		PartDefinition hexadecagon54_r1 = hexadecagon54.addOrReplaceChild("hexadecagon54_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon54_r2 = hexadecagon54.addOrReplaceChild("hexadecagon54_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon54_r3 = hexadecagon54.addOrReplaceChild("hexadecagon54_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon54_r4 = hexadecagon54.addOrReplaceChild("hexadecagon54_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon55 = bone171.addOrReplaceChild("hexadecagon55",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.3562F));

		PartDefinition hexadecagon55_r1 = hexadecagon55.addOrReplaceChild("hexadecagon55_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon55_r2 = hexadecagon55.addOrReplaceChild("hexadecagon55_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon55_r3 = hexadecagon55.addOrReplaceChild("hexadecagon55_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon55_r4 = hexadecagon55.addOrReplaceChild("hexadecagon55_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon56 = bone171.addOrReplaceChild("hexadecagon56",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.2253F));

		PartDefinition hexadecagon56_r1 = hexadecagon56.addOrReplaceChild("hexadecagon56_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon56_r2 = hexadecagon56.addOrReplaceChild("hexadecagon56_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon56_r3 = hexadecagon56.addOrReplaceChild("hexadecagon56_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon56_r4 = hexadecagon56.addOrReplaceChild("hexadecagon56_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon57 = bone171.addOrReplaceChild("hexadecagon57",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.0944F));

		PartDefinition hexadecagon57_r1 = hexadecagon57.addOrReplaceChild("hexadecagon57_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon57_r2 = hexadecagon57.addOrReplaceChild("hexadecagon57_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon57_r3 = hexadecagon57.addOrReplaceChild("hexadecagon57_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon57_r4 = hexadecagon57.addOrReplaceChild("hexadecagon57_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon58 = bone171.addOrReplaceChild("hexadecagon58",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.9635F));

		PartDefinition hexadecagon58_r1 = hexadecagon58.addOrReplaceChild("hexadecagon58_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon58_r2 = hexadecagon58.addOrReplaceChild("hexadecagon58_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon58_r3 = hexadecagon58.addOrReplaceChild("hexadecagon58_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon58_r4 = hexadecagon58.addOrReplaceChild("hexadecagon58_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon59 = bone171.addOrReplaceChild("hexadecagon59",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.8326F));

		PartDefinition hexadecagon59_r1 = hexadecagon59.addOrReplaceChild("hexadecagon59_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon59_r2 = hexadecagon59.addOrReplaceChild("hexadecagon59_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon59_r3 = hexadecagon59.addOrReplaceChild("hexadecagon59_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon59_r4 = hexadecagon59.addOrReplaceChild("hexadecagon59_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon60 = bone171.addOrReplaceChild("hexadecagon60",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.7017F));

		PartDefinition hexadecagon60_r1 = hexadecagon60.addOrReplaceChild("hexadecagon60_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon60_r2 = hexadecagon60.addOrReplaceChild("hexadecagon60_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon60_r3 = hexadecagon60.addOrReplaceChild("hexadecagon60_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon60_r4 = hexadecagon60.addOrReplaceChild("hexadecagon60_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon61 = bone171.addOrReplaceChild("hexadecagon61",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hexadecagon61_r1 = hexadecagon61.addOrReplaceChild("hexadecagon61_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon61_r2 = hexadecagon61.addOrReplaceChild("hexadecagon61_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon61_r3 = hexadecagon61.addOrReplaceChild("hexadecagon61_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon61_r4 = hexadecagon61.addOrReplaceChild("hexadecagon61_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon62 = bone171.addOrReplaceChild("hexadecagon62",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.4399F));

		PartDefinition hexadecagon62_r1 = hexadecagon62.addOrReplaceChild("hexadecagon62_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon62_r2 = hexadecagon62.addOrReplaceChild("hexadecagon62_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon62_r3 = hexadecagon62.addOrReplaceChild("hexadecagon62_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon62_r4 = hexadecagon62.addOrReplaceChild("hexadecagon62_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon63 = bone171.addOrReplaceChild("hexadecagon63",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.309F));

		PartDefinition hexadecagon63_r1 = hexadecagon63.addOrReplaceChild("hexadecagon63_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon63_r2 = hexadecagon63.addOrReplaceChild("hexadecagon63_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon63_r3 = hexadecagon63.addOrReplaceChild("hexadecagon63_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon63_r4 = hexadecagon63.addOrReplaceChild("hexadecagon63_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon64 = bone171.addOrReplaceChild("hexadecagon64",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.1781F));

		PartDefinition hexadecagon64_r1 = hexadecagon64.addOrReplaceChild("hexadecagon64_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon64_r2 = hexadecagon64.addOrReplaceChild("hexadecagon64_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon64_r3 = hexadecagon64.addOrReplaceChild("hexadecagon64_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon64_r4 = hexadecagon64.addOrReplaceChild("hexadecagon64_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon65 = bone171.addOrReplaceChild("hexadecagon65",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.0472F));

		PartDefinition hexadecagon65_r1 = hexadecagon65.addOrReplaceChild("hexadecagon65_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon65_r2 = hexadecagon65.addOrReplaceChild("hexadecagon65_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon65_r3 = hexadecagon65.addOrReplaceChild("hexadecagon65_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon65_r4 = hexadecagon65.addOrReplaceChild("hexadecagon65_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon66 = bone171.addOrReplaceChild("hexadecagon66",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.9163F));

		PartDefinition hexadecagon66_r1 = hexadecagon66.addOrReplaceChild("hexadecagon66_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon66_r2 = hexadecagon66.addOrReplaceChild("hexadecagon66_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon66_r3 = hexadecagon66.addOrReplaceChild("hexadecagon66_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon66_r4 = hexadecagon66.addOrReplaceChild("hexadecagon66_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon67 = bone171.addOrReplaceChild("hexadecagon67",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon67_r1 = hexadecagon67.addOrReplaceChild("hexadecagon67_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon67_r2 = hexadecagon67.addOrReplaceChild("hexadecagon67_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon67_r3 = hexadecagon67.addOrReplaceChild("hexadecagon67_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon67_r4 = hexadecagon67.addOrReplaceChild("hexadecagon67_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon68 = bone171.addOrReplaceChild("hexadecagon68",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.6545F));

		PartDefinition hexadecagon68_r1 = hexadecagon68.addOrReplaceChild("hexadecagon68_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon68_r2 = hexadecagon68.addOrReplaceChild("hexadecagon68_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon68_r3 = hexadecagon68.addOrReplaceChild("hexadecagon68_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon68_r4 = hexadecagon68.addOrReplaceChild("hexadecagon68_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon69 = bone171.addOrReplaceChild("hexadecagon69",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.5236F));

		PartDefinition hexadecagon69_r1 = hexadecagon69.addOrReplaceChild("hexadecagon69_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon69_r2 = hexadecagon69.addOrReplaceChild("hexadecagon69_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon69_r3 = hexadecagon69.addOrReplaceChild("hexadecagon69_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon69_r4 = hexadecagon69.addOrReplaceChild("hexadecagon69_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon70 = bone171.addOrReplaceChild("hexadecagon70",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon70_r1 = hexadecagon70.addOrReplaceChild("hexadecagon70_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon70_r2 = hexadecagon70.addOrReplaceChild("hexadecagon70_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon70_r3 = hexadecagon70.addOrReplaceChild("hexadecagon70_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon70_r4 = hexadecagon70.addOrReplaceChild("hexadecagon70_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon71 = bone171.addOrReplaceChild("hexadecagon71",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.2618F));

		PartDefinition hexadecagon71_r1 = hexadecagon71.addOrReplaceChild("hexadecagon71_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon71_r2 = hexadecagon71.addOrReplaceChild("hexadecagon71_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon71_r3 = hexadecagon71.addOrReplaceChild("hexadecagon71_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon71_r4 = hexadecagon71.addOrReplaceChild("hexadecagon71_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon72 = bone171.addOrReplaceChild("hexadecagon72",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hexadecagon72_r1 = hexadecagon72.addOrReplaceChild("hexadecagon72_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon72_r2 = hexadecagon72.addOrReplaceChild("hexadecagon72_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon72_r3 = hexadecagon72.addOrReplaceChild("hexadecagon72_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon72_r4 = hexadecagon72.addOrReplaceChild("hexadecagon72_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon73 = bone171.addOrReplaceChild("hexadecagon73",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon73_r1 = hexadecagon73.addOrReplaceChild("hexadecagon73_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon73_r2 = hexadecagon73.addOrReplaceChild("hexadecagon73_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon73_r3 = hexadecagon73.addOrReplaceChild("hexadecagon73_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon73_r4 = hexadecagon73.addOrReplaceChild("hexadecagon73_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone172 = bone169.addOrReplaceChild("bone172", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone173 = bone172.addOrReplaceChild("bone173", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone173_r1 = bone173.addOrReplaceChild("bone173_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone174 = bone172.addOrReplaceChild("bone174", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone174_r1 = bone174.addOrReplaceChild("bone174_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone175 = bone172.addOrReplaceChild("bone175", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone175_r1 = bone175.addOrReplaceChild("bone175_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone176 = bone172.addOrReplaceChild("bone176", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone176_r1 = bone176.addOrReplaceChild("bone176_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone177 = bone172.addOrReplaceChild("bone177", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone177_r1 = bone177.addOrReplaceChild("bone177_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone178 = bone172.addOrReplaceChild("bone178", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone178_r1 = bone178.addOrReplaceChild("bone178_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone179 = bone172.addOrReplaceChild("bone179", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone179_r1 = bone179.addOrReplaceChild("bone179_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone180 = bone172.addOrReplaceChild("bone180", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone180_r1 = bone180.addOrReplaceChild("bone180_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone181 = bone172.addOrReplaceChild("bone181", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone181_r1 = bone181.addOrReplaceChild("bone181_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone182 = bone172.addOrReplaceChild("bone182", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone182_r1 = bone182.addOrReplaceChild("bone182_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone183 = bone172.addOrReplaceChild("bone183", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone183_r1 = bone183.addOrReplaceChild("bone183_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone184 = bone172.addOrReplaceChild("bone184", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone184_r1 = bone184.addOrReplaceChild("bone184_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone185 = bone172.addOrReplaceChild("bone185", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone185_r1 = bone185.addOrReplaceChild("bone185_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone186 = bone172.addOrReplaceChild("bone186", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone186_r1 = bone186.addOrReplaceChild("bone186_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone187 = bone172.addOrReplaceChild("bone187", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone187_r1 = bone187.addOrReplaceChild("bone187_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone188 = bone172.addOrReplaceChild("bone188", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone188_r1 = bone188.addOrReplaceChild("bone188_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone189 = bone172.addOrReplaceChild("bone189", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone189_r1 = bone189.addOrReplaceChild("bone189_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone190 = bone172.addOrReplaceChild("bone190", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone190_r1 = bone190.addOrReplaceChild("bone190_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone191 = bone172.addOrReplaceChild("bone191", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone191_r1 = bone191.addOrReplaceChild("bone191_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone192 = bone172.addOrReplaceChild("bone192", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone192_r1 = bone192.addOrReplaceChild("bone192_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone193 = bone172.addOrReplaceChild("bone193", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone193_r1 = bone193.addOrReplaceChild("bone193_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone194 = bone172.addOrReplaceChild("bone194", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone194_r1 = bone194.addOrReplaceChild("bone194_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone195 = bone172.addOrReplaceChild("bone195", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone195_r1 = bone195.addOrReplaceChild("bone195_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone196 = bone172.addOrReplaceChild("bone196", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone196_r1 = bone196.addOrReplaceChild("bone196_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone197 = bone172.addOrReplaceChild("bone197", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone197_r1 = bone197.addOrReplaceChild("bone197_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone198 = bone172.addOrReplaceChild("bone198", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone198_r1 = bone198.addOrReplaceChild("bone198_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone199 = bone172.addOrReplaceChild("bone199", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone199_r1 = bone199.addOrReplaceChild("bone199_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone200 = bone172.addOrReplaceChild("bone200", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone200_r1 = bone200.addOrReplaceChild("bone200_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone201 = bone172.addOrReplaceChild("bone201", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone201_r1 = bone201.addOrReplaceChild("bone201_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone202 = bone172.addOrReplaceChild("bone202", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone202_r1 = bone202.addOrReplaceChild("bone202_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone203 = bone172.addOrReplaceChild("bone203", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone203_r1 = bone203.addOrReplaceChild("bone203_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone204 = bone172.addOrReplaceChild("bone204", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone204_r1 = bone204.addOrReplaceChild("bone204_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone205 = bone172.addOrReplaceChild("bone205", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone205_r1 = bone205.addOrReplaceChild("bone205_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone206 = bone172.addOrReplaceChild("bone206", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone206_r1 = bone206.addOrReplaceChild("bone206_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone207 = bone172.addOrReplaceChild("bone207", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone207_r1 = bone207.addOrReplaceChild("bone207_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone208 = bone172.addOrReplaceChild("bone208", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone208_r1 = bone208.addOrReplaceChild("bone208_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone209 = bone172.addOrReplaceChild("bone209", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone209_r1 = bone209.addOrReplaceChild("bone209_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone210 = bone172.addOrReplaceChild("bone210", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone210_r1 = bone210.addOrReplaceChild("bone210_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone211 = bone172.addOrReplaceChild("bone211", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone211_r1 = bone211.addOrReplaceChild("bone211_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone212 = bone172.addOrReplaceChild("bone212", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone212_r1 = bone212.addOrReplaceChild("bone212_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone213 = bone172.addOrReplaceChild("bone213", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone213_r1 = bone213.addOrReplaceChild("bone213_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone214 = bone172.addOrReplaceChild("bone214", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone214_r1 = bone214.addOrReplaceChild("bone214_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone215 = bone172.addOrReplaceChild("bone215", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone215_r1 = bone215.addOrReplaceChild("bone215_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone216 = bone172.addOrReplaceChild("bone216", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone216_r1 = bone216.addOrReplaceChild("bone216_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone217 = bone172.addOrReplaceChild("bone217", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone217_r1 = bone217.addOrReplaceChild("bone217_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone218 = bone172.addOrReplaceChild("bone218", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone218_r1 = bone218.addOrReplaceChild("bone218_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone219 = bone172.addOrReplaceChild("bone219", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone219_r1 = bone219.addOrReplaceChild("bone219_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone220 = bone172.addOrReplaceChild("bone220", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone220_r1 = bone220.addOrReplaceChild("bone220_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone221 = bone444.addOrReplaceChild("bone221", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition bone222 = bone221.addOrReplaceChild("bone222",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone222_r1 = bone222.addOrReplaceChild("bone222_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone222_r2 = bone222.addOrReplaceChild("bone222_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone222_r3 = bone222.addOrReplaceChild("bone222_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone222_r4 = bone222.addOrReplaceChild("bone222_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone223 = bone221.addOrReplaceChild("bone223",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone223_r1 = bone223.addOrReplaceChild("bone223_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone223_r2 = bone223.addOrReplaceChild("bone223_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone223_r3 = bone223.addOrReplaceChild("bone223_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone223_r4 = bone223.addOrReplaceChild("bone223_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone224 = bone221.addOrReplaceChild("bone224",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone224_r1 = bone224.addOrReplaceChild("bone224_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone224_r2 = bone224.addOrReplaceChild("bone224_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone224_r3 = bone224.addOrReplaceChild("bone224_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone224_r4 = bone224.addOrReplaceChild("bone224_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone225 = bone221.addOrReplaceChild("bone225",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone225_r1 = bone225.addOrReplaceChild("bone225_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone225_r2 = bone225.addOrReplaceChild("bone225_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone225_r3 = bone225.addOrReplaceChild("bone225_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone225_r4 = bone225.addOrReplaceChild("bone225_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone226 = bone221.addOrReplaceChild("bone226",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone226_r1 = bone226.addOrReplaceChild("bone226_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone226_r2 = bone226.addOrReplaceChild("bone226_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone226_r3 = bone226.addOrReplaceChild("bone226_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone226_r4 = bone226.addOrReplaceChild("bone226_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone227 = bone221.addOrReplaceChild("bone227",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone227_r1 = bone227.addOrReplaceChild("bone227_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone227_r2 = bone227.addOrReplaceChild("bone227_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone227_r3 = bone227.addOrReplaceChild("bone227_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone227_r4 = bone227.addOrReplaceChild("bone227_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone228 = bone221.addOrReplaceChild("bone228",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone228_r1 = bone228.addOrReplaceChild("bone228_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone228_r2 = bone228.addOrReplaceChild("bone228_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone228_r3 = bone228.addOrReplaceChild("bone228_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone228_r4 = bone228.addOrReplaceChild("bone228_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone229 = bone221.addOrReplaceChild("bone229",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone229_r1 = bone229.addOrReplaceChild("bone229_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone229_r2 = bone229.addOrReplaceChild("bone229_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone229_r3 = bone229.addOrReplaceChild("bone229_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone229_r4 = bone229.addOrReplaceChild("bone229_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone230 = bone221.addOrReplaceChild("bone230",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone230_r1 = bone230.addOrReplaceChild("bone230_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone230_r2 = bone230.addOrReplaceChild("bone230_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone230_r3 = bone230.addOrReplaceChild("bone230_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone230_r4 = bone230.addOrReplaceChild("bone230_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone231 = bone221.addOrReplaceChild("bone231",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone231_r1 = bone231.addOrReplaceChild("bone231_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone231_r2 = bone231.addOrReplaceChild("bone231_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone231_r3 = bone231.addOrReplaceChild("bone231_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone231_r4 = bone231.addOrReplaceChild("bone231_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone232 = bone221.addOrReplaceChild("bone232",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone232_r1 = bone232.addOrReplaceChild("bone232_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone232_r2 = bone232.addOrReplaceChild("bone232_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone232_r3 = bone232.addOrReplaceChild("bone232_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone232_r4 = bone232.addOrReplaceChild("bone232_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone233 = bone221.addOrReplaceChild("bone233",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone233_r1 = bone233.addOrReplaceChild("bone233_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone233_r2 = bone233.addOrReplaceChild("bone233_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone233_r3 = bone233.addOrReplaceChild("bone233_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone233_r4 = bone233.addOrReplaceChild("bone233_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone234 = bone221.addOrReplaceChild("bone234",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone234_r1 = bone234.addOrReplaceChild("bone234_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone234_r2 = bone234.addOrReplaceChild("bone234_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone234_r3 = bone234.addOrReplaceChild("bone234_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone234_r4 = bone234.addOrReplaceChild("bone234_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone235 = bone221.addOrReplaceChild("bone235",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone235_r1 = bone235.addOrReplaceChild("bone235_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone235_r2 = bone235.addOrReplaceChild("bone235_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone235_r3 = bone235.addOrReplaceChild("bone235_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone235_r4 = bone235.addOrReplaceChild("bone235_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone236 = bone221.addOrReplaceChild("bone236",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone236_r1 = bone236.addOrReplaceChild("bone236_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone236_r2 = bone236.addOrReplaceChild("bone236_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone236_r3 = bone236.addOrReplaceChild("bone236_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone236_r4 = bone236.addOrReplaceChild("bone236_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone237 = bone221.addOrReplaceChild("bone237", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone237_r1 = bone237.addOrReplaceChild("bone237_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone237_r2 = bone237.addOrReplaceChild("bone237_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone237_r3 = bone237.addOrReplaceChild("bone237_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone237_r4 = bone237.addOrReplaceChild("bone237_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone238 = bone221.addOrReplaceChild("bone238", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone238_r1 = bone238.addOrReplaceChild("bone238_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone238_r2 = bone238.addOrReplaceChild("bone238_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone238_r3 = bone238.addOrReplaceChild("bone238_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone238_r4 = bone238.addOrReplaceChild("bone238_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone239 = bone221.addOrReplaceChild("bone239",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone239_r1 = bone239.addOrReplaceChild("bone239_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone239_r2 = bone239.addOrReplaceChild("bone239_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone239_r3 = bone239.addOrReplaceChild("bone239_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone239_r4 = bone239.addOrReplaceChild("bone239_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone240 = bone221.addOrReplaceChild("bone240",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone240_r1 = bone240.addOrReplaceChild("bone240_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone240_r2 = bone240.addOrReplaceChild("bone240_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone240_r3 = bone240.addOrReplaceChild("bone240_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone240_r4 = bone240.addOrReplaceChild("bone240_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone241 = bone221.addOrReplaceChild("bone241", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone242 = bone241.addOrReplaceChild("bone242", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone243 = bone242.addOrReplaceChild("bone243", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon74 = bone243.addOrReplaceChild("hexadecagon74",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 3.0107F));

		PartDefinition hexadecagon74_r1 = hexadecagon74.addOrReplaceChild("hexadecagon74_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon74_r2 = hexadecagon74.addOrReplaceChild("hexadecagon74_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon74_r3 = hexadecagon74.addOrReplaceChild("hexadecagon74_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon74_r4 = hexadecagon74.addOrReplaceChild("hexadecagon74_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon75 = bone243.addOrReplaceChild("hexadecagon75",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.8798F));

		PartDefinition hexadecagon75_r1 = hexadecagon75.addOrReplaceChild("hexadecagon75_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon75_r2 = hexadecagon75.addOrReplaceChild("hexadecagon75_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon75_r3 = hexadecagon75.addOrReplaceChild("hexadecagon75_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon75_r4 = hexadecagon75.addOrReplaceChild("hexadecagon75_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon76 = bone243.addOrReplaceChild("hexadecagon76",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.7489F));

		PartDefinition hexadecagon76_r1 = hexadecagon76.addOrReplaceChild("hexadecagon76_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon76_r2 = hexadecagon76.addOrReplaceChild("hexadecagon76_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon76_r3 = hexadecagon76.addOrReplaceChild("hexadecagon76_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon76_r4 = hexadecagon76.addOrReplaceChild("hexadecagon76_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon77 = bone243.addOrReplaceChild("hexadecagon77",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.618F));

		PartDefinition hexadecagon77_r1 = hexadecagon77.addOrReplaceChild("hexadecagon77_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon77_r2 = hexadecagon77.addOrReplaceChild("hexadecagon77_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon77_r3 = hexadecagon77.addOrReplaceChild("hexadecagon77_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon77_r4 = hexadecagon77.addOrReplaceChild("hexadecagon77_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon78 = bone243.addOrReplaceChild("hexadecagon78",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.4871F));

		PartDefinition hexadecagon78_r1 = hexadecagon78.addOrReplaceChild("hexadecagon78_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon78_r2 = hexadecagon78.addOrReplaceChild("hexadecagon78_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon78_r3 = hexadecagon78.addOrReplaceChild("hexadecagon78_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon78_r4 = hexadecagon78.addOrReplaceChild("hexadecagon78_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon79 = bone243.addOrReplaceChild("hexadecagon79",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.3562F));

		PartDefinition hexadecagon79_r1 = hexadecagon79.addOrReplaceChild("hexadecagon79_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon79_r2 = hexadecagon79.addOrReplaceChild("hexadecagon79_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon79_r3 = hexadecagon79.addOrReplaceChild("hexadecagon79_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon79_r4 = hexadecagon79.addOrReplaceChild("hexadecagon79_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon80 = bone243.addOrReplaceChild("hexadecagon80",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.2253F));

		PartDefinition hexadecagon80_r1 = hexadecagon80.addOrReplaceChild("hexadecagon80_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon80_r2 = hexadecagon80.addOrReplaceChild("hexadecagon80_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon80_r3 = hexadecagon80.addOrReplaceChild("hexadecagon80_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon80_r4 = hexadecagon80.addOrReplaceChild("hexadecagon80_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon81 = bone243.addOrReplaceChild("hexadecagon81",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.0944F));

		PartDefinition hexadecagon81_r1 = hexadecagon81.addOrReplaceChild("hexadecagon81_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon81_r2 = hexadecagon81.addOrReplaceChild("hexadecagon81_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon81_r3 = hexadecagon81.addOrReplaceChild("hexadecagon81_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon81_r4 = hexadecagon81.addOrReplaceChild("hexadecagon81_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon82 = bone243.addOrReplaceChild("hexadecagon82",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.9635F));

		PartDefinition hexadecagon82_r1 = hexadecagon82.addOrReplaceChild("hexadecagon82_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon82_r2 = hexadecagon82.addOrReplaceChild("hexadecagon82_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon82_r3 = hexadecagon82.addOrReplaceChild("hexadecagon82_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon82_r4 = hexadecagon82.addOrReplaceChild("hexadecagon82_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon83 = bone243.addOrReplaceChild("hexadecagon83",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.8326F));

		PartDefinition hexadecagon83_r1 = hexadecagon83.addOrReplaceChild("hexadecagon83_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon83_r2 = hexadecagon83.addOrReplaceChild("hexadecagon83_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon83_r3 = hexadecagon83.addOrReplaceChild("hexadecagon83_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon83_r4 = hexadecagon83.addOrReplaceChild("hexadecagon83_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon84 = bone243.addOrReplaceChild("hexadecagon84",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.7017F));

		PartDefinition hexadecagon84_r1 = hexadecagon84.addOrReplaceChild("hexadecagon84_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon84_r2 = hexadecagon84.addOrReplaceChild("hexadecagon84_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon84_r3 = hexadecagon84.addOrReplaceChild("hexadecagon84_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon84_r4 = hexadecagon84.addOrReplaceChild("hexadecagon84_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon85 = bone243.addOrReplaceChild("hexadecagon85",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon85_r1 = hexadecagon85.addOrReplaceChild("hexadecagon85_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon85_r2 = hexadecagon85.addOrReplaceChild("hexadecagon85_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon85_r3 = hexadecagon85.addOrReplaceChild("hexadecagon85_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon85_r4 = hexadecagon85.addOrReplaceChild("hexadecagon85_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon86 = bone243.addOrReplaceChild("hexadecagon86",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.4399F));

		PartDefinition hexadecagon86_r1 = hexadecagon86.addOrReplaceChild("hexadecagon86_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon86_r2 = hexadecagon86.addOrReplaceChild("hexadecagon86_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon86_r3 = hexadecagon86.addOrReplaceChild("hexadecagon86_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon86_r4 = hexadecagon86.addOrReplaceChild("hexadecagon86_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon87 = bone243.addOrReplaceChild("hexadecagon87",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.309F));

		PartDefinition hexadecagon87_r1 = hexadecagon87.addOrReplaceChild("hexadecagon87_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon87_r2 = hexadecagon87.addOrReplaceChild("hexadecagon87_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon87_r3 = hexadecagon87.addOrReplaceChild("hexadecagon87_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon87_r4 = hexadecagon87.addOrReplaceChild("hexadecagon87_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon88 = bone243.addOrReplaceChild("hexadecagon88",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.1781F));

		PartDefinition hexadecagon88_r1 = hexadecagon88.addOrReplaceChild("hexadecagon88_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon88_r2 = hexadecagon88.addOrReplaceChild("hexadecagon88_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon88_r3 = hexadecagon88.addOrReplaceChild("hexadecagon88_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon88_r4 = hexadecagon88.addOrReplaceChild("hexadecagon88_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon89 = bone243.addOrReplaceChild("hexadecagon89",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.0472F));

		PartDefinition hexadecagon89_r1 = hexadecagon89.addOrReplaceChild("hexadecagon89_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon89_r2 = hexadecagon89.addOrReplaceChild("hexadecagon89_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon89_r3 = hexadecagon89.addOrReplaceChild("hexadecagon89_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon89_r4 = hexadecagon89.addOrReplaceChild("hexadecagon89_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon90 = bone243.addOrReplaceChild("hexadecagon90",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.9163F));

		PartDefinition hexadecagon90_r1 = hexadecagon90.addOrReplaceChild("hexadecagon90_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon90_r2 = hexadecagon90.addOrReplaceChild("hexadecagon90_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon90_r3 = hexadecagon90.addOrReplaceChild("hexadecagon90_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon90_r4 = hexadecagon90.addOrReplaceChild("hexadecagon90_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon91 = bone243.addOrReplaceChild("hexadecagon91",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon91_r1 = hexadecagon91.addOrReplaceChild("hexadecagon91_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon91_r2 = hexadecagon91.addOrReplaceChild("hexadecagon91_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon91_r3 = hexadecagon91.addOrReplaceChild("hexadecagon91_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon91_r4 = hexadecagon91.addOrReplaceChild("hexadecagon91_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon92 = bone243.addOrReplaceChild("hexadecagon92",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.6545F));

		PartDefinition hexadecagon92_r1 = hexadecagon92.addOrReplaceChild("hexadecagon92_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon92_r2 = hexadecagon92.addOrReplaceChild("hexadecagon92_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon92_r3 = hexadecagon92.addOrReplaceChild("hexadecagon92_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon92_r4 = hexadecagon92.addOrReplaceChild("hexadecagon92_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon93 = bone243.addOrReplaceChild("hexadecagon93",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.5236F));

		PartDefinition hexadecagon93_r1 = hexadecagon93.addOrReplaceChild("hexadecagon93_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon93_r2 = hexadecagon93.addOrReplaceChild("hexadecagon93_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon93_r3 = hexadecagon93.addOrReplaceChild("hexadecagon93_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon93_r4 = hexadecagon93.addOrReplaceChild("hexadecagon93_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon94 = bone243.addOrReplaceChild("hexadecagon94",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon94_r1 = hexadecagon94.addOrReplaceChild("hexadecagon94_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon94_r2 = hexadecagon94.addOrReplaceChild("hexadecagon94_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon94_r3 = hexadecagon94.addOrReplaceChild("hexadecagon94_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon94_r4 = hexadecagon94.addOrReplaceChild("hexadecagon94_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon95 = bone243.addOrReplaceChild("hexadecagon95",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.2618F));

		PartDefinition hexadecagon95_r1 = hexadecagon95.addOrReplaceChild("hexadecagon95_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon95_r2 = hexadecagon95.addOrReplaceChild("hexadecagon95_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon95_r3 = hexadecagon95.addOrReplaceChild("hexadecagon95_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon95_r4 = hexadecagon95.addOrReplaceChild("hexadecagon95_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon96 = bone243.addOrReplaceChild("hexadecagon96",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hexadecagon96_r1 = hexadecagon96.addOrReplaceChild("hexadecagon96_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon96_r2 = hexadecagon96.addOrReplaceChild("hexadecagon96_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon96_r3 = hexadecagon96.addOrReplaceChild("hexadecagon96_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon96_r4 = hexadecagon96.addOrReplaceChild("hexadecagon96_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon97 = bone243.addOrReplaceChild("hexadecagon97",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon97_r1 = hexadecagon97.addOrReplaceChild("hexadecagon97_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon97_r2 = hexadecagon97.addOrReplaceChild("hexadecagon97_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon97_r3 = hexadecagon97.addOrReplaceChild("hexadecagon97_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon97_r4 = hexadecagon97.addOrReplaceChild("hexadecagon97_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone244 = bone241.addOrReplaceChild("bone244", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone245 = bone244.addOrReplaceChild("bone245", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone245_r1 = bone245.addOrReplaceChild("bone245_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone246 = bone244.addOrReplaceChild("bone246", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone246_r1 = bone246.addOrReplaceChild("bone246_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone247 = bone244.addOrReplaceChild("bone247", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone247_r1 = bone247.addOrReplaceChild("bone247_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone248 = bone244.addOrReplaceChild("bone248", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone248_r1 = bone248.addOrReplaceChild("bone248_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone249 = bone244.addOrReplaceChild("bone249", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone249_r1 = bone249.addOrReplaceChild("bone249_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone250 = bone244.addOrReplaceChild("bone250", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone250_r1 = bone250.addOrReplaceChild("bone250_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone251 = bone244.addOrReplaceChild("bone251", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone251_r1 = bone251.addOrReplaceChild("bone251_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone252 = bone244.addOrReplaceChild("bone252", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone252_r1 = bone252.addOrReplaceChild("bone252_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone253 = bone244.addOrReplaceChild("bone253", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone253_r1 = bone253.addOrReplaceChild("bone253_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone254 = bone244.addOrReplaceChild("bone254", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone254_r1 = bone254.addOrReplaceChild("bone254_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone255 = bone244.addOrReplaceChild("bone255", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone255_r1 = bone255.addOrReplaceChild("bone255_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone256 = bone244.addOrReplaceChild("bone256", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone256_r1 = bone256.addOrReplaceChild("bone256_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone257 = bone244.addOrReplaceChild("bone257", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone257_r1 = bone257.addOrReplaceChild("bone257_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone258 = bone244.addOrReplaceChild("bone258", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone258_r1 = bone258.addOrReplaceChild("bone258_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone259 = bone244.addOrReplaceChild("bone259", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone259_r1 = bone259.addOrReplaceChild("bone259_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone260 = bone244.addOrReplaceChild("bone260", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone260_r1 = bone260.addOrReplaceChild("bone260_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone261 = bone244.addOrReplaceChild("bone261", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone261_r1 = bone261.addOrReplaceChild("bone261_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone262 = bone244.addOrReplaceChild("bone262", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone262_r1 = bone262.addOrReplaceChild("bone262_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone263 = bone244.addOrReplaceChild("bone263", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone263_r1 = bone263.addOrReplaceChild("bone263_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone264 = bone244.addOrReplaceChild("bone264", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone264_r1 = bone264.addOrReplaceChild("bone264_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone265 = bone244.addOrReplaceChild("bone265", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone265_r1 = bone265.addOrReplaceChild("bone265_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone266 = bone244.addOrReplaceChild("bone266", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone266_r1 = bone266.addOrReplaceChild("bone266_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone267 = bone244.addOrReplaceChild("bone267", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone267_r1 = bone267.addOrReplaceChild("bone267_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone268 = bone244.addOrReplaceChild("bone268", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone268_r1 = bone268.addOrReplaceChild("bone268_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone269 = bone244.addOrReplaceChild("bone269", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone269_r1 = bone269.addOrReplaceChild("bone269_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone270 = bone244.addOrReplaceChild("bone270", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone270_r1 = bone270.addOrReplaceChild("bone270_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone271 = bone244.addOrReplaceChild("bone271", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone271_r1 = bone271.addOrReplaceChild("bone271_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone272 = bone244.addOrReplaceChild("bone272", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone272_r1 = bone272.addOrReplaceChild("bone272_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone273 = bone244.addOrReplaceChild("bone273", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone273_r1 = bone273.addOrReplaceChild("bone273_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone274 = bone244.addOrReplaceChild("bone274", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone274_r1 = bone274.addOrReplaceChild("bone274_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone275 = bone244.addOrReplaceChild("bone275", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone275_r1 = bone275.addOrReplaceChild("bone275_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone276 = bone244.addOrReplaceChild("bone276", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone276_r1 = bone276.addOrReplaceChild("bone276_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone277 = bone244.addOrReplaceChild("bone277", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone277_r1 = bone277.addOrReplaceChild("bone277_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone278 = bone244.addOrReplaceChild("bone278", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone278_r1 = bone278.addOrReplaceChild("bone278_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone279 = bone244.addOrReplaceChild("bone279", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone279_r1 = bone279.addOrReplaceChild("bone279_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone280 = bone244.addOrReplaceChild("bone280", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone280_r1 = bone280.addOrReplaceChild("bone280_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone281 = bone244.addOrReplaceChild("bone281", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone281_r1 = bone281.addOrReplaceChild("bone281_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone282 = bone244.addOrReplaceChild("bone282", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone282_r1 = bone282.addOrReplaceChild("bone282_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone283 = bone244.addOrReplaceChild("bone283", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone283_r1 = bone283.addOrReplaceChild("bone283_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone284 = bone244.addOrReplaceChild("bone284", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone284_r1 = bone284.addOrReplaceChild("bone284_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone285 = bone244.addOrReplaceChild("bone285", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone285_r1 = bone285.addOrReplaceChild("bone285_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone286 = bone244.addOrReplaceChild("bone286", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone286_r1 = bone286.addOrReplaceChild("bone286_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone287 = bone244.addOrReplaceChild("bone287", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone287_r1 = bone287.addOrReplaceChild("bone287_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone288 = bone244.addOrReplaceChild("bone288", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone288_r1 = bone288.addOrReplaceChild("bone288_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone289 = bone244.addOrReplaceChild("bone289", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone289_r1 = bone289.addOrReplaceChild("bone289_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone290 = bone244.addOrReplaceChild("bone290", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone290_r1 = bone290.addOrReplaceChild("bone290_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone291 = bone244.addOrReplaceChild("bone291", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone291_r1 = bone291.addOrReplaceChild("bone291_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone292 = bone244.addOrReplaceChild("bone292", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone292_r1 = bone292.addOrReplaceChild("bone292_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone5 = bone444.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1745F, -0.3491F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone6_r3 = bone6.addOrReplaceChild("bone6_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone6_r4 = bone6.addOrReplaceChild("bone6_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone7 = bone5.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone7_r1 = bone7.addOrReplaceChild("bone7_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone7_r2 = bone7.addOrReplaceChild("bone7_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone7_r3 = bone7.addOrReplaceChild("bone7_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone7_r4 = bone7.addOrReplaceChild("bone7_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone8 = bone5.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone8_r2 = bone8.addOrReplaceChild("bone8_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone8_r3 = bone8.addOrReplaceChild("bone8_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone8_r4 = bone8.addOrReplaceChild("bone8_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone9 = bone5.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone9_r2 = bone9.addOrReplaceChild("bone9_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone9_r3 = bone9.addOrReplaceChild("bone9_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone9_r4 = bone9.addOrReplaceChild("bone9_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone10 = bone5.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone10_r1 = bone10.addOrReplaceChild("bone10_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone10_r2 = bone10.addOrReplaceChild("bone10_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone10_r3 = bone10.addOrReplaceChild("bone10_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone10_r4 = bone10.addOrReplaceChild("bone10_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone11 = bone5.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone11_r1 = bone11.addOrReplaceChild("bone11_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone11_r2 = bone11.addOrReplaceChild("bone11_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone11_r3 = bone11.addOrReplaceChild("bone11_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone11_r4 = bone11.addOrReplaceChild("bone11_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone12 = bone5.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone12_r1 = bone12.addOrReplaceChild("bone12_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone12_r2 = bone12.addOrReplaceChild("bone12_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone12_r3 = bone12.addOrReplaceChild("bone12_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone12_r4 = bone12.addOrReplaceChild("bone12_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone13 = bone5.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone13_r2 = bone13.addOrReplaceChild("bone13_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone13_r3 = bone13.addOrReplaceChild("bone13_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone13_r4 = bone13.addOrReplaceChild("bone13_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone14 = bone5.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone14_r1 = bone14.addOrReplaceChild("bone14_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone14_r2 = bone14.addOrReplaceChild("bone14_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone14_r3 = bone14.addOrReplaceChild("bone14_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone14_r4 = bone14.addOrReplaceChild("bone14_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone15 = bone5.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone15_r1 = bone15.addOrReplaceChild("bone15_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone15_r2 = bone15.addOrReplaceChild("bone15_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone15_r3 = bone15.addOrReplaceChild("bone15_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone15_r4 = bone15.addOrReplaceChild("bone15_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone16 = bone5.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone16_r1 = bone16.addOrReplaceChild("bone16_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone16_r2 = bone16.addOrReplaceChild("bone16_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone16_r3 = bone16.addOrReplaceChild("bone16_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone16_r4 = bone16.addOrReplaceChild("bone16_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone17 = bone5.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone17_r1 = bone17.addOrReplaceChild("bone17_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone17_r2 = bone17.addOrReplaceChild("bone17_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone17_r3 = bone17.addOrReplaceChild("bone17_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone17_r4 = bone17.addOrReplaceChild("bone17_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone18 = bone5.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone18_r1 = bone18.addOrReplaceChild("bone18_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone18_r2 = bone18.addOrReplaceChild("bone18_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone18_r3 = bone18.addOrReplaceChild("bone18_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone18_r4 = bone18.addOrReplaceChild("bone18_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone19 = bone5.addOrReplaceChild("bone19",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone19_r1 = bone19.addOrReplaceChild("bone19_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone19_r2 = bone19.addOrReplaceChild("bone19_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone19_r3 = bone19.addOrReplaceChild("bone19_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone19_r4 = bone19.addOrReplaceChild("bone19_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone20 = bone5.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone20_r1 = bone20.addOrReplaceChild("bone20_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone20_r2 = bone20.addOrReplaceChild("bone20_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone20_r3 = bone20.addOrReplaceChild("bone20_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone20_r4 = bone20.addOrReplaceChild("bone20_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone21 = bone5.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone21_r1 = bone21.addOrReplaceChild("bone21_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone21_r2 = bone21.addOrReplaceChild("bone21_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone21_r3 = bone21.addOrReplaceChild("bone21_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone21_r4 = bone21.addOrReplaceChild("bone21_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone22 = bone5.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone22_r1 = bone22.addOrReplaceChild("bone22_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone22_r2 = bone22.addOrReplaceChild("bone22_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone22_r3 = bone22.addOrReplaceChild("bone22_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone22_r4 = bone22.addOrReplaceChild("bone22_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone23 = bone5.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone23_r1 = bone23.addOrReplaceChild("bone23_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone23_r2 = bone23.addOrReplaceChild("bone23_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone23_r3 = bone23.addOrReplaceChild("bone23_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone23_r4 = bone23.addOrReplaceChild("bone23_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone24 = bone5.addOrReplaceChild("bone24",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone24_r1 = bone24.addOrReplaceChild("bone24_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone24_r2 = bone24.addOrReplaceChild("bone24_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone24_r3 = bone24.addOrReplaceChild("bone24_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone24_r4 = bone24.addOrReplaceChild("bone24_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone25 = bone5.addOrReplaceChild("bone25", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon2 = bone27.addOrReplaceChild("hexadecagon2", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -3.0107F));

		PartDefinition hexadecagon2_r1 = hexadecagon2.addOrReplaceChild("hexadecagon2_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon2_r2 = hexadecagon2.addOrReplaceChild("hexadecagon2_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon2_r3 = hexadecagon2.addOrReplaceChild("hexadecagon2_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon2_r4 = hexadecagon2.addOrReplaceChild("hexadecagon2_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon3 = bone27.addOrReplaceChild("hexadecagon3", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.8798F));

		PartDefinition hexadecagon3_r1 = hexadecagon3.addOrReplaceChild("hexadecagon3_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon3_r2 = hexadecagon3.addOrReplaceChild("hexadecagon3_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon3_r3 = hexadecagon3.addOrReplaceChild("hexadecagon3_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon3_r4 = hexadecagon3.addOrReplaceChild("hexadecagon3_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon4 = bone27.addOrReplaceChild("hexadecagon4", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.7489F));

		PartDefinition hexadecagon4_r1 = hexadecagon4.addOrReplaceChild("hexadecagon4_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon4_r2 = hexadecagon4.addOrReplaceChild("hexadecagon4_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon4_r3 = hexadecagon4.addOrReplaceChild("hexadecagon4_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon4_r4 = hexadecagon4.addOrReplaceChild("hexadecagon4_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon5 = bone27.addOrReplaceChild("hexadecagon5", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.618F));

		PartDefinition hexadecagon5_r1 = hexadecagon5.addOrReplaceChild("hexadecagon5_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon5_r2 = hexadecagon5.addOrReplaceChild("hexadecagon5_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon5_r3 = hexadecagon5.addOrReplaceChild("hexadecagon5_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon5_r4 = hexadecagon5.addOrReplaceChild("hexadecagon5_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon6 = bone27.addOrReplaceChild("hexadecagon6", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.4871F));

		PartDefinition hexadecagon6_r1 = hexadecagon6.addOrReplaceChild("hexadecagon6_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon6_r2 = hexadecagon6.addOrReplaceChild("hexadecagon6_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon6_r3 = hexadecagon6.addOrReplaceChild("hexadecagon6_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon6_r4 = hexadecagon6.addOrReplaceChild("hexadecagon6_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon7 = bone27.addOrReplaceChild("hexadecagon7", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.3562F));

		PartDefinition hexadecagon7_r1 = hexadecagon7.addOrReplaceChild("hexadecagon7_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon7_r2 = hexadecagon7.addOrReplaceChild("hexadecagon7_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon7_r3 = hexadecagon7.addOrReplaceChild("hexadecagon7_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon7_r4 = hexadecagon7.addOrReplaceChild("hexadecagon7_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon8 = bone27.addOrReplaceChild("hexadecagon8", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.2253F));

		PartDefinition hexadecagon8_r1 = hexadecagon8.addOrReplaceChild("hexadecagon8_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon8_r2 = hexadecagon8.addOrReplaceChild("hexadecagon8_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon8_r3 = hexadecagon8.addOrReplaceChild("hexadecagon8_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon8_r4 = hexadecagon8.addOrReplaceChild("hexadecagon8_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon9 = bone27.addOrReplaceChild("hexadecagon9", CubeListBuilder.create().texOffs(0, 158)
				.mirror().addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 158).mirror()
				.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -2.0944F));

		PartDefinition hexadecagon9_r1 = hexadecagon9.addOrReplaceChild("hexadecagon9_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon9_r2 = hexadecagon9.addOrReplaceChild("hexadecagon9_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon9_r3 = hexadecagon9.addOrReplaceChild("hexadecagon9_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon9_r4 = hexadecagon9.addOrReplaceChild("hexadecagon9_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon10 = bone27.addOrReplaceChild("hexadecagon10",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.9635F));

		PartDefinition hexadecagon10_r1 = hexadecagon10.addOrReplaceChild("hexadecagon10_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon10_r2 = hexadecagon10.addOrReplaceChild("hexadecagon10_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon10_r3 = hexadecagon10.addOrReplaceChild("hexadecagon10_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon10_r4 = hexadecagon10.addOrReplaceChild("hexadecagon10_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon11 = bone27.addOrReplaceChild("hexadecagon11",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.8326F));

		PartDefinition hexadecagon11_r1 = hexadecagon11.addOrReplaceChild("hexadecagon11_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon11_r2 = hexadecagon11.addOrReplaceChild("hexadecagon11_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon11_r3 = hexadecagon11.addOrReplaceChild("hexadecagon11_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon11_r4 = hexadecagon11.addOrReplaceChild("hexadecagon11_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon12 = bone27.addOrReplaceChild("hexadecagon12",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.7017F));

		PartDefinition hexadecagon12_r1 = hexadecagon12.addOrReplaceChild("hexadecagon12_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon12_r2 = hexadecagon12.addOrReplaceChild("hexadecagon12_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon12_r3 = hexadecagon12.addOrReplaceChild("hexadecagon12_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon12_r4 = hexadecagon12.addOrReplaceChild("hexadecagon12_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon13 = bone27.addOrReplaceChild("hexadecagon13",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hexadecagon13_r1 = hexadecagon13.addOrReplaceChild("hexadecagon13_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon13_r2 = hexadecagon13.addOrReplaceChild("hexadecagon13_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon13_r3 = hexadecagon13.addOrReplaceChild("hexadecagon13_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon13_r4 = hexadecagon13.addOrReplaceChild("hexadecagon13_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon14 = bone27.addOrReplaceChild("hexadecagon14",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.4399F));

		PartDefinition hexadecagon14_r1 = hexadecagon14.addOrReplaceChild("hexadecagon14_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon14_r2 = hexadecagon14.addOrReplaceChild("hexadecagon14_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon14_r3 = hexadecagon14.addOrReplaceChild("hexadecagon14_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon14_r4 = hexadecagon14.addOrReplaceChild("hexadecagon14_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon15 = bone27.addOrReplaceChild("hexadecagon15",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.309F));

		PartDefinition hexadecagon15_r1 = hexadecagon15.addOrReplaceChild("hexadecagon15_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon15_r2 = hexadecagon15.addOrReplaceChild("hexadecagon15_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon15_r3 = hexadecagon15.addOrReplaceChild("hexadecagon15_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon15_r4 = hexadecagon15.addOrReplaceChild("hexadecagon15_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon16 = bone27.addOrReplaceChild("hexadecagon16",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.1781F));

		PartDefinition hexadecagon16_r1 = hexadecagon16.addOrReplaceChild("hexadecagon16_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon16_r2 = hexadecagon16.addOrReplaceChild("hexadecagon16_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon16_r3 = hexadecagon16.addOrReplaceChild("hexadecagon16_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon16_r4 = hexadecagon16.addOrReplaceChild("hexadecagon16_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon17 = bone27.addOrReplaceChild("hexadecagon17",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -1.0472F));

		PartDefinition hexadecagon17_r1 = hexadecagon17.addOrReplaceChild("hexadecagon17_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon17_r2 = hexadecagon17.addOrReplaceChild("hexadecagon17_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon17_r3 = hexadecagon17.addOrReplaceChild("hexadecagon17_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon17_r4 = hexadecagon17.addOrReplaceChild("hexadecagon17_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon18 = bone27.addOrReplaceChild("hexadecagon18",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.9163F));

		PartDefinition hexadecagon18_r1 = hexadecagon18.addOrReplaceChild("hexadecagon18_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon18_r2 = hexadecagon18.addOrReplaceChild("hexadecagon18_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon18_r3 = hexadecagon18.addOrReplaceChild("hexadecagon18_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon18_r4 = hexadecagon18.addOrReplaceChild("hexadecagon18_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon19 = bone27.addOrReplaceChild("hexadecagon19",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.7854F));

		PartDefinition hexadecagon19_r1 = hexadecagon19.addOrReplaceChild("hexadecagon19_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon19_r2 = hexadecagon19.addOrReplaceChild("hexadecagon19_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon19_r3 = hexadecagon19.addOrReplaceChild("hexadecagon19_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon19_r4 = hexadecagon19.addOrReplaceChild("hexadecagon19_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon20 = bone27.addOrReplaceChild("hexadecagon20",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.6545F));

		PartDefinition hexadecagon20_r1 = hexadecagon20.addOrReplaceChild("hexadecagon20_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon20_r2 = hexadecagon20.addOrReplaceChild("hexadecagon20_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon20_r3 = hexadecagon20.addOrReplaceChild("hexadecagon20_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon20_r4 = hexadecagon20.addOrReplaceChild("hexadecagon20_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon21 = bone27.addOrReplaceChild("hexadecagon21",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.5236F));

		PartDefinition hexadecagon21_r1 = hexadecagon21.addOrReplaceChild("hexadecagon21_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon21_r2 = hexadecagon21.addOrReplaceChild("hexadecagon21_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon21_r3 = hexadecagon21.addOrReplaceChild("hexadecagon21_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon21_r4 = hexadecagon21.addOrReplaceChild("hexadecagon21_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon22 = bone27.addOrReplaceChild("hexadecagon22",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.3927F));

		PartDefinition hexadecagon22_r1 = hexadecagon22.addOrReplaceChild("hexadecagon22_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon22_r2 = hexadecagon22.addOrReplaceChild("hexadecagon22_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon22_r3 = hexadecagon22.addOrReplaceChild("hexadecagon22_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon22_r4 = hexadecagon22.addOrReplaceChild("hexadecagon22_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon23 = bone27.addOrReplaceChild("hexadecagon23",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.2618F));

		PartDefinition hexadecagon23_r1 = hexadecagon23.addOrReplaceChild("hexadecagon23_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon23_r2 = hexadecagon23.addOrReplaceChild("hexadecagon23_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon23_r3 = hexadecagon23.addOrReplaceChild("hexadecagon23_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon23_r4 = hexadecagon23.addOrReplaceChild("hexadecagon23_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon24 = bone27.addOrReplaceChild("hexadecagon24",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hexadecagon24_r1 = hexadecagon24.addOrReplaceChild("hexadecagon24_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon24_r2 = hexadecagon24.addOrReplaceChild("hexadecagon24_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon24_r3 = hexadecagon24.addOrReplaceChild("hexadecagon24_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon24_r4 = hexadecagon24.addOrReplaceChild("hexadecagon24_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon49 = bone27.addOrReplaceChild("hexadecagon49",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon49_r1 = hexadecagon49.addOrReplaceChild("hexadecagon49_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon49_r2 = hexadecagon49.addOrReplaceChild("hexadecagon49_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon49_r3 = hexadecagon49.addOrReplaceChild("hexadecagon49_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon49_r4 = hexadecagon49.addOrReplaceChild("hexadecagon49_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone28 = bone25.addOrReplaceChild("bone28", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone29_r1 = bone29.addOrReplaceChild("bone29_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone30 = bone28.addOrReplaceChild("bone30", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone30_r1 = bone30.addOrReplaceChild("bone30_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone31 = bone28.addOrReplaceChild("bone31", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone31_r1 = bone31.addOrReplaceChild("bone31_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone32 = bone28.addOrReplaceChild("bone32", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone32_r1 = bone32.addOrReplaceChild("bone32_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone33 = bone28.addOrReplaceChild("bone33", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone33_r1 = bone33.addOrReplaceChild("bone33_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone34 = bone28.addOrReplaceChild("bone34", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone34_r1 = bone34.addOrReplaceChild("bone34_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone35 = bone28.addOrReplaceChild("bone35", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone35_r1 = bone35.addOrReplaceChild("bone35_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone36 = bone28.addOrReplaceChild("bone36", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone36_r1 = bone36.addOrReplaceChild("bone36_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone37 = bone28.addOrReplaceChild("bone37", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone37_r1 = bone37.addOrReplaceChild("bone37_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone38 = bone28.addOrReplaceChild("bone38", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone38_r1 = bone38.addOrReplaceChild("bone38_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone39 = bone28.addOrReplaceChild("bone39", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone39_r1 = bone39.addOrReplaceChild("bone39_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone40 = bone28.addOrReplaceChild("bone40", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone40_r1 = bone40.addOrReplaceChild("bone40_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone41 = bone28.addOrReplaceChild("bone41", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone41_r1 = bone41.addOrReplaceChild("bone41_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone42 = bone28.addOrReplaceChild("bone42", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone42_r1 = bone42.addOrReplaceChild("bone42_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone43 = bone28.addOrReplaceChild("bone43", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone43_r1 = bone43.addOrReplaceChild("bone43_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone44 = bone28.addOrReplaceChild("bone44", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone44_r1 = bone44.addOrReplaceChild("bone44_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone45 = bone28.addOrReplaceChild("bone45", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone45_r1 = bone45.addOrReplaceChild("bone45_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone46 = bone28.addOrReplaceChild("bone46", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone46_r1 = bone46.addOrReplaceChild("bone46_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone47 = bone28.addOrReplaceChild("bone47", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone47_r1 = bone47.addOrReplaceChild("bone47_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone48 = bone28.addOrReplaceChild("bone48", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone48_r1 = bone48.addOrReplaceChild("bone48_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone49 = bone28.addOrReplaceChild("bone49", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone49_r1 = bone49.addOrReplaceChild("bone49_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone50 = bone28.addOrReplaceChild("bone50", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone50_r1 = bone50.addOrReplaceChild("bone50_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone51 = bone28.addOrReplaceChild("bone51", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone51_r1 = bone51.addOrReplaceChild("bone51_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone52 = bone28.addOrReplaceChild("bone52", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone52_r1 = bone52.addOrReplaceChild("bone52_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone53 = bone28.addOrReplaceChild("bone53", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone53_r1 = bone53.addOrReplaceChild("bone53_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone54 = bone28.addOrReplaceChild("bone54", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone54_r1 = bone54.addOrReplaceChild("bone54_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone55 = bone28.addOrReplaceChild("bone55", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone55_r1 = bone55.addOrReplaceChild("bone55_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone56 = bone28.addOrReplaceChild("bone56", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone56_r1 = bone56.addOrReplaceChild("bone56_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone57 = bone28.addOrReplaceChild("bone57", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone57_r1 = bone57.addOrReplaceChild("bone57_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone58 = bone28.addOrReplaceChild("bone58", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone58_r1 = bone58.addOrReplaceChild("bone58_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone59 = bone28.addOrReplaceChild("bone59", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone59_r1 = bone59.addOrReplaceChild("bone59_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone60 = bone28.addOrReplaceChild("bone60", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone60_r1 = bone60.addOrReplaceChild("bone60_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone61 = bone28.addOrReplaceChild("bone61", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone61_r1 = bone61.addOrReplaceChild("bone61_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone62 = bone28.addOrReplaceChild("bone62", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone62_r1 = bone62.addOrReplaceChild("bone62_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone63 = bone28.addOrReplaceChild("bone63", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone63_r1 = bone63.addOrReplaceChild("bone63_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone64 = bone28.addOrReplaceChild("bone64", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone64_r1 = bone64.addOrReplaceChild("bone64_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone65 = bone28.addOrReplaceChild("bone65", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone65_r1 = bone65.addOrReplaceChild("bone65_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone66 = bone28.addOrReplaceChild("bone66", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone66_r1 = bone66.addOrReplaceChild("bone66_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone67 = bone28.addOrReplaceChild("bone67", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone67_r1 = bone67.addOrReplaceChild("bone67_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone68 = bone28.addOrReplaceChild("bone68", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone68_r1 = bone68.addOrReplaceChild("bone68_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone69 = bone28.addOrReplaceChild("bone69", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone69_r1 = bone69.addOrReplaceChild("bone69_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone70 = bone28.addOrReplaceChild("bone70", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone70_r1 = bone70.addOrReplaceChild("bone70_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone71 = bone28.addOrReplaceChild("bone71", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone71_r1 = bone71.addOrReplaceChild("bone71_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone72 = bone28.addOrReplaceChild("bone72", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone72_r1 = bone72.addOrReplaceChild("bone72_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone73 = bone28.addOrReplaceChild("bone73", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone73_r1 = bone73.addOrReplaceChild("bone73_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone74 = bone28.addOrReplaceChild("bone74", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone74_r1 = bone74.addOrReplaceChild("bone74_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone75 = bone28.addOrReplaceChild("bone75", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone75_r1 = bone75.addOrReplaceChild("bone75_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone76 = bone28.addOrReplaceChild("bone76", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone76_r1 = bone76.addOrReplaceChild("bone76_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone77 = bone444.addOrReplaceChild("bone77", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1745F, 0.3491F, 0.0F));

		PartDefinition bone78 = bone77.addOrReplaceChild("bone78",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone78_r1 = bone78.addOrReplaceChild("bone78_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone78_r2 = bone78.addOrReplaceChild("bone78_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -2.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone78_r3 = bone78.addOrReplaceChild("bone78_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone78_r4 = bone78.addOrReplaceChild("bone78_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -2.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone79 = bone77.addOrReplaceChild("bone79",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.0698F, -3.9873F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.0698F, -1.1835F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone79_r1 = bone79.addOrReplaceChild("bone79_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone79_r2 = bone79.addOrReplaceChild("bone79_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone79_r3 = bone79.addOrReplaceChild("bone79_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone79_r4 = bone79.addOrReplaceChild("bone79_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.5698F, -0.4873F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone80 = bone77.addOrReplaceChild("bone80",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.7981F, -3.9632F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.7981F, -1.1594F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone80_r1 = bone80.addOrReplaceChild("bone80_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone80_r2 = bone80.addOrReplaceChild("bone80_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone80_r3 = bone80.addOrReplaceChild("bone80_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone80_r4 = bone80.addOrReplaceChild("bone80_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.2981F, -0.4632F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone81 = bone77.addOrReplaceChild("bone81",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1641F, -3.0895F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1641F, -0.2857F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone81_r1 = bone81.addOrReplaceChild("bone81_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone81_r2 = bone81.addOrReplaceChild("bone81_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone81_r3 = bone81.addOrReplaceChild("bone81_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone81_r4 = bone81.addOrReplaceChild("bone81_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.6641F, 0.4105F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone82 = bone77.addOrReplaceChild("bone82",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.8619F, -2.6354F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.8619F, 0.1684F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone82_r1 = bone82.addOrReplaceChild("bone82_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone82_r2 = bone82.addOrReplaceChild("bone82_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone82_r3 = bone82.addOrReplaceChild("bone82_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone82_r4 = bone82.addOrReplaceChild("bone82_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3619F, 0.8646F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone83 = bone77.addOrReplaceChild("bone83",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 3.4149F, -1.656F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 3.4149F, 1.1478F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.4F, 9.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone83_r1 = bone83.addOrReplaceChild("bone83_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone83_r2 = bone83.addOrReplaceChild("bone83_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone83_r3 = bone83.addOrReplaceChild("bone83_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone83_r4 = bone83.addOrReplaceChild("bone83_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9149F, 1.844F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone84 = bone77.addOrReplaceChild("bone84",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.023F, -1.3302F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.023F, 1.4736F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.4F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone84_r1 = bone84.addOrReplaceChild("bone84_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone84_r2 = bone84.addOrReplaceChild("bone84_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone84_r3 = bone84.addOrReplaceChild("bone84_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone84_r4 = bone84.addOrReplaceChild("bone84_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.523F, 2.1698F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone85 = bone77.addOrReplaceChild("bone85",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.8258F, -1.4308F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.8258F, 1.373F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4F, 9.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone85_r1 = bone85.addOrReplaceChild("bone85_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone85_r2 = bone85.addOrReplaceChild("bone85_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone85_r3 = bone85.addOrReplaceChild("bone85_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone85_r4 = bone85.addOrReplaceChild("bone85_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.3258F, 2.0692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone86 = bone77.addOrReplaceChild("bone86",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 5.6892F, -2.0062F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 5.6892F, 0.7977F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -13.4F, 9.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone86_r1 = bone86.addOrReplaceChild("bone86_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone86_r2 = bone86.addOrReplaceChild("bone86_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone86_r3 = bone86.addOrReplaceChild("bone86_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone86_r4 = bone86.addOrReplaceChild("bone86_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1892F, 1.4938F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone87 = bone77.addOrReplaceChild("bone87",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -1.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-3.5F, -1.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -8.4301F, 9.43F));

		PartDefinition bone87_r1 = bone87.addOrReplaceChild("bone87_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone87_r2 = bone87.addOrReplaceChild("bone87_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 3.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone87_r3 = bone87.addOrReplaceChild("bone87_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone87_r4 = bone87.addOrReplaceChild("bone87_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone88 = bone77.addOrReplaceChild("bone88",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 0.085F, -3.1863F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 0.085F, -0.3826F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.4301F, 9.43F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone88_r1 = bone88.addOrReplaceChild("bone88_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone88_r2 = bone88.addOrReplaceChild("bone88_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone88_r3 = bone88.addOrReplaceChild("bone88_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone88_r4 = bone88.addOrReplaceChild("bone88_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.585F, 0.3137F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone89 = bone77.addOrReplaceChild("bone89",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 2.1401F, -3.9765F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 2.1401F, -1.1727F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.4301F, 11.43F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone89_r1 = bone89.addOrReplaceChild("bone89_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone89_r2 = bone89.addOrReplaceChild("bone89_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone89_r3 = bone89.addOrReplaceChild("bone89_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone89_r4 = bone89.addOrReplaceChild("bone89_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.6401F, -0.4765F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone90 = bone77.addOrReplaceChild("bone90",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 1.4385F, -4.9339F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 1.4385F, -2.1301F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -14.2899F, 12.9535F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone90_r1 = bone90.addOrReplaceChild("bone90_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone90_r2 = bone90.addOrReplaceChild("bone90_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone90_r3 = bone90.addOrReplaceChild("bone90_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone90_r4 = bone90.addOrReplaceChild("bone90_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9385F, -1.4339F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone91 = bone77.addOrReplaceChild("bone91",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 4.6232F, -3.5701F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 4.6232F, -0.7663F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 14.9535F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone91_r1 = bone91.addOrReplaceChild("bone91_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone91_r2 = bone91.addOrReplaceChild("bone91_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone91_r3 = bone91.addOrReplaceChild("bone91_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone91_r4 = bone91.addOrReplaceChild("bone91_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.1232F, -0.0701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone92 = bone77.addOrReplaceChild("bone92",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 7.3622F, -6.2283F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 7.3622F, -3.4245F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -18.2899F, 20.4223F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone92_r1 = bone92.addOrReplaceChild("bone92_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone92_r2 = bone92.addOrReplaceChild("bone92_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone92_r3 = bone92.addOrReplaceChild("bone92_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone92_r4 = bone92.addOrReplaceChild("bone92_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.8622F, -2.7283F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone93 = bone77.addOrReplaceChild("bone93", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 12.4058F, -7.4599F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 12.4058F, -4.6561F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 26.9848F, -1.0472F, 0.0F, 0.0F));

		PartDefinition bone93_r1 = bone93.addOrReplaceChild("bone93_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone93_r2 = bone93.addOrReplaceChild("bone93_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone93_r3 = bone93.addOrReplaceChild("bone93_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone93_r4 = bone93.addOrReplaceChild("bone93_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 16.9058F, -3.9599F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone94 = bone77.addOrReplaceChild("bone94", CubeListBuilder.create().texOffs(0, 158).mirror()
				.addBox(-0.6962F, 14.0381F, -6.1115F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 158).mirror()
				.addBox(-3.5F, 14.0381F, -3.3077F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 29.6723F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone94_r1 = bone94.addOrReplaceChild("bone94_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone94_r2 = bone94.addOrReplaceChild("bone94_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone94_r3 = bone94.addOrReplaceChild("bone94_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone94_r4 = bone94.addOrReplaceChild("bone94_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 18.5381F, -2.6115F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone95 = bone77.addOrReplaceChild("bone95",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 16.056F, -4.1399F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 16.056F, -1.3361F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 32.891F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone95_r1 = bone95.addOrReplaceChild("bone95_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone95_r2 = bone95.addOrReplaceChild("bone95_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone95_r3 = bone95.addOrReplaceChild("bone95_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone95_r4 = bone95.addOrReplaceChild("bone95_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.556F, -0.6399F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone96 = bone77.addOrReplaceChild("bone96",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, 19.9684F, -1.2889F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-3.5F, 19.9684F, 1.5149F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -19.0712F, 38.3285F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone96_r1 = bone96.addOrReplaceChild("bone96_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone96_r2 = bone96.addOrReplaceChild("bone96_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-3.5F, -4.5F, -0.6962F, 7.0F, 2.0F, 1.3924F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone96_r3 = bone96.addOrReplaceChild("bone96_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone96_r4 = bone96.addOrReplaceChild("bone96_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.6962F, -4.5F, -3.5F, 1.3924F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.4684F, 2.2111F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone97 = bone77.addOrReplaceChild("bone97", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2188F, -15.4063F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone98 = bone97.addOrReplaceChild("bone98", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone99 = bone98.addOrReplaceChild("bone99", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.7188F, -0.4063F));

		PartDefinition hexadecagon25 = bone99.addOrReplaceChild("hexadecagon25",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 3.0107F));

		PartDefinition hexadecagon25_r1 = hexadecagon25.addOrReplaceChild("hexadecagon25_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon25_r2 = hexadecagon25.addOrReplaceChild("hexadecagon25_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon25_r3 = hexadecagon25.addOrReplaceChild("hexadecagon25_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon25_r4 = hexadecagon25.addOrReplaceChild("hexadecagon25_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon26 = bone99.addOrReplaceChild("hexadecagon26",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.8798F));

		PartDefinition hexadecagon26_r1 = hexadecagon26.addOrReplaceChild("hexadecagon26_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon26_r2 = hexadecagon26.addOrReplaceChild("hexadecagon26_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon26_r3 = hexadecagon26.addOrReplaceChild("hexadecagon26_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon26_r4 = hexadecagon26.addOrReplaceChild("hexadecagon26_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon27 = bone99.addOrReplaceChild("hexadecagon27",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.7489F));

		PartDefinition hexadecagon27_r1 = hexadecagon27.addOrReplaceChild("hexadecagon27_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon27_r2 = hexadecagon27.addOrReplaceChild("hexadecagon27_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon27_r3 = hexadecagon27.addOrReplaceChild("hexadecagon27_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon27_r4 = hexadecagon27.addOrReplaceChild("hexadecagon27_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon28 = bone99.addOrReplaceChild("hexadecagon28",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.618F));

		PartDefinition hexadecagon28_r1 = hexadecagon28.addOrReplaceChild("hexadecagon28_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon28_r2 = hexadecagon28.addOrReplaceChild("hexadecagon28_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon28_r3 = hexadecagon28.addOrReplaceChild("hexadecagon28_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon28_r4 = hexadecagon28.addOrReplaceChild("hexadecagon28_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon29 = bone99.addOrReplaceChild("hexadecagon29",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.4871F));

		PartDefinition hexadecagon29_r1 = hexadecagon29.addOrReplaceChild("hexadecagon29_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon29_r2 = hexadecagon29.addOrReplaceChild("hexadecagon29_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon29_r3 = hexadecagon29.addOrReplaceChild("hexadecagon29_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon29_r4 = hexadecagon29.addOrReplaceChild("hexadecagon29_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon30 = bone99.addOrReplaceChild("hexadecagon30",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.3562F));

		PartDefinition hexadecagon30_r1 = hexadecagon30.addOrReplaceChild("hexadecagon30_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon30_r2 = hexadecagon30.addOrReplaceChild("hexadecagon30_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon30_r3 = hexadecagon30.addOrReplaceChild("hexadecagon30_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon30_r4 = hexadecagon30.addOrReplaceChild("hexadecagon30_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon31 = bone99.addOrReplaceChild("hexadecagon31",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.2253F));

		PartDefinition hexadecagon31_r1 = hexadecagon31.addOrReplaceChild("hexadecagon31_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon31_r2 = hexadecagon31.addOrReplaceChild("hexadecagon31_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon31_r3 = hexadecagon31.addOrReplaceChild("hexadecagon31_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon31_r4 = hexadecagon31.addOrReplaceChild("hexadecagon31_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon32 = bone99.addOrReplaceChild("hexadecagon32",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 2.0944F));

		PartDefinition hexadecagon32_r1 = hexadecagon32.addOrReplaceChild("hexadecagon32_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon32_r2 = hexadecagon32.addOrReplaceChild("hexadecagon32_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon32_r3 = hexadecagon32.addOrReplaceChild("hexadecagon32_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon32_r4 = hexadecagon32.addOrReplaceChild("hexadecagon32_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon33 = bone99.addOrReplaceChild("hexadecagon33",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.9635F));

		PartDefinition hexadecagon33_r1 = hexadecagon33.addOrReplaceChild("hexadecagon33_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon33_r2 = hexadecagon33.addOrReplaceChild("hexadecagon33_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon33_r3 = hexadecagon33.addOrReplaceChild("hexadecagon33_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon33_r4 = hexadecagon33.addOrReplaceChild("hexadecagon33_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon34 = bone99.addOrReplaceChild("hexadecagon34",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.8326F));

		PartDefinition hexadecagon34_r1 = hexadecagon34.addOrReplaceChild("hexadecagon34_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon34_r2 = hexadecagon34.addOrReplaceChild("hexadecagon34_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon34_r3 = hexadecagon34.addOrReplaceChild("hexadecagon34_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon34_r4 = hexadecagon34.addOrReplaceChild("hexadecagon34_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon35 = bone99.addOrReplaceChild("hexadecagon35",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.7017F));

		PartDefinition hexadecagon35_r1 = hexadecagon35.addOrReplaceChild("hexadecagon35_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon35_r2 = hexadecagon35.addOrReplaceChild("hexadecagon35_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon35_r3 = hexadecagon35.addOrReplaceChild("hexadecagon35_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon35_r4 = hexadecagon35.addOrReplaceChild("hexadecagon35_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon36 = bone99.addOrReplaceChild("hexadecagon36",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon36_r1 = hexadecagon36.addOrReplaceChild("hexadecagon36_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon36_r2 = hexadecagon36.addOrReplaceChild("hexadecagon36_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon36_r3 = hexadecagon36.addOrReplaceChild("hexadecagon36_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon36_r4 = hexadecagon36.addOrReplaceChild("hexadecagon36_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon37 = bone99.addOrReplaceChild("hexadecagon37",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.4399F));

		PartDefinition hexadecagon37_r1 = hexadecagon37.addOrReplaceChild("hexadecagon37_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon37_r2 = hexadecagon37.addOrReplaceChild("hexadecagon37_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon37_r3 = hexadecagon37.addOrReplaceChild("hexadecagon37_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon37_r4 = hexadecagon37.addOrReplaceChild("hexadecagon37_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon38 = bone99.addOrReplaceChild("hexadecagon38",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.309F));

		PartDefinition hexadecagon38_r1 = hexadecagon38.addOrReplaceChild("hexadecagon38_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon38_r2 = hexadecagon38.addOrReplaceChild("hexadecagon38_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon38_r3 = hexadecagon38.addOrReplaceChild("hexadecagon38_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon38_r4 = hexadecagon38.addOrReplaceChild("hexadecagon38_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon39 = bone99.addOrReplaceChild("hexadecagon39",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.1781F));

		PartDefinition hexadecagon39_r1 = hexadecagon39.addOrReplaceChild("hexadecagon39_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon39_r2 = hexadecagon39.addOrReplaceChild("hexadecagon39_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon39_r3 = hexadecagon39.addOrReplaceChild("hexadecagon39_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon39_r4 = hexadecagon39.addOrReplaceChild("hexadecagon39_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon40 = bone99.addOrReplaceChild("hexadecagon40",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 1.0472F));

		PartDefinition hexadecagon40_r1 = hexadecagon40.addOrReplaceChild("hexadecagon40_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon40_r2 = hexadecagon40.addOrReplaceChild("hexadecagon40_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon40_r3 = hexadecagon40.addOrReplaceChild("hexadecagon40_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon40_r4 = hexadecagon40.addOrReplaceChild("hexadecagon40_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon41 = bone99.addOrReplaceChild("hexadecagon41",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.9163F));

		PartDefinition hexadecagon41_r1 = hexadecagon41.addOrReplaceChild("hexadecagon41_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon41_r2 = hexadecagon41.addOrReplaceChild("hexadecagon41_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon41_r3 = hexadecagon41.addOrReplaceChild("hexadecagon41_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon41_r4 = hexadecagon41.addOrReplaceChild("hexadecagon41_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon42 = bone99.addOrReplaceChild("hexadecagon42",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.7854F));

		PartDefinition hexadecagon42_r1 = hexadecagon42.addOrReplaceChild("hexadecagon42_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon42_r2 = hexadecagon42.addOrReplaceChild("hexadecagon42_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon42_r3 = hexadecagon42.addOrReplaceChild("hexadecagon42_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon42_r4 = hexadecagon42.addOrReplaceChild("hexadecagon42_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon43 = bone99.addOrReplaceChild("hexadecagon43",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.6545F));

		PartDefinition hexadecagon43_r1 = hexadecagon43.addOrReplaceChild("hexadecagon43_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon43_r2 = hexadecagon43.addOrReplaceChild("hexadecagon43_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon43_r3 = hexadecagon43.addOrReplaceChild("hexadecagon43_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon43_r4 = hexadecagon43.addOrReplaceChild("hexadecagon43_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon44 = bone99.addOrReplaceChild("hexadecagon44",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.5236F));

		PartDefinition hexadecagon44_r1 = hexadecagon44.addOrReplaceChild("hexadecagon44_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon44_r2 = hexadecagon44.addOrReplaceChild("hexadecagon44_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon44_r3 = hexadecagon44.addOrReplaceChild("hexadecagon44_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon44_r4 = hexadecagon44.addOrReplaceChild("hexadecagon44_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon45 = bone99.addOrReplaceChild("hexadecagon45",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.3927F));

		PartDefinition hexadecagon45_r1 = hexadecagon45.addOrReplaceChild("hexadecagon45_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon45_r2 = hexadecagon45.addOrReplaceChild("hexadecagon45_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon45_r3 = hexadecagon45.addOrReplaceChild("hexadecagon45_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon45_r4 = hexadecagon45.addOrReplaceChild("hexadecagon45_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon46 = bone99.addOrReplaceChild("hexadecagon46",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.2618F));

		PartDefinition hexadecagon46_r1 = hexadecagon46.addOrReplaceChild("hexadecagon46_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon46_r2 = hexadecagon46.addOrReplaceChild("hexadecagon46_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon46_r3 = hexadecagon46.addOrReplaceChild("hexadecagon46_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon46_r4 = hexadecagon46.addOrReplaceChild("hexadecagon46_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon47 = bone99.addOrReplaceChild("hexadecagon47",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -35.391F, 8.8181F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hexadecagon47_r1 = hexadecagon47.addOrReplaceChild("hexadecagon47_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(1.5826F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(3.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon47_r2 = hexadecagon47.addOrReplaceChild("hexadecagon47_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-6.6101F, -0.1676F, 9.3895F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-4.5964F, -0.1676F, 7.3758F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon47_r3 = hexadecagon47.addOrReplaceChild("hexadecagon47_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(7.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon47_r4 = hexadecagon47.addOrReplaceChild("hexadecagon47_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-8.0691F, -0.1676F, 5.0554F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon48 = bone99.addOrReplaceChild("hexadecagon48",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, 8.1906F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, 10.2043F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, -35.391F, 8.8181F));

		PartDefinition hexadecagon48_r1 = hexadecagon48.addOrReplaceChild("hexadecagon48_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon48_r2 = hexadecagon48.addOrReplaceChild("hexadecagon48_r2",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-2.5137F, -0.1676F, -0.5F, 5.0275F, 0.3352F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon48_r3 = hexadecagon48.addOrReplaceChild("hexadecagon48_r3",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon48_r4 = hexadecagon48.addOrReplaceChild("hexadecagon48_r4",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.5F, -0.1676F, -2.5137F, 1.0F, 0.3352F, 5.0275F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.7043F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone100 = bone97.addOrReplaceChild("bone100", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -31.1F, -25.4688F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone101 = bone100.addOrReplaceChild("bone101", CubeListBuilder.create(),
				PartPose.offset(0.0F, -33.0008F, 31.8701F));

		PartDefinition bone101_r1 = bone101.addOrReplaceChild("bone101_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone102 = bone100.addOrReplaceChild("bone102", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone102_r1 = bone102.addOrReplaceChild("bone102_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone103 = bone100.addOrReplaceChild("bone103", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone103_r1 = bone103.addOrReplaceChild("bone103_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone104 = bone100.addOrReplaceChild("bone104", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone104_r1 = bone104.addOrReplaceChild("bone104_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone105 = bone100.addOrReplaceChild("bone105", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bone105_r1 = bone105.addOrReplaceChild("bone105_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone106 = bone100.addOrReplaceChild("bone106", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone106_r1 = bone106.addOrReplaceChild("bone106_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone107 = bone100.addOrReplaceChild("bone107", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone107_r1 = bone107.addOrReplaceChild("bone107_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone108 = bone100.addOrReplaceChild("bone108", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 0.9163F, 0.0F));

		PartDefinition bone108_r1 = bone108.addOrReplaceChild("bone108_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone109 = bone100.addOrReplaceChild("bone109", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone109_r1 = bone109.addOrReplaceChild("bone109_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone110 = bone100.addOrReplaceChild("bone110", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.1781F, 0.0F));

		PartDefinition bone110_r1 = bone110.addOrReplaceChild("bone110_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone111 = bone100.addOrReplaceChild("bone111", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.309F, 0.0F));

		PartDefinition bone111_r1 = bone111.addOrReplaceChild("bone111_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone112 = bone100.addOrReplaceChild("bone112", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.4399F, 0.0F));

		PartDefinition bone112_r1 = bone112.addOrReplaceChild("bone112_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone113 = bone100.addOrReplaceChild("bone113", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone113_r1 = bone113.addOrReplaceChild("bone113_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone114 = bone100.addOrReplaceChild("bone114", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.7017F, 0.0F));

		PartDefinition bone114_r1 = bone114.addOrReplaceChild("bone114_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone115 = bone100.addOrReplaceChild("bone115", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.8326F, 0.0F));

		PartDefinition bone115_r1 = bone115.addOrReplaceChild("bone115_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone116 = bone100.addOrReplaceChild("bone116", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 1.9635F, 0.0F));

		PartDefinition bone116_r1 = bone116.addOrReplaceChild("bone116_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone117 = bone100.addOrReplaceChild("bone117", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone117_r1 = bone117.addOrReplaceChild("bone117_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone118 = bone100.addOrReplaceChild("bone118", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.2253F, 0.0F));

		PartDefinition bone118_r1 = bone118.addOrReplaceChild("bone118_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone119 = bone100.addOrReplaceChild("bone119", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone119_r1 = bone119.addOrReplaceChild("bone119_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone120 = bone100.addOrReplaceChild("bone120", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone120_r1 = bone120.addOrReplaceChild("bone120_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone121 = bone100.addOrReplaceChild("bone121", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.618F, 0.0F));

		PartDefinition bone121_r1 = bone121.addOrReplaceChild("bone121_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone122 = bone100.addOrReplaceChild("bone122", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.7489F, 0.0F));

		PartDefinition bone122_r1 = bone122.addOrReplaceChild("bone122_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone123 = bone100.addOrReplaceChild("bone123", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 2.8798F, 0.0F));

		PartDefinition bone123_r1 = bone123.addOrReplaceChild("bone123_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone124 = bone100.addOrReplaceChild("bone124", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.0107F, 0.0F));

		PartDefinition bone124_r1 = bone124.addOrReplaceChild("bone124_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone125 = bone100.addOrReplaceChild("bone125", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone125_r1 = bone125.addOrReplaceChild("bone125_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone126 = bone100.addOrReplaceChild("bone126", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -3.0107F, 0.0F));

		PartDefinition bone126_r1 = bone126.addOrReplaceChild("bone126_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone127 = bone100.addOrReplaceChild("bone127", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.8798F, 0.0F));

		PartDefinition bone127_r1 = bone127.addOrReplaceChild("bone127_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone128 = bone100.addOrReplaceChild("bone128", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.7489F, 0.0F));

		PartDefinition bone128_r1 = bone128.addOrReplaceChild("bone128_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone129 = bone100.addOrReplaceChild("bone129", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone129_r1 = bone129.addOrReplaceChild("bone129_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone130 = bone100.addOrReplaceChild("bone130", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone130_r1 = bone130.addOrReplaceChild("bone130_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone131 = bone100.addOrReplaceChild("bone131", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone131_r1 = bone131.addOrReplaceChild("bone131_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone132 = bone100.addOrReplaceChild("bone132", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.2253F, 0.0F));

		PartDefinition bone132_r1 = bone132.addOrReplaceChild("bone132_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone133 = bone100.addOrReplaceChild("bone133", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone133_r1 = bone133.addOrReplaceChild("bone133_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone134 = bone100.addOrReplaceChild("bone134", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.9635F, 0.0F));

		PartDefinition bone134_r1 = bone134.addOrReplaceChild("bone134_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone135 = bone100.addOrReplaceChild("bone135", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.8326F, 0.0F));

		PartDefinition bone135_r1 = bone135.addOrReplaceChild("bone135_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone136 = bone100.addOrReplaceChild("bone136", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.7017F, 0.0F));

		PartDefinition bone136_r1 = bone136.addOrReplaceChild("bone136_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone137 = bone100.addOrReplaceChild("bone137", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone137_r1 = bone137.addOrReplaceChild("bone137_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone138 = bone100.addOrReplaceChild("bone138", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.4399F, 0.0F));

		PartDefinition bone138_r1 = bone138.addOrReplaceChild("bone138_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone139 = bone100.addOrReplaceChild("bone139", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone139_r1 = bone139.addOrReplaceChild("bone139_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone140 = bone100.addOrReplaceChild("bone140", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.1781F, 0.0F));

		PartDefinition bone140_r1 = bone140.addOrReplaceChild("bone140_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone141 = bone100.addOrReplaceChild("bone141", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone141_r1 = bone141.addOrReplaceChild("bone141_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone142 = bone100.addOrReplaceChild("bone142", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.9163F, 0.0F));

		PartDefinition bone142_r1 = bone142.addOrReplaceChild("bone142_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone143 = bone100.addOrReplaceChild("bone143", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone143_r1 = bone143.addOrReplaceChild("bone143_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone144 = bone100.addOrReplaceChild("bone144", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone144_r1 = bone144.addOrReplaceChild("bone144_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone145 = bone100.addOrReplaceChild("bone145", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bone145_r1 = bone145.addOrReplaceChild("bone145_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone146 = bone100.addOrReplaceChild("bone146", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone146_r1 = bone146.addOrReplaceChild("bone146_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone147 = bone100.addOrReplaceChild("bone147", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone147_r1 = bone147.addOrReplaceChild("bone147_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone148 = bone100.addOrReplaceChild("bone148", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -33.0008F, 31.8701F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone148_r1 = bone148.addOrReplaceChild("bone148_r1",
				CubeListBuilder.create().texOffs(0, 158).mirror()
						.addBox(-0.2274F, -2.5F, -0.5F, 0.4549F, 5.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.8F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone442 = head.addOrReplaceChild("bone442", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone445 = bone442.addOrReplaceChild("bone445", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.7F, -31.4F, -3.7F, 0.6545F, 0.3491F, -0.1745F));

		PartDefinition hexadecagon = bone445.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-2.1079F, -1.6308F, -4.766F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-2.486F, -1.6308F, -4.3879F, 0.9439F, 5.4317F, 0.1878F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(2.3099F, -3.1888F, 4.4246F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.472F, -3.7177F, -0.0939F, 0.9439F, 5.4317F, 0.1878F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.014F, 2.0869F, -4.294F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.472F, -3.7177F, -0.0939F, 0.9439F, 5.4317F, 0.1878F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.014F, 2.0869F, -4.294F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.014F, 2.0869F, -4.294F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.014F, 2.0869F, -4.294F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon146 = bone445.addOrReplaceChild("hexadecagon146",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-13.1913F, -10.438F, 6.056F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-13.1913F, -10.438F, 7.16F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-12.64F, -10.438F, 6.6087F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-13.744F, -10.438F, 6.6087F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(13.3499F, 5.2292F, -6.6154F));

		PartDefinition hexadecagon146_r1 = hexadecagon146.addOrReplaceChild("hexadecagon146_r1",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.69F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(0.414F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-13.054F, -9.748F, 6.746F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon146_r2 = hexadecagon146.addOrReplaceChild("hexadecagon146_r2",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.69F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(0.414F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-13.054F, -9.748F, 6.746F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon146_r3 = hexadecagon146.addOrReplaceChild("hexadecagon146_r3",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-13.054F, -9.748F, 6.746F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon146_r4 = hexadecagon146.addOrReplaceChild("hexadecagon146_r4",
				CubeListBuilder.create().texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 123).mirror()
						.addBox(-0.1373F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-13.054F, -9.748F, 6.746F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone443 = bone442.addOrReplaceChild("bone443", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.7F, -31.4F, -3.7F, 0.6545F, -0.3491F, 0.1745F));

		PartDefinition hexadecagon147 = bone443.addOrReplaceChild("hexadecagon147",
				CubeListBuilder.create().texOffs(0, 123)
						.addBox(1.9201F, -1.6308F, -4.766F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F))
						.texOffs(0, 123).addBox(1.542F, -1.6308F, -4.3879F, 0.9439F, 5.4317F, 0.1878F,
								new CubeDeformation(0.0F)),
				PartPose.offset(-2.3099F, -3.1888F, 4.4246F));

		PartDefinition hexadecagon147_r1 = hexadecagon147.addOrReplaceChild("hexadecagon147_r1",
				CubeListBuilder.create().texOffs(0, 123)
						.addBox(-0.472F, -3.7177F, -0.0939F, 0.9439F, 5.4317F, 0.1878F, new CubeDeformation(0.0F))
						.texOffs(0, 123)
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.014F, 2.0869F, -4.294F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon147_r2 = hexadecagon147.addOrReplaceChild("hexadecagon147_r2",
				CubeListBuilder.create().texOffs(0, 123)
						.addBox(-0.472F, -3.7177F, -0.0939F, 0.9439F, 5.4317F, 0.1878F, new CubeDeformation(0.0F))
						.texOffs(0, 123)
						.addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.014F, 2.0869F, -4.294F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon147_r3 = hexadecagon147.addOrReplaceChild("hexadecagon147_r3",
				CubeListBuilder.create().texOffs(0, 123).addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.014F, 2.0869F, -4.294F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon147_r4 = hexadecagon147.addOrReplaceChild("hexadecagon147_r4",
				CubeListBuilder.create().texOffs(0, 123).addBox(-0.0939F, -3.7177F, -0.472F, 0.1878F, 5.4317F, 0.9439F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.014F, 2.0869F, -4.294F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon148 = bone443.addOrReplaceChild("hexadecagon148", CubeListBuilder.create()
				.texOffs(0, 123).addBox(12.9168F, -10.438F, 6.056F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
				.texOffs(0, 123).addBox(12.9168F, -10.438F, 7.16F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
				.texOffs(0, 123).addBox(12.364F, -10.438F, 6.6087F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F))
				.texOffs(0, 123).addBox(13.468F, -10.438F, 6.6087F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.3499F, 5.2292F, -6.6154F));

		PartDefinition hexadecagon148_r1 = hexadecagon148.addOrReplaceChild("hexadecagon148_r1", CubeListBuilder
				.create().texOffs(0, 123)
				.addBox(0.414F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.69F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.1372F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.1372F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.054F, -9.748F, 6.746F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon148_r2 = hexadecagon148.addOrReplaceChild("hexadecagon148_r2", CubeListBuilder
				.create().texOffs(0, 123)
				.addBox(0.414F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.69F, -0.69F, -0.1373F, 0.276F, 0.552F, 0.2745F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.1372F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(-0.1372F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.054F, -9.748F, 6.746F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon148_r3 = hexadecagon148.addOrReplaceChild("hexadecagon148_r3",
				CubeListBuilder.create().texOffs(0, 123)
						.addBox(-0.1372F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.texOffs(0, 123)
						.addBox(-0.1372F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.054F, -9.748F, 6.746F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hexadecagon148_r4 = hexadecagon148.addOrReplaceChild("hexadecagon148_r4",
				CubeListBuilder.create().texOffs(0, 123)
						.addBox(-0.1372F, -0.69F, 0.414F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F))
						.texOffs(0, 123)
						.addBox(-0.1372F, -0.69F, -0.69F, 0.2745F, 0.552F, 0.276F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.054F, -9.748F, 6.746F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Fogobraco = rightArm.addOrReplaceChild("Fogobraco", CubeListBuilder.create(),
				PartPose.offset(2.0F, 1.0F, -2.0F));

		PartDefinition Fogobraco_r1 = Fogobraco.addOrReplaceChild(
				"Fogobraco_r1", CubeListBuilder.create().texOffs(1241, 334).addBox(-17.0F, 16.0F, 0.0F, 4.0F, 6.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, 1.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition Fogobraco_r2 = Fogobraco.addOrReplaceChild("Fogobraco_r2",
				CubeListBuilder.create().texOffs(1241, 334).addBox(-17.0F, 16.0F, 0.0F, 4.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -19.0F, 3.0F, 0.0F, 0.0F, -1.309F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition Fogobraco2 = leftArm.addOrReplaceChild("Fogobraco2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 1.0F, -2.0F));

		PartDefinition Fogobraco2_r1 = Fogobraco2.addOrReplaceChild("Fogobraco2_r1",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 16.0F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -29.0F, 1.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition Fogobraco2_r2 = Fogobraco2.addOrReplaceChild("Fogobraco2_r2",
				CubeListBuilder.create().texOffs(1241, 334).mirror()
						.addBox(13.0F, 16.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(21.0F, -19.0F, 3.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1300, 1300);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}