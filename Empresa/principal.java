package Empresa;

import Empresa.*;

public class principal {
    public static void main(String[]args){
        Salario salario1 = new Salario(
            100,
            10.0,
            5
        );

        Salario salario2 = new Salario(
            100,
            10.0,
            5
            
        );
        salario2.setSalarioFixo(1000.0);

        
    

        funcionarios funcionario1 = new funcionarios(
            8850,
            "Sávio",
            "230.505.749-66",
            "19/04/1965",
            salario1



        );

        funcionarios funcionario2 = new funcionarios(
            2560,
            "Laura",
            "980.222.225-10",
            "14/02/1985",
            salario2

        );

        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario2.getSalario());

    }


}
    

    

