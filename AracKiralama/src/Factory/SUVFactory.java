package Factory;

import IcMekan.*;
import Lastik.*;
import Motor.*;

public class SUVFactory implements IAracFactory{
    public IMotor motorUret(){
        IMotor motor = new SUVMotor();
        motor.motorUret();
        return motor;
    }
    public ILastik lastikUret(){
        ILastik lastik = new SUVLastik();
        lastik.lastigiUret();
        return lastik;
    }
    public IIcMekan icMekanUret(){
        IIcMekan icMekan = new SUVIcMekan();
        icMekan.icMekanUret();
        return icMekan;
    }
}
