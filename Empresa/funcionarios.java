package Empresa;

//Criação de atributos obrigatórios

public class funcionarios {
    private Integer matricula;
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private Salario salario;


 // constructor que dá inicio ao cadastro dos funcionários

 public funcionarios(Integer matricula, String nome, String cpf,    String dataDeNascimento,Salario salario){
    this.matricula = matricula;
    this.nome = nome;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
    this.salario = salario;
 }

 // método chamando outro método da classe salário

 public Double getSalario(){
        return salario.getSalarioFinal();
    }


}



