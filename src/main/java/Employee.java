import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Employee {

  public static final int EMPLOYEE_ID_INDEX = 0;
  public static final int NAME_INDEX = 1;
  public static final int DOB_INDEX = 2;
  public static final int SEX_INDEX = 3;
  public static final int ADDRESS_INDEX = 4;
  public static final int PIT_INDEX = 5;
  public static final int ID_INDEX = 6;
  public static final int SIBN_INDEX = 7;
  public static final int TITLE_INDEX = 8;
  public static final String SA = "Solution Architect";
  public static final String SSE = "Senior Software Engineer";
  public static final String SE = "Software Engineer";
  public static final String SQA = "Senior Quality Assurance";
  public static final String QA = "Quality Assuranc";
  public static final String SBA = "Senior Business Analyst";
  public static final String BA = "Business Analyst";

  public static Map<Integer, Object[]> getEmployeeMap(int employeeNumber) {
    Map<Integer, Object[]> employeeMap = new HashMap<>();
    for (int i = 0; i < employeeNumber; i++) {
      employeeMap.put(i + 1, generateEmployee(i + 1));
    }
    return employeeMap;
  }

  public static Map<Integer, Object[]> getEmployeeEmployeeRelationship(
      Map<Integer, Object[]> employees) {
    Map<Integer, Object[]> relationshipMap = new HashMap<>();
    int count = 1;
    relationshipMap.put(0, List.of("subordinateName", "superiorName", "startDate").toArray());
    Map<Integer, Object[]> saGroup = new HashMap<>();
    Map<Integer, Object[]> sseGroup = new HashMap<>();
    Map<Integer, Object[]> sqaGroup = new HashMap<>();
    Map<Integer, Object[]> sbaGroup = new HashMap<>();
    for (var entry : employees.entrySet()) {
      Object[] employee = entry.getValue();
      switch (employee[TITLE_INDEX].toString()) {
        case SA -> saGroup.put(entry.getKey(), employee);
        case SSE -> sseGroup.put(entry.getKey(), employee);
        case SQA -> sqaGroup.put(entry.getKey(), employee);
        case SBA -> sbaGroup.put(entry.getKey(), employee);
      }
    }

    Map<Integer, Integer> assignmentCount = new HashMap<>();

    for (var subordinateMap : employees.entrySet()) {
      switch (subordinateMap.getValue()[TITLE_INDEX].toString()) {
        case SSE, SQA, SBA -> {
          Object[] assignment = assignSupervisor(subordinateMap.getKey(), saGroup, assignmentCount);
          if (assignment != null) {
            relationshipMap.put(count, assignment);
            count++;
          }
        }
        case SE -> {
          Object[] seAssignment = assignSupervisor(subordinateMap.getKey(), sseGroup,
              assignmentCount);
          if (seAssignment != null) {
            relationshipMap.put(count, seAssignment);
            count++;
          }
        }
        case QA -> {
          Object[] qaAssignment = assignSupervisor(subordinateMap.getKey(), sqaGroup,
              assignmentCount);
          if (qaAssignment != null) {
            relationshipMap.put(count, qaAssignment);
            count++;
          }
        }
        case BA -> {
          Object[] baAssignment = assignSupervisor(subordinateMap.getKey(), sbaGroup,
              assignmentCount);
          if (baAssignment != null) {
            relationshipMap.put(count, baAssignment);
            count++;
          }
        }
      }
    }
    return relationshipMap;
  }

  private static Object[] assignSupervisor(Integer subordinate, Map<Integer, Object[]> candidates,
      Map<Integer, Integer> assignmentCount) {
    Object[] assignment;
    List<Integer> candidateArray = new ArrayList<>(candidates.keySet());
    Random r = new Random();
    int candidateSize = candidateArray.size();

    while (true) {
      Integer candidate = candidateArray.get(r.nextInt(candidateSize));
      Integer count = assignmentCount.get(candidate);
      if (count == null || count < 10) {
        assignment = List.of(subordinate, candidate,
            LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-"
                + LocalDate.now().getDayOfMonth()).toArray();
        assignmentCount.put(candidate, count == null ? 1 : count + 1);
        break;
      }
    }

    return assignment;
  }

  private static Object[] generateEmployee(int employeeId) {
    String dob = generateDate();
    boolean isFemale = new Random().nextInt(3) == 1;
    String name = NameGenerator.generate(isFemale);
    String sex = isFemale ? "Female" : "Male";
    String address = new Random().nextInt(2) == 1 ? "123 Thành Thái, phường 14, quận 10, TPHCM"
        : "456 Lý Thường Kiệt, phường 4, quận 10, TPHCM";
    String pit = String.format("%05d", new Random().nextInt(1, 99999)) + String.format("%05d",
        new Random().nextInt(1, 99999));
    String id = String.format("%06d", new Random().nextInt(1, 999999)) + String.format("%06d",
        new Random().nextInt(1, 999999));
    String sibn = String.format("%05d", new Random().nextInt(1, 99999)) + String.format("%05d",
        new Random().nextInt(1, 99999));
    int titleIndex = new Random().nextInt(100);
    String title = titleIndex < 5 ? "Solution Architect"
        : titleIndex < 20 ? "Senior Software Engineer" : titleIndex < 50 ? "Software Engineer"
            : titleIndex < 70 ? "Quality Assurance" : titleIndex < 80 ? "Senior Quality Assurance"
                : titleIndex < 88 ? "Senior Business Analyst" : "Business Analyst";

    List<Object> employee = Arrays.asList(employeeId, name, dob, sex, address, pit, id, sibn,
        title);
    return employee.toArray();
  }

  private static String generateDate() {
    int year = new Random().nextInt(1980, 2001);
    int month = new Random().nextInt(1, 13);
    int day = new Random().nextInt(1, 30);
    return year + "-" + month + "-" + day;
  }
}
