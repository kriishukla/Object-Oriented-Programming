class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T set(T t) {
        return t;
    }

    public static void main(String[] args) {
        Box<Object> intbox = new Box<Object>();
        Box<String> strbox = new Box<String>();

        intbox.add(10);
        strbox.add("hello");

        System.out.println(intbox.t);
        System.out.println(strbox.t);
    }
}