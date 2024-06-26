# java-study

Repositório destinado a anotações de estudo sobre Java, em específico sobre a certificação Java 17

# Conhecendo a Prova

- Duração 90 min
- 50 Questões
- Média 68%

### Como Escolher a resposta correta

- A prova é composta por questões de múltipla escolha
- Se uma questão tiver mais de uma resposta correta, será específicado quantas alternativas são corretas.
- Se importe com _imports_ apenas se eles estiverem específicados no código.

# Tipos de Questões

- Questões com Informação Extra oferecida
  - Por exemplo, se uma questão informar que _XMLParseException_ é excecão checada, então você saberá que a questão é sobre lançar exceções.
- Questões com subquestões
  - Algumas questões poderão exigir que você responda subquestões para encontrar a resposta correta, essa questões costuma ser muito difícies e devemos tomar cuidado com elas, pois consomem muito tempo.
- Questões com APIs pouco comuns
  - Podem surgir questões com APIs que não estão listadas nos conteúdos para o exame, então você pode assumir que aquele trecho de código funciona como esperado.
- Questões com conceitos errados ou pegadinhas
  - No exame podem haver questões com termos ou conceitos que não fazem o menor sentido, por exemplo dizer que uma interface pode herdar de uma classe, em outros casos pode usar uma palavra chave que não existe no Java como _struct_.

## Como estudar

- É muito importante criar uma rotina de estudos, de preferência diariamente a fim de conseguir ter uma evolução considerável. É de igual importância executar os exemplos de código para entender de fato o conteúdo. Por exemplo, pode não ser obvio por que essa linha de código não compila: `float value = 102.0; // DOES NOT COMPILE `

---

> Cenário Real: Enquanto estiver estudando para a prova é indicado utilizar um editor de texto e compilar o código por linha de comando, isso aumentará a sensiblidade na hora de examinar um trecho de código na prova.

---

# Entendendo as questões

A maioria das questões terão trechos de código e perguntarão para responder sobre eles. Para essas questões antes de ver outras coisas é necessário se perguntar:

    *Este código compila??*

Parece simples, mas se você saber se um determinado conjunto de códigos compila ou não, responder a pergunta pode ser mais fácil.

> Se todas as alternativas da questão não tiverem a opção que o código não compila, considere um presente. Isso significa que todas as linha compilam e é possivel usar a informação dessa questão para responder outras questões.

## Aplicando o processo de eliminação

Em alguns casos é possivel eliminar alternativas mesmo sem ler a questão, algumas alternativas podem ter erros de declaração, por exemplo. Com isso mesmo se você não souber a resposta a eliminação irá aumentar as suas changes de acertar. Imagine de 5 alternativas conseguir eliminar 3?

## Pular questões difícies

É melhor gastar 10 minutos respondendo 5 questões corretamente do que gastar 10 minutos em uma questão, se não tiver certeza ou a questão for muito difícil deixe para revisar depois no final da prova.

## Fique de olho em questões com palavras fortes

Muitas questões do exame incluem opções de resposta com frases descritivas em vez de linhas de código. Ao ver essas perguntas, tenha cuidado com qualquer opção de resposta que inclua palavras fortes como _"must"_, _"all"_ ou _"cannot"_. Se você pensar nas complexidades de linguagens de programação, é raro que uma regra não tenha exceções ou casos especiais. Portanto, se você estiver preso entre duas respostas e uma delas usar _"must"_ enquanto a outra usar _"can"_ ou _"may"_, é melhor escolher aquele com a palavra mais fraca, pois é mais declaração ambígua.

# Lista de conteúdos da prova

- Handling date, time, text, numeric and boolean values
  - Use primitives and wrapper classes including Math API, parentheses, type promotion, and casting to evaluate arithmetic and boolean expressions
  - Manipulate text, including text blocks, using String and StringBuilder classes
  - Manipulate date, time, duration, period, instant and time-zone objects using Date-Time API
- Controlling Program Flow
  - Create program flow control constructs including if/else, switch statements
    and expressions, loops, and break and continue statements
- Utilizing Java Object-Oriented Approach
  - Declare and instantiate Java objects including nested class objects, and explain the object life-cycle including creation, reassigning references, and garbage collection
    -Create classes and records, and define and use instance and static fields and methods, constructors, and instance and static initializers
  - Implement overloading, including var-arg methods
  - Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable
    -Implement polymorphism and differentiate object type versus reference type. Perform type casting, identify object types using instanceof operator and pattern matching
  - Create and use interfaces, identify functional interfaces, and utilize private, static, and default interface methods
  - Create and use enumerations with fields, methods and constructors
- Handling Exceptions
  - Handle exceptions using try/catch/finally, try-with-resources, and multi-catch blocks, including custom exceptions
- Working with Arrays and Collections
  - Create Java arrays, List, Set, Map, and Deque collections, and add, remove,
    update, retrieve and sort their elements
- Working with Streams and Lambda expressions
  - Use Java object and primitive Streams, including lambda expressions
    implementing functional interfaces, to supply, filter, map, consume,
    and sort data
  - Perform decomposition, concatenation and reduction, and grouping and
    partitioning on sequential and parallel streams
