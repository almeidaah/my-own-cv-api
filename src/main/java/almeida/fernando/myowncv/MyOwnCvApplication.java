package almeida.fernando.myowncv;

import almeida.fernando.myowncv.model.Experience;
import almeida.fernando.myowncv.model.MySelf;
import almeida.fernando.myowncv.model.Qualification;
import almeida.fernando.myowncv.repository.MyExperienceRepository;
import almeida.fernando.myowncv.repository.MyselfRepository;
import almeida.fernando.myowncv.repository.QualificationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyOwnCvApplication {

	public static final String MYSELF_NAME = "FERNANDO ALMEIDA";

	public static void main(String[] args) {
		SpringApplication.run(MyOwnCvApplication.class, args);
	}

	List<Experience> experiences = new ArrayList<>();
	List<Qualification> qualifications = new ArrayList<>();

	{

		experiences.add(new Experience().builder()
				.fullName(MYSELF_NAME)
				.startDate(LocalDate.of(2017, 06, 01))
				.endDate(LocalDate.of(2018, 11, 30 ))
				.companyName("Suntech - Verint Group")
				.role("Full Java Developer")
				.whatIDidThere("Suntech is a leader in the Legal Interception market in Brazil and Chile. Our business consist in solutions that help organizations around the world fight crime and other threats. As a Java Developer I've worked on projects in the area of Legal Interception Management, Communication Networks and Cyber Security, most of times focusing on Backend development. In my day-to-day activities I'm mostly developing code with Spring components, Java last features and more recently with Amazon Kinesis(to DataStreams) and another AWS stack tools.  - One concern that I have is always developing scalable, reusable applications that work with a large amount of data while maintaining performance, always looking to develop the best approach for the problem. - Technologies: Java 7/8/9, Javascript, JSP - Testing Using MockMvc(for Spring MVC), RestTemplate and Junit(Annotations and Rules) - Frameworks: jQuery, Spring MVC, Spring Boot 2, MyBatis/JPA(ORM), Maven, Jenkins. - Databases: Oracle, PostgreSQL - AWS Kinesis / ECS /Aurora ").build());

		experiences.add(new Experience().builder()
				.fullName(MYSELF_NAME)
				.startDate(LocalDate.of(2015, 02, 8))
				.endDate(LocalDate.of(2017, 06, 01 ))
				.companyName("Portal Unimed")
				.role("Full Developer Analyst (Java) - New Products Development Team")
				.whatIDidThere("Development of applications using the Java programming language for Corporate Portal, using technologies such as JSP, JPA, EJB, Ireports, JBoss / ApacheTomcat7 / 8 ++, MySQL and Oracle relational databases. Platform for the development of corporate Liferay portals and their technologies. Use of agile methodologies for development (Scrum). - Direct use of the Liferay platform with JSF2, Primefaces 4.0, Javascript, Hibernate, Oracle 11g JBoss5.1/7 and Apache Solr. - Continuous build of Maven projects using Jenkins. Code version control using SVN. - Member of the team of development of new projects of the company. - Participating Member Involved in Single Sign-On Design for the Unimed System Application Suite. Through the Single Sign-On (SSO) mechanism, using the oAuth2 protocol in conjunction with the Spring Framework. - Participating member of mobile projects for the Unimed System (Cooperative / Beneficiary) using technologies such as Ionic and AngularJS.").build());

		experiences.add(new Experience().builder()
				.fullName(MYSELF_NAME)
				.startDate(LocalDate.of(2013, 02, 05))
				.endDate(LocalDate.of(2015, 02, 05 ))
				.companyName("Portal Unimed")
				.role("Java Junior Developer - Support Team")
				.whatIDidThere(" Member participant of support team to legacy projects of the System Unimed. Working with legacy applications. Front-end using JSP/JSF with JavaScript. Back-end with Java6/7 and Struts1.2 and Spring. Databases like Oracle and MySQL; Prepare deployment in staging and production environment; Technical analysis of legacy applications improvements(database and code improvements); ").build());

		experiences.add(new Experience().builder()
				.fullName(MYSELF_NAME)
				.startDate(LocalDate.of(2011, 03, 01))
				.endDate(LocalDate.of(2013, 02, 01))
				.companyName("Softplan / Poligraph")
				.role("Intern Java Developer")
				.whatIDidThere("Maintenance and implementation of functionalities in a system responsible for the electronic management of purchases and tenders of state and federal public agencies. Maintenance of software, testing, data validation, implementation of reports and etc. Worked with Java6/7, Struts2, EJB3 and Jboss 4.2/5.1. ").build());

		qualifications.add(new Qualification().builder()
					.fullName(MYSELF_NAME)
					.description("Information Systems Bachelor Degree - UFSC")
					.startDate(LocalDate.of(2010, 03, 01))
					.endDate(LocalDate.of(2016, 01, 01))
					.build());

		qualifications.add(new Qualification().builder()
				.fullName(MYSELF_NAME)
				.description("MBA in Software Architecture - IGTI")
				.startDate(LocalDate.of(2016, 06, 01))
				.endDate(LocalDate.of(2018, 10, 01))
				.build());

		qualifications.add(new Qualification().builder()
				.fullName(MYSELF_NAME)
				.description("Oracle Certified Associate, Java SE 7 Programmer")
				.build());

		qualifications.add(new Qualification().builder()
				.fullName(MYSELF_NAME)
				.description("Speaker at some local and national software conferences in Brazil (for example, The Developers Conference)")
				.build());

		qualifications.add(new Qualification().builder()
				.fullName(MYSELF_NAME)
				.description("Team Player and problem solver.")
				.build());

		qualifications.add(new Qualification().builder()
				.fullName(MYSELF_NAME)
				.description("Always updated about tech and trendings on IT. As a hobby, writer to DZone and Medium sites.")
				.build());
	}


	@Bean
	public CommandLineRunner populateAboutMe(MyselfRepository myselfRepository, MyExperienceRepository myExperienceRepository, QualificationRepository qualificationRepository){

		return (args) -> {

			myselfRepository.deleteAll();
			myExperienceRepository.deleteAll();
			qualificationRepository.deleteAll();

			myselfRepository.save(new MySelf()
					.builder()
					.fullName("FERNANDO ALMEIDA")
					.email("almeidascvn@gmail.com")
					.linkedinProfile("https://www.linkedin.com/in/oalmeidajavadeveloper/")
					.twitterProfile("https://twitter.com/almeidajava")
					.phoneNumber("+351 911 110 480")
					.build());

			myExperienceRepository.saveAll(experiences);
			qualificationRepository.saveAll(qualifications);
		};
		}
}
