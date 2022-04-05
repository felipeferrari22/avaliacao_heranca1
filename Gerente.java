public class Gerente extends Funcionario {
    private int Senha;
    public boolean Autentica;

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int senha) {
        this.Senha = senha;
    }
    public boolean Autentica(int Senha){
        if(this.Senha==Senha){
            System.out.println("Logado com sucesso.");
            return true;
        }
        else{
            System.out.println("Senha incorreta.");
            return false;
        }
    }
}