- Packaging and deploying Java code and use the Java Platform
  Module System
  - Define modules and their dependencies, expose module content including for reflection. Define services, producers, and consumers
  - Compile Java code, produce modular and non-modular jars, runtime images, and implement migration using unnamed and automatic modules
- Managing concurrent code execution
  - Create worker threads using Runnable and Callable, manage the thread lifecycle, including automations provided by different Executor services and concurrent API
  - Develop thread-safe code, using different locking mechanisms and concurrent API
  - Process Java collections concurrently including the use of parallel streams
- Using Java I/O API
  - Read and write console and file data using I/O Streams
  - Serialize and de-serialize Java objects
  - Create, traverse, read, and write Path objects and their properties using
    java.nio.file API
- Accessing databases using JDBC
  - Create connections, create and execute basic, prepared and callable statements, process query results and control transactions using JDBC API
- Implementing Localization
  - Implement localization using locales, resource bundles, parse and
    format messages, dates, times, and numbers including currency and
    percentage values

# Handling date, time, text, numeric and boolean values and Utilizing Java Object-Oriented Approach

Nessa seção vamos aprender sobre o básico da java.

## Principais componentes do Java

A JDK (Java Development Kit) contém o mínimo para desenvolver em Java. Os comandos principais incluem:

- _javac_ : Converte código .java em arquivos .class bytecode
- _java_ : Executa o programa
- _jar_ : Faz o package dos arquivos
- _javadoc_ : Gera a documentação

## Entendendo a estrutura da classe

Classes em Java são os blocos básicos de construção de programas. Elas descrevem as partes e características fundamentais de um programa. Além das classes, há outros blocos de construção como interfaces, records e enums. Para usar classes, é necessário criar objetos, que são instâncias em tempo de execução das classes na memória. Os objetos representam o estado do programa e são referidos como instâncias. As referências são variáveis que apontam para objetos.

## Campos e Métodos

As classes Java possuem dois elementos primários: _métodos_ mais chamados de funções e _campos_ mais conhecidos como variáveis. Eles são chamados de _membros_ da classe. Variáveis guardam o estado do programa e os métodos operam nesse estado.

Um exemplo simples de classe Java seria assim:

```java
public class Animal {
}
```

Uma palavra que possui um significado especial se chama _keyword_, no exemplo a cima são as palavras _public_ e _class_.

```java
public class Animal {
  String name;
}
```

Agora adicionamos o campo do tipo **String** e com o nome **name**.

```java
public class Animal {
  String name;
  public String getName() {
    return name;
  }
  public void setName(String newName) {
    name = newName;
  }
}
```

Agora adicionamos dois métodos à classe. A palavra _public_ significa que o método pode ser chamado por outras classes. Após temos o tipo de retorno que nesse caso é uma **String**.
No segundo método _setName(String newName)_ temos um tipo especial de retorno, chamado _void_ ele indica que nenhum valor é retornado na verdade. Esse método necessita que quem irá chamá-lo informe uma informação, essa informação se chama _parâmetro_. Isso significa que quem está chamando esse método precisa passar uma _String_ como parâmetro e não deve esperar nada como retorno.

## Classes e arquivos

Na maioria das vezes, cada classe Java é definida em seu próprio arquivo .java. Um tipo de nível superior é uma estrutura de dados que pode ser definida de forma independente dentro de um arquivo. Uma classe de nível superior é frequentemente pública, o que significa que qualquer código pode chamá-la. Curiosamente, o Java não exige que o tipo seja público. Por exemplo, a classe a seguir está correta:

```java
class Animal {
  String name;
}
```

Você até pode colocar dois tipos no mesmo arquivo. Quando o faz, no máximo um dos tipos de nível superior no arquivo pode ser público. Isso significa que um arquivo contendo o seguinte também está correto:

```java
public class Animal {
  private String name;
}
class Animal2 {}
```

Se você tiver um tipo público, ele precisa corresponder ao nome do arquivo. A declaração `public class Animal2` não seria compilada em um arquivo chamado Animal.java.

## Criando um método _main()_

Um programa Java inicia a sua execução através de seu método _main()_.
A maneira mais simples se declarar um método main seria assim:

