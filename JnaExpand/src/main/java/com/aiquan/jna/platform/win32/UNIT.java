package com.aiquan.jna.platform.win32;

public class UNIT {
	/**
	 * 创建一个窗口
	 */
	public static final int WM_CREATE = 0x0001;
	/**
	 * 当一个窗口被破坏时发送
	 */
	public static final int WM_DESTROY = 0x0002;
	/**
	 * 移动一个窗口
	 */
	public static final int WM_MOVE = 0x0003;
	/**
	 * 改变一个窗口的大小
	 */
	public static final int WM_SIZE = 0x0005;
	/**
	 * 一个窗口被激活或失去激活状态
	 */
	public static final int WM_ACTIVATE = 0x0006;
	/**
	 * 一个窗口获得焦点
	 */
	public static final int WM_SETFOCUS = 0x0007;
	/**
	 * 一个窗口失去焦点
	 */
	public static final int WM_KILLFOCUS = 0x0008;
	/**
	 * 一个窗口改变成Enable状态
	 */
	public static final int WM_ENABLE = 0x000A;
	/**
	 * 设置窗口是否能重画
	 */
	public static final int WM_SETREDRAW = 0x000B;
	/**
	 * 应用程序发送此消息来设置一个窗口的文本
	 */
	public static final int WM_SETTEXT = 0x000C;
	/**
	 * 应用程序发送此消息来复制对应窗口的文本到缓冲区
	 */
	public static final int WM_GETTEXT = 0x000D;
	/**
	 * 得到与一个窗口有关的文本的长度（不包含空字符）
	 */
	public static final int WM_GETTEXTLENGTH = 0x000E;
	/**
	 * 要求一个窗口重画自己
	 */
	public static final int WM_PAINT = 0x000F;
	/**
	 * 当一个窗口或应用程序要关闭时发送一个信号
	 */
	public static final int WM_CLOSE = 0x0010;
	/**
	 * 当用户选择结束对话框或程序自己调用ExitWindows函数
	 */
	public static final int WM_QUERYENDSESSION = 0x0011;
	/**
	 * 用来结束程序运行
	 */
	public static final int WM_QUIT = 0x0012;
	/**
	 * 当用户窗口恢复以前的大小位置时，把此消息发送给某个图标
	 */
	public static final int WM_QUERYOPEN = 0x0013;
	/**
	 * 当窗口背景必须被擦除时（例在窗口改变大小时）
	 */
	public static final int WM_ERASEBKGND = 0x0014;
	/**
	 * 当系统颜色改变时，发送此消息给所有顶级窗口
	 */
	public static final int WM_SYSCOLORCHANGE = 0x0015;
	/**
	 * 当系统进程发出WM_QUERYENDSESSION消息后，此消息发送给应用程序，通知它对话是否结束
	 */
	public static final int WM_ENDSESSION = 0x0016;
	/**
	 * 当隐藏或显示窗口是发送此消息给这个窗口
	 */
	public static final int WM_SHOWWINDOW = 0x0018;
	/**
	 * 发此消息给应用程序哪个窗口是激活的，哪个是非激活的
	 */
	public static final int WM_ACTIVATEAPP = 0x001C;
	/**
	 * 当系统的字体资源库变化时发送此消息给所有顶级窗口
	 */
	public static final int WM_FONTCHANGE = 0x001D;
	/**
	 * 当系统的时间变化时发送此消息给所有顶级窗口
	 */
	public static final int WM_TIMECHANGE = 0x001E;
	/**
	 * 发送此消息来取消某种正在进行的摸态（操作）
	 */
	public static final int WM_CANCELMODE = 0x001F;
	/**
	 * 如果鼠标引起光标在某个窗口中移动且鼠标输入没有被捕获时，就发消息给某个窗口
	 */
	public static final int WM_SETCURSOR = 0x0020;
	/**
	 * 当光标在某个非激活的窗口中而用户正按着鼠标的某个键发送此消息给当前窗口
	 */
	public static final int WM_MOUSEACTIVATE = 0x0021;
	/**
	 * 发送此消息给MDI子窗口当用户点击此窗口的标题栏，或当窗口被激活，移动，改变大小
	 */
	public static final int WM_CHILDACTIVATE = 0x0022;
	/**
	 * 此消息由基于计算机的训练程序发送，通过 WH_JOURNALPALYBACK 的 hook 程序分离出用户输入消息
	 */
	public static final int WM_QUEUESYNC = 0x0023;
	/**
	 * 此消息发送给窗口当它将要改变大小或位置
	 */
	public static final int WM_GETMINMAXINFO = 0x0024;
	/**
	 * 发送给最小化窗口当它图标将要被重画
	 */
	public static final int WM_PAINTICON = 0x0026;
	/**
	 * 此消息发送给某个最小化窗口，仅当它在画图标前它的背景必须被重画
	 */
	public static final int WM_ICONERASEBKGND = 0x0027;
	/**
	 * 发送此消息给一个对话框程序去更改焦点位置
	 */
	public static final int WM_NEXTDLGCTL = 0x0028;
	/**
	 * 每当打印管理列队增加或减少一条作业时发出此消息
	 */
	public static final int WM_SPOOLERSTATUS = 0x002A;
	/**
	 * 当button，combobox，listbox，menu的可视外观改变时发送
	 */
	public static final int WM_DRAWITEM = 0x002B;
	/**
	 * 当button, combo box, list box, list view control, or menu item 被创建时
	 */
	public static final int WM_MEASUREITEM = 0x002C;
	/**
	 * 当the list box 或 combo box 被销毁或当某些项被删除通过LB_DELETESTRING,
	 * LB_RESETCONTENT,CB_DELETESTRING, or CB_RESETCONTENT消息
	 */
	public static final int WM_DELETEITEM = 0x002D;
	/**
	 * 此消息有一个LBS_WANTKEYBOARDINPUT风格的发出给它的所有者来响应WM_KEYDOWN消息
	 */
	public static final int WM_VKEYTOITEM = 0x002E;
	/**
	 * 此消息由一个LBS_WANTKEYBOARDINPUT风格的列表框发送给他的所有者来响应WM_CHAR消息
	 */
	public static final int WM_CHARTOITEM = 0x002F;
	/**
	 * 当绘制文本时程序发送此消息得到控件要用的颜色
	 */
	public static final int WM_SETFONT = 0x0030;
	/**
	 * 应用程序发送此消息得到当前控件绘制文本的字体
	 */
	public static final int WM_GETFONT = 0x0031;
	/**
	 * 应用程序发送此消息让一个窗口与一个热键相关连
	 */
	public static final int WM_SETHOTKEY = 0x0032;
	/**
	 * 应用程序发送此消息来判断热键与某个窗口是否有关联
	 */
	public static final int WM_GETHOTKEY = 0x0033;
	/**
	 * 此消息发送给最小化窗口，当此窗口将要被拖放而它的类中没有定义图标，应用程序能返回一个图标或光标的句柄，当用户拖放图标时系统显示这个图标或光标
	 */
	public static final int WM_QUERYDRAGICON = 0x0037;
	/**
	 * 发送此消息来判定 combobox 或 listbox 新增加的项的相对位置
	 */
	public static final int WM_COMPAREITEM = 0x0039;
	/**
	 * 显示内存已经很少了
	 */
	public static final int WM_COMPACTING = 0x0041;
	/**
	 * 发送此消息给那个窗口的大小和位置将要被改变时，来调用 setwindowpos 函数或其它窗口管理函数
	 */
	public static final int WM_WINDOWPOSCHANGING = 0x0046;
	/**
	 * 发送此消息给那个窗口的大小和位置已经被改变时，来调用setwindowpos函数或其它窗口管理函数
	 */
	public static final int WM_WINDOWPOSCHANGED = 0x0047;
	/**
	 * 当系统将要进入暂停状态时发送此消息
	 */
	public static final int WM_POWER = 0x0048;
	/**
	 * 当一个应用程序传递数据给另一个应用程序时发送此消息
	 */
	public static final int WM_COPYDATA = 0x004A;
	/**
	 * 当某个用户取消程序日志激活状态，提交此消息给程序
	 */
	public static final int WM_CANCELJOURNA = 0x004B;
	/**
	 * 当某个控件的某个事件已经发生或这个控件需要得到一些信息时，发送此消息给它的父窗口
	 */
	public static final int WM_NOTIFY = 0x004E;
	/**
	 * 当用户选择某种输入语言，或输入语言的热键改变
	 */
	public static final int WM_INPUTLANGCHANGEREQUEST = 0x0050;
	/**
	 * 当平台现场已经被改变后发送此消息给受影响的最顶级窗口
	 */
	public static final int WM_INPUTLANGCHANGE = 0x0051;
	/**
	 * 当程序已经初始化 windows 帮助例程时发送此消息给应用程序
	 */
	public static final int WM_TCARD = 0x0052;
	/**
	 * 此消息显示用户按下了F1，如果某个菜单是激活的，就发送此消息个此窗口关联的菜单，否则就发送给有焦点的窗口，如果当前都没有焦点，
	 * 就把此消息发送给当前激活的窗口
	 */
	public static final int WM_HELP = 0x0053;
	/**
	 * 当用户已经登入或退出后发送此消息给所有的窗口，当用户登入或退出时系统更新用户的具体设置信息，在用户更新设置时系统马上发送此消息
	 */
	public static final int WM_USERCHANGED = 0x0054;
	/**
	 * 公用控件，自定义控件和他们的父窗口通过此消息来判断控件是使用ANSI还是UNICODE结构
	 */
	public static final int WM_NOTIFYFORMAT = 0x0055;
	/**
	 * 当用户某个窗口中点击了一下右键就发送此消息给这个窗口
	 */
	public static final int WM_CONTEXTMENU = 0x007B;
	/**
	 * 当调用SETWINDOWLONG函数将要改变一个或多个 窗口的风格时发送此消息给那个窗口
	 */
	public static final int WM_STYLECHANGING = 0x007C;
	/**
	 * 当调用 SETWINDOWLONG 函数一个或多个 窗口的风格后发送此消息给那个窗口
	 */
	public static final int WM_STYLECHANGED = 0x007D;
	/**
	 * 当显示器的分辨率改变后发送此消息给所有的窗口
	 */
	public static final int WM_DISPLAYCHANGE = 0x007E;
	/**
	 * 此消息发送给某个窗口来返回与某个窗口有关连的大图标或小图标的句柄
	 */
	public static final int WM_GETICON = 0x007F;
	/**
	 * 程序发送此消息让一个新的大图标或小图标与某个窗口关联
	 */
	public static final int WM_SETICON = 0x0080;
	/**
	 * 当某个窗口第一次被创建时，此消息在WM_CREATE消息发送前发送
	 */
	public static final int WM_NCCREATE = 0x0081;
	/**
	 * 此消息通知某个窗口，非客户区正在销毁
	 */
	public static final int WM_NCDESTROY = 0x0082;
	/**
	 * 当某个窗口的客户区域必须被核算时发送此消息
	 */
	public static final int WM_NCCALCSIZE = 0x0083;
	/**
	 * 移动鼠标，按住或释放鼠标时发生
	 */
	public static final int WM_NCHITTEST = 0x0084;
	/**
	 * 程序发送此消息给某个窗口当它（窗口）的框架必须被绘制时
	 */
	public static final int WM_NCPAINT = 0x0085;
	/**
	 * 此消息发送给某个窗口仅当它的非客户区需要被改变来显示是激活还是非激活状态
	 */
	public static final int WM_NCACTIVATE = 0x0086;
	/**
	 * 发送此消息给某个与对话框程序关联的控件。正常情况下，windows 处理所有输入到此控件的箭头键和 TAB 键。通常响应
	 * WM_GETDLGCODE 消息，应用程序可以控制一个特定类型的输入和处理这个输入
	 */
	public static final int WM_GETDLGCODE = 0x0087;

