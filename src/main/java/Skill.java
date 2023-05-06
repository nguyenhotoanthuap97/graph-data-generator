import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class Skill {

  private static final List<String> skills = new ArrayList<>(
      Arrays.asList("Java", "Spring Boot", "C++", "C#", ".Net", "React.js", "Flutter",
          "Apache Tomcat", "Backend", "Frontend", "DevOps", "Microsoft Azure", "Amazon Web Service",
          "Google Cloud Provider", "React Native", "Scrum", "Python", "Golang", "Automation test",
          "Manual test", "Xamarin", "Android", "iOS", "XCode", "VueJS", "ExpressJS", "JavaScript",
          "HTML", "CSS", "Apache JMeter", "Apache Kafka", "Docker", "Kubernetes", "SQL", "NoSQL",
          "Git", "SVN", "JDBC", "Hibernate", "Groovy", "Scala", "TypeScript", "Ruby", "Kotlin",
          "Angular", "ASP.NET", "Django", "Laravel", "GraphQL", "Microservices", "Bootstrap",
          "Ember", "Swift", "Redux", "JavaFX", "Microsoft SQL Server", "PostgreSQL", "MySQL",
          "MongoDB", "Oracle", "Cassandra", "CouchDB", "Redis", "ElasticSearch", "DBA", "Neo4j",
          "Heroku", "Maven", "Gradle", "SonarQube", "CircleCI", "Ansible", "Jenkins", "JUnit",
          "Selenium", "Cucumber", "Serenity", "ETL", "QlikView", "Oracle Warehouse", "Logi Info",
          "Pentaho", "Hadoop", "Spark", "AI", "ML", "Business Analyst", "Wireframe Development",
          "System Analytic", "Product Documentation", "Graphic Design", "Batch script", "Waterfall",
          "Agile", "Kanban", "Scrum master", "English", "Japanese", "French", "Karate",
          "Atlassian JIRA", "AWS Redshift", "Backbone.js", "COBOL", "jQuery", "Linux", "Node.js",
          "Objective C", "PHP", "Perl", "R", "Ruby on Rails", "Shell script", "Spring Framework",
          "AJAX", "Bash", "ASP.NET Core", "Microsoft Visio", "Postman", "Confluence", "Mockup",
          "Oracle Business Intelligence", "Resource planning"));

  private static final List<String> devSkills = List.of("Java", "Spring Boot", "C++", "C#", ".Net",
      "React.js", "Flutter", "Apache Tomcat", "Backend", "Frontend", "DevOps", "Microsoft Azure",
      "Amazon Web Service", "Google Cloud Provider", "React Native", "Python", "Golang", "Xamarin",
      "Android", "iOS", "XCode", "VueJS", "ExpressJS", "JavaScript", "HTML", "CSS", "Apache Kafka",
      "Docker", "Kubernetes", "SQL", "NoSQL", "Git", "SVN", "JDBC", "Hibernate", "Groovy", "Scala",
      "TypeScript", "Ruby", "Kotlin", "Angular", "ASP.NET", "Django", "Laravel", "GraphQL",
      "Microservices", "Bootstrap", "Ember", "Swift", "Redux", "JavaFX", "Microsoft SQL Server",
      "PostgreSQL", "MySQL", "MongoDB", "Oracle", "Cassandra", "CouchDB", "Redis", "ElasticSearch",
      "DBA", "Neo4j", "Heroku", "Maven", "Gradle", "SonarQube", "CircleCI", "Ansible", "Jenkins",
      "JUnit", "ETL", "Oracle Warehouse", "Pentaho", "Hadoop", "Spark", "AI", "ML", "Batch script",
      "AWS Redshift", "Backbone.js", "COBOL", "jQuery", "Linux", "Node.js", "Objective C", "PHP",
      "Perl", "R", "Ruby on Rails", "Shell script", "Spring Framework", "AJAX", "Bash",
      "ASP.NET Core", "Postman");

  private static final List<String> qaSkills = List.of("Automation test", "Manual test",
      "Apache JMeter", "Selenium", "Cucumber", "Serenity", "Karate");

  private static final List<String> baSkills = List.of("Scrum", "QlikView", "Logi Info",
      "Business Analyst", "Wireframe Development", "System Analytic", "Product Documentation",
      "Graphic Design", "Waterfall", "Agile", "Kanban", "Scrum master", "English", "Japanese",
      "French", "Atlassian JIRA", "Microsoft Visio", "Confluence", "Mockup",
      "Oracle Business Intelligence", "Resource planning");

  private static final List<List<String>> stackGroups = List.of(
      List.of("Java", "Spring Framework", "Apache Tomcat", "Backend", "DevOps",
          "Amazon Web Service", "Scrum", "Automation test", "Docker", "SQL", "Git", "Hibernate",
          "Microservices", "PostgreSQL", "Maven", "JUnit", "English", "Karate"),
      List.of("Java", "Spring Boot", "Backend", "DevOps", "Microsoft Azure", "Automation test",
          "Manual test", "NoSQL", "Git", "Hibernate", "MongoDB", "Gradle", "JUnit", "Karate",
          "Cucumber"),
      List.of("Java", "Spring Boot", "Backend", "DevOps", "Google Cloud Provider",
          "Automation test", "SQL", "Git", "Hibernate", "JDBC", "Microservices", "MySQL", "Maven",
          "JUnit", "SonarQube", "English"),
      List.of("Java", "JavaFX", "Amazon Web Service", "Automation test", "Manual test", "JDBC",
          "SQL", "Git", "Hibernate", "JDBC", "PostgreSQL"),
      List.of("C#", ".Net", "DevOps", "Xamarin", "HTML", "CSS", "Microsoft Azure", "Manual test",
          "SQL", "SVN", "Microsoft SQL Server", "DBA", "Oracle Warehouse"),
      List.of("C#", ".Net", "ASP.NET", "Angular", "JavaScript", "HTML", "CSS", "Graphic Design",
          "Microsoft Azure", "Automation test", "Manual test", "SQL", "SVN", "MySQL",
          "Resource planning"),
      List.of("React.js", "Java", "DevOps", "Spring Boot", "Backend", "Frontend", "JavaScript",
          "HTML", "CSS", "Amazon Web Service", "Automation test", "Manual test", "NoSQL", "Git",
          "MongoDB"),
      List.of("C++", "Backend", "Scrum", "Python", "Automation test", "Docker", "SQL", "Oracle",
          "SVN", "Confluence", "Shell script", "Atlassian JIRA"),
      List.of("TypeScript", "JavaScript", "Angular", "Git", "Jenkins", "SonarQube", "Hadoop",
          "Postman", "Confluence", "Mockup"),
      List.of("AJAX", "Node.js", "React.js", "Postman", "English", "French", "Atlassian JIRA",
          "Confluence"),
      List.of("AI", "ML", "Python", "Spark", "Product Documentation", "System Analytic", "Kanban"),
      List.of("Agile", "Scrum master", "ETL", "DBA", "Pentaho", "Business Analyst", "Git"),
      List.of("Ruby on Rails", "PostgreSQL", "Agile", "Ansible"),
      List.of("Bash", "Shell script", "Linux", "C++", "Git"),
      List.of("PHP", "JavaScript", "HTML", "CSS", "Bootstrap", "CouchDB", "Redis", "ElasticSearch",
          "Mockup"),
      List.of("Golang", "Google Cloud Provider", "Automation test", "SQL", "SVN", "Oracle", "DBA",
          "ETL", "Oracle Warehouse", "CircleCI", "Oracle Business Intelligence"),
      List.of("Swift", "iOS", "XCode", "Graphic Design", "Mockup"),
      List.of("Python", "ETL", "System Analytic", "QlikView", "Automation test", "DBA", "Spark"),
      List.of("Ember", "JavaScript", "HTML", "CSS", "Bootstrap", "Redux", "NoSQL", "MongoDB")
  );

  public static Map<Integer, Object[]> getSkillMap() {
    Map<Integer, Object[]> skillMap = new HashMap<>();
    skillMap.put(0, List.of("name").toArray());
    int count = 1;
    for (String skill : skills) {
      skillMap.put(count, List.of(skill).toArray());
      count++;
    }
    return skillMap;
  }

  public static Map<Integer, Object[]> getEmployeeSkillRelationships(
      Map<Integer, Object[]> employees) {
    Map<Integer, Object[]> employeeSkillMaps = new HashMap<>();
    employeeSkillMaps.put(0, List.of("employeeId", "skillName", "rating").toArray());
    int count = 1;
    for (var employee : employees.entrySet()) {
      Object[] employeeProperties = employee.getValue();
      count = generateSkillRatingForEmployee(
          employeeProperties[Employee.EMPLOYEE_ID_INDEX].toString(),
          employeeProperties[Employee.TITLE_INDEX].toString(), employeeSkillMaps, count);
    }
    return employeeSkillMaps;
  }

  private static int generateSkillRatingForEmployee(String employeeId, String title,
      Map<Integer, Object[]> skillRatings, int count) {
    Map<String, List<String>> titleExpertises = Title.getTitleExpertises();
    List<String> sAExpertises = titleExpertises.get("SA");
    List<String> sSEExpertises = titleExpertises.get("SSE");
    List<String> sEExpertises = titleExpertises.get("SE");
    List<String> qAExpertises = titleExpertises.get("QA");
    List<String> sQAExpertises = titleExpertises.get("SQA");
    List<String> sBAExpertises = titleExpertises.get("SBA");
    List<String> bAExpertises = titleExpertises.get("BA");
    for (String skill : skills) {
      int rating = 0;
      int randomNumWithWeight = new Random().nextInt(4);
      switch (title) {
        case Employee.SA -> rating = sAExpertises.contains(skill) ? new Random().nextInt(6)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.SSE -> rating = sSEExpertises.contains(skill) ? new Random().nextInt(4)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.SE -> rating = sEExpertises.contains(skill) ? new Random().nextInt(3)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.QA -> rating = qAExpertises.contains(skill) ? new Random().nextInt(3)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.SQA -> rating = sQAExpertises.contains(skill) ? new Random().nextInt(4)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.SBA -> rating = sBAExpertises.contains(skill) ? new Random().nextInt(4)
            : (randomNumWithWeight == 3 ? 1 : 0);
        case Employee.BA -> rating = bAExpertises.contains(skill) ? new Random().nextInt(3)
            : (randomNumWithWeight == 3 ? 1 : 0);
      }
      if (rating != 0) {
        skillRatings.put(count, List.of(employeeId, skill, rating).toArray());
        count++;
      }
    }
    return count;
  }

  private static int getSkillRatingForProject(String projectName,
      Map<Integer, Object[]> projectSkillRatings, int count) {
    int stackIndex = new Random().nextInt(stackGroups.size());
    for (String skill : stackGroups.get(stackIndex)) {
      projectSkillRatings.put(count,
          List.of(projectName, skill, new Random().nextInt(1, 5)).toArray());
      count++;
    }
    return count;
  }

  public static Map<Integer, Object[]> getSkillRatingForProjects() {
    Map<Integer, Object[]> projectSkillRatings = new HashMap<>();
    projectSkillRatings.put(0, List.of("projectName", "skillName", "rating").toArray());
    List<String> allProjects = Stream.of(BusinessUnit.eu, BusinessUnit.aus, BusinessUnit.apac,
        BusinessUnit.us).flatMap(
        Collection::stream).toList();
    int count = 1;
    for (String project : allProjects) {
      count = getSkillRatingForProject(project, projectSkillRatings, count);
    }

    return projectSkillRatings;
  }

  public static Map<Integer, Object[]> getSkillRoleRelationship() {
    Map<Integer, Object[]> skillRoleRelationship = new HashMap<>();

    skillRoleRelationship.put(0, List.of("skillName", "roleName").toArray());
    int count = 1;
    for (String skill : devSkills) {
      skillRoleRelationship.put(count, List.of(skill, Role.DEVELOPER).toArray());
      count++;
    }

    for (String skill : qaSkills) {
      skillRoleRelationship.put(count, List.of(skill, Role.TESTER).toArray());
      count++;
    }

    for (String skill : baSkills) {
      skillRoleRelationship.put(count, List.of(skill, Role.BUSINESS_ANALYST).toArray());
      count++;
    }

    return skillRoleRelationship;
  }

  public static Map<Integer, Object[]> generateSkillRating(int rowNumber) {
    Map<Integer, Object[]> employeeData = new HashMap<>();
    Map<String, List<String>> titleExpertises = Title.getTitleExpertises();
    for (int rowNum = 1; rowNum <= rowNumber; rowNum++) {
      List<Object> ratingRow = new ArrayList<>();
      List<String> generatedBU = BusinessUnit.getRandomBusinessUnits();
      int titleIndex = new Random().nextInt(100);
      if (titleIndex < 5) { // SA
        List<String> sAExpertises = titleExpertises.get("SA");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Solution Architect");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (sAExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(6));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } // SSE
      else if (titleIndex < 20) {
        List<String> sSEExpertises = titleExpertises.get("SSE");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Senior Software Engineer");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (sSEExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(4));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } // SE
      else if (titleIndex < 50) {
        List<String> sEExpertises = titleExpertises.get("SE");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Software Engineer");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (sEExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(3));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } // QA
      else if (titleIndex < 70) {
        List<String> qAExpertises = titleExpertises.get("QA");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Quality Assurance");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (qAExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(3));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } else if (titleIndex < 80) { // SQA
        List<String> sQAExpertises = titleExpertises.get("SQA");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Senior Quality Assurance");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (sQAExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(4));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } else if (titleIndex < 88) { // SBA
        List<String> sBAExpertises = titleExpertises.get("SBA");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Senior Business Analyst");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (sBAExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(4));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      } // BA
      else {
        List<String> bAExpertises = titleExpertises.get("BA");
        ratingRow.add(rowNum);
        ratingRow.add(NameGenerator.generate(true));
        ratingRow.add("Business Analyst");
        ratingRow.add(generatedBU.get(0));
        ratingRow.add(generatedBU.get(1));
        for (String skill : skills) {
          if (bAExpertises.contains(skill)) {
            ratingRow.add(new Random().nextInt(3));
          } else {
            int randomNumWithWeight = new Random().nextInt(2) - new Random().nextInt(2);
            ratingRow.add(randomNumWithWeight <= 0 ? 0 : 1);
          }
        }
      }
      employeeData.put(rowNum + 1, ratingRow.toArray());
    }
    return employeeData;
  }
}
