package its_meow.betteranimalsplus.client.model.shark;

import its_meow.betteranimalsplus.common.entity.EntityShark;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

/**
 * BlueShark - Batman Created using Tabula 7.0.1
 */
public class ModelBlueShark extends EntityModel<EntityShark> {
    public RendererModel body;
    public RendererModel tail00;
    public RendererModel neck;
    public RendererModel dorsalFin00;
    public RendererModel lFin00;
    public RendererModel rFin00;
    public RendererModel tail01;
    public RendererModel tail02;
    public RendererModel lLowerTailFin;
    public RendererModel rLowerTailFin;
    public RendererModel tail03;
    public RendererModel tail04;
    public RendererModel upperTailFin;
    public RendererModel mLowerTailFin;
    public RendererModel tail05;
    public RendererModel tailFinUpper00;
    public RendererModel tailFinLower00;
    public RendererModel tailFinUpper01;
    public RendererModel tailFinUpper02;
    public RendererModel tailFinLower01;
    public RendererModel tailFinLower02;
    public RendererModel head;
    public RendererModel lowerJaw;
    public RendererModel snout;
    public RendererModel teethUpper;
    public RendererModel headUpper;
    public RendererModel headUpper2;
    public RendererModel teethLower;
    public RendererModel dorsalFin01;
    public RendererModel dorsalFin03;
    public RendererModel dorsalFin02;
    public RendererModel dorsalFin04;
    public RendererModel lFin01;
    public RendererModel lFin02;
    public RendererModel rFin01;
    public RendererModel rFin02;

