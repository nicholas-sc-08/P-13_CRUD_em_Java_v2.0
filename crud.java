import javax.swing.JOptionPane;
import java.util.ArrayList;

public class crud{

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static boolean fim_do_crud = false;

    public static void main(String[] args){

        while(!fim_do_crud){

       String resposta = JOptionPane.showInputDialog("Escolha uma das opções a seguir:\n1) Cadastrar\n2) Pesquisar\n3)Excluir\n4) Editar\n5) Sair");

       switch(resposta){

        case "1":

            cadastrar_usuario();
            break;

        case "2":

            pesquisar_usuario();
            break;

        case "3":

            excluir_usuario();
            break;
       };
       };
    };

       private static void excluir_usuario(){

            String resposta = JOptionPane.showInputDialog(null, "Digite o nome que deseja excluir:");

            
       };

       private static void pesquisar_usuario(){

            String resposta = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar:");

            for(Usuario usuario : usuarios){

                if(usuario.nome.equals(resposta)){

                    JOptionPane.showMessageDialog(null, "Nome cadastrado!");

                } else {

                    JOptionPane.showMessageDialog(null, "Nome não cadastrado!");

                };
            };
       };

       private static void cadastrar_usuario(){

            boolean cpf_ja_cadastrado = false;
            boolean email_ja_cadastrado = false;

            String nome = JOptionPane.showInputDialog("Digite o nome de usuário:");

            String cpf = JOptionPane.showInputDialog("Digite seu cpf:");

            String email = JOptionPane.showInputDialog("Digite seu email:");

            String senha = JOptionPane.showInputDialog("Digite sua senha:");

            for(Usuario usuario : usuarios){

                if(usuario.cpf.equals(cpf)){

                    cpf_ja_cadastrado = true;
                };

                if(usuario.email.equals(email)){

                    email_ja_cadastrado = true;
                };
            };
            
            if(cpf_ja_cadastrado == false && email_ja_cadastrado == false){

                Usuario novo_usuario = new Usuario(nome, cpf, email, senha);

                usuarios.add(novo_usuario);
            
            } else {

                if(cpf_ja_cadastrado == true && email_ja_cadastrado == false){

                    JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
                } else if(cpf_ja_cadastrado == false && email_ja_cadastrado == true){

                    JOptionPane.showMessageDialog(null, "Email já cadastrado!");
                } else {

                    JOptionPane.showMessageDialog(null, "CPF & Email já cadastrado!");
                };
            };
       };
}
