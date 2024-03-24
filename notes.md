# Termo `yeld`

A palavra chave `yeld` foi incluida no java 14, ela permite sair de uma expressão switch retornando um valor que se torna o valor da expresão switch.
Exemplo utilizando `break`:

```java:
public enum Number {
    ONE, TWO, THREE, FOUR;
}

String message;
switch (number) {
    case ONE:
        message = "Got a 1";
        break;
    case TWO:
        message = "Got a 2";
        break;
    default:
        message = "More than 2";
}
```

Exemplo utilizando `yeld`:

```java:
String message = switch (number) {
    case ONE -> {
        yield "Got a 1";
    }
    case TWO -> {
        yield "Got a 2";
    }
    default -> {
        yield "More than 2";
    }
};
```

# Instruções rotuladas

Um rótulo marca a declaração que o segue. Você pode usá-lo para sair dessa afirmação, e apenas para sair dessa afirmação. O controle do fluxo sempre será transferido para o final da instrução rotulada.
Por exemplo:

```java:
public class LabeledBreakExample {
   public static void main(String args[]){
      Task: // Pode ser qualquer nome
      for(int i=0; i<10; i++){
         if (i==8){
            break Task;
          }
          System.out.println("......."+i );
      }
   }
}
```
