public class Drawing {
    private static Drawing instance;
    public String v;

    private Drawing(String val){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.v = val;
    }

    private Drawing(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.v = "testVal";
    }

    public void drawShape(Shape shape){
        System.out.println("Drawing a " + shape.getClass() + " with color: " + shape.getColor() + " and area: " + shape.calculateArea());
    }


    public static Drawing getInstance() {
        if(instance == null){
            instance = new Drawing(); // Maybe make sure to create a second 
        }
        return instance;
    }

    public static void setInstance(Drawing instance) {
        Drawing.instance = instance;
    }

    public String getValue() {
        return v;
    }

    public void setValue(String val) {
        this.v = val;
    }

    
}
