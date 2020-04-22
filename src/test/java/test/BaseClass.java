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
			
			setupDriver("医智一键报修");
//			
//			//System.out.println("所有的contexts:" + driver.getContextHandles());
//			
//			//转到webview
//			driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//			Thread.sleep(2000);
//			
//			//在所有的webview中都需要找到正确的handle
//			findWindowHandle(driver, "点击登录");
//			
//			//如果默认已经登录，则不运行下面代码
//			if (loginFlag){
//		
//				//主页：“点击登录”按钮
//				driver.findElement(By.xpath("/html/body/wx-view[2]/wx-view[1]/wx-view[1]/wx-button")).click();
//				Thread.sleep(2000);	
//				
//				//弹出页：“拒绝”按钮，转到native			
//				driver.context("NATIVE_APP");
//				Thread.sleep(1000);	
//				driver.findElement(By.id("com.tencent.mm:id/xh")).click();
//				
//				//手机号输入页：“手机号登录”。转到webview
//				driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//				Thread.sleep(2000);
//				
//				//在所有的webview中都需要找到正确的handle
//				findWindowHandle(driver, "医院登记");
//	
//				driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-input")).click();
//				Thread.sleep(2000);				
//				//输入电话号码
//				Config.MobileNumAndCode.inputMobileNum(driver);						
//				Thread.sleep(2000);	
//				//点击 获取 验证码
//				driver.findElement(By.xpath("/html/body/wx-view/wx-button")).click();
//				Thread.sleep(2000);	
//							
//				//验证码页：“手机验证码”。转到webview
//				System.out.println("所有的contexts:" + driver.getContextHandles());
//				driver.context("WEBVIEW_com.tencent.mm:appbrand0");
//				Thread.sleep(2000);
//				
//				//在所有的webview中都需要找到正确的handle
//				findWindowHandle(driver, "手机验证码");
//	
//				driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-input")).click();
//				Thread.sleep(2000);				
//				//输入验证码
//				Config.MobileNumAndCode.inputCode(driver);						
//				Thread.sleep(2000);	
//				//点击 登录
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
		
		System.out.println("1。报修端：开始报修");
		
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		//主页：点击 填写报修
		findWindowHandle(driver, "填写报修");		
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-view[2]")).click();
		Thread.sleep(3000);
		
		//设备列表页：选择灯管		
		findWindowHandle(driver, "快速检索设备设施");		
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
		//该分类已报修列表，选择新建报修
		loginFlag = false;
		findWindowHandle(driver, "新建报修");	
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
		
		//故障信息描述页
		findWindowHandle(driver, "故障描述");
		//点击 请选择所在位置
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-view[1]/wx-location/wx-input")).click();
		Thread.sleep(3000);
		//位置选择页，选择 开水间
		findWindowHandle(driver, "快速检索位置");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist[33]/wx-view/wx-view/wx-text")).click();
		Thread.sleep(4000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist/wx-view/wx-view[2]/wx-treelist[33]/wx-view/wx-view/wx-text")).click();
		}catch(Exception e){
			}
		
		//回到故障信息描述页
		findWindowHandle(driver, "故障描述");
		//点击上传照片
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[3]/wx-view[2]/wx-view")).click();
		Thread.sleep(3000);
				
		//System.out.println("所有的contexts:" + driver.getContextHandles());
		//上传照片
		driver.context("NATIVE_APP");
		Thread.sleep(2000);	
		//点击下拉按钮
		driver.findElement(By.id("com.tencent.mm:id/pg")).click();
		Thread.sleep(2000);
		//选择Screenshots
		driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
		Thread.sleep(2000);
		//默认选中第一张照片
		driver.findElement(By.id("com.tencent.mm:id/bws")).click();
		Thread.sleep(1000);
		//点击完成按钮
		driver.findElement(By.id("com.tencent.mm:id/ln")).click();
		Thread.sleep(6000);

		//填写故障描述
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		//故障信息描述页
		findWindowHandle(driver, "故障描述");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[1]/wx-view[3]/wx-textarea")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[1]/wx-view[3]/wx-textarea")).click();		
		Thread.sleep(2000);
		
		//输入故障描述
		Config.MobileNumAndCode.inputDescription(driver);
		Thread.sleep(5000);
		try{
			driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
			Thread.sleep(1000);
		}catch(Exception e){
			}
		//报修
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(1000);
		findWindowHandle(driver, "故障描述");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[3]/wx-view")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[3]/wx-view")).click();
			Thread.sleep(1000);
		}catch(Exception e){
			}
		Thread.sleep(2000);
		
		//消息，取消
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
		
		System.out.println("报修端：报修完成");
		driver.quit();
		
