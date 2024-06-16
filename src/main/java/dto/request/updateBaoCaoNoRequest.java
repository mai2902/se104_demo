package dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data

public class updateBaoCaoNoRequest {
    long phong_id;
    long noDau;
    long noCuoi;
    LocalDate thang;
}
