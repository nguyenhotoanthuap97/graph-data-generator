import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameGenerator {

  private static final List<String> lastName = new ArrayList<>();
  private static final List<String> middleNameMale = new ArrayList<>();
  private static final List<String> middleNameFemale = new ArrayList<>();
  private static final List<String> firstNameMale = new ArrayList<>();
  private static final List<String> firstNameFemale = new ArrayList<>();

  static {
    lastName.add(new String("Nguyễn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Trần".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Hồ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Lê".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Lý".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Phan".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Trương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Võ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Lâm".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Vương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Huỳnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Phùng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Triệu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Lương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Bùi".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Dương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Đặng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Tống".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Thái".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Đỗ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Phạm".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Ngô".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Đinh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Tạ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Trịnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Vũ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Cao".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    lastName.add(new String("Diệp".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));

    middleNameMale.add(new String("Văn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Hữu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Thanh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Thành".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Quốc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Ngọc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Duy".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Đức".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Bá".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Minh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Vũ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Trần".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Nhật".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Mạnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Trọng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Quang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Công".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Trường".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Đình".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Gia".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Anh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(new String("Minh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameMale.add(
        new String("Dương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));

    middleNameFemale.add(
        new String("Thị".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Thanh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Ngọc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Mai".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Thu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(new String("Mỹ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Kim".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(new String("Tú".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Ngân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Quỳnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Yến".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Hồng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Hiền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Trân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Anh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Ánh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Thảo".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Vân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Diễm".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(new String("Lệ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Huyền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Nguyệt".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    middleNameFemale.add(
        new String("Thuý".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));

    firstNameMale.add(new String("Duẩn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Bình".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Anh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thiên".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thiện".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thế".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thể".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Tùng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Sang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hiếu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hồ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hải".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Sơn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Triều".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Quốc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Tiến".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thức".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Tuấn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Tân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thạch".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thanh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thành".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thịnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thông".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Thuận".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Phùng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Phong".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(
        new String("Phương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Sinh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Đại".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Dương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Danh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Giang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hiền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hào".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hùng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hưng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Kiên".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Khanh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Khang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(
        new String("Khương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Khánh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Luân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Long".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Luận".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Đạt".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Đức".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Đông".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Cao".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Việt".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Vinh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Nhân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Nhật".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Nhựt".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Minh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Mẫn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Mạnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Toàn".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Phú".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Hoàng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Quyền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Chiến".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Bảo".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameMale.add(new String("Trí".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));

    firstNameFemale.add(new String("Anh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Quỳnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Thư".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Thuỷ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Thu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Thuỳ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Thuý".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Yến".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Phượng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Phương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Phụng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Ánh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Duyên".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Dương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Dung".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Định".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Đình".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Giang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Hải".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Hạnh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Hương".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Hiền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Hồng".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Quyên".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Khanh".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Lài".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Lành".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Xuân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Hoa".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Nhung".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Ngân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Nga".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Cúc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Ngọc".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Bích".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Thảo".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Huyền".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Huyên".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Vân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Diễm".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Nguyệt".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Trang".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Trân".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(new String("Huệ".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Tuyết".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    firstNameFemale.add(
        new String("Châu".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
  }

  private static String getRandomLastName() {
    int pos = new Random().nextInt(lastName.size());
    return lastName.get(pos);
  }

  private static String getRandomMiddleNameMale() {
    int pos = new Random().nextInt(middleNameMale.size());
    return middleNameMale.get(pos);
  }

  private static String getRandomMiddleNameFemale() {
    int pos = new Random().nextInt(middleNameFemale.size());
    return middleNameFemale.get(pos);
  }

  private static String getRandomFirstNameMale() {
    int pos = new Random().nextInt(firstNameMale.size());
    return firstNameMale.get(pos);
  }

  private static String getRandomFirstNameFemale() {
    int pos = new Random().nextInt(firstNameFemale.size());
    return firstNameFemale.get(pos);
  }

  public static String generate(boolean isFemale) {
    String fullName = getRandomLastName();
    int middleNameCount = new Random().nextInt(3);
    for (int i = 0; i < middleNameCount; i++) {
      fullName =
          fullName.concat(
              " " + (isFemale ? getRandomMiddleNameFemale() : getRandomMiddleNameMale()));
    }
    fullName =
        fullName.concat(" " + (isFemale ? getRandomFirstNameFemale() : getRandomFirstNameMale()));

    return fullName;
  }
}