```java
public class Foo {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

Esse código exibe a mensagem **Hello World** no console. Basta executar o seguinte:

- _javac Foo.java_
- _java Foo_

As regras para o que um arquivo Java contém e em que ordem são mais detalhadas do que explicamos até agora, mas para simplificar as coisas por enquanto, seguimos este subconjunto das regras:

- Cada arquivo pode conter apenas uma classe pública.
- O nome do arquivo deve corresponder ao nome da classe, incluindo a caixa, e ter uma extensão .java.
- Se a classe Java for um ponto de entrada para o programa, ela deve conter um método main() válido.

Vamos primeiro revisar as palavras na assinatura do método _main()_, uma por uma. A palavra-chave public é o que chamamos de **modificador de acesso**. Ele declara o nível de exposição deste método aos possíveis chamadores no programa. Naturalmente, _public_ significa acesso total de qualquer lugar no programa.

A palavra-chave _static_ vincula um método à sua classe, para que possa ser chamado apenas pelo nome da classe, como, por exemplo, _Foo.main()_. O Java não precisa criar um objeto para chamar o método _main()_ - o que é bom. Na verdade, a JVM faz isso, mais ou menos, ao carregar o nome da classe fornecido a ela. Se um método _main()_ não tiver as palavras-chave corretas, você receberá um erro ao tentar executá-lo.

A palavra-chave _void_ representa o tipo de retorno. Um método que não retorna dados devolve o controle silenciosamente ao chamador. Em geral, é uma boa prática usar _void_ para métodos que alteram o estado de um objeto. Nesse sentido, o método _main()_ altera o estado do programa de iniciado para finalizado.
Finalmente, chegamos à lista de parâmetros do método _main()_, representada como um array de objetos _java.lang.String_. Você pode usar qualquer nome de variável válido junto com qualquer um desses três formatos:

- String[] args
- String options[]
- String... friends

O compilador aceita qualquer um desses. O nome da variável args é comum porque sugere que esta lista contém valores que foram lidos (argumentos) quando a JVM foi iniciada. Os caracteres [] são colchetes e representam um array. Um array é uma lista de tamanho fixo de itens que são todos do mesmo tipo. Os caracteres **...** são chamados de varargs (listas de argumentos variáveis).

## Passando parametros para um programa java

O código `args[0]` acessa o primeiro elemento do array. Isso mesmo: os índices de array começam com 0 em Java. Para executá-lo, digite o seguinte:

```
javac Foo.java
java Foo Pedro Silva
```

A saída é o que você poderia esperar:

```
Pedro
Silva
```

# Compilando e rodando código com pacotes

| Passo                     | Windows                      | Mac/Linux                 |
| ------------------------- | ---------------------------- | ------------------------- |
| 1.Cria a primeira classe. | C:\temp\packagea\ClassA.java | /tmp/packagea/ClassA.java |
| 2. Crie a segunda classe. | C:\temp\packageb\ClassB.java | /tmp/packageb/ClassB.java |
| 3. Entre no diretório.    | cd C:\temp                   | cd /tmp                   |

Agora para compilar basta rodar:

    javac packagea/ClassA.java packageb/ClassB.java
    ou
    javac packagea/*.java packageb/*.java

E para rodar o código java:

    java packageb.ClassB

## Compilando em outro diretório

Por padrão o `javac` coloca as classes compiladas no mesmo diretório do codígo fonte, mas é possível alterar isso. A opção -d específica esse diretório de destino.

    javac -d classes packagea/ClassA.java packageb/ClassB.java

Para rodar o programa é preciso específicar o classpath para que o Java saiba onde encontrar as classes. Existem três opções:

    java -cp classes packageb.ClassB
    java -classpath classes packageb.ClassB
    java --class-path classes packageb.ClassB

# Criando arquivos JAR

Um arquivo Java (JAR) é como um ZIP mas apenas com arquivos java.

Para criar podemos usar um desses comandos:

    jar -cvf myNewFile.jar .
    jar --create --verbose --file myNewFile.jar .

E para compilar:

Windows:

    java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass

Linux:

    java -cp ".:/tmp/someOtherLocation:/tmp/myJar.jar" myPackage.MyClass

O (.) indica que você quer incluir o diretório atual no _classpath_, o (;) é usado para separar partes do _classpath_.

# Ordem de elementos para declarar uma classe

| Element                               | Example                | Required? | Where does it go?                                                     |
| ------------------------------------- | ---------------------- | --------- | --------------------------------------------------------------------- |
| Declaração Package                    | `package abc; `        | Não       | Primeira linha do arquivo (excluindo comentários ou linhas em branco) |
| declarações imports                   | `import java.util.\*;` | Não       | Logo após o package (Se presente)                                     |
| Declarações de tipo de nível superior | `public class C`       | Sim       | Logo após o import (se existir)                                       |
| Declarações de campos                 | `int value;`           | Não       | Qualquer elemento de nível superior dentro de uma classe              |
| Declarações de métodos                | `void method()`        | Não       | Qualquer elemento de nível superior dentro de uma classe              |

# Criando Objetos

## Chamando construtores

- Para criar uma instancia de uma classe é preciso apenas digitar a palavra `new` antes do nome da classe e adicionar parênteses depois.

```java
Foo f = new Foo();
```

Primeiro você declara o tipo que você irá criar (Foo) depois adiciona um nome a variável (f) e então você escreve `new Foo()` para realmente criar o objeto.
`Foo()` se parece com um método, mas é chamado de construtor que é um tipo de método especial para criar novos objetos.

```java
public class Foo {
  public Foo(){
    System.out.println("Sou um construtor");
  }
}
```

Diferente desse exemplo que podemos ver no exame de certificação:

```java
public class Foo {
  public void Foo(){} //Isso não é um construtor
}
```

Um construtor nunca terá um tipo de retorno, pois o propósito principal dele é inicializar campos.

# Blocos Inicializadores de Instância

- São representados por chaves `{ }` e ficam fora dos métodos.

```java
  public class Dog {
    public static void main(String[] args){
      { System.out.println("Olá humano!"); }
    }
    { System.out.println("Quero brincar!"); }
  }

