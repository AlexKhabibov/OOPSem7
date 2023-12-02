package Builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }

    public OrderBuilder setCompanyName(String companyName) {
        order.setCompanyName(companyName);
        return this;

    }

    public OrderBuilder setProductName(String productName) {
        order.setProductName(productName);
        return this;

    }

    public OrderBuilder setProductQNT(int productQNT) {
        order.setProductQNT(productQNT);
        return this;

    }

    public OrderBuilder setProductPrice(double productPrice) {
        order.setProductPrice(productPrice);
        return this;

    }

    public OrderBuilder setSign(boolean sign) {
        order.setSign(sign);
        return this;

    }

}
