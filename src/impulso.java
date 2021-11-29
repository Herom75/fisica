public class impulso {
    public float qf;
    public float qi;
    public float q;

    public float solucao() {
        float s1 = q * qf;
        float s2 = q * qi;
        float fim = s1 - s2;

        return fim;

    }
}