```

# Ordem de inicialização

- Campos e blocos inicializadores de instância são executados na ordem que cada um aparece no arquivo.
- o construtor roda depois de todos os campos e blocos inicializadores de instância.

# Usando tipos primitivos

- Os tipos tipos primitivos são:

| Keyword | Type                        | Min value      | Max value     | Default value | Example |
| ------- | --------------------------- | -------------- | ------------- | ------------- | ------- |
| boolean | true or false               | n/a            | n/a           | false         | true    |
| byte    | 8-bit integral value        | -128           | 127           | 0             | 123     |
| short   | 16-bit integral value       | -32,768        | 32,767        | 0             | 123     |
| int     | 32-bit integral value       | -2,147,483,648 | 2,147,483,647 | 0             | 123     |
| long    | 64-bit integral value       | -2^63          | 2^63 – 1      | 0L            | 123L    |
| float   | 32-bit floating-point value | n/a            | n/a           | 0.0f          | 123.45f |
| double  | 64-bit floating-point value | n/a            | n/a           | 0.0           | 123.456 |
| char    | 16-bit Unicode value        | 0              | 65,535        | \u0000        | 'a'     |

- _Signed_ e _Unsigned_

  Você deve estar ciente de que short e char estão intimamente relacionados, pois ambos são armazenados como tipos integrais com o mesmo comprimento de 16 bits. A principal diferença é que short
  é _signed_, o que significa que divide seu intervalo entre inteiros positivos e negativos. Alternativamente, char não tem sinal, o que significa que seu intervalo é estritamente positivo, incluindo 0.

# Classes Wrapper

Cada tipo primitivo possui uma classe wrapper, que é um objeto que corresponde com um primitivo:

| Primitive type | Wrapper class | Wrapper class inherits Number? | Example of creating        |
| -------------- | ------------- | ------------------------------ | -------------------------- |
| boolean        | Boolean       | No                             | Boolean.valueOf(true)      |
| byte           | Byte          | Yes                            | Byte.valueOf((byte) 1)     |
| short          | Short         | Yes                            | Short.valueOf((short) 1)   |
| int            | Integer       | Yes                            | Integer.valueOf(1)         |
| long           | Long          | Yes                            | Long.valueOf(1)            |
| float          | Float         | Yes                            | Float.valueOf((float) 1.0) |
| double         | Double        | Yes                            | Double.valueOf(1.0)        |
| char           | Character     | No                             | Character.valueOf('c')     |

# Identificando _identifiers_

Um _identifier_ é um nome de variável, método, classe, interface ou pacote. As regras para a declareção deles são as seguintes:

- Os identificadores devem começar com uma letra, um símbolo de moeda ou um símbolo \_. Símbolos monetários
  incluem dólar ($), yuan (¥), euro (€) e assim por diante.
- Os identificadores podem incluir números, mas não começar com eles.
- Um único sublinhado \_ não é permitido como identificador.
- Não é possível usar o mesmo nome de uma palavra reservada Java. Uma palavra reservada é especial palavra que o Java deixou de lado para que você não tenha permissão para usá-la. Lembre-se que Java diferencia maiúsculas de minúsculas, portanto, você pode usar versões das palavras-chave que diferem apenas em maiúsculas e minúsculas. Por favor, não use.

Exemplos legais:

```java
long okidentifier;
float $OK2Identifier;
boolean _alsoOK1d3ntifi3r;
char __SStillOkbutKnotsonice$;
```

Exemplos não legais:

```java
int 3DPointClass; // identifiers cannot begin with a number
byte hollywood@vine; // @ is not a letter, digit, $ or _
String *$coffee; // * is not a letter, digit, $ or _
double public; // public is a reserved word
short _; // a single underscore is not allowed
```

# Declarando e inicializando múltiplas variáveis

Exemplo correto:

```java
void sandFence() {
 String s1, s2;
 String s3 = "yes", s4 = "no";
}
```

Exemplo incorreto:

```java
int num, String value; // DOES NOT COMPILE

```

# Inferindo Tipo com o _var_

Para usar isso basta digitar _var_ ao invés do tipo primitivo ou tipo por referência.

```java
  public class Zoo {
    public void whatTypeAmI() {
    var name = "Hello";
    var size = 7;
    }
  }
