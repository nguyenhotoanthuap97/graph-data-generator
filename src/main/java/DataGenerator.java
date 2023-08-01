import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataGenerator {

  private static final Logger LOGGER = Logger.getLogger(DataGenerator.class.getName());
  private static final int EMPLOYEE_COUNT = 1000; //S:1000, M: 5000, L: 10000
  private static final String OUTPUT_FOLDER =
      "D:/Study/Master/Thesis/Data/Final3/" + EMPLOYEE_COUNT + "/";

  public static void main(String[] args) {
    Map<Integer, Object[]> businessUnits = BusinessUnit.getBUMap();
    writeData("Data", businessUnits, OUTPUT_FOLDER + "BusinessUnits.xlsx");

    Map<Integer, Object[]> teams = BusinessUnit.getTeamMap();
    writeData("Data", teams, OUTPUT_FOLDER + "Teams.xlsx");

    Map<Integer, Object[]> teamBusinessUnitRelationship = BusinessUnit.getTeamBusinessUnitRelationship();
    writeData("Data", teamBusinessUnitRelationship,
        OUTPUT_FOLDER + "BELONGS_TO.xlsx");

    Map<Integer, Object[]> employees = Employee.getEmployeeMap(EMPLOYEE_COUNT);

    Map<Integer, Object[]> roles = Role.getRoleMap();
    writeData("Data", roles,
        OUTPUT_FOLDER + "Roles.xlsx");

    Map<Integer, Object[]> jobs = Job.getJobs();
    writeData("Data", jobs, OUTPUT_FOLDER + "Jobs.xlsx");

    Map<Integer, Object[]> isA = Role.getRoleEmployeeRelationship(employees);
    writeData("Data", isA,
        OUTPUT_FOLDER + "IS_A.xlsx");

    Map<Integer, Object[]> reportsTo = Employee.getEmployeeEmployeeRelationship(employees);
    writeData("Data", reportsTo,
        OUTPUT_FOLDER + "REPORTS_TO.xlsx");

//    Map<Integer, Object[]> isMemberOf = BusinessUnit.getEmployeeProjectRelationship(employees);
//    writeData("Data", isMemberOf,
//        OUTPUT_FOLDER + "IS_MEMBER_OF.xlsx");

    Map<Integer, Object[]> isOf = Job.getTeamJobRelationship(employees);
    writeData("Data", isOf,
        OUTPUT_FOLDER + "IS_OF.xlsx");

    Map<Integer, Object[]> skills = Skill.getSkillMap();
    writeData("Data", skills,
        OUTPUT_FOLDER + "skills.xlsx");

    Map<Integer, Object[]> isUsedBy = Skill.getSkillRoleRelationship();
    writeData("Data", isUsedBy,
        OUTPUT_FOLDER + "IS_USED_BY.xlsx");

    Map<Integer, Object[]> projectRating = Skill.getSkillRatingForJobs();
    writeData("Data", projectRating, OUTPUT_FOLDER + "REQUIRES.xlsx");

    Map<Integer, Object[]> employeeRating = Skill.getEmployeeSkillRelationships(employees);
    int fileId = 1;
    if (employeeRating.keySet().size() > 500000) {
      while (employeeRating.keySet().size() > 1) {
        Map<Integer, Object[]> subEmployeeRating = new HashMap<>();
        subEmployeeRating.put(0, employeeRating.get(0));
        int rowCount = 0;
        Map<Integer, Object[]> traverseMap = new HashMap<>(employeeRating);
        for (var rating : traverseMap.entrySet()) {
          if (rowCount == 500000) {
            break;
          }
          if (!rating.getKey().equals(0)) {
            subEmployeeRating.put(rating.getKey(), rating.getValue());
            employeeRating.remove(rating.getKey());
            rowCount++;
          }
        }
        writeData("Data", subEmployeeRating, OUTPUT_FOLDER + "RATES_" + fileId + ".xlsx");
        fileId++;
      }
    } else {
      writeData("Data", employeeRating, OUTPUT_FOLDER + "RATES.xlsx");
    }

    employees.put(0,
        List.of("employeeId", "name", "dateOfBirth", "sex", "address", "pit", "id", "sibn", "title")
            .toArray());
    writeData("Data", employees,
        OUTPUT_FOLDER + "Employees.xlsx");
  }

  private static void writeData(String sheetName, Map<Integer, Object[]> data, String outputPath) {
    try (XSSFWorkbook workbook = new XSSFWorkbook()) {
      XSSFSheet sheet = workbook.createSheet(sheetName);
      XSSFRow row;
      Set<Integer> keyId = data.keySet();

      int rowId = 0;
      for (Integer key : keyId) {
        row = sheet.createRow(rowId++);
        Object[] objectArr = data.get(key);
        int cellId = 0;

        for (Object obj : objectArr) {
          Cell cell = row.createCell(cellId++);
          cell.setCellValue(String.valueOf(obj));
        }
      }

      FileOutputStream out = new FileOutputStream(outputPath);
      workbook.write(out);
      out.close();
      LOGGER.log(Level.INFO, "Done writing for {0}!!!", outputPath);
    } catch (IOException ex) {
      LOGGER.log(Level.SEVERE, "Error while generating data: {0}", ex);
    }
  }
}
