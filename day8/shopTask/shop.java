package day8.shopTask;
import java.util.*;

public class shop implements retailInterface{
  @Override
  public float getTotalCost(float tax, float cost, float number){
    float totalCost = (cost*(1+(tax/100)))*number;
    return totalCost;
  }

  @Override
  public float getTotalExtendedCost(float cosmetics, float perfume, float clothes){
    float getTotalExtendedCost = cosmetics + perfume + clothes;
    System.out.println("Total cost purchase: "+ getTotalExtendedCost);
    return getTotalExtendedCost;
  }
  @Override
  public void getDiscount(float totalCost){
    double discountCost = (totalCost*(0.98));
    System.out.println("Discounted price: "+ discountCost);
  }

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Choose correctly to purchase:");
    System.out.println("Enter quantity of cosmetics: ");
    float cosmetics = sc.nextFloat();
    System.out.println("Enter quantity of perfumes: ");
    float perfume = sc.nextFloat();
    System.out.println("Enter quantity of clothes: ");
    float clothes = sc.nextFloat();

    shop obj = new shop();
    float cost1 = obj.getTotalCost(7,10000, cosmetics);
    System.out.println("Total cost of cosmetics: "+ cost1);
    float cost2 = obj.getTotalCost(12,5000, perfume);
    System.out.println("Total cost of cosmetics: "+ cost2);
    float cost3 = obj.getTotalCost(4,7000, clothes);
    System.out.println("Total cost of cosmetics: "+ cost3);

    float totalCost = obj.getTotalExtendedCost(cost1, cost2, cost3);
    obj.getDiscount(totalCost);
    sc.close();
  }
}
