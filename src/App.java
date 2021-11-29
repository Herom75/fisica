public class App {
    public static void main(String[] args) {
        
        forcaCentripeda centri = new forcaCentripeda();

        centri.m = 800;
        centri.r = 100;
        centri.v = 20;

        float soma = centri.solucao();
        
        System.out.println(soma);

        velocidade vel = new velocidade();

        vel.deltaS1 = 300;
        vel.deltaS2 = 0;
        vel.deltaT1 = 12;
        vel.deltaT2 = 7;

        float soma2 = vel.solucao();
        
        System.out.println(soma2);

        forcaPeso fp = new forcaPeso();

        fp.g = 9.8f;
        fp.m = 10;

        float soma3 = fp.solucao();

        System.out.println(soma3);

        movimentoUniforme uniforme = new movimentoUniforme();

        uniforme.S = 2;
        uniforme.S0 = 0;
        uniforme.deltaT = 2.5f;
        uniforme.v = 340;

         float soma4 = uniforme.solucao();

         System.out.println(soma4);

         impulso im = new impulso();

         im.qi = 20;
         im.qf = 30;
         im.q = 800;

         float soma5 = im.solucao();

         System.out.println(soma5);

        forcaElastica elastica = new forcaElastica();

        elastica.K = 110;
        elastica.x = 5;

        float soma6 = elastica.solucao();

        System.out.println(soma6);

        movimentoVariado variado = new movimentoVariado();
        
        variado.S0 = 0;
        variado.Sf = 5;
        variado.V = 15;
        variado.V0 = 10;
        variado.V2 = 10;
        variado.v02 = 3;
        variado.a = 5;
        variado.at = 5;
        variado.delta = 0;

        float soma7 = variado.solucao();

        System.out.println(soma7);
    }
}
