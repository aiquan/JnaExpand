package com.aiquan.jna.plaform.win32;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.aiquan.jna.platform.win32.UNIT;
import com.aiquan.jna.platform.win32.User32Expand;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;

public class User32ExpandTest {
	User32Expand user32=User32Expand.INSTANCE;
	
	//该测试需要打开记事本并填写相关内容
	@Test
	public void TestSendMessageGETTEXTLENGTH(){
		HWND hWnd=user32.FindWindow("Notepad", null);
		HWND edit =user32.FindWindowEx(hWnd, null, "Edit", null);
		int length=user32.SendMessage(edit, UNIT.WM_GETTEXTLENGTH, new WPARAM(0), new LPARAM(0));
		System.out.println(length);
	}
	@Test
	public void TestSendMessageGETTEXT(){
		HWND hWnd=user32.FindWindow("Notepad", null);
		HWND edit =user32.FindWindowEx(hWnd, null, "Edit", null);
		char[] str=new char[256];
		user32.SendMessage(edit, UNIT.WM_GETTEXT, str.length, str);
		System.out.println(str);
	}
	@Test
	public void TestSendMessageSETTEXT(){
		HWND hWnd=user32.FindWindow("Notepad", null);
		HWND edit =user32.FindWindowEx(hWnd, null, "Edit", null);
		String str="写个258114752字进去";
		user32.SendMessage(edit, UNIT.WM_SETTEXT, null,str);
		char[] c=new char[256];
		user32.SendMessage(edit, UNIT.WM_GETTEXT, c.length, c);
		System.out.println(Native.toString(c));
	}
	
	@Test
	public void TestFindWindow(){
		HWND hWnd=user32.FindWindow("Notepad", null);
		char[] winClass=new char[1024];
		user32.GetClassName(hWnd, winClass, winClass.length);
		String winClassStr=Native.toString(winClass);
		assertEquals(winClassStr,"Notepad");
	}
	@Test
	public void TestFindWindowFazzy() throws Throwable{
		String winText="无标题";
		Pointer data=new Memory(1024);
		data.setString(0, winText);
		WNDENUMPROC wndenumproc=new WNDENUMPROC() {
			
			@Override
			public boolean callback(HWND paramHWND, Pointer data) {
				char[] windowText = new char[512];
				user32.GetWindowText(paramHWND, windowText, 512);
				String wText = Native.toString(windowText);
				if (wText.contains(data.getString(0))) {
					System.out.println(wText);
					Native.free(Pointer.nativeValue(data));
					///Pointer.nativeValue(data, 0);
			//		user32.SetForegroundWindow(paramHWND);
					return false;
				}
				return true;
			}
		};
		
		System.out.println(user32.EnumWindows(wndenumproc, data));
	}

}
