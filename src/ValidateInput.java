public class ValidateInput {
    private ValidateInput(){}

    public static long longVal(){
        long val = 0;
        while (true) {
            try {
                val = Long.parseLong(Main.sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return val;
    }
    public static int intVal(){
        int val = 0;
        while (true) {
            try {
                val = Integer.parseInt(Main.sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return val;
    }
}