```

Essa _feature_ se chama, inferência de tipo em variável local. Só é possível usar o _var_ em váriaveis locais.
O compilador irá inferir o tipo de acordo com o valor colocado na varriável e não pode ser trocado posteriormente.
Quando o _var_ for utilizado sempre será necessário inicializar a variável.

# Trabalhando com escopo de variável

- Uma vairável nunca pode ter um escopo maior do que o método em que ela está declarada, no entanto elas podem ter um escopo menor.

# Escopo para classes

- Variáveis de instância estão disponíveis assim que são definidas e duram a vida útil do objeto.
- Variáveis estáticas entram no escopo quando declaradas como o outros tipos de variáveis. No entanto, eles permanecem no escopo durante toda a vida do programa.

# Resumo sobre escopos

- Variáveis ​​locais: No escopo desde a declaração até o final do bloco
- Parâmetros do método: no escopo durante a duração do método
- Variáveis ​​de instância: no escopo desde a declaração até que o objeto seja elegível para o _garbage collection_
- Variáveis ​​de classe: no escopo desde a declaração até o término do programa

# Garbage collector

A coleta de lixo refere-se ao processo de liberação automática de memória no heap, excluindo objetos que não estão mais acessíveis em seu programa.

Um objeto está elegível ao garbage collector quando:

- O objeto não possui mais referências apontando para ele.
- Todas as referências ao objeto saíram do escopo.

Diferença entre objeto e referência:

    A referência é uma variável que possui um nome e pode ser usada para acessar o conteúdo de um
    objeto. Uma referência pode ser atribuída a outra referência, passada para um método ou retornada
    de um método. Todas as referências são do mesmo tamanho, independentemente do tipo.
    Um objeto fica na pilha e não tem nome. Portanto, você não tem como acessar
    um objeto, exceto por meio de uma referência. Os objetos vêm em diferentes formas e tamanhos e
    consomem quantidades variadas de memória. Um objeto não pode ser atribuído a outro objeto e
    um objeto não pode ser passado para um método ou retornado de um método. É o objeto que é coletado pelo _garbage collector_
    , não sua referência.

# Resumo

- **Ser capaz de escrever código usando um método main().**
- Um método main() geralmente é escrito como público estático void principal(String[] args). Os argumentos são referenciados começando com argumentos[0]. Acessar um argumento que não foi passado fará com que o código lance um exceção.
- **Entenda o efeito do uso de pacotes e importações.**
- Os pacotes contêm classes Java. As classes podem ser importadas por nome de classe ou curinga. Os curingas não olham para subdiretórios. No caso de um conflito, as importações de nomes de classe têm precedência. Empacotar e importar declarações são opcionais. Se estiverem presentes, ambos vão antes da declaração de classe em essa ordem.
- **Ser capaz de reconhecer um construtor.**
- Um construtor tem o mesmo nome da classe. Parece como um método sem tipo de retorno.

- **Ser capaz de identificar declarações e inicialização legais e ilegais.**
  - Múltiplas variáveis ​​podem ser declarados e inicializados na mesma instrução quando compartilham um tipo. Variáveis ​locais requer uma inicialização explícita; outros usam o valor padrão para esse tipo. Os identificadores podem
    contêm letras, números, símbolos de moeda ou _, embora não possam começar com números.
    Além disso, você não pode definir um identificador que seja apenas um caractere de sublinhado _. Numérico
    literais podem conter sublinhados entre dois dígitos, como 1*000, mas não em outros lugares,
    como \_100*.0\_.
- **Entenda como criar blocos de texto.**
  - Um bloco de texto começa com """ na primeira linha. A próxima linha inicia o conteúdo. A última linha termina com """. Se """ estiver em sua própria linha, uma quebra de linha final está incluída.
- **Ser capaz de usar var corretamente.**
  - Um var é usado para uma variável local. Uma var é inicializada no mesma linha onde foi declarado e, embora possa alterar o valor, não pode alterar o tipo. Uma variável não pode ser inicializado com um valor nulo sem um tipo, nem pode ser usado em declarações de múltiplas variáveis.
- **Ser capaz de determinar onde as variáveis ​​entram e saem do escopo.**
  - Todas as variáveis ​​entram no escopo quando forem declarados. Variáveis ​​locais saem do escopo quando o bloco em que são declaradas nas pontas. Variáveis ​​de instância saem do escopo quando o objeto é elegível para coleta de lixo.
    Variáveis ​​de classe permanecem no escopo enquanto o programa estiver em execução.
- **Saiba como identificar quando um objeto é elegível para coleta de lixo.**
  - Desenhe um diagrama para acompanhe referências e objetos enquanto rastreia o código. Quando nenhuma seta aponta para uma caixa (objeto), ele é elegível para coleta de lixo.

# Precedência dos Operadores

| Operator                        | Symbols and examples                              | Evaluation    |
| ------------------------------- | ------------------------------------------------- | ------------- |
| Post-unary operators            | expression++, expression--                        | Left-to-right |
| Pre-unary operators             | ++expression, --expression                        | Left-to-right |
| Other unary operators           | -, !, ~, +, (type)                                | Right-to-left |
| Cast                            | (Type)reference                                   | Right-to-left |
| Multiplication/division/modulus | \*, /, %                                          | Left-to-right |
| Addition/subtraction            | +, -                                              | Left-to-right |
| Shift operators                 | <<, >>, >>>                                       | Left-to-right |
| Relational operators            | <, >, <=, >=, instanceof                          | Left-to-right |
| Equal to/not equal to           | ==, !=                                            | Left-to-right |
| Logical AND                     | &                                                 | Left-to-right |
| Logical exclusive OR            | ^                                                 | Left-to-right |
| Logical inclusive OR            | \|                                                | Left-to-right |
| Conditional AND                 | &&                                                | Left-to-right |
| Conditional OR                  | \|\|                                              | Left-to-right |
| Ternary operators               | boolean expression ? expression1 : expression2    | Right-to-left |
| Assignment operators            | =, +=, -=, \*=, /=, %=, &=, ^=, =, <<=, >>=, >>>= | Right-to-left |
| Arrow operator                  | ->                                                | Right-to-left |

# Regras de promoção númerica

1. Se dois valores tiverem tipos de dados diferentes, Java promoverá automaticamente um dos valores para o maior dos dois tipos de dados.
2. Se um dos valores for integral e o outro for ponto flutuante, Java irá automaticamente promova o valor integral ao tipo de dados do valor de ponto flutuante.
3. Tipos de dados menores, ou seja, byte, short e char, são primeiro promovidos para int a qualquer momento eles são usados ​​com um operador aritmético binário Java com uma variável (em oposição a um valor), mesmo que nenhum dos operandos seja int.
4. Após toda a promoção ter ocorrido e os operandos terem o mesmo tipo de dados, o valor resultante terá o mesmo tipo de dados que seus operandos promovidos.

# Operadores Lógicos

| Operator             | Example | Description                                                                 |
| -------------------- | ------- | --------------------------------------------------------------------------- |
| Logical AND          | a & b   | O valor é verdadeiro somente se ambos os valores forem verdadeiros.         |
| Logical inclusive OR | c \| d  | O valor é verdadeiro se pelo menos um dos valores for verdadeiro.           |
| Logical exclusive OR | e ^ f   | O valor é verdadeiro apenas se um valor for verdadeiro e o outro for falso. |

# Operadores de Atribuição Compostos

| Operator                  | Example   | Description                                                                          |
| ------------------------- | --------- | ------------------------------------------------------------------------------------ |
| Addition assignment       | a += 5    | Adiciona o valor da direita à variável da esquerda e atribui a soma à variável       |
| Subtraction assignment    | b -= 0.2  | Subtrai o valor à direita da variável à esquerda e atribui a diferença à variável    |
| Multiplication assignment | c \*= 100 | Multiplica o valor à direita pela variável à esquerda e atribui o produto à variável |
| Division assignment       | d /= 4    | Divide a variável à esquerda pelo valor à direita e atribui o quociente à variável   |

# Operadores de incremento e decremento

| Operator       | Example | Description                                     |
| -------------- | ------- | ----------------------------------------------- |
| Pre-increment  | ++w     | Aumenta o valor em 1 e retorna o novo valor     |
| Pre-decrement  | --x     | Diminui o valor em 1 e retorna o novo valor     |
| Post-increment | y++     | Aumenta o valor em 1 e retorna o valor original |
| Post-decrement | z--     | Diminui o valor em 1 e retorna o valor original |

---

Formúla para saber o valor quando utilizado o operadot bitwise (~)

```java
  int value = 3;
  System.out.println(-1*value - 1); // -4
