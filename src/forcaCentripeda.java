public class forcaCentripeda {
    public float f;
    public float m;
    public float v;
    public float r;

    public float solucao() {
        float fim = this.v * this.v / this.r * this.m;
        
        return fim;
    }
}
