package Herança;

class HERANCA_1 { // Classe base 'HERANCA_1' que contém atributos comuns
	    // Atributos comuns para todas pessoas
	    private String nome;
	    private String endereco;
	    private String email;

	    HERANCA_1(String nome, String endereco, String email) { // Construtor 'HERANCA_1'
	    	// Atributos inicializados com valor = parâmetros
	        this.nome = nome;
	        this.endereco = endereco;
	        this.email = email;
	    }
 
	    public String getNomeCompleto() { // Método getter para chamar o atributo 'nome'
	        return nome;
	    }
 
	    public String getEndereco() {     // Método getter para chamar o atributo 'endereco'
	        return endereco;
	    }
	    
	    public String getContatoEmail() { // Método getter para chamar o atributo 'email'
	        return email;
	    }
	    
	    public void setNomeCompleto(String nome) {  // Método setter para alterar o valor de 'nome'
	        this.nome = nome;
	    }

	    public void setEndereco(String endereço) {  // Método setter para alterar o valor de 'endereco'
	        this.endereco = endereço;
	    }

	    public void setContatoEmail(String email) { // Método setter para alterar o valor de 'email'
	        this.email = email;
	    }

	    public String informacoes() { // Método que retorna os dados em comum
	        return "Nome: " + nome + "\nEndereço: " + endereco + "\nE-mail: " + email;
	    }
}

	class PessoaJuridica extends HERANCA_1{ // Classe 'PessoaJuridica' que herda de 'HERANCA_1' e adiciona o atributo CNPJ
	    private String cnpj; // Atributo exclusivo de Pessoa Jurídica

	    PessoaJuridica(String nome, String endereco, String email, String cnpj) { // Construtor 'PessoaJuridica' que inicializa atributos da superclasse e o CNPJ
	        super(nome, endereco, email);  // Chama o construtor da superclasse 'HERANÇA_1'
	        this.cnpj = cnpj;
	    }
 
	    public String getCnpj() {          // Método getter para chamar o atributo 'cnpj'
	        return cnpj;
	    }

	    public void setCnpj(String cnpj) { // Método setter para alterar o valor de 'cnpj'
	        this.cnpj = cnpj;
	    }

	    @Override
	    public String informacoes() { // Método que retorna as informações completas da pessoa jurídica
	        return super.informacoes() + "\nCNPJ: " + cnpj;
	    }
	}

	class PessoaFisica extends HERANCA_1 { // Classe 'PessoaFisica' que herda de 'HERANCA_1' e adiciona o atributo CPF
	    private String cpf; // Atributo exclusivo de Pessoa Física

	    PessoaFisica(String nome, String endereco, String email, String cpf) { //Construtor 'PessoaFisica' que inicializa atributos da superclasse e o CPF
	        super(nome, endereco, email); // Chama o construtor da superclasse
	        this.cpf = cpf;
	    }

	    public String getCpf() {         // Método getter para chamar o atributo 'cpf'
	        return cpf;
	    }

	    public void setCpf(String cpf) { // Método setter para alterar o valor de 'cpf'
	        this.cpf = cpf;
	    }

	    @Override
	    public String informacoes() { // Método que retorna as informações completas da pessoa física
	        return super.informacoes() + "\nCPF: " + cpf;
	    }
	}

	class Funcionario extends HERANCA_1 { // Classe 'Funcionário' que herda de 'HERANCA_1' e adiciona CPF e Salário
	    // Atributos exclusivos de Funcionario
	    private String cpfFuncionario;
	    private float salario;

	    Funcionario(String nome, String endereco, String email, String cpfFuncionario, float salario) { // Construtor 'Funcionário' que inicializa atributos da superclasse e os atributos de 'Funcionário'
	        super(nome, endereco, email); // Chama o construtor da superclasse
	        this.cpfFuncionario = cpfFuncionario;
	        this.salario = salario;
	    }

	    public String getCpfFuncionario() { // Método getter para chamar o 'cpfFuncionario'
	        return cpfFuncionario;
	    }

	    public float getSalario() {      // Método para obter o valor de 'salario'
	        return salario;
	    }
	    
	    public void setCpfFuncionario(String cpfFuncionario) { // Método setter para alterar o valor de 'cpfFuncionario'
	        this.cpfFuncionario = cpfFuncionario;
	    }

	    public void setSalario(float salario) {        // Método para alterar o valor de 'salario'
	        this.salario = salario;
	    }

	    @Override
	    public String informacoes() { // Método que retorna as informações completas do funcionario
	        return super.informacoes() + "\nCPF: " + cpfFuncionario + "\nSalário: " + salario;
	    }
	}

	public class CADASTRO { // Classe principal para apresentar e exibir no console as informações criadas nas classes
	    public static void main(String[] args) {
	        // Instanciando objetos de PessoaJuridica, PessoaFisica e Funcionário
	        PessoaJuridica e1 = new PessoaJuridica("Grupo Invest Financeiro", "R. 7 de Setembro, 287 - Centro, Sorocaba - SP", "grupoinvestfinanceiro@gmail.com", "34.567.890/0001-12.");
	        PessoaFisica p1 = new PessoaFisica("Yuri Alberto Jr", "R. XV de Novembro, 345 - Centro, Curitiba - PR", "yuri.albertojr@gmail.com", "777.888.999-19");
	        Funcionario f1 = new Funcionario("Juan Miguel", "Rua das Flores, 123 - Jardim Botânico, Rio de Janeiro - RJ", "juan.miguel@gmail.com", "391.235.162-12", 3700.00f);

	        // Exibindo as informações após intância e atualização de informações de PessoaJuridica,PessoaFisica e Funcionário
	        System.out.println(e1.informacoes());
	        System.out.println();
	        System.out.println(p1.informacoes());
	        System.out.println();
	        System.out.println(f1.informacoes());
	    }
	}