```

# Pattern Matching

É uma nova ferramenta usada no bloco _if_ pra reduzir boilerplante no código. Por exemplo:

```java
  void compareIntegers(Number number) {
    if(number instanceof Integer) {
      Integer data = (Integer) number;
      System.out.print(data.compareTo(5));
    }
  }
```

O cast é necessário nesse caso para podermos utilizar o _compareTo()_. Agora vejamos como fica con o recurso do _Pattern Matching_:

```java
  void compareIntegers(Number number) {
    if(number instanceof Integer data) {
    System.out.print(data.compareTo(5));
    }
  }
```

# Subtypes

O tipo da variável _pattern_ precisa ser um subtipo da variável informado no lado esquerdo da expressão, por exemplo:

```java
Integer value = 123;
if(value instanceof Integer) {}
if(value instanceof Integer data) {} // DOES NOT COMPILE
```

# Switch

Estrutura:

![alt text](image.png)

Exemplos:

Depois do java 14:

```java
switch(animal) {
 case 1,2: System.out.print("Lion");
 case 3: System.out.print("Tiger");
 }
```

Antes do java 14

```java
switch(animal) {
 case 1: case 2: System.out.print("Lion");
 case 3: System.out.print("Tiger");
 }
```

Exemplos que não compilam:

```java

switch month { // DOES NOT COMPILE, falta os parênteses no month
 case 1: System.out.print("January");
}

switch(month) // DOES NOT COMPILE, não possui as chaves
 case 1: System.out.print("January");

switch(month) {
 case 1: 2: System.out.print("January"); // DOES NOT COMPILE, deveria ter uma vírgula entre o 1 e 2;
}
```

# Declaração _break_

O _break_ em uma expressão _switch_ é opcional, mas sem ele cada branch (case) seguido do _case_ que corresponde a busca e a declaração _default_ será executado.

Por exemplo, o que será printado chamando printSeason(2):

```java
  public void printSeason(int month) {
    switch(month) {
        case 1, 2, 3: System.out.print("Winter");
        case 4, 5, 6: System.out.print("Spring");
        default: System.out.print("Unknown");
        case 7, 8, 9: System.out.print("Summer");
        case 10, 11, 12: System.out.print("Fall");
    }
  }
```

Será printado todos os casos: **WinterSpringUnknownSummerFall**

# Tipos de dados suportados pela expressão switch:

- int and Integer
- byte and Byte
- short and Short
- char and Character
- String
- enum values
- var (if the type resolves to one of the preceding types)

# Determinando _case values_ aceitáveis:

Não é qualquer variável ou valor que pode ser usado em uma instrução _case_. Primeiro, os valores em cada instrução _case_ devem ser valores constantes de tempo de compilação do mesmo tipo de dados que o valor do _switch_. Isso significa que você pode usar apenas literais, constantes de enum ou variáveis constantes finais do mesmo tipo de dados.

# Expressão _switch_

Estrutura:
![alt text](image-1.png)

Exemplo:

```java
public void printDayOfWeek(int day) {
  var result = switch(day) {
    case 0 -> "Sunday";
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    default -> "Invalid value";
  };
  System.out.print(result);
}
```

Exemplo com múltiplos valores:

```java
public void printSeason(int month) {
  switch(month) {
    case 1, 2, 3 -> System.out.print("Winter");
    case 4, 5, 6 -> System.out.print("Spring");
    case 7, 8, 9 -> System.out.print("Summer");
    case 10, 11, 12 -> System.out.print("Fall");
  }
 }
