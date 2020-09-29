/**
* Uma classe que mantém as informações sobre um círculo.
*/
public class Circulo
{
    // Os campos.
    private double raio = 1.0;
    private String cor = "vermelho";
    
    // Construtores
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }



    /* (a)
    Adicione à classe um _construtor_ que permita criar um `Circulo` com 
    dois marâmetros: um `double` para o `raio` e um `String` para `cor`. 
    Use a assinatura abaixo como base:
    */
    public Circulo(double raioInformado, String corInformada){
        this.raio = raioInformado;
        this.cor = corInformada;
    }

    // Métodos de acesso
    public double getRaio() {
        return raio;
    }

    /* (c)
    Um aluno escreveu o seguinte código para a classe `Circulo`:
    */
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
    // O que a palavra `@Override` indica? Por que ela foi colocada neste método da classe?
    /*
        Resposta: A palavra 'Override' ela vem derivada do javadoc que simboliza uma anotação, e essa palavra em quisitos de anotação significa que esse método
        está sobrescrevendo um metodo da classe pai (object), ou seja, ele herdou esse método e foi aplicado o polimorfismo dando outra forma a esse método com a mesma assinatura
        do método da classe pai (object).
    */
}