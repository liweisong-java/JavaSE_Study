package Test008;
/*
 * 接口的使用
 * 		接口使用上也满足多态性
 * 		接口，实际上就是定义了一种规范
 * 
 */
public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		Flash flash = new Flash();
		com.transferData(flash);
	}
}
class Computer{
	public void transferData(USB usb) {
		usb.start();
		
		System.out.println("具体传输数据细节");
		
		usb.stop();
		
	}
}
interface USB{
	//常量：定义了长，宽，最大最小的输出等
	void start();
	
	void stop();
	
}
class Flash implements USB{
	public void start() {
		System.out.println("U盘开启工作");
	}
	
	public void stop() {
		System.out.println("U盘结束工作");
	}
}
class Printer implements USB{
	public void start() {
		System.out.println("打印机开启工作");
	}
	public void stop(){
		System.out.println("打印机结束工作");
	}
}
