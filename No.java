public class No {
    int data; // valor armazenado neste nó da pilha
    No proximo; // referência (ponteiro) para o próximo nó na pilha | indica qual é o próximo elemento na pilha

    // A classe é usada para armazenar valores
    // e criar uma ligação entre os elementos.
    // Cada objeto 'No' contém um valor e uma referência para o
    // próximo nó na estrutura (proximo).
    // cada caixinha da pilha tem um dado e a informação de quem é o elemento que está embaixo dela.
    // a pilha acaba quando o ponteiro aponta para NULL, quando não há mais elementos embaixo.
    // o ponteiro fica emcima dos elementos, já que precisa "apontar" pra eles, logo, se remover o ultimo elemento ele apontará para o null.
}
