public class Skeleton extends Boss {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ "кол стрел"+ number;
    }
}
