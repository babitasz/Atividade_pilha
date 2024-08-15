public class Stack {
        private int top = -1;
        private int[] data;
        private int size;

        Stack(int size){
            this.size = size;
            this.data = new int[size];
        }

        public void push(int value) {
            if (top >= size - 1) { // se estiver cheia, não adiciona
                return;
            }
            top++; // incrementa o topo
            data[top] = value;
        }

        public int pop() {
            if (top <= -1) { // se estiver vazia, não retira
                return -1;
            }
            int valor = data[top];
            data[top] = 0; // "remove" o valor
            top--; // decrementa o topo
            return valor;
        }

        public void clear() {
            while (top != -1) {
                data[top] = 0; // "remove" o valor
                top--;
            }
        }

        public boolean isFull() {
            return top >= size - 1; // se o topo for igual ou maior à capacidade, está cheia dai return true
        }

        public boolean isEmpty() {
            return top == -1; // se o topo for -1, está vazia e retorna true
        }
    }
