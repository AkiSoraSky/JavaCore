class Test {
    public static int ashwani(int num) {
        int var = num * 3;
        return var;
    }

    public static void main(String[] args) {
        int ssd = ashwani(3);
        System.out.println("ssd: " + ssd);
    }
}

class V extends Test {
    public static int ashwani(int num) {
        int vik = num * 100;
        System.out.println("num: " + vik);
        return vik;
    }

    private static void moos(int var) {
        int multi = var * 3;
        System.out.println(+multi);
    }
}