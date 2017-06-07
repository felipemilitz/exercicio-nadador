import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner leia=new Scanner(System.in);
     
        String nome;
        int idade;
        String categoria;
        
        System.out.println("Informe os dados dos nadador");
        System.out.print("nome: ");
        nome=leia.next();
        System.out.print("idade: ");
        idade=leia.nextInt();
        
        if((idade<8)&&(idade>60)){
        categoria="Nao pode ser nadador";
        }else if((idade>=8)&&(idade<=10)){
            categoria="infantil";
        }else if((idade>=11)&&(idade<=17)){
            categoria="Juvenil";
        }else if((idade>=18)&&(idade<=49)){
            categoria="Adulto";
        }else if((idade>=50)&&(idade<=60)){
            categoria="Terceira idade";
        }else{
            categoria="Invalido";
        }
        
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("Categoria: "+categoria);
        
    }
        
        
    }


