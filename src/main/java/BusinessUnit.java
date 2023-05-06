import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class BusinessUnit {

  public static final List<String> eu;
  public static final List<String> aus;
  public static final List<String> apac;
  public static final List<String> us;

  static {
    eu = new ArrayList<>(
        Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota",
            "Kappa", "Lambda", "Mu", "Nu", "Xi", "Omicron", "Pi", "Rho", "Sigma", "Tau", "Upsilon",
            "Phi", "Chi", "Psi", "Omega"));

    aus = new ArrayList<>(
        Arrays.asList("Technica", "Digital Shock", "Techx System", "Horizon", "Techverse",
            "Infinite Revo", "Enigma"));

    apac = new ArrayList<>(
        Arrays.asList("Titans", "Evo", "Hypertech", "ActiveTrade", "GoFund", "Signal Studio",
            "Synth", "GoCrypto", "Net Hive", "NextGear", "Fundal"));

    us = new ArrayList<>(
        Arrays.asList("Aimed", "Netician", "AISpace", "Light Speed", "Portfolio", "Elimica"));
  }

  public static Map<Integer, Object[]> getEmployeeProjectRelationship(
      Map<Integer, Object[]> employees) {
    Map<Integer, Object[]> relationships = new HashMap<>();
    relationships.put(0, List.of("employeeId", "teamName", "buName", "startDate").toArray());
    int count = 1;
    for (var employee : employees.entrySet()) {
      List<String> generatedBU = BusinessUnit.getRandomBusinessUnits();
      relationships.put(count,
          List.of(employee.getKey(), generatedBU.get(1), generatedBU.get(0),
              LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-"
                  + LocalDate.now().getDayOfMonth()).toArray());
      count++;
    }
    return relationships;
  }

  public static List<String> getRandomBusinessUnits() {
    String randomBU = "";
    String randomTeam = "";
    int bUIndex = new Random().nextInt(5);
    switch (bUIndex) {
      case 0, 1 -> {
        randomBU = "EU";
        randomTeam = eu.get(new Random().nextInt(eu.size()));
      }
      case 2 -> {
        randomBU = "AUS";
        randomTeam = aus.get(new Random().nextInt(aus.size()));
      }
      case 3 -> {
        randomBU = "APAC";
        randomTeam = apac.get(new Random().nextInt(apac.size()));
      }
      case 4 -> {
        randomBU = "US";
        randomTeam = us.get(new Random().nextInt(us.size()));
      }
    }
    return Arrays.asList(randomBU, randomTeam);
  }

  public static Map<Integer, Object[]> getTeamMap() {
    Map<Integer, Object[]> teamMap = new HashMap<>();
    teamMap.put(0, List.of("id", "name").toArray());
    int index = 1;
    index = addTeams(teamMap, index, eu);
    index = addTeams(teamMap, index, aus);
    index = addTeams(teamMap, index, apac);
    addTeams(teamMap, index, us);
    return teamMap;
  }

  public static Map<Integer, Object[]> getBUMap() {
    Map<Integer, Object[]> buMap = new HashMap<>();
    buMap.put(0, List.of("id", "name").toArray());
    buMap.put(1, List.of("1", "EU").toArray());
    buMap.put(2, List.of("2", "AUS").toArray());
    buMap.put(3, List.of("3", "APAC").toArray());
    buMap.put(4, List.of("4", "US").toArray());
    return buMap;
  }

  private static int addTeams(Map<Integer, Object[]> teamMap, int index, List<String> bu) {
    for (String team : bu) {
      teamMap.put(index, List.of(index, team).toArray());
      index++;
    }
    return index;
  }

  public static Map<Integer, Object[]> getTeamBusinessUnitRelationship() {
    Map<Integer, Object[]> buStructure = new HashMap<>();
    int teamCount = 0;
    buStructure.put(0, List.of("id", "teamName", "buName").toArray());
    for (String s : eu) {
      List<Object> teamRow = new ArrayList<>();
      teamRow.add(teamCount + 1);
      teamRow.add(s);
      teamRow.add("EU");
      buStructure.put(teamCount + 1, teamRow.toArray());
      teamCount++;
    }
    for (String au : aus) {
      List<Object> teamRow = new ArrayList<>();
      teamRow.add(teamCount + 1);
      teamRow.add(au);
      teamRow.add("AUS");
      buStructure.put(teamCount + 1, teamRow.toArray());
      teamCount++;
    }
    for (String s : apac) {
      List<Object> teamRow = new ArrayList<>();
      teamRow.add(teamCount + 1);
      teamRow.add(s);
      teamRow.add("APAC");
      buStructure.put(teamCount + 1, teamRow.toArray());
      teamCount++;
    }
    for (String u : us) {
      List<Object> teamRow = new ArrayList<>();
      teamRow.add(teamCount + 1);
      teamRow.add(u);
      teamRow.add("US");
      buStructure.put(teamCount + 1, teamRow.toArray());
      teamCount++;
    }
    return buStructure;
  }


}
