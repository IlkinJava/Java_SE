package generics;

public class Robot<T extends Head> {
    private Body body;
    private T head;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "body=" + body +
                ", head=" + head +
                '}';
    }
}
