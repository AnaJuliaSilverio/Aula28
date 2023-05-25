# Aula 27
Exercicio sobre os conceitos de Interface
# Habilidades desenvolvidas
<ul>
    <li>Métodos</li>
    <li>Polimosfismo</li>
    <li>Override e overload</li>
    <li>Herança</li>
<li>Classe abstratas</li>
<li>Interface</li>
</ul>

# Lógicas desenvolvidas
<ol>
<li>No exercício 1, primeiro criei a interface Lampada,como pedia no enunciado.As classes Incandescente e Fluorescente,como ambas são lâmpadas,mas tipos diferentes,deverão implementar
a interface e desenvolver os métodos de acordo com as necessidades.
Pensando que um usuario não estára procupado em como "criar" as lampadas e sim em utiliza-las,a classe FabricaLampadas que terá essa responsabilade com o método construir.
Atráves desse método é perguntado o tipo da lâmpada e retornado um objeto do tipo Lampada,pois dessa maneira,através do polimorfismo poderei atribuir ao objeto
tanto um tipo Incandescente,quanto um Fluorescente.Na minha Main,criarei uma variavel do tipo Fabrica que podera criar quantas lampadas forem necessárias.</li>
<li>No exercicio 2, primeiro criei a interface Tributos com a apenas um método calculaTributos.Crie um classe abstrata Conta,
pois como ContaCorrente e ContaPoupanca contem alguns atributos e métods iguais evita uma repetição de código.A Conta Corrente contém tributos, logo implementa minha interface e usa minha regra de negócio(1% do saldo) para desenvolver meu método.
Meu SeguroDeVida é independente de conta, mas também é tributável com uma taxa fixa de R$42,00.</li>
</ol>