	/**
	 * 当光标在一个窗口的非客户区内移动时发送此消息给这个窗口。非客户区为：窗体的标题栏及窗体的边框
	 */
	public static final int WM_NCMOUSEMOVE = 0x00A0;
	/**
	 * 当光标在一个窗口的非客户区同时按下鼠标左键时提交此消息
	 */
	public static final int WM_NCLBUTTONDOWN = 0x00A1;
	/**
	 * 当用户释放鼠标左键同时光标某个窗口在非客户区十发送此消息
	 */
	public static final int WM_NCLBUTTONUP = 0x00A2;
	/**
	 * 当用户双击鼠标左键同时光标某个窗口在非客户区十发送此消息
	 */
	public static final int WM_NCLBUTTONDBLCLK = 0x00A3;
	/**
	 * 当用户按下鼠标右键同时光标又在窗口的非客户区时发送此消息
	 */
	public static final int WM_NCRBUTTONDOWN = 0x00A4;
	/**
	 * 当用户释放鼠标右键同时光标又在窗口的非客户区时发送此消息
	 */
	public static final int WM_NCRBUTTONUP = 0x00A5;
	/**
	 * 当用户双击鼠标右键同时光标某个窗口在非客户区十发送此消息
	 */
	public static final int WM_NCRBUTTONDBLCLK = 0x00A6;
	/**
	 * 当用户按下鼠标中键同时光标又在窗口的非客户区时发送此消息
	 */
	public static final int WM_NCMBUTTONDOWN = 0x00A7;
	/**
	 * 当用户释放鼠标中键同时光标又在窗口的非客户区时发送此消息
	 */
	public static final int WM_NCMBUTTONUP = 0x00A8;
	/**
	 * 当用户双击鼠标中键同时光标又在窗口的非客户区时发送此消息
	 */
	public static final int WM_NCMBUTTONDBLCLK = 0x00A9;
	/**
	 * 按下一个键
	 */
	public static final int WM_KEYDOWN = 0x0100;
	/**
	 * 释放一个键
	 */
	public static final int WM_KEYUP = 0x0101;
	/**
	 * 按下某键，并已发出WM_KEYDOWN， WM_KEYUP消息
	 */
	public static final int WM_CHAR = 0x0102;
	/**
	 * 当用 translatemessage 函数翻译 WM_KEYUP 消息时发送此消息给拥有焦点的窗口
	 */
	public static final int WM_DEADCHAR = 0x0103;
	/**
	 * 当用户按住 ALT 键同时按下其它键时提交此消息给拥有焦点的窗口
	 */
	public static final int WM_SYSKEYDOWN = 0x0104;
	/**
	 * 当用户释放一个键同时 ALT 键还按着时提交此消息给拥有焦点的窗口
	 */
	public static final int WM_SYSKEYUP = 0x0105;
	/**
	 * 当WM_SYSKEYDOWN消息被TRANSLATEMESSAGE函数翻译后提交此消息给拥有焦点的窗口
	 */
	public static final int WM_SYSCHAR = 0x0106;
	/**
	 * 当WM_SYSKEYDOWN消息被TRANSLATEMESSAGE函数翻译后发送此消息给拥有焦点的窗口
	 */
	public static final int WM_SYSDEADCHAR = 0x0107;
	/**
	 * 在一个对话框程序被显示前发送此消息给它，通常用此消息初始化控件和执行其它任务
	 */
	public static final int WM_INITDIALOG = 0x0110;
	/**
	 * 当用户选择一条菜单命令项或当某个控件发送一条消息给它的父窗口，一个快捷键被翻译
	 * 当用户选择菜单中的项目后,将向窗体发送此消息. 窗体收到此消息后,再决定下一个行为。
	 */
	public static final int WM_COMMAND = 0x0111;
	/**
	 * 当用户选择窗口菜单的一条命令或当用户选择最大化或最小化时那个窗口会收到此消息
	 * 向窗体发送用户点击系统菜单消息. 窗体将响应这个消息 ,决定下个行为。
	 */
	public static final int WM_SYSCOMMAND = 0x0112;
	/**
	 * 发生了定时器事件
	 */
	public static final int WM_TIMER = 0x0113;
	/**
	 * 当一个窗口标准水平滚动条产生一个滚动事件时发送此消息给那个窗口，也发送给拥有它的控件
	 */
	public static final int WM_HSCROLL = 0x0114;
	/**
	 * 当一个窗口标准垂直滚动条产生一个滚动事件时发送此消息给那个窗口，也发送给拥有它的控件
	 */
	public static final int WM_VSCROLL = 0x0115;
	/**
	 * 当一个菜单将要被激活时发送此消息，它发生在用户菜单条中的某项或按下某个菜单键，它允许程序在显示前更改菜单
	 * 当菜单准备显示前,向窗体发送此消息, 窗体将初始化菜单项。
	 */
	public static final int WM_INITMENU = 0x0116;
	/**
	 * 当一个下拉菜单或子菜单将要被激活时发送此消息，它允许程序在它显示前更改菜单，而不要改变全部
	 */
	public static final int WM_INITMENUPOPUP = 0x0117;
	/**
	 * 当用户选择一条菜单项时发送此消息给菜单的所有者（一般是窗口）
	 */
	public static final int WM_MENUSELECT = 0x011F;
	/**
	 * 当菜单已被激活用户按下了某个键（不同于加速键），发送此消息给菜单的所有者
	 */
	public static final int WM_MENUCHAR = 0x0120;
	/**
	 * 当一个模态对话框或菜单进入空载状态时发送此消息给它的所有者，
	 * 一个模态对话框或菜单进入空载状态就是在处理完一条或几条先前的消息后没有消息它的列队中等待
	 */
	public static final int WM_ENTERIDLE = 0x0121;
	/**
	 * 在 windows
	 * 绘制消息框前发送此消息给消息框的所有者窗口，通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置消息框的文本和背景颜色
	 */
	public static final int WM_CTLCOLORMSGBOX = 0x0132;
	/**
	 * 当一个编辑型控件将要被绘制时发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置编辑框的文本和背景颜色
	 */
	public static final int WM_CTLCOLOREDIT = 0x0133;
	/**
	 * 当一个列表框控件将要被绘制前发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置列表框的文本和背景颜色
	 */
	public static final int WM_CTLCOLORLISTBOX = 0x0134;
	/**
	 * 当一个按钮控件将要被绘制时发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置按纽的文本和背景颜色
	 */
	public static final int WM_CTLCOLORBTN = 0x0135;
	/**
	 * 当一个对话框控件将要被绘制前发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置对话框的文本背景颜色
	 */
	public static final int WM_CTLCOLORDLG = 0x0136;
	/**
	 * 当一个滚动条控件将要被绘制时发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置滚动条的背景颜色
	 */
	public static final int WM_CTLCOLORSCROLLBAR = 0x0137;
	/**
	 * 当一个静态控件将要被绘制时发送此消息给它的父窗口 通过响应这条消息，所有者窗口可以 通过使用给定的相关显示设备的句柄来设置静态控件的文本和背景颜色
	 */
	public static final int WM_CTLCOLORSTATIC = 0x0138;
	/**
	 * 移动鼠标时发生
	 */
	public static final int WM_MOUSEMOVE = 0x0200;
	/**
	 * 按下鼠标左键
	 */
	public static final int WM_LBUTTONDOWN = 0x0201;
	/**
	 * 释放鼠标左键
	 */
	public static final int WM_LBUTTONUP = 0x0202;
	/**
	 * 双击鼠标左键,当鼠标在一个窗体范围内时，告诉此窗体鼠标左键已双击，返回值 0
	 */
	public static final int WM_LBUTTONDBLCLK = 0x0203;
	/**
	 * 按下鼠标右键
	 */
	public static final int WM_RBUTTONDOWN = 0x0204;
	/**
	 * 释放鼠标右键
	 */
	public static final int WM_RBUTTONUP = 0x0205;
	/**
	 * 双击鼠标右键
	 */
	public static final int WM_RBUTTONDBLCLK = 0x0206;
	/**
	 * 按下鼠标中键
	 */
	public static final int WM_MBUTTONDOWN = 0x0207;
	/**
	 * 释放鼠标中键
	 */
	public static final int WM_MBUTTONUP = 0x0208;
	/**
	 * 双击鼠标中键
	 */
	public static final int WM_MBUTTONDBLCLK = 0x0209;
	/**
	 * 当鼠标轮子转动时发送此消息个当前有焦点的控件
	 */
	public static final int WM_MOUSEWHEEL = 0x020A;

