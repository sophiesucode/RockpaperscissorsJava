public class Rock implements Choice{

    @Override
    public int compare(Choice choice) {
        if(choice.getClass()== Scissors.class){
            return -1;
        }
        if(choice.getClass()== Paper.class){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Rock";
    }
}
