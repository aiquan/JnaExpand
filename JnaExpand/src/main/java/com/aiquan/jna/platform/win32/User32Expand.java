package com.aiquan.jna.platform.win32;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.W32APIOptions;

public interface User32Expand extends User32 {
	User32Expand INSTANCE = Native.loadLibrary("user32", User32Expand.class,
			W32APIOptions.DEFAULT_OPTIONS);

	/**
	 * 
	 * @param hWnd
	 *            类型：HWND 窗口程序将接收消息的窗口的句柄。如果此参数是HWND_BROADCAST（（HWND）0xffff），
	 *            则会将消息发送到系统中的所有顶级窗口，包括禁用或不可见的未知窗口，重叠窗口和弹出窗口;
	 *            但消息不会发送到子窗口。邮件发送受UIPI约束。 进程的线程可以将消息发送到较小或相同完整性级别的进程中的线程消息队列。
	 * @param msg
	 *            类型：int 要发送的消息。 有关系统提供的消息的列表，请参见UNIT类。(每个消息有不同的WPARAM,LPARAM)
	 * @param wParam
	 *            类型：WPARAM 额外的消息特定信息。 通常是一个与消息有关的常量值，也可能是窗口或控件的句柄。
	 * @param IParam
	 *            类型：LPARAM 额外的消息特定信息 通常是一个指向内存中数据的指针
	 * @return
	 */
	int SendMessage(HWND hWnd, int msg, WPARAM wParam, LPARAM IParam);
	/**
	 * 
	 * @param hWnd
	 * 类型：HWND 窗口程序将接收消息的窗口的句柄。
	 * @param msg
	 * 类型：int 适用于WM_SETTEXT
	 * @param length
	 * 类型：int 表示字符长度
	 * @param str
	 *类型:String 需要设置的字符串
	 * @return
	 */
	int SendMessage(HWND hWnd, int msg, WPARAM wParam, String str);
	/**
	 * 
	 * @param hWnd
	 * 类型：HWND 窗口程序将接收消息的窗口的句柄。
	 * @param msg
	 * 类型：int 适用于WM_GETTEXT
	 * @param length
	 * 类型：int 表示字符长度
	 * @param str
	 *类型:char[] 窗口文本的字符数组
	 * @return
	 */
	int SendMessage(HWND hWnd, int msg, int length, char[] str);
}
