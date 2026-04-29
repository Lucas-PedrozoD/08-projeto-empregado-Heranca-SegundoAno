public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDeHorasTrabalhadas;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDeHorasTrabalhadas) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDeHorasTrabalhadas = valorDeHorasTrabalhadas;
    }

    public  double calcularSalario(){
        return totalDeHorasTrabalhadas * valorDeHorasTrabalhadas;
    }

    @Override
    public String toString() {
        return "EmpregadoHorista{" +
                "totalDeHorasTrabalhadas=" + totalDeHorasTrabalhadas +
                ", valorDeHorasTrabalhadas=" + valorDeHorasTrabalhadas +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