	/**
	 * 程序发送此消息给一个编辑框或combobox来删除当前选择的文本
	 */
	public static final int WM_CUT = 0x0300;
	/**
	 * 程序发送此消息给一个编辑框或combobox来复制当前选择的文本到剪贴板
	 */
	public static final int WM_COPY = 0x0301;

	/**
	 * 程序发送此消息给editcontrol或combobox从剪贴板中得到数据
	 */
	public static final int WM_PASTE = 0x0302;

	/**
	 * 程序发送此消息给editcontrol或combobox清除当前选择的内容；
	 */
	public static final int WM_CLEAR = 0x0303;

	/**
	 * 程序发送此消息给editcontrol或combobox撤消最后一次操作
	 */
	public static final int WM_UNDO = 0x0304;

	/**
	 * 按钮被点击消息
	 */
	public static final int BM_CLICK = 0x00F5;
	/**
	 * 可用于复选框/单选框。查看是否被选择了
	 */
	public static final int BM_GETCHECK = 0x00F0;
	/**
	 * 发送此消息，可返回 button 的状态，如是否被选择；是否可用（不可用就变灰了）
	 */
	public static final int BM_GETSTATE = 0x00F2;
	/**
	 * 如果已经选择了，发送此消息后，变为未选择，就是那个钩没被勾上
	 */
	public static final int BM_SETCHECK = 0x00F1;
	/**
	 * 设置 button 被点击状态。
	 */
	public static final int BM_SETSTATE = 0x00F3;

