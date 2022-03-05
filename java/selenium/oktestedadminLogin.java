package selenium;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Test;

public class oktestedadminLogin {
	
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avi Gupta\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.setExperimentalOption("useAutomationExtension", false);
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver=new ChromeDriver(opt);
		//driver.manage().window().maximize(); 
		//driver.manage().deleteAllCookies();
		driver.get("https://oktadmin.scoopwhoop.com/");
	
		String userData="{\"display_name\":\"avi gupta\",\"id\":\"5e60e70d2f1b74465b91b7e0\",\"name\":\"avi-gupta\",\"image\":\"https://lh3.googleusercontent.com/a-/AOh14Ghsmqrhkwqd2pqzv8wn902LvNx42_Vt6DenFB1o=s96-c\"}";
		String permission="{\"article_view\":1,\"article_create\":1,\"article_edit\":1,\"article_publish\":1,\"article_publish_as_other\":1,\"article_unpublish\":1,\"article_invalidate\":1,\"tag_view\":0,\"tag_create\":0,\"tag_edit\":0,\"destination_view\":0,\"destination_create\":0,\"destination_edit\":0,\"destination_invalidate\":0,\"category_view\":0,\"category_create\":0,\"category_edit\":0,\"category_invalidate\":0,\"design_category\":0,\"topic_view\":0,\"topic_create\":0,\"topic_edit\":0,\"topic_invalidate\":0,\"perm_view\":0,\"perm_create\":0,\"perm_edit\":0,\"group_view\":0,\"group_create\":0,\"group_edit\":0,\"group_invalidate\":0,\"create_edt_pick\":0,\"edit_pick_okt_app\":0,\"make_url\":0,\"laugh\":0,\"live_blog\":0,\"mailchimp\":0,\"home_design\":0,\"micro_create\":0,\"help_center\":0,\"g_notification\":0,\"telegram\":0,\"g_image_uploader\":0,\"video_view\":0,\"video_create\":0,\"video_edit\":0,\"video_publish\":0,\"video_unpublish\":0,\"video_invalidate\":0,\"show_view\":0,\"show_create\":0,\"show_edit\":0,\"show_invalidate\":0,\"genre_view\":0,\"genre_create\":0,\"genre_edit\":0,\"genre_invalidate\":0,\"cast_crew_view\":0,\"cast_crew_create\":0,\"cast_crew_edit\":0,\"cast_crew_invalidate\":0,\"gazab_dashboard_view\":0,\"gazab_users_view\":0,\"gazab_community_view\":0,\"gazab_post_view\":0,\"gazab_report_view\":0,\"gazab_comments_view\":0,\"gazab_help_view\":0,\"gazab_help_create\":0,\"gazab_help_edit\":0,\"gazab_category_view\":0,\"gazab_category_create\":0,\"gazab_category_edit\":0,\"gazab_community_create\":0,\"gazab_community_edit\":0,\"gazab_post_create\":0,\"gazab_post_edit\":0,\"gazab_comments_edit\":0,\"gazab_page_view\":0,\"gazab_page_create\":0,\"gazab_page_edit\":0,\"gazab_reportabuse_view\":0,\"okt_dashboard_view\":0,\"okt_users_view\":0,\"okt_users_create\":0,\"okt_users_edit\":0,\"okt_users_activity\":0,\"okt_help_view\":0,\"okt_help_create\":0,\"okt_help_edit\":0,\"okt_report_view\":0,\"okt_question_view\":0,\"okt_question_create\":0,\"okt_question_edit\":0,\"okt_video_view\":0,\"okt_video_publish\":0,\"okt_video_edit\":0,\"telegram_view\":0,\"telegram_create\":0,\"telegram_edit\":0,\"telegram_invalidate\":0,\"tag_invalidate\":0,\"developer\":0}";
		String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTYwNzU1MDUsIm5iZiI6MTYxNjA3NTUwNSwianRpIjoiNjlmNzk1OWEtZDU3OC00MmRmLTk1NDUtZTg4YTE2M2E0ZDQxIiwiaWRlbnRpdHkiOiJhdmkuZ3VwdGFAc2Nvb3B3aG9vcC5jb20iLCJmcmVzaCI6ZmFsc2UsInR5cGUiOiJhY2Nlc3MifQ.EEnCenavL0p6aRhTqik-qcbtRG-lbFHYUnEWoXyjL-8";
		
		WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);
		// using local storage
		LocalStorage localStorage = webStorage.getLocalStorage();
		localStorage.setItem("userData", userData);
		localStorage.getItem("userData");
		//localStorage.removeItem("name");
		//localStorage.size();
		//localStorage.keySet();
		//localStorage.clear();
		
		
		
		localStorage.setItem("token",token);
		localStorage.getItem("token");
		//localStorage.removeItem("name");
		//localStorage.size();
		//localStorage.keySet();
		//localStorage.clear();
		
		
		localStorage.setItem("permission", permission);
		localStorage.getItem("permission");
		//localStorage.removeItem("name");
		//localStorage.size();
		//localStorage.keySet();
		//localStorage.clear();
		
		
	}

}
