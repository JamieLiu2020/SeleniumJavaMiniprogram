package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import Config.DeviceInfo;
import Config.MobileNumAndCode;

public class BaseClass {
	
	static AndroidDriver<MobileElement> driver = null;
	public boolean loginFlag = false;
	public String baoXiuOrderNo = "";
	
	@BeforeTest
	public void setup() throws Exception{
		
		try {						
			
			setupDriver("ҽ��һ������");
//			
//			//System.out.println("���е�contexts:" + driver.getContextHandles());
//			
//			//ת��webview
//			driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//			Thread.sleep(2000);
//			
//			//�����е�webview�ж���Ҫ�ҵ���ȷ��handle
//			findWindowHandle(driver, "�����¼");
//			
//			//���Ĭ���Ѿ���¼���������������
//			if (loginFlag){
//		
//				//��ҳ���������¼����ť
//				driver.findElement(By.xpath("/html/body/wx-view[2]/wx-view[1]/wx-view[1]/wx-button")).click();
//				Thread.sleep(2000);	
//				
//				//����ҳ�����ܾ�����ť��ת��native			
//				driver.context("NATIVE_APP");
//				Thread.sleep(1000);	
//				driver.findElement(By.id("com.tencent.mm:id/xh")).click();
//				
//				//�ֻ�������ҳ�����ֻ��ŵ�¼����ת��webview
//				driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//				Thread.sleep(2000);
//				
//				//�����е�webview�ж���Ҫ�ҵ���ȷ��handle
//				findWindowHandle(driver, "ҽԺ�Ǽ�");
//	
//				driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-input")).click();
//				Thread.sleep(2000);				
//				//����绰����
//				Config.MobileNumAndCode.inputMobileNum(driver);						
//				Thread.sleep(2000);	
//				//��� ��ȡ ��֤��
//				driver.findElement(By.xpath("/html/body/wx-view/wx-button")).click();
//				Thread.sleep(2000);	
//							
//				//��֤��ҳ�����ֻ���֤�롱��ת��webview
//				System.out.println("���е�contexts:" + driver.getContextHandles());
//				driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//				Thread.sleep(2000);
//				
//				//�����е�webview�ж���Ҫ�ҵ���ȷ��handle
//				findWindowHandle(driver, "�ֻ���֤��");
//	
//				driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-input")).click();
//				Thread.sleep(2000);				
//				//������֤��
//				Config.MobileNumAndCode.inputCode(driver);						
//				Thread.sleep(2000);	
//				//��� ��¼
//				driver.findElement(By.xpath("/html/body/wx-view/wx-button")).click();
//				Thread.sleep(2000);	
//				
//				loginFlag = false;
//			}
//			
		} catch(MalformedURLException e) {
            e.printStackTrace();
        }			
	}
	
