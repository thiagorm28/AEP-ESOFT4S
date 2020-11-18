package plantas.usuario;

import plantas.BaseEntity;
import plantas.plantasUsuario.PlantasUsuario;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
public class Usuario extends BaseEntity {

    private String email;
    private String nome;
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PlantasUsuario> plantacao = new ArrayList<PlantasUsuario>();

    public Usuario() {
        super();
    }

    public Usuario(String email, String senha) {
        super();
    }

    public Usuario(String email, String nome, String senha) {
        this();
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        if (this.senha != null) {
            throw new RuntimeException("Sua senha já foi criada");
        } else {
            this.senha = senha;
            System.out.println("Senha criada com sucesso");
        }
    }

    public void atualizarSenha (String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
        } else {
            throw new RuntimeException("Essa senha não corresponde a sua senha atual");
        }
    }

    public List<PlantasUsuario> getPlantaçao() {
        return this.plantacao;
    }

    public String mostrarPlantacao() {
        String listaDePlantas = "";
        for (PlantasUsuario p: plantacao) {
            if(p.equals(plantacao.get(plantacao.size()-1))) {
                listaDePlantas += p + ".";
            } else {
                listaDePlantas += p + ", ";
            }
        }
        return listaDePlantas;
    }

    public void addPlantacao(PlantasUsuario novaPlanta) {
        this.plantacao.add(novaPlanta);
    }

    public boolean login () {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira seu email: ");
        String email = leia.nextLine();
        System.out.println("Insira sua senha: ");
        String senha = leia.nextLine();
        if (!this.email.equals(email) || !this.senha.equals(senha)) {
            System.out.println("Essa combinação de Email e senha não existe ou está incorreta");
            return false;
        } else {
            System.out.println("Login efetuado com sucesso");
            return true;
        }
    }

    public void cadastrarUsuario() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Cadastro de Usuário: " + "" +
                "\n---------------------------------------\n");
        System.out.println("Insira seu nome: ");
        this.nome = leia.nextLine();

        System.out.println("Insira seu email: ");
        this.email = leia.nextLine();

        boolean iguais = false;
        while (!iguais) {
            System.out.println("Insira sua senha: ");
            String verifSenha = leia.nextLine();
            System.out.println("Confirme sua senha: ");
            String verifSenha2 = leia.nextLine();
            if (verifSenha.equals(verifSenha2)) {
                this.senha = verifSenha;
                iguais = true;
            }
            else {
                System.out.println("As senha não são correspondentes");
            }
        }

        System.out.println("Cadastro efetuado com sucesso!");
    }



}
