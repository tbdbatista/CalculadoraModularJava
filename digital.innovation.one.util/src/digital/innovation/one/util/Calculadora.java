package digital.innovation.one.util;

import digital.innovation.one.util.internal.DivHelper;
import digital.innovation.one.util.internal.MultHelper;
import digital.innovation.one.util.internal.SubHelper;
import digital.innovation.one.util.internal.SumHelper;

public class Calculadora {

    DivHelper divHelper;
    SubHelper subHelper;
    SumHelper sumHelper;
    MultHelper multHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();

    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
