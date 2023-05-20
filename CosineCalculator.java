import java.text.DecimalFormat;

public class CosineCalculator {
    
    CosineCalculator(){     
    }
    public double Coseno(double Value ) {
       DecimalFormat df = new DecimalFormat("*,0000");
       if(Value<0 || Value>360.2){
        System.out.println("Los valores son entre 0 y 360");
        return -2.0;
       }
       else{
        Value = Math.toRadians(Value); 
        System.out.println(df.format(Math.cos(Value)));    
        return Math.cos(Value);
       }
    }
}
