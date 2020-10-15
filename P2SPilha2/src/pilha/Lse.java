/*

 
 
	Grupo Aula 14/10/20
	Inser��o por Posi��o na FIla
	
	Paulo Viana - 5146017
	Thiara Gon�alves Fagundes - 5101027
	Jo�o Lucas Alves de Lima - 5146434
	Victor Aparecido Pereira - 5150349
 
 
 
 
 
 

 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: Lse
 * Objetivo: Criação e manutenção dos elementos na pilha simplesmente encadeada
 */
package pilha;
import java.util.Scanner;

import pilha.Msg;
import pilha.Noh;

public class Lse
{
    // Objetivo: atributos de determina��o do primeiro e do �ltimo elemento da
    //           pilha, para que seja realizada a sua gest�o
    //
    public Noh primeiro;
    public Noh ultimo;

    // Objetivo: m�todo para receber e tratar a digita��o de um atributo dados
    //           (do tipo Object) quando de uma inser��o ou consulta por conte�do
    //
    public String digitacao (String tipo)
    {
        Scanner s = new Scanner(System.in);
        String dados = " ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl("Digite o ["+tipo+"] para o elemento - n�o pode ser vazio: ");
                dados = s.nextLine();
            }
            catch(Exception e)
            {
                Msg.msg_pl ("Erro de digita��o, n�o deixe a informa��o ["+tipo+"] vazia:");
            }
        } while (dados.isEmpty());

        return dados;
    }


    // Objetivo: m�todo para receber e tratar a digita��o do atributo codigo
    //           quando de uma inser��o ou consulta por conte�do
    //
    public Integer D_Id ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        Integer cod = 0;
        String texto = "Digite o valor para o Id do cliente (inteiro maior que zero): ";
        Integer erro = 0;

        do
        {
            try
            {
                Msg.msg_pl(texto);
                cod = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digita��o, o ID � obrigat�rio e inteiro maior que zero: ";
                erro = 1;
            }
            if((cod <= 0) && (erro == 0))
            {
                texto = "Erro de digita��o, o ID � obrigat�rio e inteiro maior que zero: ";
            }
            erro = 0;
            Msg.limpatela();

        } while (cod <= 0);

        return cod;
    }

    // Objetivo: m�todo para receber e tratar a digita��o de um atributo dados
    //           Nome
    //
    public String D_Nome ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        String nome = " ";
        String texto = "Digite o NOME do cliente (obrigat�rio): ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                nome = s.nextLine();
            }
            catch(Exception e)
            {
                texto = "Erro de digita��o, o NOME � obrigat�rio: ";
            }

            Msg.limpatela();
            
        } while (nome.isEmpty());

        return nome;
    }

    // Objetivo: m�todo para receber e tratar a digita��o do atributo sexo
    //           quando de uma inser��o ou consulta por conte�do
    //
    public Integer D_Sexo ()
    {
        Scanner s = new Scanner(System.in);
        int sexo  = 0;
        String texto = "Digite o valor para o SEXO do cliente (1.Mas 2.Fem): ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                sexo = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digita��o, o SEXO � obrigat�rio: ";
                erro = 1;
            }
            if((sexo < 1) || (sexo > 2) || (erro == 0))
            {
                texto = "Erro de digita��o, o SEXO � obrigat�rio (1.Mas 2.Fem): ";
            }
            
            erro = 0;
        
            Msg.limpatela();

        } while ((sexo < 1) || (sexo > 2));

        return sexo;
    }

    // Objetivo: m�todo para quantificar e informar a quantidade de
    //           elementos da pilha, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        //
        // Aguarde a implementa��o do c�lculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: m�todo para verificar se a pilha est� vazia (true)
    //           ou n�o (false)
    //
    public boolean vazia()
    {
        boolean r = true;

        if (this.primeiro != null)
        {
            r = false;
        }
        
        return r;
    }

    // Objetivo: m�todo para inserir um novo elemento no final da pilha
    //
    //
    public void inserir_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSER��O NO FINAL");
        
        Noh novo = new Noh();
        
        if (novo == null)
        {
            Msg.msg_central ("Mem�ria n�o dispon�vel.");
        }
        else
        {
            novo.setId(this.D_Id());
            novo.setNome(this.D_Nome());
            novo.setSexo(this.D_Sexo());
            
            if (this.vazia())
            {
                this.primeiro = this.ultimo = novo;
            }
            else
            {
                this.ultimo.setProximo(novo);
                this.ultimo = novo;
            }
        }
    } 

    // Objetivo: metodo para remover um elemento da �ltima posi��o da pilha
    //           
    //
    public void remover_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMO��O NO FINAL");
       
    			
    		if (this.primeiro.getProximo() == null) { 
    			
    			this.primeiro = null;
    		
    		} else { 
    		
    		    this.ultimo = null;
    		    
    		    Noh aux = new Noh();
    		    aux = this.primeiro;
    		    
    		    while (aux.getProximo().getProximo() != null){
    		    	aux = aux.getProximo();
    		    }
    		    
    		    this.ultimo = aux.getProximo();
    		    
    		    aux.setProximo(null);
    			
    		}
    		
    		Msg.enter();
    		
    }

    // Objetivo: m�todo para remover todos os elementos que est�o
    //           presentes na pilha, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZA��O");
        Msg.msg_central ("Aten��o! Aguarde a implementa��o da inicializa��o!");
    }

    // Objetivo: m�todo para consultar todos os elementos que est�o
    //           presentes na pilha
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL");
        
        Noh aux = null;
        int pos = 0;
        
        for (aux = this.primeiro, pos = 1;
                aux != null;
                    aux = aux.getProximo(), pos++)
        {
            aux.mostra_noh(pos);
        }
    
        Msg.enter();
    }

    // Objetivo: m�todo para consultar se uma determinada posi��o est�
    //           presente na pilha e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR POSI��O");
        
        Noh aux = null;
        int pos = 0;
        
        for (aux = this.primeiro, pos = 1; aux != null && pos != posicao; aux = aux.getProximo(), pos++) {
        	
        }
        
        if (aux == null) {
        	
        	System.out.println("Posi��o " + posicao + "N�O ENCONTRADA NA LISTA.");
        	
        } else {
        	
        	aux.mostra_noh(pos);
        	
        }
        
        Msg.enter();
    
    }

    // Objetivo: m�todo para consultar se um determinado elemento com conte�do INT est�
    //           presente na pilha e, se sim, qual posi��o ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTE�DO - INT");
    
        Noh aux = null;
        int pos = 0;
        
        for (aux = this.primeiro, pos = 1; aux != null && aux.getId()!=conteudo; aux = aux.getProximo(), pos++) {
        	
        }
        
        if( aux == null ) {
        	
        	System.out.println("O conte�do ID =  " + conteudo + " n�o est� presente na lista.");
        	
        } else {
        	
        	aux.mostra_noh(pos);
        	
        }
    
        Msg.enter();
        
    
    
    
    }

    public void inserir_posi(int posicao) {
    	
        Noh novo = new Noh();
        
        if (novo == null)
        {
        	
            Msg.msg_central ("Mem�ria n�o dispon�vel.");
        
        } else {
        	
            novo.setId(this.D_Id());
            novo.setNome(this.D_Nome());
            novo.setSexo(this.D_Sexo());
            
            if (this.vazia())
            {
                System.out.println("Lista Vazia!");
            
            } else if (posicao-1 == 0) {
            	
            	novo.setProximo(this.primeiro); 
            	this.primeiro = novo;
            
            } else if ( this.primeiro == this.ultimo ) {
            
           	 	this.primeiro = novo;
           	 	novo.setProximo(ultimo);
            	
            } else {
        	
                Noh aux = null;
                int pos = 0;
            	
            	for (aux = this.primeiro, pos = 1; aux != null && pos != posicao-1; aux = aux.getProximo(), pos++) {
            	
            	}
            
            	if ( (aux == this.ultimo && pos == posicao-1) || pos < posicao-1 ) {
            	
            		System.out.println("Posi��o Inv�lida!");
             
            	} else {
            		
            		novo.setProximo(aux.getProximo());
            		aux.setProximo(novo);

            	}
            
            }
        	
        }
            	
    }
    
    
    // Objetivo: m�todo para consultar se um determinado elemento com conte�do STR est�
    //           presente na pilha e, se sim, qual posi��o ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTE�DO - STR");
       
        Noh aux = null;
        int pos = 0;
        boolean existe = false;

        
        for (aux = this.primeiro, pos = 1; aux != null; aux = aux.getProximo(), pos++)
        {
        	
        	if(aux.getNome().substring(0,2).equals(conteudo)==true) {
        		existe = true;
        		aux.mostra_noh(pos);
        		}
        
        }
    
        
        if(existe == false) {
        	System.out.println("O conte�do STR =  " + conteudo + " n�o est� presente na lista.");
        }
        
        Msg.enter();
        
    
    }

    // Objetivo: m�todo construtor da pilha e que determina que ela
    //           est�, inicialmente, vazia
    //
    public Lse()
    {
        this.primeiro = this.ultimo = null;
    }
}