public class RunEncap {
    public static void main(String[] args)
    {
        EncapsExample encEx=new EncapsExample();
        encEx.setName("Nigam");
        encEx.setIdNum("TMU1234");
        encEx.setAge(21);
        System.out.print("Name : "+encEx.getName()+"\nID Number : "+encEx.getIdNum()+"\nAge : "+encEx.getAge());
    }
}