    public ModelBlueShark() {
        this.textureWidth = 60;
        this.textureHeight = 200;
        this.tailFinUpper02 = new RendererModel(this, 25, 84);
        this.tailFinUpper02.setRotationPoint(0.0F, -5.8F, -0.5F);
        this.tailFinUpper02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(tailFinUpper02, -0.136659280431156F, 0.0F, 0.0F);
        this.tailFinLower02 = new RendererModel(this, 15, 97);
        this.tailFinLower02.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.tailFinLower02.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tailFinLower02, 0.31869712141416456F, 0.0F, 0.0F);
        this.lFin01 = new RendererModel(this, 12, 178);
        this.lFin01.setRotationPoint(-0.5F, 6.9F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(lFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail01 = new RendererModel(this, 0, 50);
        this.tail01.setRotationPoint(0.0F, -1.4F, 10.4F);
        this.tail01.addBox(-2.5F, -3.0F, 0.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(tail01, -0.04363323129985824F, 0.0F, 0.0F);
        this.dorsalFin02 = new RendererModel(this, 26, 144);
        this.dorsalFin02.setRotationPoint(-1.0F, -1.7F, 0.2F);
        this.dorsalFin02.addBox(0.0F, -2.2F, 0.1F, 1, 4, 4, 0.0F);
        this.setRotateAngle(dorsalFin02, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail02 = new RendererModel(this, 0, 65);
        this.tail02.setRotationPoint(0.0F, 0.1F, 5.3F);
        this.tail02.addBox(-2.0F, -3.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(tail02, -1.7453292519943296E-4F, 0.0F, 0.0F);
        this.mLowerTailFin = new RendererModel(this, 22, 179);
        this.mLowerTailFin.setRotationPoint(-0.5F, 1.6F, 0.9F);
        this.mLowerTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(mLowerTailFin, 0.40980330836826856F, 0.0F, 0.0F);
        this.dorsalFin01 = new RendererModel(this, 26, 134);
        this.dorsalFin01.setRotationPoint(0.0F, -3.1F, 0.4F);
        this.dorsalFin01.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.136659280431156F, 0.0F, 0.0F);
        this.upperTailFin = new RendererModel(this, 19, 189);
        this.upperTailFin.setRotationPoint(-0.5F, -1.4F, 0.8F);
        this.upperTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(upperTailFin, 1.2292353921796064F, 0.0F, 0.0F);
        this.headUpper2 = new RendererModel(this, 28, 25);
        this.headUpper2.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.headUpper2.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 9, 0.0F);
        this.setRotateAngle(headUpper2, 0.18029251173101424F, 0.0F, 0.0F);
        this.tail05 = new RendererModel(this, 25, 50);
        this.tail05.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.tail05.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.body = new RendererModel(this, 0, 0);
        this.body.setRotationPoint(0.0F, 13.0F, 3.0F);
        this.body.addBox(-4.5F, -5.5F, -14.0F, 9, 9, 14, 0.0F);
        this.setRotateAngle(body, 0.022863813201125717F, 0.0F, 0.0F);
        this.lFin02 = new RendererModel(this, 0, 189);
        this.lFin02.setRotationPoint(0.0F, 5.7F, 1.0F);
        this.lFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.rFin00 = new RendererModel(this, 0, 178);
        this.rFin00.mirror = true;
        this.rFin00.setRotationPoint(-3.6F, 1.0F, -13.9F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.setRotateAngle(rFin00, 0.18203784098300857F, 0.0F, 0.7740535232594852F);
        this.tailFinUpper00 = new RendererModel(this, 25, 61);
        this.tailFinUpper00.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.tailFinUpper00.addBox(-0.51F, -8.0F, -1.5F, 1, 8, 4, 0.0F);
        this.setRotateAngle(tailFinUpper00, -1.0016444577195458F, 0.0F, 0.0F);
        this.headUpper = new RendererModel(this, 0, 146);
        this.headUpper.setRotationPoint(0.0F, -5.0F, 2.0F);
        this.headUpper.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 8, 0.0F);
        this.setRotateAngle(headUpper, -1.141619863729491F, 0.0F, 0.0F);
        this.tail03 = new RendererModel(this, 0, 78);
        this.tail03.setRotationPoint(0.0F, -1.0F, 5.7F);
        this.tail03.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F);
        this.lLowerTailFin = new RendererModel(this, 8, 189);
        this.lLowerTailFin.setRotationPoint(2.2F, 4.0F, 2.5F);
        this.lLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(lLowerTailFin, 0.36425021489121656F, 0.0F, -0.5462880558742251F);
        this.dorsalFin03 = new RendererModel(this, 26, 159);
        this.dorsalFin03.setRotationPoint(-1.0F, -6.1F, 2.3F);
        this.dorsalFin03.addBox(0.0F, -3.1F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(dorsalFin03, -0.5235987755982988F, 0.0F, 0.0F);
        this.teethLower = new RendererModel(this, 0, 171);
        this.teethLower.setRotationPoint(-2.0F, -1.8F, -3.0F);
        this.teethLower.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.tailFinLower01 = new RendererModel(this, 15, 88);
        this.tailFinLower01.setRotationPoint(0.0F, 3.6F, -0.5F);
        this.tailFinLower01.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(tailFinLower01, 0.36425021489121656F, 0.0F, 0.0F);
        this.tail00 = new RendererModel(this, 0, 27);
        this.tail00.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.tail00.addBox(-3.5F, -4.5F, 0.0F, 7, 8, 11, 0.0F);
        this.setRotateAngle(tail00, -0.05969026041820607F, 0.0F, 0.0F);
        this.rFin02 = new RendererModel(this, 0, 189);
        this.rFin02.mirror = true;
        this.rFin02.setRotationPoint(0.0F, 5.7F, 1.0F);
        this.rFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.rLowerTailFin = new RendererModel(this, 8, 189);
        this.rLowerTailFin.setRotationPoint(-2.2F, 4.0F, 2.5F);
        this.rLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(rLowerTailFin, 0.36425021489121656F, 0.0F, 0.5462880558742251F);
        this.head = new RendererModel(this, 0, 124);
        this.head.setRotationPoint(0.0F, 0.3F, -8.6F);
        this.head.addBox(-3.5F, -3.0F, -4.2F, 7, 4, 4, 0.0F);
        this.setRotateAngle(head, -0.136659280431156F, 0.0F, 0.0F);
        this.lowerJaw = new RendererModel(this, 0, 157);
        this.lowerJaw.setRotationPoint(0.0F, 2.4F, -8.4F);
        this.lowerJaw.addBox(-3.0F, -1.0F, -4.0F, 6, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.18203784098300857F, 0.0F, 0.0F);
        this.dorsalFin00 = new RendererModel(this, 26, 124);
        this.dorsalFin00.setRotationPoint(0.5F, -6.6F, -6.7F);
        this.dorsalFin00.addBox(-1.5F, -0.4F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.40980330836826856F, 0.0F, 0.0F);
        this.snout = new RendererModel(this, 0, 135);
        this.snout.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.snout.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 2, 0.0F);
        this.setRotateAngle(snout, 1.3203415791337103F, 0.0F, 0.0F);
        this.lFin00 = new RendererModel(this, 0, 178);
        this.lFin00.setRotationPoint(3.6F, 1.0F, -13.9F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.setRotateAngle(lFin00, 0.18203784098300857F, 0.0F, -0.7740535232594852F);
        this.rFin01 = new RendererModel(this, 12, 178);
        this.rFin01.mirror = true;
        this.rFin01.setRotationPoint(-0.5F, 6.9F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(rFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.tailFinUpper01 = new RendererModel(this, 25, 73);
        this.tailFinUpper01.setRotationPoint(0.0F, -8.7F, -0.3F);
        this.tailFinUpper01.addBox(-0.5F, -6.0F, -1.0F, 1, 7, 3, 0.0F);
        this.setRotateAngle(tailFinUpper01, -0.22759093446006054F, 0.0F, 0.0F);
        this.dorsalFin04 = new RendererModel(this, 34, 152);
        this.dorsalFin04.setRotationPoint(0.0F, -3.3F, 1.3F);
        this.dorsalFin04.addBox(0.0F, 0.0F, -0.6F, 1, 7, 2, 0.0F);
        this.setRotateAngle(dorsalFin04, 0.6373942428283291F, 0.0F, 0.0F);
        this.neck = new RendererModel(this, 0, 103);
        this.neck.setRotationPoint(0.0F, 0.0F, -13.6F);
        this.neck.addBox(-4.0F, -5.5F, -9.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
        this.tail04 = new RendererModel(this, 0, 89);
        this.tail04.setRotationPoint(0.0F, -0.4F, 4.9F);
        this.tail04.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.teethUpper = new RendererModel(this, 0, 164);
        this.teethUpper.setRotationPoint(-2.5F, 0.8F, -3.4F);
        this.teethUpper.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.tailFinLower00 = new RendererModel(this, 25, 91);
        this.tailFinLower00.setRotationPoint(0.0F, 0.9F, 2.0F);
        this.tailFinLower00.addBox(-0.49F, 0.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(tailFinLower00, 0.40980330836826856F, 0.0F, 0.0F);
        this.tailFinUpper01.addChild(this.tailFinUpper02);
        this.tailFinLower01.addChild(this.tailFinLower02);
        this.lFin00.addChild(this.lFin01);
        this.tail00.addChild(this.tail01);
        this.dorsalFin01.addChild(this.dorsalFin02);
        this.tail01.addChild(this.tail02);
        this.tail03.addChild(this.mLowerTailFin);
        this.dorsalFin00.addChild(this.dorsalFin01);
        this.tail03.addChild(this.upperTailFin);
        this.headUpper.addChild(this.headUpper2);
        this.tail04.addChild(this.tail05);
        this.lFin01.addChild(this.lFin02);
        this.body.addChild(this.rFin00);
        this.tail05.addChild(this.tailFinUpper00);
        this.snout.addChild(this.headUpper);
        this.tail02.addChild(this.tail03);
        this.tail01.addChild(this.lLowerTailFin);
        this.dorsalFin00.addChild(this.dorsalFin03);
        this.lowerJaw.addChild(this.teethLower);
        this.tailFinLower00.addChild(this.tailFinLower01);
        this.body.addChild(this.tail00);
        this.rFin01.addChild(this.rFin02);
        this.tail01.addChild(this.rLowerTailFin);
        this.neck.addChild(this.head);
        this.neck.addChild(this.lowerJaw);
        this.body.addChild(this.dorsalFin00);
        this.head.addChild(this.snout);
        this.body.addChild(this.lFin00);
        this.rFin00.addChild(this.rFin01);
        this.tailFinUpper00.addChild(this.tailFinUpper01);
        this.dorsalFin02.addChild(this.dorsalFin04);
        this.body.addChild(this.neck);
        this.tail03.addChild(this.tail04);
        this.head.addChild(this.teethUpper);
        this.tail05.addChild(this.tailFinLower00);
    }

    @Override
    public void render(EntityShark entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void setRotationAngles(EntityShark entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        ModelBullShark.animate(entity, ageInTicks, body, tail00, tail01, tail02, lowerJaw);
    }

    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}
