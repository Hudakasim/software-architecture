package Factory;

import Factory.IAracFactory;
import IcMekan.IIcMekan;
import IcMekan.SedanIcMekan;
import Lastik.ILastik;
import Lastik.SUVLastik;
import Motor.IMotor;
import Motor.SUVMotor;

public class SUVFactory implements IAracFactory {
    public IMotor motorUret(){
        return new SUVMotor();
    }
    public ILastik lastikUret(){
        return new SUVLastik();
    }
    public IIcMekan IcMekanUret(){
        return new SedanIcMekan();
    }
}
