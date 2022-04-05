public class Principal {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Johnson");
        funcionario.setCpf("12122121");
        funcionario.setSalario(1000);
        funcionario.setDepartamento("Marketing");

        System.out.println("Funcionario se chama "+funcionario.getNome());
        System.out.println("CPF do Funcionario é "+funcionario.getCpf());
        System.out.println("O Salário do Funcionario é "+funcionario.getSalario());
        System.out.println("O Funcionario trabalha no Departamento de "+funcionario.getDepartamento());
    }
}
