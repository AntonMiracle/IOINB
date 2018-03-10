import java.util.*;

/**
 * Anton Bondarenko
 * b.anton.m.1986@gmail.com
 * Created by student on 10.03.2018.
 */
public class Kolejka<T, P extends Integer> {
    private List<Node<T, P>> kolejka;

    public Kolejka() {
        kolejka = new ArrayList<>();
    }

    public T pop() {
        if (isEmpty()) throw new NoSuchElementException("Kolejka pusta");
        T type = peek();
        kolejka.remove(kolejka.size() - 1);
        return type;
    }

    public boolean isEmpty() {
        return kolejka.isEmpty();
    }


    public T peek() {
        return kolejka.get(kolejka.size() - 1).getType();
    }

    public void push(T type, P prioritet) {
        kolejka.add(new Node<>(type, prioritet));
        Collections.sort(kolejka, (n1, n2) -> n1.compareTo(n2));
    }

    @Override
    public String toString() {
        return kolejka.toString();
    }

    public class Node<T, P extends Integer> implements Comparable<Node<T, P>> {
        T type;
        P prioritet;
        Date createOn;

        public Node(T type, P prioritet) {
            this.type = type;
            this.prioritet = prioritet;
            createOn = new Date();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            if (type != null ? !type.equals(node.type) : node.type != null) return false;
            if (prioritet != null ? !prioritet.equals(node.prioritet) : node.prioritet != null) return false;
            return createOn != null ? createOn.equals(node.createOn) : node.createOn == null;
        }

        @Override
        public int hashCode() {
            int result = type != null ? type.hashCode() : 0;
            result = 31 * result + (prioritet != null ? prioritet.hashCode() : 0);
            result = 31 * result + (createOn != null ? createOn.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(Node<T, P> node) {
            if (this == node) return 0;
            if (this.prioritet.intValue() > node.prioritet.intValue()) return 1;
            if (this.prioritet.intValue() < node.prioritet.intValue()) return -1;
            if (this.createOn.getTime() > node.createOn.getTime()) return 1;
            if (this.createOn.getTime() > node.createOn.getTime()) return -1;
            return 0;
        }

        @Override
        public String toString() {
            return "\n" + type + ", " + prioritet + ", " + createOn;
        }

        protected T getType() {
            return this.type;
        }
    }
}