	/**
	 * 添加字符串到组合框。
	 */
	public static final int CB_ADDSTRING = 0x0143;
	/**
	 * 删除组合框中的条目，即 item 。
	 */
	public static final int CB_DELETESTRING = 0x0144;
	/**
	 * 得到组合框条目 item 的数目。
	 */
	public static final int CB_GETCOUNT = 0x0146;
	/**
	 * 返回组合框中被选条目在组合框中的位置，第一条为 0。 如果没有条目或出错，则返回 -1 。
	 */
	public static final int CB_GETCURSEL = 0x0147;
	/**
	 * 发送此消息，可判断组合框的下拉列表是否下拉。 如果是，返回非零值，不是，则返回 0 。
	 */
	public static final int CB_GETDROPPEDSTATE = 0x0157;
	/**
	 * 得到组合框的条目文本。返回值是这个文本的长度。
	 */
	public static final int CB_GETLBTEXT = 0x0148;
	/**
	 * 返回值是条目的文本的长度。
	 */
	public static final int CB_GETLBTEXTLEN = 0x0149;
	/**
	 * 插入字符串条目到组合框中。
	 */
	public static final int CB_INSERTSTRING = 0x014A;
	/**
	 * 清空组合框所有条目。
	 */
	public static final int CB_RESETCONTENT = 0x014B;
	/**
	 * 设置组合框被选条目。
	 */
	public static final int CB_SETCURSEL = 0x014E;
	/**
	 * 让组合框的下拉列表下拉，即显出所有条目。
	 */
	public static final int CB_SHOWDROPDOWN = 0x014F;

