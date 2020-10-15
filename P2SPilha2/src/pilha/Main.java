/*
 * Projeto.: Lista Simplesmente Ligada
 * Autor...: Professor Dreco
 * Classe..: Spilha / 2018-S2
 * Objetivo: Projeto pilha Simplesmente Ligada
 */
package pilha;

import static pilha.Msg.msg_nl;

public class Main
{
    public static void main(String[] args)
    {
        Lse pilha = new Lse();
        
        int    tamanho = 0;
        int    posicao = 0;
        int    conteudo_int = 0;
        String conteudo_str = " ";
        
        int opc = Msg.opcao_principal();

        while (opc != 0)
        {
            switch (opc)
            {
                case 1: // Inser��o
                    Msg.limpatela();
                    
                    pilha.inserir_final();
                    
                    Msg.enter();
                    break;

                case 2: // Remo��o
                    Msg.limpatela();

                    if (pilha.vazia())
                    {
                        Msg.msg_central ("A pilha est� vazia, remo��o n�o processada!");
                    }
                    else
                    {
                        pilha.remover_final();
                    }
                    Msg.enter();
                    break;

                case 3: // Consulta
                    Msg.limpatela();

                    if (pilha.vazia())
                    {
                        Msg.msg_central ("A pilha est� vazia, consulta n�o processada!");
                        Msg.enter();
                    }
                    else
                    {
                        opc = Msg.opcao_consulta();

                        Msg.limpatela();

                        switch (opc)
                        {
                            case 1: // Consulta Geral
                                pilha.consultar_geral();
                                break;

                            case 2: // Consulta Posi��o
                                posicao = Msg.solicita_posicao();

                                if (posicao < 1)
                                {
                                    Msg.msg_central ("Consulta nao realizada!");
                                }
                                else
                                {
                                    pilha.consultar_posicao(posicao);
                                }
                                Msg.enter();
                                break;

                            case 3: // Consulta Conte�do INT
                                conteudo_int = Msg.solicita_conteudo_int();

                                if (conteudo_int == 0)
                                {
                                    Msg.msg_central ("Consulta nao realizada!");
                                }
                                else
                                {
                                    pilha.consultar_conteudo_int(conteudo_int);
                                }
                                Msg.enter();
                                break;

                            case 4: // Consulta Conte�do STR
                                conteudo_str = Msg.solicita_conteudo_str();

                                if (conteudo_str.isEmpty())
                                {
                                    Msg.msg_central ("Consulta nao realizada!");
                                }
                                else
                                {
                                    pilha.consultar_conteudo_str(conteudo_str);
                                }
                                Msg.enter();
                                break;
        
                            default:
                                Msg.limpatela();
                                Msg.msg_central ("Op��o inv�lida, retornando...");
                                Msg.enter();
                        }
                    }
                    break;

                case 4: // Inicializa��o
                    Msg.limpatela();

                    if (pilha.vazia())
                    {
                        Msg.msg_central ("A pilha est� vazia, inicializa��o n�o processada!");
                    }
                    else
                    {
                        pilha.inicializar();
                    }
                    Msg.enter();
                    break;

                case 5: // Tamanho da Lista
                    Msg.limpatela();

                    if (pilha.vazia())
                    {
                        Msg.msg_central(">> A lista est� vazia.");
                    }
                    else
                    {
                        tamanho = pilha.tamanho();

                        if (tamanho == 0)
                        {
                            Msg.msg_central (">> Aguarde a implementa��o do c�lculo de tamanho!");
                        }
                        else
                        {
                            Msg.msg_central (">> O tamanho da deque �: ["+tamanho+"]\n\n");
                        }
                        
                        tamanho = 0;
                    }
                    
                    Msg.enter();
                    break;

                case 6: // Especial 06
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 06");
                    
                    posicao = Msg.solicita_posicao();
                    pilha.inserir_posi(posicao);
                    
                    Msg.enter();
                    break;

                case 7: // Especial 07
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 07");
                    Msg.enter();
                    break;

                case 8: // Especial 08
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 08");
                    Msg.enter();
                    break;

                case 9: // Especial 09
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 09");
                    Msg.enter();
                    break;
                    
                case 10: // Especial 10
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 10");
                    Msg.enter();
                    break;

                case 11: // Especial 11
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 11");
                    Msg.enter();
                    break;

                case 12: // Especial 12
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 12");
                    Msg.enter();
                    break;

                case 13: // Especial 13
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 13");
                    Msg.enter();
                    break;

                case 14: // Especial 14
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 14");
                    Msg.enter();
                    break;

                case 15: // Especial 15
                    
                    Msg.limpatela();
                    Msg.msg_central ("Especial 15");
                    Msg.enter();
                    break;

                case 0:
                    break;

                default:
                    Msg.limpatela();
                    Msg.msg_central ("Op��o inv�lida, retornando...");
                    Msg.enter();
            }
            
            opc = Msg.opcao_principal();
        }
        Msg.limpatela();

        if (pilha.vazia())
        {
           Msg.msg_central ("O programa encerrou com a pilha vazia!");
        }
        else
        {
           Msg.msg_central ("Antes de encerrar, ser� apresentada a pilha na situa��o atual.");

           pilha.consultar_geral();
        }
    }
}
