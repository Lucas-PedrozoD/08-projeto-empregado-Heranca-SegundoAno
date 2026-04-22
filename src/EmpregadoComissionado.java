public class EmpregadoComissionado extends Empregado{
    double totalDeVendas;
    double commissao;

    public EmpregadoComissionado (long matricula, String nome, double totalDeVendas, double commissao){
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.commissao = commissao;
    }

    public  double calcularSalario(){
        return totalDeVendas * (commissao / 100);
    }
}
