abstract class Hotel{
    abstract public void biryani();
}

class Chef extends Hotel{
    @Override
    public void biryani(){
        System.out.println("Biryani ready");
    }

    public void test(){
        System.out.println("test method");
    }
}


