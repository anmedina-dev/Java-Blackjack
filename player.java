public class player{
    private String name;
    private int amount;

    public player(){
        this.name = "User";
        this.amount = 100;
    }

    public player(String name, int amount){
        this.name = name;
        this.amount = amount;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}