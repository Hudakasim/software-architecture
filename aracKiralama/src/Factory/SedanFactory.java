package Factory;

import Factory.IAracFactory;
import IcMekan.IIcMekan;
import IcMekan.SedanIcMekan;
import Lastik.ILastik;
import Lastik.SedanLastik;
import Motor.IMotor;
import Motor.SedanMotor;

public class SedanFactory implements IAracFactory {
    public IMotor motorUret(){
        return new SedanMotor();
    }
    public ILastik lastikUret(){
        return new SedanLastik();
    }
    public IIcMekan IcMekanUret(){
        return new SedanIcMekan();
    }
}
