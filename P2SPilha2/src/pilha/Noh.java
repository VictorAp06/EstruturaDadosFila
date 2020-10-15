
/* 
 * 
 * 
 * 
 * 
 
 
	Grupo Aula 14/10/20
	Inser��o por Posi��o na FIla
	
	Paulo Viana - 5146017
	Thiara Gon�alves Fagundes - 5101027
	Jo�o Lucas Alves de Lima - 5146434
	Victor Aparecido Pereira - 5150349
 
 
 
 
 
 
 * 
 * 
 * Projeto...: Lista Simplesmente Ligada
 * Autor.....: Professor Dreco
 * Biblioteca: Noh
 * Classe....: Noh
 * Objetivo..: Cria��o do n� (elemento) que ser� utilizado nos projetos
 */
package pilha;

public class Noh
{
    // Objetivo: atributo de determina��o do objeto para servir de refer�ncia
    //           no armazenamento dos dados de um elemento da lista
    //
    private Integer id;
    private String  nome;
    private Integer sexo;
    
    // Objetivo: atributo de determina��o do objeto para expressar a liga��o
    //           do elemento para um outr elemento da lista
    //
    private Noh proximo;

    // Objetivo: m�todo para registrar o preenchimento do atributo
    //           de liga��o de um elemento da lista a outro elemento
    //
    public void setProximo(Noh proximo)
    {
        this.proximo = proximo;
    }

    // Objetivo: m�todo para registrar as informa��o do atributo de
    //           codigo de um elemento da lista
    //
    public void setId (Integer id)
    {
        this.id = id;
    }

    // Objetivo: m�todo para registrar as informa��o do atributo de
    //           nome de um elemento da lista
    //
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    // Objetivo: m�todo para registrar as informa��o do atributo de
    //           sexo de um elemento da lista
    //
    public void setSexo(Integer sexo)
    {
        this.sexo = sexo;
    }

    // Objetivo: m�todo para buscar informa��o sobre o atributo de
    //           liga��o do elemento atual a um outro da lista
    //
    public Noh getProximo()
    {
        return proximo;
    }

    // Objetivo: m�todo para buscar informa��es sobre o atributo
    //           codigo do elemento atual
    //
    public Integer getId()
    {
        return id;
    }

    // Objetivo: m�todo para buscar informa��es sobre o atributo
    //           nome do elemento atual
    //
    public String getNome()
    {
        return nome;
    }

    // Objetivo: m�todo para buscar informa��es sobre o atributo
    //           sexo do elemento atual
    //
    public Integer getSexo()
    {
        return sexo;
    }

    // Objetivo: m�todo para mostrar os dados de um elemento
    //
    //
    public void mostra_noh (int posicao)
    {
        if (posicao == 1)
        {
            System.out.println();
            System.out.println("+---------+----------+--------------------------------+------+----------+--------------------------------+");
            System.out.println("| Posicao | Id       | Nome                           | Sexo | Pr�ximo  | Nome do Pr�ximo                |");
            System.out.println("+---------+----------+--------------------------------+------+----------+--------------------------------+");
        }
        if (this.getProximo() == null)
        {
            System.out.format ("| %7d | %8d | %-30s |   %1d  |     null | - - - - - - - - - - - - - - -  |",
                posicao, this.getId(), this.getNome(), this.getSexo());
            System.out.println();
        }
        else
        {
            System.out.format ("| %7d | %8d | %-30s |   %1d  | %8d | %-30s |",
                posicao, this.getId(), this.getNome(), this.getSexo(),
                this.getProximo().getId(), this.getProximo().getNome());
            System.out.println();
        }
        System.out.println("+---------+----------+--------------------------------+------+----------+--------------------------------+");
    }

    // Objetivo: m�todo de apoio da constru��o do NOH e que registra o
    //           preenchimento dos dados e da liga��o de um elemento da lista
    //
    public Noh (Integer id, String nome, Integer sexo, Noh proximo)
    {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.proximo = proximo;
    }
    
    // Objetivo: m�todo respons�vel pela constru��o de objetos desta classe
    //
    public Noh()
    {
        this.id = 0;
        this.nome = " ";
        this.sexo = 0;
        this.proximo = null;
    }
}