	@Test
	public void Step1BaoXiuTest() throws Exception{
		
		System.out.println("1�����޶ˣ���ʼ����");
		
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		//��ҳ����� ��д����
		findWindowHandle(driver, "��д����");		
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[2]")).click();
		Thread.sleep(3000);
		
		//�豸�б�ҳ��ѡ��ƹ�		
		findWindowHandle(driver, "���ټ����豸��ʩ");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view/wx-treelist[2]/wx-view/wx-view[2]/wx-treelist[6]/wx-view/wx-view[2]/wx-treelist[2]/wx-view/wx-view/wx-text")).click();
		Thread.sleep(3000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view/wx-treelist[2]/wx-view/wx-view[2]/wx-treelist[6]/wx-view/wx-view[2]/wx-treelist[2]/wx-view/wx-view/wx-text")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}	
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view/wx-treelist[2]/wx-view/wx-view[2]/wx-treelist[6]/wx-view/wx-view[2]/wx-treelist[2]/wx-view/wx-view/wx-text")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}	
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view/wx-treelist[2]/wx-view/wx-view[2]/wx-treelist[6]/wx-view/wx-view[2]/wx-treelist[2]/wx-view/wx-view/wx-text")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}	
		//�÷����ѱ����б�ѡ���½�����
		loginFlag = false;
		findWindowHandle(driver, "�½�����");	
		if (loginFlag){
			driver.findElement(By.xpath("/html/body/wx-view/wx-view/wx-view")).click();
			Thread.sleep(2000);
			try{
				driver.findElement(By.xpath("/html/body/wx-view/wx-view/wx-view")).click();
				Thread.sleep(2000);
			}catch(Exception e){
				}		
			loginFlag = false;			
		}
		
		//������Ϣ����ҳ
		findWindowHandle(driver, "��������");
		//��� ��ѡ������λ��
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-view[1]/wx-location/wx-input")).click();
		Thread.sleep(3000);
		//λ��ѡ��ҳ��ѡ�� ��ˮ��
		findWindowHandle(driver, "���ټ���λ��");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist[33]/wx-view/wx-view/wx-text")).click();
		Thread.sleep(4000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist[33]/wx-view/wx-view/wx-text")).click();
		}catch(Exception e){
			}
		
		//�ص�������Ϣ����ҳ
		findWindowHandle(driver, "��������");
		//����ϴ���Ƭ
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[3]/wx-view[2]/wx-view")).click();
		Thread.sleep(3000);
				
		//System.out.println("���е�contexts:" + driver.getContextHandles());
		//�ϴ���Ƭ
		driver.context("NATIVE_APP");
		Thread.sleep(2000);	
		//���������ť
		driver.findElement(By.id("com.tencent.mm:id/pg")).click();
		Thread.sleep(2000);
		//ѡ��Screenshots
		driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
		Thread.sleep(2000);
		//Ĭ��ѡ�е�һ����Ƭ
		driver.findElement(By.id("com.tencent.mm:id/bws")).click();
		Thread.sleep(1000);
		//�����ɰ�ť
		driver.findElement(By.id("com.tencent.mm:id/ln")).click();
		Thread.sleep(6000);

		//��д��������
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		//������Ϣ����ҳ
		findWindowHandle(driver, "��������");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[1]/wx-view[3]/wx-textarea")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[1]/wx-view[3]/wx-textarea")).click();		
		Thread.sleep(2000);
		
