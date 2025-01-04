package Factory;

import IcMekan.*;
import Lastik.*;
import Motor.*;

public class SedanFactory implements IAracFactory{
    public IMotor motorUret(){
        IMotor motor = new SedanMotor();
        motor.motorUret();
        return motor;
    }
    public ILastik lastikUret(){
        ILastik lastik = new SedanLastik();
        lastik.lastigiUret();
        return lastik;
    }
    public IIcMekan icMekanUret(){
        IIcMekan icMekan = new SedanIcMekan();
        icMekan.icMekanUret();
        return icMekan;
    }
}