```

Chamar printSeason(2) imprime o valor único Winter. Desta vez, não precisamos nos preocupar com instruções de quebra, já que apenas uma ramificação é executada.

Regras extras:

- All of the branches of a switch expression that do not throw an exception must return
  a consistent data type (if the switch expression returns a value).
- If the switch expression returns a value, then every branch that isn’t an expression must
  yield a value.
- A default branch is required unless all cases are covered or no value is returned.

Não é possível retornar tipos de dados incompatíveis ou aleatórios. Por exemplo:

```java
int measurement = 10;
int size = switch(measurement) {
 case 5 -> 1;
 case 10 -> (short)2;
 default -> 5;
 case 20 -> "3"; // DOES NOT COMPILE
 case 40 -> 4L; // DOES NOT COMPILE
 case 50 -> null; // DOES NOT COMPILE
};
```

# Case Block

Como um bloco normal, um bloco de caso é aquele que é cercado por chaves ({}). Ele também inclui uma instrução yield se a expressão switch retornar um valor. Por exemplo, o seguinte usa uma mistura de expressões de maiúsculas e minúsculas e blocos:

```java
int fish = 5;
int length = 12;
var name = switch(fish) {
  case 1 -> "Goldfish";
  case 2 -> {yield "Trout";}
  case 3 -> {
  if(length > 10) yield "Blobfish";
  else yield "Green";
  }
  default -> "Swordfish";
};
```

# Core APIs

## Concatenação

Regras:

1 - Se ambos os operandos forem numéricos, + significa adição numérica.
2 - Se um dos operandos for uma String, + significa concatenação.
3 - A expressão é avaliada da esquerda para a direita

String index:

![alt text](image-2.png)

## Métodos importantes para String

- **length()** = Retorna o tamanho da string, quantidade de caracteres.
- **charAt(int index)** = permite consultar a cadeia de caracteres para descobrir qual caractere está em um índice específico.
- **indexOf()** = Examina os caracteres na cadeia de caracteres e localiza o primeiro índice que corresponde ao valor desejado.
  Assinaturas:

```java
public int indexOf(int ch)
public int indexOf(int ch, int fromIndex)
public int indexOf(String str)
public int indexOf(String str, int fromIndex)
```

- **substring()** = também procura caracteres em uma cadeia de caracteres. Ele retorna partes da cadeia de caracteres
  assinaturas:

```java
public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)
```

![alt text](image-3.png)

- **equals() e equalsIgnoreCase()** = O método equals() verifica se dois objetos String contêm exatamente os mesmos caracteres na mesma ordem. O método equalsIgnoreCase() verifica se dois objetos String contêm os mesmos caracteres, com a exceção de que ele ignora as maiúsculas e minúsculas dos caracteres.

```java
public boolean equals(Object obj)
public boolean equalsIgnoreCase(String str)
```

- **startsWith(), endsWith() e contains()** = Os métodos startsWith() e endsWith() examinam se o valor fornecido corresponde a parte da String. O método contains() não é tão particular; ele procura correspondências em qualquer lugar na String

```java
public boolean startsWith(String prefix)
public boolean endsWith(String suffix)
public boolean contains(CharSequence charSeq)
```

- **replace()** = O método replace() faz uma pesquisa simples e substitui na cadeia de caracteres. Há uma versão que usa parâmetros char, bem como uma versão que usa parâmetros CharSequence

```java
public String replace(char oldChar, char newChar)
public String replace(CharSequence target, CharSequence replacement)
```

- **strip(), stripLeading(), stripTrailing(), trim()** = Os métodos strip() e trim() removem o espaço em branco do início e do fim de uma String. Em termos de exame, o espaço em branco consiste em espaços junto com os caracteres t (tabulação) e n (nova linha).
  o método stripLeading() remove o espaço em branco do início da String e o deixa no final. O método stripTrailing() faz o oposto. Ele remove o espaço em branco do final da String e o deixa no início.

```java
public String strip()
public String stripLeading()
public String stripTrailing()
public String trim()
```

- **indent() e striptIndent()** = O método _indent()_ adiciona o mesmo número de espaços em branco ao início de cada linha se você passar um número positivo. Se você passar um número negativo, ele tentará remover esse número de caracteres de espaço em branco do início da linha. Se você passar de zero, o recuo não será alterado. _indent()_ também normaliza caracteres de espaço em branco. O que significa normalizar o espaço em branco, você pergunta? Primeiro, uma quebra de linha é adicionada ao final da cadeia de caracteres, se ainda não estiver lá. Em segundo lugar, todas as quebras de linha são convertidas para o formato \n.
  O método _stripIndent()_ é útil quando um String foi criado com concatenação em vez de usar um bloco de texto. Ele se livra de todos os espaços em branco incidentais. Isso significa que todas as linhas que não estão em branco são deslocadas para a esquerda para que o mesmo número de caracteres de espaço em branco seja removido de cada linha e o primeiro caractere que permanece não esteja em branco

```java
public String indent(int numberSpaces)
public String stripIndent()

