package dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class createPhongResponse {
    long id;
    long soPhong;
    String loaiPhong;
    String tinhTrang;
}
