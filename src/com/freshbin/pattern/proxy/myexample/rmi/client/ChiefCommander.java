package com.freshbin.pattern.proxy.myexample.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import com.freshbin.pattern.proxy.myexample.rmi.client.Commander;

/**
 *总指挥官类
 * 
 * @author freshbin
 * @date 2019年1月12日 上午10:10:57
 */
public class ChiefCommander {
	
	public static void main(String[] args) throws Exception {
		Commander commander = new ChiefCommander().getFrontCommander();
		
		if(commander == null) {
			throw new Exception();
		}
		
		Boolean flag = true;
		while (flag) {
			System.out.println();
			System.out.println("============总司令官，请指示!============");
			System.out.println("1:查看前方所剩军款数;");
			System.out.println("2:为前方送去十万元军款;");
			System.out.println("0:无指示,退出控制!");
			
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			switch (input) {
			case 0:
				System.out.println("已退出!");
				flag = false;
				break;
			case 1:
				Integer money = commander.getMoney();
				System.out.println("前方所剩军款:" + money + "万元!");
				break;
			case 2:
				String returnStr = commander.addTenMoney();
				System.out.println(returnStr);
				break;
			default:
				System.out.println("您输入有误，请重新输入!");
				break;
			}
			
		}
	}
	
	public Commander getFrontCommander() {
		Commander commander = null;
		try {
			commander = (Commander) Naming.lookup("rmi://127.0.0.1:6666/RemoteCommander");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return commander;
	}
}
