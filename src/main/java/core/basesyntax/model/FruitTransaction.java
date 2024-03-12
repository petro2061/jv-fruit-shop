package core.basesyntax.model;

import java.util.Objects;

public class FruitTransaction {
    private String fruit;
    private int quantity;
    private Operation operation;

    public FruitTransaction(String fruit, int quantity, Operation operation) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.operation = operation;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private String code;

        Operation(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FruitTransaction that = (FruitTransaction) o;
        return quantity == that.quantity
                && Objects.equals(fruit, that.fruit)
                && operation == that.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, quantity, operation);
    }

    @Override
    public String toString() {
        return "Operation type: "
                + operation
                + " |"
                + " FruitName: "
                + fruit
                + " |"
                + " Quantity fruit per operation = "
                + quantity;
    }
}

