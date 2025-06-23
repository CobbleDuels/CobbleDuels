package net.cobbleduels.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.cobbleduels.CobbleDuelsMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DarkMagicianModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(CobbleDuelsMod.MOD_ID, "darkmagician"), "main");
    private final ModelPart bone;
    private final ModelPart LeftLeg;
    private final ModelPart LeftLeg2;
    private final ModelPart RightLeg;
    private final ModelPart RightLeg2;
    private final ModelPart Body;
    private final ModelPart bone6;
    private final ModelPart bone5;
    private final ModelPart bone8;
    private final ModelPart bone7;
    private final ModelPart LeftArm;
    private final ModelPart bone3;
    private final ModelPart bone2;
    private final ModelPart RightArm;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart Head;
    private final ModelPart bone4;

    public DarkMagicianModel(ModelPart root) {
        this.bone = root.getChild("bone");
        this.LeftLeg = this.bone.getChild("LeftLeg");
        this.LeftLeg2 = this.LeftLeg.getChild("LeftLeg2");
        this.RightLeg = this.bone.getChild("RightLeg");
        this.RightLeg2 = this.RightLeg.getChild("RightLeg2");
        this.Body = this.bone.getChild("Body");
        this.bone6 = this.Body.getChild("bone6");
        this.bone5 = this.bone6.getChild("bone5");
        this.bone8 = this.Body.getChild("bone8");
        this.bone7 = this.Body.getChild("bone7");
        this.LeftArm = this.bone.getChild("LeftArm");
        this.bone3 = this.LeftArm.getChild("bone3");
        this.bone2 = this.bone3.getChild("bone2");
        this.RightArm = this.bone.getChild("RightArm");
        this.bone9 = this.RightArm.getChild("bone9");
        this.bone10 = this.bone9.getChild("bone10");
        this.bone11 = this.bone10.getChild("bone11");
        this.Head = this.bone.getChild("Head");
        this.bone4 = this.Head.getChild("bone4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

        PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(5, 83).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(20, 83).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offset(1.9F, 7.0F, 0.5F));

        PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(71, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(5, 71).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 6.0F, 0.0F));

        PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(83, 58).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(84, 78).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offset(-1.9F, 7.0F, 0.5F));

        PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(71, 12).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(20, 71).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 6.0F, 0.0F));

        PartDefinition Body = bone.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(64, 47).addBox(-4.0F, -6.75F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 7.0F, 0.0F));

        PartDefinition bone6 = Body.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(58, 60).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition bone5 = bone6.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(33, 60).addBox(-4.0F, -6.25F, 0.35F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.25F, -2.35F));

        PartDefinition Body_r1 = bone5.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(23, 55).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition Body_r2 = bone5.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(73, 71).addBox(-3.0F, -1.0F, -2.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-5.0F, -4.75F, 2.85F, 0.0F, 0.0F, -0.0436F));

        PartDefinition Body_r3 = bone5.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(35, 71).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(-6.0F, -6.75F, 2.35F, 0.0F, 0.0F, 0.2182F));

        PartDefinition Body_r4 = bone5.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(66, 39).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(6.0F, -6.75F, 2.35F, 0.0F, 0.0F, -0.2182F));

        PartDefinition Body_r5 = bone5.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(54, 71).addBox(-2.0F, -1.0F, -2.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(5.0F, -4.75F, 2.85F, 0.0F, 0.0F, 0.0436F));

        PartDefinition bone8 = Body.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, -1.8201F, -2.213F));

        PartDefinition Body_r6 = bone8.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(66, 24).addBox(-3.0F, -25.0F, -2.0F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 25.0701F, 1.213F, -0.0436F, 0.0F, 0.0F));

        PartDefinition bone7 = Body.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, -1.8201F, 2.213F));

        PartDefinition Body_r7 = bone7.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-3.0F, -25.0F, 2.0F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 25.0701F, -1.213F, 0.0436F, 0.0F, 0.0F));

        PartDefinition LeftArm = bone.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(54, 78).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(69, 78).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.0F, -3.0F, 0.0F));

        PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(85, 35).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(86, 0).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.5F, 4.5F, 0.0F));

        PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, -0.25F, -1.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(89, 45).addBox(-0.5F, -0.25F, -1.125F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, 4.75F, -0.375F));

        PartDefinition RightArm = bone.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(79, 24).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(35, 79).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, -3.0F, 0.0F));

        PartDefinition bone9 = RightArm.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(86, 10).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(84, 88).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-0.5F, 4.5F, 0.0F));

        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(16, 55).addBox(0.0F, -0.25F, -1.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 89).addBox(-1.5F, -0.25F, -1.125F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, 4.75F, -0.375F));

        PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -7.0461F, -0.7989F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(61, 89).addBox(0.0F, 14.9539F, -0.7989F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 71).addBox(-0.5F, -7.0461F, -0.7989F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.25F, 0.2961F, -0.8261F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r1 = bone11.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -7.7961F, -0.7989F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r2 = bone11.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 89).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, -6.5461F, -0.0489F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 89).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5461F, 0.2011F, 0.0436F, 0.0F, 0.0F));

        PartDefinition Head = bone.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(33, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -5.0F, 0.0F));

        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -14.0F, -4.0F, 9.0F, 14.0F, 7.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-0.5F, 2.0F, 1.5F, -0.2182F, 0.0F, 0.0F));

        PartDefinition bone4 = Head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(33, 17).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -8.0F, 2.0F));

        PartDefinition Head_r1 = bone4.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(-1.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

        PartDefinition Head_r2 = bone4.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(33, 32).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, -0.75F, -1.5F, 0.3054F, 0.0F, 0.0F));

        PartDefinition Head_r3 = bone4.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(31, 47).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, 0.1309F, 0.0F, 0.0F));

        PartDefinition Head_r4 = bone4.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, 0.0873F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 112, 112);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    public ModelPart root() {
        return bone;
    }
}
