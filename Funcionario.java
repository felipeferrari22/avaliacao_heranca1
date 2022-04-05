public class Funcionario{

    private String Nome;
    private String Cpf;
    private double Salario;
    private String Departamento;
    private double Soma;
    protected double Bonificacao;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String CPF) {
        Cpf = CPF;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public void registro(String Funcionario){
        double boni = Bonificacao();
        this.Soma = this.Soma + boni;
    }
    protected double Bonificacao(){
        return Bonificacao()+getSalario();
    }
    


}