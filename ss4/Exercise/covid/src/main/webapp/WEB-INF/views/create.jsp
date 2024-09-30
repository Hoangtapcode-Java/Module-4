<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 5px;
        }
        .setcolor {
            font-weight: bold;
            color: red;
        }
        .tablehead{
            background-color: gray;
        }

        .head {
            text-align: center;
        }

        .foot{
            color: red;
            text-align: center;
        }

    </style>
</head>
<body>
    <div class="head">
        <h4>TỜ KHAI Y TẾ</h4>
        <span>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</span>
        <span class="setcolor">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</span>
    </div>
    <div>
        <form:form action="/medican/create" method="post" modelAttribute="medican">
            <table width="100%">
                <tr>
                    <td colspan="3"><form:label path="name">Họ tên (ghi chữ IN HOA) <span class="setcolor">(*)</span></form:label></td>
                </tr>
                <tr>
                    <td colspan="3"><form:input path="name" cssStyle="width: 1000px"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="yearOfBirth">Năm sinh <span class="setcolor">(*)</span></form:label></td>
                    <td><form:label path="gender">Giới tính <span class="setcolor">(*)</span></form:label></td>
                    <td><form:label path="nationality">Quốc tịch <span class="setcolor">(*)</span></form:label></td>
                </tr>
                <tr>
                    <td>
                        <form:select path="yearOfBirth">
                            <form:options items="${yearOfBirth}"></form:options>
                        </form:select>
                    </td>
                    <td>
                        <form:select path="gender">
                            <form:options items="${gender}"></form:options>
                        </form:select>
                    </td>
                    <td>
                        <form:select path="nationality">
                            <form:option value="Việt Nam">Việt Nam</form:option>
                            <form:option value="New York">New York</form:option>
                            <form:option value="Canada">Canada</form:option>
                            <form:option value="China">China</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="cMND">
                            Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="cMND" cssStyle="width: 1000px"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="transport">
                            Thông tin đi lại <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:radiobuttons path="transport" items="${transport}"></form:radiobuttons>
                    </td>
                </tr>
                <tr>
                    <td colspan="1.5">
                        <form:label path="licensePlates">
                            Số hiệu phương tiện <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                    <td colspan="1.5">
                        <form:label path="numberOfSeats">
                            Số ghế <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="1.5">
                        <form:input path="licensePlates"></form:input>
                    </td>
                    <td colspan="1.5">
                        <form:input path="numberOfSeats"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="startDate">
                            Ngày bắt đầu <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="startDate" type="date"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="endDate">
                            Ngày kết thúc <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="endDate" type="date"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="placeToVisit">
                            Trong vòng 14 ngày qua, Anh/Chị đã đến tỉnh/thành phố nào ? <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:textarea path="placeToVisit" cols="100" rows="5"></form:textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span style="font-weight: bold"> Địa chỉ liên lạc </span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="province">
                            Tỉnh/Thành <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                    <td>
                        <form:label path="district">
                            Quận/Huyện <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                    <td>
                        <form:label path="ward">
                            Phường/Xã <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:input path="province"></form:input>
                    </td>
                    <td>
                        <form:input path="district"></form:input>
                    </td>
                    <td>
                        <form:input path="ward" ></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:label path="address">
                            Địa chỉ nơi ở <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="address" cssStyle="width: 100%"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="1.5">
                        <form:label path="phone">
                            Điện thoại <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                    <td colspan="1.5">
                        <form:label path="email">
                            Email <span class="setcolor">(*)</span>
                        </form:label>
                    </td>
                </tr>
                <tr>
                    <td colspan="1.5">
                        <form:input path="phone"></form:input>
                    </td>
                    <td colspan="1.5">
                        <form:input path="email"></form:input>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span style="font-weight: bold">Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không? <span class="setcolor">(*)</span> </span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <table border="1 solid">
                            <tr>
                                <th class="tablehead">Triệu chứng</th>
                                <th class="tablehead">Có</th>
                                <th class="tablehead">Không</th>
                                <th class="tablehead">Triệu chứng</th>
                                <th class="tablehead">Có</th>
                                <th class="tablehead">Không</th>
                            </tr>
                            <tr>
                                <td>
                                    Sốt <span class="setcolor">(*)</span>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value="Sốt"></form:checkbox>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value=""></form:checkbox>
                                </td>
                                <td>
                                    Nôn/Buồn Nôn <span class="setcolor">(*)</span>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value="Nôn/Buồn Nôn"></form:checkbox>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value=""></form:checkbox>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Ho <span class="setcolor">(*)</span>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value="Ho"></form:checkbox>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value=""></form:checkbox>
                                </td>
                                <td>
                                    Tiêu chảy <span class="setcolor">(*)</span>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value="Tiêu Chảy"></form:checkbox>
                                </td>
                                <td>
                                    <form:checkbox path="symptom" value=""></form:checkbox>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span style="font-weight: bold">Lịch sử phơi nhiễm: Trong vòng 14 ngày qua Anh/Chị có <span class="setcolor">(*)</span> </span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <table border="1 solid black">
                            <tr>
                                <th></th>
                                <th>Có</th>
                                <th>Không</th>
                            </tr>
                            <tr>
                                <td>Đến trang trại chăn nuôi/chợ buôn bán động vật sống/cơ sở giết mổ động vật / tiếp xúc động vật <span class="setcolor">(*)</span> </td>
                                <td><form:checkbox path="exposureHistoryFirst" value="Có"></form:checkbox></td>
                                <td><form:checkbox path="exposureHistoryFirst" value="Không"></form:checkbox></td>
                            </tr>
                            <tr>
                                <td>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCov <span class="setcolor">(*)</span></td>
                                <td><form:checkbox path="exposureHistorySecond" value="Có"></form:checkbox> </td>
                                <td><form:checkbox path="exposureHistorySecond" value="Không"></form:checkbox> </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
            <div class="foot">
                <span>Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch, thuộc quản lý của
                Ban chỉ đạo quốc gia về phòng chống dịch Covid-19.
                Khi bạn nhấn nút "Gửi" là bạn đã hiểu và đồng ý</span>
                <div class="submit">
                    <input type="submit" value="GỬI TỜ KHAI">
                </div>
            </div>

        </form:form>
    </div>
</body>
</html>
