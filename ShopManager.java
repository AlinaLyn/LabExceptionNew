public class ShopManager {
    private int availableStock = 10;

    public void displayStock() {
        System.out.println("Кількість товару на складі: " + availableStock);
    }

    public int sellItem(int quantity) {
        if (quantity <= 0) {
            System.out.println("Помилка: Кількість товару має бути більше нуля.");
            return 0;
        }
        if (quantity > availableStock) {
            System.out.println("Помилка: Недостатньо товару на складі. Максимально доступна кількість для продажу: " + availableStock);
            int soldQuantity = availableStock;
            availableStock = 0;
            System.out.println("Продано " + soldQuantity + " одиниць товару.");
            return soldQuantity;
        }
        availableStock -= quantity;
        System.out.println("Продано " + quantity + " одиниць товару.");
        return quantity;
    }
    public void addItem(int quantity) {
        if (quantity <= 0) {
            System.out.println("Кількість товару для додавання має бути більше нуля.");
            return;
        }
        availableStock += quantity;
        System.out.println("Додано " + quantity + " одиниць товару на склад.");
    }


    }


