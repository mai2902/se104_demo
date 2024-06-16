package dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data

public class createBaoCaoNoResponse {
    long Id;
    long phong_id;
    long noDau;
    long noCuoi;
    LocalDate thang;
}
