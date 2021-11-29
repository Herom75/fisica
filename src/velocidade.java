public class velocidade {
    public float deltaS1;
    public float deltaS2;
    
    public float deltaT1;
    public float deltaT2;

    public float solucao() {
        float deltaS = this.deltaS1 - this.deltaS2;
        float deltaT = this.deltaT1 - this.deltaT2;
        float del = deltaS / deltaT;
        
        return del;
    }
}
