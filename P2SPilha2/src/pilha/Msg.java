/*
 * Projeto.: Lista Simplesmente Ligada
 * Autor...: Professor Dreco
 * Classe..: Msg 
 * Objetivo: Biblioteca para mensagens de intera��o com o usu�rio
 */
package pilha;
import java.util.Scanner;

public class Msg
{
    public static String x_linha = "--------------------------------------------------------------------------------";
    public static int    t_linha = 80;

    // Objetivo: simular a limpeza da tela para despoluir a �rea
    //           de sa�da (resultados) dos projetos
    //
    public static void limpatela()
    {
        for (int i=0; i<50; i++)
        {
            msg_pl (" ");
        }
        msg_nl (x_linha);
        msg_nl (">>>>>>>>>>>>>>>>>>   Lista Simplesmente Ligada - Tipo PILHA!   <<<<<<<<<<<<<<<<<<");
        msg_nl (x_linha);
    }
    
    // Objetivo: apresentar mensagens interativas ao usu�rio sobre
    //           caminhar dos processos nos projetos - com salto de linha antes
    //
    public static void msg_pl (String mensagem)
    {
        System.out.println("\n"+mensagem);
    }

    // Objetivo: apresentar mensagens interativas ao usu�rio sobre
    //           caminhar dos processos nos projetos - com salto de linha antes
    //
    public static void msg_nl (String mensagem)
    {
        System.out.println(mensagem);
    }

    // Objetivo: apresentar mensagens interativas ao usu�rio sobre
    //           caminhar dos processos nos projetos - com layout central
    //
    public static void msg_central (String mensagem)
    {
        int t = mensagem.length();
        
        if (t < 80)
        {
            int d = (80 - t) / 2;
            int r = t % 2;

            for (int p = 1; p <= d; p++)
            {
                mensagem = " "+mensagem;
            }

            if (r == 1) 
            {
                mensagem = " "+mensagem;
            }
        }
        
        Msg.msg_nl(mensagem);
        Msg.msg_nl(x_linha);
    }

    // Objetivo: possibilitar uma a��o interativa para com o usu�rio
    //           visando chamar a aten��o para algumas mensagens
    //
    public static void enter ()
    {
        Scanner s = new Scanner(System.in);
        msg_central ("Pressione <enter> para prosseguir.");

        String tecla = s.nextLine();

        limpatela();
    }

    // Objetivo: menu padr�o para as atividades de inser��o/remo��o nas
    //           extremidades para os deques
    //
    public static void menu_extremidade()
    {
        limpatela();
        msg_central("Menu Extremidade - Escolha a sua opcao");
        msg_nl("1. In�cio");
        msg_nl("2. Final");
        msg_nl("0. Retornar ao Menu Principal");
        msg_nl(x_linha);
    }

    // Objetivo: menu padr�o para as atividades de consulta
    //           relacionadas as listas
    //
    public static void menu_consulta()
    {
        limpatela();
        msg_central("Menu Consulta - Escolha a sua opcao");
        msg_nl("1. Geral");
        msg_nl("2. Por posi��o");
        msg_nl("3. Por conte�do INT");
        msg_nl("4. Por conte�do STR");
        msg_nl("0. Retornar ao Menu Principal");
        msg_nl(x_linha);
    }

    // Objetivo: menu padr�o para as atividades principais
    //           relacionadas as listas
    //
    public static void menu_principal()
    {
        limpatela();
        msg_central("Menu Principal - Escolha a sua opcao");
        msg_nl("           01. Inserir            06. Inserir por Posi��o (FILA)        11. Especial 11");
        msg_nl("           02. Remover            07. Especial 07        				12. Especial 12");
        msg_nl("           03. Consultar          08. Especial 08        				13. Especial 13");
        msg_nl("           04. Inicializar        09. Especial 09        				14. Especial 14");
        msg_nl("           05. Tamanho            10. Especial 10        				15. Especial 15");
        msg_central(" 0. Finalizar");
    }