	/**
	 * 决定上一次操作是否可以 undo（撤消操作）。如果可以，则可发送 EM_UNDO 消息
	 */
	public static final int EM_CANUNDO = 0x00C6;
	/**
	 * 在多行控件中，找到最上层的可见的行号。此行号是相对于所有行的。
	 */
	public static final int EM_GETFIRSTVISIBLELINE = 0x00CE;
	/**
	 * 返回密码框的字符集，即查看密码。
	 */
	public static final int EM_GETPASSWORDCHAR = 0x00D2;
	/**
	 * 返回在可编辑控件中，被选择（高亮选择）的字符集的起点和终点的位置，用 SendMessage 的 wParam 参数返回起点位置，lParam
	 * 返回终点位置
	 */
	public static final int EM_GETSEL = 0x00B0;
	/**
	 * 用不同的字符串替换可编辑控件中的字符串。如果可编辑控件中没有字符串，则此消息变为添加字符串。如果 wParam 为
	 * TRUE，则本次操作允许撤消，FALSE 禁止撤消。
	 */
	public static final int EM_REPLACESEL = 0x00C2;
	/**
	 * 在可编辑控件中设置密码字符集，即用 * 代替
	 */
	public static final int EM_SETPASSWORDCHAR = 0x00CC;
	/**
	 * 发送操作撤消消息。
	 */
	public static final int EM_UNDO = 0x00C7;
	/**
	 * 获取编辑控件中输入的文字。
	 */
	public static final int EM_GETLINE = 0x00C4;
	/**
	 * 检索指定字符索引（索引编号从编辑框的第一个字符开始）所在的行索引
	 */
	public static final int EM_LINEFROMCHAR = 0x00C9;
	/**
	 * 在多行编辑控件中，检索某行首字符在编辑控件中的索引
	 */
	public static final int EM_LINEINDEX = 0x00BB;
	/**
	 * 设置编辑框用户可输入的最大字符数。wParam 为字符数，lParam 不使用(0L)
	 */
	public static final int EM_LIMITTEXT = 0x00C5;

