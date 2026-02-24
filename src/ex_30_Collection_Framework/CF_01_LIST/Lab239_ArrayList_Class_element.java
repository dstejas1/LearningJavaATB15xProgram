package ex_30_Collection_Framework.CF_01_LIST;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lab239_ArrayList_Class_element {
    static void main(String[] args) {
        APIautomation appvwoLogin = new APIautomation("vwo","https://app.vwo.com");
        APIautomation katalonStudio = new APIautomation("katalon","https://cura.katalon.com");
        APIautomation ttaBank = new APIautomation("ttaBank","https://tta-bank-digital-973242068062.us-west1.run.app/");

        LinkedList<APIautomation> list = new LinkedList<APIautomation>();
        list.add(appvwoLogin);
        list.add(katalonStudio);
        list.add(ttaBank);

        appvwoLogin.printDetails();
        katalonStudio.printDetails();
        ttaBank.printDetails();
    }

    static class  APIautomation{
    private String appName;
    private String Urls;

        public APIautomation(String urls, String appName) {
            Urls = urls;
            this.appName = appName;
        }
        public String getAppName() {
            return appName;
        }
        public void setAppName(String appName) {
            this.appName = appName;
        }
        public String getUrls() {
            return Urls;
        }
        public void setUrls(String urls) {
            this.Urls = Urls;
        }

        public void printDetails(){
            System.out.println("Information : " +  this.appName +" - "+  this.Urls);
        }
    }
}
