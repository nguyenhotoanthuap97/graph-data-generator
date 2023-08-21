import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Job {

  public static final String SA = "Solution Architect";
  public static final String SSE = "Senior Software Engineer";
  public static final String SE = "Software Engineer";
  public static final String SQA = "Senior Quality Assurance";
  public static final String QA = "Quality Assurance";
  public static final String SBA = "Senior Business Analyst";
  public static final String BA = "Business Analyst";

  private static final Map<Integer, Object[]> jobs;

  static {
    jobs = getJobMap(1000);
  }

  public static Map<Integer, Object[]> getJobs() {
    return jobs;
  }

  public static Map<Integer, Object[]> getJobMap(int jobNumber) {
    Map<Integer, Object[]> jobMap = new HashMap<>();
    jobMap.put(0, List.of("jobId", "jobName", "roleName").toArray());
    for (int i = 0; i < jobNumber; i++) {
      int titleIndex = new Random().nextInt(7);
      String title = titleIndex == 0 ? SA
          : titleIndex == 1 ? SSE : titleIndex == 2 ? SE
              : titleIndex == 3 ? QA : titleIndex == 4 ? SQA
                  : titleIndex == 5 ? SBA : BA;
      String role = titleIndex < 3 ? Role.DEVELOPER
          : titleIndex < 5 ? Role.TESTER
              : Role.BUSINESS_ANALYST;
      List<Object> job = Arrays.asList(i + 1, title, role);
      jobMap.put(i + 1, job.toArray());
    }
    return jobMap;
  }

  public static Map<Integer, Object[]> getTeamJobRelationship(Map<Integer, Object[]> jobs) {
    Map<Integer, Object[]> teamJob = new HashMap<>();
    teamJob.put(0, List.of("teamName", "jobName").toArray());
    int count = 1;
    for (var job : jobs.entrySet()) {
      List<String> generatedBU = BusinessUnit.getRandomBusinessUnits();
      teamJob.put(count, List.of(generatedBU.get(1), job.getKey()).toArray());
      count++;
    }
    return teamJob;
  }

  public static String getShortFormTitle(String title) {
    switch (title) {
      case SA -> {
        return "SA";
      }
      case SSE -> {
        return "SSE";
      }
      case SE -> {
        return "SE";
      }
      case QA -> {
        return "QA";
      }
      case SQA -> {
        return "SQA";
      }
      case BA -> {
        return "BA";
      }
      case SBA -> {
        return "SBA";
      }
      default -> {
        return "";
      }
    }
  }
}
