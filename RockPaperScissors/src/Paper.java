public class Paper implements Choice{
    @Override
    public int compare(Choice choice) {
        if(choice.getClass()== Rock.class){
            return -1;
        }
        if(choice.getClass()== Scissors.class){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Paper";
    }
}
