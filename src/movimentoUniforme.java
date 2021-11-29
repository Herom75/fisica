public class movimentoUniforme {
    public float S;
    public float S0;
    public float deltaT;
    public float v;

    public float solucao() {
    
        float vd = v * deltaT;
        float vd0 = vd + S0;
        float vd0s = vd0 / S;

        return vd0s;
    }
}
