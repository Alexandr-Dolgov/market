package market

class PayController {

    public Object index() {
        String n = params.name
        Object o = new Object();
        return [name: n, obj: o]
    }

    def doit() {
        println("t");
    }
}
