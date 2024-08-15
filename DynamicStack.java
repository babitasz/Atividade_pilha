public class DynamicStack {
    No topo; //no é a mesma coisa que um elemento novo
    int tamanho;
    DynamicStack(){
        tamanho = 0; //comeca em 0
        topo = null; //comeca nulo
    }

    public boolean isEmpty(){
        return topo==null; //quando o topo estiver nulo, a pilha está vazia :)
    }

    public void push(int data){ //o topo vai apontar para o ultimo elemento adicionado e
        No no = new No(); // o elemento adicionado aponta para o elemento debaixo
        no.data = data; //ate ele apontar para nulo, que seria o final da pilha
        no.proximo = topo;
        topo = no;
        tamanho ++; //aumenta o tamanho da pilha
    }

    public int pop(){ //o topo saí e o proximo elemento vira o topo
        if (isEmpty()){ //se estiver vazia n remove
            return 0;
        }
        int data = topo.data; //a informação a ser retirada é a informação que está no topo
        topo = topo.proximo; //o topo agora é o próximo elemento
        tamanho--; //diminui o tamanho da pilha
        return data; //retorna o elemento que foi removido
    }
}