    // Objetivo: fun��o para receber e tratar a op��o em rela��o a� extremidade
    //           de atividades de inser��o/remo��o nos deques
    //
    public static int opcao_extremidade()
    {
        Scanner s = new Scanner(System.in);
        int opc  = 0;
        int erro = 0;

        menu_extremidade();
        msg_nl ("Digite a extremidade desejada: ");

        try
        {
            opc = s.nextInt();
        }
        catch (Exception e)
        {
            opc  = 99;
            erro = 1;
        }

        while ((opc < 0 || opc > 2) && (erro != 1))
        {
            menu_extremidade();
            msg_nl ("Extremidade inv�lida, corrija: ");

            try
            {
                opc = s.nextInt();
            }
            catch (Exception e)
            {
                opc  = 99;
                erro = 1;
            }
        }
        return opc;
    }

    // Objetivo: fun��o para receber e tratar a op��o em rela��o as consultas
    //           
    //
    public static int opcao_consulta()
    {
        Scanner s = new Scanner(System.in);
        int opc  = 0;
        int erro = 0;

        menu_consulta();
        msg_nl ("Digite a op��o desejada: ");

        try
        {
            opc = s.nextInt();
        }
        catch (Exception e)
        {
            opc  = 99;
            erro = 1;
        }

        while ((opc < 0 || opc > 4) && (erro != 1))
        {
            menu_consulta();
            msg_nl ("Op��o inv�lida, corrija: ");

            try
            {
                opc = s.nextInt();
            }
            catch (Exception e)
            {
                opc  = 99;
                erro = 1;
            }
        }
        return opc;
    }

    // Objetivo: fun��o para receber e tratar a op��o em rela��o ao menu
    //           principal das atividades relacionadas as listas
    //
    public static int opcao_principal()
    {
        Scanner s = new Scanner(System.in);
        int opc  = 0;
        int erro = 0;

        menu_principal();
        msg_nl ("Digite a op��o desejada: ");

        try
        {
            opc = s.nextInt();
        }
        catch (Exception e)
        {
            opc  = 99;
            erro = 1;
        }

        while ((opc < 0 || opc > 15) && (erro != 1))
        {
            menu_principal();
            msg_nl ("Op��o inv�lida, corrija: ");

            try
            {
                opc = s.nextInt();
            }
            catch (Exception e)
            {
                opc  = 99;
                erro = 1;
            }
        }
        return opc;
    }

    // Objetivo: fun��o para receber o valor de uma posi��o para
    //           as atividades relacionadas as listas que a requeiram
    //
    public static int solicita_posicao()
    {
        Scanner s = new Scanner(System.in);
        int posicao = 0;

        try
        {
            msg_nl ("Digite a posicao desejada ou zero para retornar: ");
            posicao = s.nextInt();
        }
        catch(Exception e)
        {
            posicao = 0;
        }
        return posicao;
    }

    // Objetivo: fun��o para receber o valor de um conte�do str para
    //           as atividades relacionadas as listas que o requeiram
    //
    public static String solicita_conteudo_str()
    {
        Scanner s = new Scanner(System.in);
        String conteudo = " ";

        try
        {
            msg_nl("Digite o conteudo a ser pesquisado ou tecle <enter> para retornar: ");
            conteudo = s.next();
        }
        catch(Exception e)
        {
            msg_nl ("Erro de digita��o, retornando ao menu principal...");
            conteudo = " ";
        }
        return conteudo;
    }

    // Objetivo: fun��o para receber o valor de um conte�do int para
    //           as atividades relacionadas as listas que o requeiram
    //
    public static int solicita_conteudo_int()
    {
        Scanner s = new Scanner(System.in);
        int conteudo = 0;

        try
        {
            msg_nl ("Digite a posicao desejada ou zero para retornar: ");
            conteudo = s.nextInt();
        }
        catch(Exception e)
        {
            conteudo = 0;
        }
        return conteudo;
    }
}
