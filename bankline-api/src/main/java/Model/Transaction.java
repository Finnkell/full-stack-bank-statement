package Model;

import java.time.LocalDateTime;

public class Transaction {
    private Integer id;
    private LocalDateTime datetime;
    private String description;
    private Double value;
    private TransactionType type;
}
