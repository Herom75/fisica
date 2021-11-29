public class movimentoVariado {
    public float Sf;
    public float S0;
    public float V;
    public float V0;
    public float at;
    public float v0t;
    public float delta;
    public float V2;
    public float v02;
    public float a;

    public float solucao() {
        float s1 = at + V0;
        float s2 = s1 / V;
        float v0t = s2;
        float s3 = at * at / 2;
        float s4 = s3 + v0t;
        float s5 = delta + Sf - S0;
        float s6 = s5 / s4;
        float s7 = 2 * a * s6;
        float s8 = v02 * 2 + s7;
        float fim = V2 * 2 + s8;
        
        return fim;

    }
}
