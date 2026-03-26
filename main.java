public class main {
    private String state;

    public main() {
        this.state = "IDLE";
    }

    public void next() {
        if (state.equals("IDLE")) {
            state = "HAS_MONEY";
            System.out.println("Money inserted. Select product.");
        } 
        else if (state.equals("HAS_MONEY")) {
            state = "DISPENSING";
            System.out.println("Product is being dispensed...");
        } 
        else if (state.equals("DISPENSING")) {
            state = "IDLE";
            System.out.println("Product delivered. Back to idle state.");
        }
    }

    public String getState() {
        return state;
    }
}
