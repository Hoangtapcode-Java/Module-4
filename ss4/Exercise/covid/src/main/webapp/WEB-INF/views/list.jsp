<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-26
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>DANH SÁCH KHAI BÁO Y TẾ</h4>
<table border="1px">
    <tr>
        <th>Họ và Tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Số chứng minh thư</th>
    </tr>
    <tr>
        <td>${medican.name}</td>
        <td>${medican.yearOfBirth}</td>
        <td>${medican.gender}</td>
        <td>${medican.nationality}</td>
        <td>${medican.cMND}</td>
    </tr>
</table>
<h4>Thông tin đi lại</h4>
<table border="1px">
    <tr>
        <th>Phương tiện</th>
        <th>Số hiệu</th>
        <th>Số ghế</th>
        <th>Ngày khởi hành</th>
        <th>Ngày kết thúc</th>
        <th>Những tỉnh/thành đã đi qua trong 14 ngày</th>
    </tr>
    <tr>
        <td>${medican.transport}</td>
        <td>${medican.licensePlates}</td>
        <td>${medican.numberOfSeats}</td>
        <td>${medican.startDate}</td>
        <td>${medican.endDate}</td>
        <td>${medican.placeToVisit}</td>
    </tr>
</table>

<h4>Địa chỉ liên lạc</h4>
<table border="1px">
    <tr>
        <th>Tỉnh/Thành</th>
        <th>Quận/Huyện</th>
        <th>Phường/Xã</th>
        <th>Địa chỉ nơi ở</th>
        <th>Điện thoại</th>
        <th>Email</th>
    </tr>
    <tr>
        <td>${medican.province}</td>
        <td>${medican.district}</td>
        <td>${medican.ward}</td>
        <td>${medican.address}</td>
        <td>${medican.phone}</td>
        <td>${medican.email}</td>
    </tr>
</table>
<h4>Lịch sử phơi nhiễm và triệu trứng</h4>
<table border="1px">
    <tr>
        <td>Triệu chứng </td>
        <td>${medican.symptom}</td>
    </tr>
    <tr>
        <td>
            Đến trang trại chăn nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật
        </td>
        <td>${medican.exposureHistoryFirst}</td>
    </tr>
    <tr>
        <td>
            Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCov
        </td>
        <td>${medican.exposureHistorySecond}</td>
    </tr>
</table>
</body>
</html>
