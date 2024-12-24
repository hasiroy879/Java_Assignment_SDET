public class CalculatePrice {
    public static void main(String[] args) {
        String str = "A core I 7 laptop price is 85000 tk and a gaming mouse" +
                " price is 2500 tk. If I buy the laptop and 1 piece mouse," +
                " what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
       // System.out.println(str);
        str = str.trim();
        //System.out.println(str);
        str = str.replaceAll(" +", " ");
        System.out.println(str);
        String [] array = (str.split(" "));
        double laptop_price = Double.parseDouble(array[1]);
        double mouse_price = Double.parseDouble(array[2]);
        double discount = Double.parseDouble(array[4]);
        double total_cost = (laptop_price + mouse_price);
        double after_discount = total_cost - (total_cost*(discount/100));
        System.out.println("The price is : "+after_discount);
    }
}
