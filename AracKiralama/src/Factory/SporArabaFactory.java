package Factory;

import IcMekan.*;
import Lastik.*;
import Motor.*;

public class SporArabaFactory implements IAracFactory{
    public IMotor motorUret(){
        IMotor motor = new SporArabaMotor();
        motor.motorUret();
        return motor;
    }
    public ILastik lastikUret(){
        ILastik lastik = new SporArabaLastik();
        lastik.lastigiUret();
        return lastik;
    }
    public IIcMekan icMekanUret(){
        IIcMekan icMekan = new SporArabaIcMekan();
        icMekan.icMekanUret();
        return icMekan;
    }
}
