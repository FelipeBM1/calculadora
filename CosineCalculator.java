public class CosineCalculator {
    private double Value;

    CosineCalculator(double Value) {
        if (Value < 0 || Value > 360) {
            System.out.println("El valor tiene que ser entre 0 y 360 grados");
            return;
        } else {
            this.Value=Value;
        }

    }

    public double Coseno() {
        Value = Math.toRadians(Value);     
         return Math.floor(Math.cos(Value));
    }
}