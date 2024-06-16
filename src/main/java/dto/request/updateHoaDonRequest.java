package dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data

public class updateHoaDonRequest {
    long phong_id;
    long tienDien;
    long tienNuoc;
    long donGia;
    long tongTien;
    LocalDate ngayLapHoaDon;
    String tinhTrangThanhToan;
}
