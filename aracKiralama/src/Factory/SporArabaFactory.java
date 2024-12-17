package Factory;

import Factory.IAracFactory;
import IcMekan.IIcMekan;
import IcMekan.SporArabaIcMekan;
import Lastik.ILastik;
import Lastik.SporArabaLastik;
import Motor.IMotor;
import Motor.SporArabaMotor;

public class SporArabaFactory implements IAracFactory {

    public IMotor motorUret(){
        return new SporArabaMotor();
    }
    public ILastik lastikUret(){
        return new SporArabaLastik();
    }
    public IIcMekan IcMekanUret(){
        return new SporArabaIcMekan();
    }
}
