package Empresa;

public class Salario {
    private Integer itensVendidos;
    private Double valorItem; 
    private Integer porcentagemComissao;
    private Double salarioFixo = 0.0;


  // constructor

  public Salario(
    Integer itensVendidos,
    Double valorItem,
    Integer porcentagemComissao
  ) {
    this.itensVendidos = itensVendidos;
    this.valorItem = valorItem;
    this.porcentagemComissao = porcentagemComissao;

  }



//Método

  public Double getSalarioFinal(){
    Double porcentagem = porcentagemComissao.doubleValue()/100;
    Double comissao = porcentagem * (valorItem * itensVendidos);

    return comissao + salarioFixo;

  }

    public void setSalarioFixo(Double salarioFixo){
    this.salarioFixo = salarioFixo;
    }

}