```

![alt text](image-4.png)

## Arrays

![alt text](image-5.png)

- Todos são válidos:

```java
int[] numAnimals;
int [] numAnimals2;
int []numAnimals3;
int numAnimals4[];
int numAnimals5 [];
```

A matriz não aloca espaço para os objetos String. Em vez disso, ele aloca espaço para uma referência de onde os objetos são realmente armazenados.
![alt text](image-6.png)

- **Arrays.binarySearch()**
  Retornos:
  ![alt text](image-7.png)

- **compare()**

Retornos:

- A negative number means the first array is smaller than the second.
- A zero means the arrays are equal.
- A positive number means the first array is larger than the second

Regras:

- Se ambas as matrizes têm o mesmo comprimento e têm os mesmos valores em cada ponto no mesmo
  ordem, retorno zero.
- Se todos os elementos são iguais, mas a segunda matriz tem elementos extras no final,
  retornar um número negativo.
- Se todos os elementos forem iguais, mas a primeira matriz tiver elementos extras no final, retorne um
  número positivo.
- Se o primeiro elemento que difere for menor na primeira matriz, retorne um número negativo.
- Se o primeiro elemento que difere for maior na primeira matriz, retorne um número positivo.

O que menor significa??

- null é menor que qualquer outro valor.
- Para os números, aplica-se a ordem numérica normal.
- Para cadeias de caracteres, uma é menor se for um prefixo de outra.
- Para cadeias de caracteres/caracteres, os números são menores do que as letras.
- Para cadeias de caracteres/caracteres, maiúsculas são menores que minúsculas.

![alt text](image-8.png)

## Diferença de **equals()**, **compare()** e **_mismatch()_**

![alt text](image-9.png)

    O método compare() retorna um inteiro positivo quando as matrizes são diferentes e a primeira é maior. Este é o caso da opção A, uma vez que o elemento no índice 1 vem primeiro em ordem alfabética. Não é o caso da opção C porque o s4 é mais longo ou da opção E porque as matrizes são as mesmas. O método mismatch() retorna um inteiro positivo quando as matrizes são diferentes em um índice de posição 1 ou maior. É o caso das opções B e D, já que a diferença está no índice 1. Não é o caso da opção F porque não há diferença.

# Trabalhando com Datas e Horas

Começando pelo import necessário para usar a nova API de datas do Java:

       import java.time.*; // import time classes

## Criando datas e horas

- LocalDate Contém apenas uma data — sem hora e sem fuso horário. Um bom exemplo de LocalDate é o seu aniversário este ano. É o seu aniversário para um dia inteiro, independentemente da hora que é.
- LocalTime Contém apenas uma hora — sem data e sem fuso horário. Um bom exemplo de LocalTime é a meia-noite. É meia-noite no mesmo horário todos os dias.
- LocalDateTime Contém uma data e hora, mas nenhum fuso horário. Um bom exemplo de LocalDateTime é "o golpe da meia-noite na véspera de Ano Novo". A meia-noite de 2 de janeiro não é tão especial, tornando a data relativamente sem importância, e claramente uma hora depois da meia-noite também não é tão especial. -
- ZonedDateTime Contém data, hora e fuso horário. Um bom exemplo de ZonedDateTime é "uma teleconferência às 9:00 a.m. EST." Se você mora na Califórnia, você terá que acordar muito cedo, já que a chamada é às 6:00 da manhã, horário local!

Você obtém instâncias de data e hora usando um método estático

```java
System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
System.out.println(LocalDateTime.now());
System.out.println(ZonedDateTime.now());
```

## Criando uma data sem horas:

```java
var date1 = LocalDate.of(2022, Month.JANUARY, 20);
var date2 = LocalDate.of(2022, 1, 20);
```

As assinaturas do método são as seguintes:

```java
public static LocalDate of(int year, int month, int dayOfMonth)
public static LocalDate of(int year, Month month, int dayOfMonth)
```

## Criando horas sem data:

```java
var time1 = LocalTime.of(6, 15); // hour and minute
var time2 = LocalTime.of(6, 15, 30); // + seconds
var time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
```

As assinaturas do método são as seguintes:

```java
public static LocalTime of(int hour, int minute)
public static LocalTime of(int hour, int minute, int second)
public static LocalTime of(int hour, int minute, int second, int nanos)

```

## Criando horas sem data:

É possível combinar datas e horas em um único objeto:

```java
var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
var dateTime2 = LocalDateTime.of(date1, time1);
```

As assinaturas do método são as seguintes:

```java
public static LocalDateTime of(int year, int month,
 int dayOfMonth, int hour, int minute)
public static LocalDateTime of(int year, int month,
 int dayOfMonth, int hour, int minute, int second)
public static LocalDateTime of(int year, int month,
 int dayOfMonth, int hour, int minute, int second, int nanos)

// Com a referência para o Month

public static LocalDateTime of(int year, Month month,
 int dayOfMonth, int hour, int minute)
public static LocalDateTime of(int year, Month month,
 int dayOfMonth, int hour, int minute, int second)
public static LocalDateTime of(int year, Month month,
 int dayOfMonth, int hour, int minute, int second, int nanos)

 // Com LocalDate e LocalTime

 public static LocalDateTime of(LocalDate date, LocalTime time)

```
