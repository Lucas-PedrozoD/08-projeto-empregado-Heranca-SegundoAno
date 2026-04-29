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

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "totalDeVendas=" + totalDeVendas +
                ", commissao=" + commissao +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
