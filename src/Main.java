public class Main {
    public static void main(String[] args) {
        Empregado []  empregados = new Empregado[4];

        empregados[0] = new EmpregadoComissionado(123, "lucas", 1000000,30);
        empregados[1] = new EmpregadoComissionado(345, "giovanni", 10000,25);
        empregados[2] = new EmpregadoHorista(567, "nickolas", 160,250);
        empregados[3] = new EmpregadoHorista(789, "Felipe", 155,300);

        //for tradicional
        for (int i = 0; i < empregados.length; i++){
            System.out.println(empregados[i].matricula);
            System.out.println(empregados[i].nome);
            System.out.println(empregados[1].calcularSalario());
            System.out.println();
        }

        //for genérico
        for (Empregado e : empregados){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }


    }
}
