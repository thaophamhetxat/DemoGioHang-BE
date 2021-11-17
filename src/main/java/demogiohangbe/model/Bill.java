package demogiohangbe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor //tạo Constructor có tất cả tham số
@NoArgsConstructor //tạo Constructor không tham số
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String buyDate;// ngay mua
    private long priceTotal;// tong tien

    @ManyToOne
    private Users buyer;// nguoi mua
}
