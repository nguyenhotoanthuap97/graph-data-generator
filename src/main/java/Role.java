import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Role {

  public static final String DEVELOPER = "Developer";
  public static final String TESTER = "Tester";
  public static final String BUSINESS_ANALYST = "Business Analyst";

  public static Map<Integer, Object[]> getRoleMap() {
    Map<Integer, Object[]> roleMap = new HashMap<>();
    roleMap.put(0, List.of("name").toArray());
    roleMap.put(1, List.of(DEVELOPER).toArray());
    roleMap.put(2, List.of(TESTER).toArray());
    roleMap.put(3, List.of(BUSINESS_ANALYST).toArray());
    return roleMap;
  }

  public static Map<Integer, Object[]> getRoleEmployeeRelationship(
      Map<Integer, Object[]> employeeMap) {
    Map<Integer, Object[]> relationship = new HashMap<>();
    relationship.put(0, List.of("employeeId", "roleName").toArray());
    int index = 1;
    for (var entry : employeeMap.entrySet()) {
      relationship.put(index,
          List.of(entry.getValue()[0], getRole(entry.getValue()[8].toString())).toArray());
      index++;
    }
    return relationship;
  }

  private static String getRole(String title) {
    return switch (title) {
      case "Solution Architect", "Senior Software Engineer", "Software Engineer" -> DEVELOPER;
      case "Quality Assurance", "Senior Quality Assurance" -> TESTER;
      default -> BUSINESS_ANALYST;
    };
  }
}
