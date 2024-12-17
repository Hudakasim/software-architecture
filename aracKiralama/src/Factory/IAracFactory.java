package Factory;

import IcMekan.IIcMekan;
import Lastik.ILastik;
import Motor.IMotor;

public interface IAracFactory {
    public IMotor motorUret();
    public ILastik lastikUret();
    public IIcMekan IcMekanUret();
}
