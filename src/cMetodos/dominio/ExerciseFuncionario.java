package cMetodos.dominio;

public class ExerciseFuncionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void impressãoFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double array : salario) {
            System.out.println(array);
        }
        MediaSalarial();

    }

    public void MediaSalarial() {
        if (salario == null) {
            return;
        }

        for (double num : salario) {
            media += num;

        }
        media /= salario.length;
        System.out.println(media);
    }
    public void  setNome(String nome){
        this.nome = nome;
    }
        public void  setidade(int idade ){
        this.idade = idade;
    }
        public void  setSalario(double[] salario){
        this.salario= salario;
    }


}
