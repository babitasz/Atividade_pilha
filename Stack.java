public class Stack {
    private int top = -1; // variável que indica o índice do topo da pilha, inicializada como -1 para indicar que a pilha está vazia
    private int[] data; // array que armazena os elementos da pilha
    private int size; // tamanho máximo da pilha

    // Construtor que inicializa a pilha com um tamanho especificado
    Stack(int size) {
        this.size = size; // define o tamanho da pilha
        this.data = new int[size]; // inicializa o array que armazenará os elementos da pilha
    }

    // Método para adicionar um elemento na pilha
    public void push(int value) {
        if (isFull()) { // verifica se a pilha está cheia
            return; // se estiver cheia, não adiciona o elemento
        }
        top++; // incrementa o índice do topo
        data[top] = value; // armazena o valor no topo da pilha
    }

    // Método para remover um elemento do topo da pilha
    public int pop() {
        if (isEmpty()) { // verifica se a pilha está vazia
            return -1; // se estiver vazia, retorna -1
        }
        int valor = data[top]; // armazena o valor do topo da pilha em uma variável temporária
        data[top] = 0; // "remove" o valor do topo
        top--; // decrementa o índice do topo
        return valor; // retorna o valor removido
    }

    // Método para limpar todos os elementos da pilha
    public void clear() {
        while (top != -1) { // enquanto a pilha não estiver vazia
            data[top] = 0; // "remove" o valor do topo
            top--; // decrementa o índice do topo
        }
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return top >= size - 1; // se o índice do topo for igual ou maior que a capacidade da pilha, retorna true
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == -1; // se o índice do topo for -1, a pilha está vazia e retorna true
    }
}