		//�����������
		Config.MobileNumAndCode.inputDescription(driver);
		Thread.sleep(5000);
		try{
			driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
			Thread.sleep(1000);
		}catch(Exception e){
			}
		//����
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(1000);
		findWindowHandle(driver, "��������");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[3]/wx-view")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[3]/wx-view")).click();
			Thread.sleep(1000);
		}catch(Exception e){
			}
		Thread.sleep(2000);
		
		//��Ϣ��ȡ��
		driver.context("NATIVE_APP");
		Thread.sleep(2000);
		
		try{
			driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		
		driver.findElement(By.id("com.tencent.mm:id/fd2")).click();
		Thread.sleep(4000);

		//Step1BaoXiuTest();
		
		System.out.println("���޶ˣ��������");
		driver.quit();
		
//		driver.context("NATIVE_APP");
//		Thread.sleep(2000);		
//		try{
//			driver.findElement(By.xpath("//*[@content-desc='�ر�']")).click();
//			Thread.sleep(2000);
//		}catch(Exception e){
//			}
//		Thread.sleep(10000);
//		driver.findElementByAndroidUIAutomator("text(\"ҽ��ά������\")").click();
//		Thread.sleep(5000);
	}
	
	@Test
	public void Step2WeiXiuTest() throws Exception{
		
		setupDriver("ҽ��ά������");
		
		driver.context("NATIVE_APP");
		Thread.sleep(1000);		
		System.out.println("2��ά�޶ˣ���ʼά��");
	
		driver.findElements(By.id("com.tencent.mm:id/om")).get(2).click();
		Thread.sleep(1000);	

		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "��ǰά������");
		Thread.sleep(2000);
		
		int i=1;
		int sum = driver.findElements(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem")).size();
		//System.out.println(sum);
		//ѡ��Jamie����ά�� ���޵ĵƹ�
		do{
			if(driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem["+i+"]/wx-view/wx-view[1]/wx-text/span[2]")).getText().equals("�ƹ� ҽ���칫��") && 
					driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem"+i+"]/wx-view/wx-view[2]/wx-view[2]/wx-text[2]/span[2]")).getText().equals("Jamie����ά�� ҽ���칫��"))
			{
				break;
			}
			i++;
		}while(i<sum);

		//��ȡ
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[3]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e){
			}
		Thread.sleep(5000);
		
		//��ȡ����
		findWindowHandle(driver, "������Ϣ");
		baoXiuOrderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-text[2]/span[2]")).getText();
		System.out.println("���޵����ǣ�" + baoXiuOrderNo);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]")).click();
		Thread.sleep(1000);
		
		//�����˵���ȡ����
		findWindowHandle(driver, "֪ͨ������Ա����");
		driver.findElement(By.xpath("/html/body/wx-arrivaltime/wx-view/wx-view[2]/wx-view[3]")).click();
		Thread.sleep(2000);
		
		//��ҳ����ѽӵ�
		findWindowHandle(driver, "��ǰά������");
		//verify �ѽӵ�
		String state = 	driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();	
		System.out.println(state);		
		Assert.assertEquals("�ѽӵ�", state);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view")).click();
		Thread.sleep(2000);
		
		//���ѵ����ֳ�
		findWindowHandle(driver, "������Ϣ");
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[2]/wx-view[2]")).click();
		Thread.sleep(2000);
		
		//��ҳ���ά����		
		findWindowHandle(driver, "��ǰά������");
		//verify ά����
		state = driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();
		System.out.println(state);		
		Assert.assertEquals("ά����", state);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem/wx-view")).click();
		Thread.sleep(2000);
		
		//�������ų�
		findWindowHandle(driver, "������Ϣ");
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view[2]")).click();
		Thread.sleep(2000);
		
		//�ύ����
		findWindowHandle(driver, "�������ͼ�¼");
		Thread.sleep(2000);
		//����ϴ�ͼƬ
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-scroll-view/div/div/div/wx-view/wx-view[1]/wx-image")).click();		
		Thread.sleep(3000);
		
		//�ϴ���Ƭ
		driver.context("NATIVE_APP");
		Thread.sleep(2000);	
		//���������ť
		driver.findElement(By.id("com.tencent.mm:id/pg")).click();
		Thread.sleep(2000);
		//ѡ��Screenshots
		driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
		Thread.sleep(2000);
		//Ĭ��ѡ�е�һ����Ƭ
		driver.findElement(By.id("com.tencent.mm:id/bws")).click();
		Thread.sleep(1000);
		//�����ɰ�ť
		driver.findElement(By.id("com.tencent.mm:id/ln")).click();
		Thread.sleep(6000);
		
		//����ύ����
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "�������ͼ�¼");
		Thread.sleep(2000);
		//���������������	
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[3]/wx-textarea")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[3]/wx-textarea")).click();
		Thread.sleep(2000);	
		
		Config.MobileNumAndCode.inputDescription(driver);
		Thread.sleep(3000);
		try{
			driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
			
		//�����ų���ʩ����
		findWindowHandle(driver, "�������ͼ�¼");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[4]/wx-textarea")).click();								 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[4]/wx-textarea")).click();
		Thread.sleep(2000);	
		
		Config.MobileNumAndCode.inputDescription(driver);
		Thread.sleep(3000);
		try{
			driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		
		findWindowHandle(driver, "�������ͼ�¼");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view[2]/wx-view")).click();
		Thread.sleep(3000);
		
		//verify ������
		findWindowHandle(driver, "��ǰά������");
		state = driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();
		System.out.println(state);		
		Assert.assertEquals("������", state);
		Thread.sleep(2000);
		
		System.out.println("ά�޶ˣ�ά�����");
		driver.quit();

	}
	
	@Test
	public void Step3BaoXiuTest() throws Exception{	
		
		setupDriver("ҽ��һ������");
		
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		System.out.println("3�����޶ˣ���ʼ����");

		findWindowHandle(driver, "��д����");
		Thread.sleep(2000);

		//��ҳ
		System.out.println("�����յĵ���������" + driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[4]/wx-view/wx-view[2]/wx-view[2]")).getText());
		
		//��������յ���
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-scroll-view/div/div/div/wx-view[1]/wx-view")).click();
		Thread.sleep(2000);
		//����ҳ�������һ��
		findWindowHandle(driver, "��������");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		
		findWindowHandle(driver, "������Ϣ");
		Thread.sleep(1000);
		
		String orderState = driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view[1]/wx-text[2]/span[2]")).getText();
		String orderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view[3]/wx-view[3]/wx-text[2]/span[2]")).getText();
		System.out.println("���޵�����:" + orderNo + ",״̬��:" + orderState);
		
		if (orderNo.equals(baoXiuOrderNo)){
			driver.findElement(By.xpath("/html/body/wx-view/wx-view/wx-view[2]/wx-view[2]")).click();
			Thread.sleep(2000);
			
			//System.out.println("���е�contexts:" + driver.getContextHandles());
			//�����ύ
			findWindowHandle(driver, "����");	
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[3]/wx-view[2]/wx-view")).click();	
			Thread.sleep(2000);			
			//�ϴ���Ƭ
			driver.context("NATIVE_APP");
			Thread.sleep(2000);	
			//���������ť
			driver.findElement(By.id("com.tencent.mm:id/pg")).click();
			Thread.sleep(2000);
			//ѡ��Screenshots
			driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
			Thread.sleep(2000);
			//Ĭ��ѡ�е�һ����Ƭ
			driver.findElement(By.id("com.tencent.mm:id/bws")).click();
			Thread.sleep(1000);
			//�����ɰ�ť
			driver.findElement(By.id("com.tencent.mm:id/ln")).click();
			Thread.sleep(6000);
			
			//�ύ
			driver.context("WEBVIEW_com.tencent.mm:appbrand0");
			Thread.sleep(2000);			
			findWindowHandle(driver, "����");
			Thread.sleep(2000);
			
			//�������
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[1]/wx-image[5]")).click();
			Thread.sleep(1000);
			//�������
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[3]/wx-text[1]")).click();
			Thread.sleep(3000);

			//��д����
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-textarea")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-textarea")).click();									 
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath(""));
			Config.MobileNumAndCode.inputDescription(driver);
			Thread.sleep(3000);
			//�ύ
			try{
				driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
				Thread.sleep(2000);
			}catch(Exception e){
				}

			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[5]")).click();
			Thread.sleep(2000);
		
		}else{
			System.out.println("���Ŵ���");
		}
		
		System.out.println("���޶ˣ��������");
		driver.quit();
	}
	
	@Test
	public void Step4WeiXiuTest() throws Exception{
		
		setupDriver("ҽ��ά������");
			
		driver.context("NATIVE_APP");
		Thread.sleep(1000);	
		System.out.println("4��ά�޶ˣ�ȷ������");
		
		driver.findElements(By.id("com.tencent.mm:id/om")).get(2).click();
		Thread.sleep(3000);

		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "��ǰά������");
		Thread.sleep(2000);
		
		//��� �鿴ά����ʷ
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[4]")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[4]")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		//������ʷ����
		findWindowHandle(driver, "�������");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-itembox[1]")).click();
		Thread.sleep(4000);
		//���뵥������
		findWindowHandle(driver, "������Ϣ");
		String orderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-text[2]/span[2]")).getText();												
		String orderState = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[1]/wx-view[5]/wx-text[2]/span[2]")).getText();
		if (orderNo.equals(baoXiuOrderNo)){
			
			System.out.println("���޵�����:" + orderNo + ", ״̬��:" + orderState);
			Assert.assertEquals("���������", orderState);
		}else{
			System.out.println("���Ŵ���");
		}
		
		driver.context("NATIVE_APP");
		Thread.sleep(1000);	
		driver.findElement(By.id("com.tencent.mm:id/q0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.tencent.mm:id/q0")).click();

		System.out.println("ά�޶ˣ�ȷ�����");
	}
	
	@AfterTest
	public void teardown(){
		System.out.println("Finished");
		//driver.close();
		//driver.quit();
	}
	
	// �������е�handles���ҵ���ǰҳ�����ڵ�handle�����pageSource�а�������Ҫ��Ԫ�أ�������Ҫ�ҵ�handle
	// С�����ҳ�������л�Ҳ��Ҫ���������е�handles���л���Ԫ�����ڵ�handle
	public void findWindowHandle(AndroidDriver driver, String element_text){
		
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
			if (driver.getPageSource().contains(element_text)) {
				loginFlag = true;
				//System.out.println("��λ�ɹ�");
				break;
			}
		}			
	}
	
	public void setupDriver(String miniProgram) throws Exception{
		
		DesiredCapabilities cap = DeviceInfo.getDefaultCapabilities();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"����\")").click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"С����\")").click();
		Thread.sleep(1000);
		if (miniProgram.equals("ҽ��һ������")){
			driver.findElementByAndroidUIAutomator("text(\"ҽ��һ������\")").click();		
		}
		if (miniProgram.equals("ҽ��ά������")){
			driver.findElementByAndroidUIAutomator("text(\"ҽ��ά������\")").click();		
		}
		Thread.sleep(1000);		
	}
	
}
