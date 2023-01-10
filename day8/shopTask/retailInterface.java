package day8.shopTask;

public interface retailInterface {
  float getTotalCost(float tax, float cost, float number);
  float getTotalExtendedCost(float cosmetics, float perfume, float clothes);
  void getDiscount(float totalCost);

}