//		driver.context("NATIVE_APP");
//		Thread.sleep(2000);		
//		try{
//			driver.findElement(By.xpath("//*[@content-desc='关闭']")).click();
//			Thread.sleep(2000);
//		}catch(Exception e){
//			}
//		Thread.sleep(10000);
//		driver.findElementByAndroidUIAutomator("text(\"医智维修助手\")").click();
//		Thread.sleep(5000);
	}
	
	@Test
	public void Step2WeiXiuTest() throws Exception{
		
		setupDriver("医智维修助手");
		
		driver.context("NATIVE_APP");
		Thread.sleep(1000);		
		System.out.println("2。维修端：开始维修");
	
		driver.findElements(By.id("com.tencent.mm:id/om")).get(2).click();
		Thread.sleep(1000);	

		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "当前维修任务");
		Thread.sleep(2000);
		
		int i=1;
		int sum = driver.findElements(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem")).size();
		//System.out.println(sum);
		//选出Jamie总务维修 报修的灯管
		do{
			if(driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem["+i+"]/wx-view/wx-view[1]/wx-text/span[2]")).getText().equals("灯管 医保办公室") && 
					driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[2]/wx-taskitem"+i+"]/wx-view/wx-view[2]/wx-view[2]/wx-text[2]/span[2]")).getText().equals("Jamie总务维修 医保办公室"))
			{
				break;
			}
			i++;
		}while(i<sum);

		//领取
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
		
		//领取任务
		findWindowHandle(driver, "报修信息");
		baoXiuOrderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-text[2]/span[2]")).getText();
		System.out.println("报修单号是：" + baoXiuOrderNo);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]")).click();
		Thread.sleep(1000);
		
		//弹出菜单领取任务
		findWindowHandle(driver, "通知报修人员将在");
		driver.findElement(By.xpath("/html/body/wx-arrivaltime/wx-view/wx-view[2]/wx-view[3]")).click();
		Thread.sleep(2000);
		
		//主页点击已接单
		findWindowHandle(driver, "当前维修任务");
		//verify 已接单
		String state = 	driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();	
		System.out.println(state);		
		Assert.assertEquals("已接单", state);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view")).click();
		Thread.sleep(2000);
		
		//我已到达现场
		findWindowHandle(driver, "报修信息");
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view[2]/wx-view[2]")).click();
		Thread.sleep(2000);
		
		//主页点击维修中		
		findWindowHandle(driver, "当前维修任务");
		//verify 维修中
		state = driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem[1]/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();
		System.out.println(state);		
		Assert.assertEquals("维修中", state);
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem/wx-view")).click();
		Thread.sleep(2000);
		
		//故障已排除
		findWindowHandle(driver, "报修信息");
		
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-view[2]")).click();
		Thread.sleep(2000);
		
		//提交验收
		findWindowHandle(driver, "故障类型记录");
		Thread.sleep(2000);
		//点击上传图片
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[3]/wx-scroll-view/div/div/div/wx-view/wx-view[1]/wx-image")).click();		
		Thread.sleep(3000);
		
		//上传照片
		driver.context("NATIVE_APP");
		Thread.sleep(2000);	
		//点击下拉按钮
		driver.findElement(By.id("com.tencent.mm:id/pg")).click();
		Thread.sleep(2000);
		//选择Screenshots
		driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
		Thread.sleep(2000);
		//默认选中第一张照片
		driver.findElement(By.id("com.tencent.mm:id/bws")).click();
		Thread.sleep(1000);
		//点击完成按钮
		driver.findElement(By.id("com.tencent.mm:id/ln")).click();
		Thread.sleep(6000);
		
		//点击提交验收
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "故障类型记录");
		Thread.sleep(2000);
		//输入故障类型描述	
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
			
		//输入排除措施描述
		findWindowHandle(driver, "故障类型记录");
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
		
		findWindowHandle(driver, "故障类型记录");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/wx-view[2]/wx-view")).click();
		Thread.sleep(3000);
		
		//verify 待验收
		findWindowHandle(driver, "当前维修任务");
		state = driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[3]/wx-view[1]/wx-taskitem/wx-view/wx-view[1]/wx-view[2]/wx-view/wx-text/span[2]")).getText();
		System.out.println(state);		
		Assert.assertEquals("待验收", state);
		Thread.sleep(2000);
		
		System.out.println("维修端：维修完成");
		driver.quit();

	}
	
	@Test
	public void Step3BaoXiuTest() throws Exception{	
		
		setupDriver("医智一键报修");
		
		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		System.out.println("3。报修端：开始验收");

		findWindowHandle(driver, "填写报修");
		Thread.sleep(2000);

		//主页
		System.out.println("待验收的单子数量：" + driver.findElement(By.xpath("/html/body/wx-view[1]/wx-view[4]/wx-view/wx-view[2]/wx-view[2]")).getText());
		
		//点击待验收单子
		driver.findElement(By.xpath("/html/body/wx-view[1]/wx-scroll-view/div/div/div/wx-view[1]/wx-view")).click();
		Thread.sleep(2000);
		//详情页：点击下一步
		findWindowHandle(driver, "当次任务");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		
		findWindowHandle(driver, "报修信息");
		Thread.sleep(1000);
		
		String orderState = driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view[1]/wx-text[2]/span[2]")).getText();
		String orderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view[3]/wx-view[3]/wx-text[2]/span[2]")).getText();
		System.out.println("报修单号是:" + orderNo + ",状态是:" + orderState);
		
		if (orderNo.equals(baoXiuOrderNo)){
			driver.findElement(By.xpath("/html/body/wx-view/wx-view/wx-view[2]/wx-view[2]")).click();
			Thread.sleep(2000);
			
			//System.out.println("所有的contexts:" + driver.getContextHandles());
			//评价提交
			findWindowHandle(driver, "评价");	
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[3]/wx-view[2]/wx-view")).click();	
			Thread.sleep(2000);			
			//上传照片
			driver.context("NATIVE_APP");
			Thread.sleep(2000);	
			//点击下拉按钮
			driver.findElement(By.id("com.tencent.mm:id/pg")).click();
			Thread.sleep(2000);
			//选择Screenshots
			driver.findElements(By.id("com.tencent.mm:id/elg")).get(1).click();
			Thread.sleep(2000);
			//默认选中第一张照片
			driver.findElement(By.id("com.tencent.mm:id/bws")).click();
			Thread.sleep(1000);
			//点击完成按钮
			driver.findElement(By.id("com.tencent.mm:id/ln")).click();
			Thread.sleep(6000);
			
			//提交
			driver.context("WEBVIEW_com.tencent.mm:appbrand0");
			Thread.sleep(2000);			
			findWindowHandle(driver, "评价");
			Thread.sleep(2000);
			
			//点击五星
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[1]/wx-image[5]")).click();
			Thread.sleep(1000);
			//点击评价
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[3]/wx-text[1]")).click();
			Thread.sleep(3000);

			//填写评价
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-textarea")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-textarea")).click();									 
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath(""));
			Config.MobileNumAndCode.inputDescription(driver);
			Thread.sleep(3000);
			//提交
			try{
				driver.findElement(By.id("com.tencent.mm:id/a1_")).click();
				Thread.sleep(2000);
			}catch(Exception e){
				}

			driver.findElement(By.xpath("/html/body/wx-view/wx-scrollview/wx-view/wx-view[2]/wx-view[2]/wx-view[5]")).click();
			Thread.sleep(2000);
		
		}else{
			System.out.println("单号错误");
		}
		
		System.out.println("报修端：验收完成");
		driver.quit();
	}
	
	@Test
	public void Step4WeiXiuTest() throws Exception{
		
		setupDriver("医智维修助手");
			
		driver.context("NATIVE_APP");
		Thread.sleep(1000);	
		System.out.println("4。维修端：确认验收");
		
		driver.findElements(By.id("com.tencent.mm:id/om")).get(2).click();
		Thread.sleep(3000);

		driver.context("WEBVIEW_com.tencent.mm:appbrand0");
		Thread.sleep(2000);
		findWindowHandle(driver, "当前维修任务");
		Thread.sleep(2000);
		
		//点击 查看维修历史
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[4]")).click();
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("/html/body/wx-view/wx-taskpage/wx-view/wx-view[4]")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			}
		//进入历史详情
		findWindowHandle(driver, "搜索结果");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html/body/wx-view/wx-view[2]/wx-view/wx-itembox[1]")).click();
		Thread.sleep(4000);
		//进入单子详情
		findWindowHandle(driver, "报修信息");
		String orderNo = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[2]/wx-view[3]/wx-text[2]/span[2]")).getText();												
		String orderState = driver.findElement(By.xpath("/html/body/wx-view/wx-view[1]/wx-view[1]/wx-view[5]/wx-text[2]/span[2]")).getText();
		if (orderNo.equals(baoXiuOrderNo)){
			
			System.out.println("报修单号是:" + orderNo + ", 状态是:" + orderState);
			Assert.assertEquals("完成已评价", orderState);
		}else{
			System.out.println("单号错误");
		}
		
		driver.context("NATIVE_APP");
		Thread.sleep(1000);	
		driver.findElement(By.id("com.tencent.mm:id/q0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.tencent.mm:id/q0")).click();

		System.out.println("维修端：确认完成");
	}
	
	@AfterTest
	public void teardown(){
		System.out.println("Finished");
		//driver.close();
		//driver.quit();
	}
	
	// 遍历所有的handles，找到当前页面所在的handle：如果pageSource有包含你想要的元素，就是所要找的handle
	// 小程序的页面来回切换也需要：遍历所有的handles，切换到元素所在的handle
	public void findWindowHandle(AndroidDriver driver, String element_text){
		
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
			if (driver.getPageSource().contains(element_text)) {
				loginFlag = true;
				//System.out.println("定位成功");
				break;
			}
		}			
	}
	
	public void setupDriver(String miniProgram) throws Exception{
		
		DesiredCapabilities cap = DeviceInfo.getDefaultCapabilities();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"发现\")").click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"小程序\")").click();
		Thread.sleep(1000);
		if (miniProgram.equals("医智一键报修")){
			driver.findElementByAndroidUIAutomator("text(\"医智一键报修\")").click();		
		}
		if (miniProgram.equals("医智维修助手")){
			driver.findElementByAndroidUIAutomator("text(\"医智维修助手\")").click();		
		}
		Thread.sleep(1000);		
	}
	
}