	/**
	 * 在条目中添加字符串
	 */
	public static final int LB_ADDSTRING = 0x0180;
	/**
	 * 删除一个条目. 条目序号是从 0 开始的.
	 */
	public static final int LB_DELETESTRING = 0x0182;
	/**
	 * 得到条目总数.
	 */
	public static final int LB_GETCOUNT = 0x018B;
	/**
	 * 得到单选的列表框选项条目的序号
	 */
	public static final int LB_GETCURSEL = 0x0188;
	/**
	 * 判断列表框的条目是否被选上, 如果选上了,则返回 >0 的值。否则返回 0 ,表示用户没选择条目
	 */
	public static final int LB_GETSEL = 0x0187;
	/**
	 * 获得可多选的列表框中被选择的条目数
	 */
	public static final int LB_GETSELCOUNT = 0x0190;
	/**
	 * 返回可多选的列表框中被选条目的序号，可返回数组
	 */
	public static final int LB_GETSELITEMS = 0x0191;
	/**
	 * 得到列表框中的一个条目的文本
	 */
	public static final int LB_GETTEXT = 0x0189;
	/**
	 * 得到列表框中的一个条目的文本的长度
	 */
	public static final int LB_GETTEXTLEN = 0x018A;
	/**
	 * 在列表框中插入一个条目。如果成功，将返回插入后此条目的序号。
	 */
	public static final int LB_INSERTSTRING = 0x0181;
	/**
	 * 对单选的列表框，设定用户选择条目的具体值
	 */
	public static final int LB_SETCURSEL = 0x0186;
	/**
	 * 对多选的列表框，设定用户选择条目的具体值
	 */
	public static final int LB_SETSEL = 0x0185;
	/**
	 * 从列表框删除所有项目，wParam 和 lParam 参数均不使用（为 0）
	 */
	public static final int LB_RESETCONTENT = 0x0184;
	/**
	 * 设定列表框水平滚动范围。如果列表框宽度小于此值，则水平滚动条显现；如果列表框宽度大于等于此值，则水平滚动条是隐藏的。wParam
	 * 为所设的水平滚动范围（像素），lParam 不使用，为 0。没有返回值 注意：LB_SETHORIZONTALEXTENT
	 * 消息要起作用，列表框必须定义 WS_HSCROLL 样式
	 */
	public static final int LB_SETHORIZONTALEXTENT = 0x0194;

	/**
	 * 在列表框中设置制表位位置（即每列间距）为了应对 LB_SETTABSTOPS 消息，列表框必须已经拥有 LBS_USETABSTOPS 样式。
	 * wParam 指定制表位数量，lParam 为制表位整数数组（各列之间间隔，不必相等）如果 wParam 是 0，lParam 为
	 * NULL，默认制表位是 2 个对话框模板单位。如果 wParam 是 1，制表位为 lParam 指定的距离。如果超过 1，制表位将被设置为
	 * lParam 中的每个值（wParam 指定数量）
	 */
	public static final int LB_SETTABSTOPS = 0x0192;

}
