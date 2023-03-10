package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;

import javax.swing.border.MatteBorder;

import javax.swing.SwingConstants;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;

import entity.TaiKhoan;

import javax.swing.event.MenuDragMouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.event.MenuListener;
import java.awt.Toolkit;

public class ManHinhChinh extends JFrame implements MenuListener, ActionListener {

	/**
	 * 
	 */

	private JPanel contentPane;
	private JPanel jpnMenu;
	private JMenuBar menuBar;
	private JMenu mnHeThong;
	private JMenuItem mntmThongTin;
//	private JMenuItem mntmTaiKhoan;
	private JMenuItem mntmDangXuat;
	private JMenu mnDanhMuc;
	private JMenuItem mntmDoiMatKhau;
	protected JMenuItem mntmNhanVien;
	private JMenuItem mntmCongNhan;
	private JMenuItem mntmSanPham;
	private JMenuItem mntmTrinhDo;
	private JMenuItem mntmTayNghe;
	private JMenuItem mntmHeSoLuong;
	protected JMenuItem mntmLuongCB;
	protected JMenu mnXuLy;
	protected JMenuItem mntmTienLuong;
	protected JMenuItem mntmChamCong;
	protected JMenuItem mntmPhanCongCN;
	protected JMenuItem mntmCongDoanSX;
	protected JMenu mnTimKiem;
	private JMenu mnThongKe;
	protected JMenuItem mntmTKNhanVien;
	private JMenuItem mntmTKCongNhan;
	private JTabbedPane jpnNoidung;
	private FrmTKCongNhan frmTKCongNhan;
	private FrmTKNhanVien frmTKNhanVien;
	private FrmNhanVien frmNhanVien;
	private FrmCongNhan frmCongNhan;
	private FrmSanPham frmSanPham;
	private FrmChamCongNV frmChamCongNV;
	private FrmChamCongCN frmChamCongCN;
	private FrmCongDoanSanXuat frmCongDoanSX;
	private FrmTimKiemCN frmTimKiemCN;
	private FrmTimKiemNV frmTimKiemNV;
	private FrmPhanCongCN frmPhanCongCN;
	private FrmTienLuongCN frmTienluong;
	private FrmTienLuongNV frmTienLuongNV;
	private FrmTimKiemSP frmTimKiemSP;
//	private FrmThongTinTaiKhoan frmTTTaiKhoan;
	private FrmTrinhDo frmTrinhDo;
	private FrmTayNghe frmTayNghe;
	
	private JLabel lblTenDN;
	private TaiKhoan tk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhChinh frame = new ManHinhChinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManHinhChinh() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("hinh\\icons8-shoe-67.png"));
		setTitle("C??ng Ty Gi??y CK-D");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setBounds(100, 100, 1253, 787);
		setSize(1439, 850);
		setUndecorated(false);

		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		JMenu mnFile = new JMenu("File");
		menuBar_1.add(mnFile);
		JMenuItem mntmHome = new JMenuItem("Home");
		mnFile.add(mntmHome);
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		JMenu mnHelp = new JMenu("Help");
		menuBar_1.add(mnHelp);
		JMenuItem mntmAbout = new JMenuItem("about");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(211, 211, 211));
		jpnMenu.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		contentPane.add(jpnMenu, BorderLayout.NORTH);

		jpnNoidung = new JTabbedPane();
		jpnNoidung.setBorder(null);
		contentPane.add(jpnNoidung);
		jpnMenu.setLayout(new BorderLayout(0, 0));
		
//		menu t??n
		JMenuBar menuBar_2 = new JMenuBar();
		setJMenuBar(menuBar_2);
		lblTenDN = new JLabel("ADMIN");
		lblTenDN.setText(DangNhapGUI.tk.getTenDangNhap());
		lblTenDN.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		menuBar_2.add(lblTenDN);
		menuBar_2.add(lblTenDN);
				
		// Menu H???? th????ng
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(211, 211, 211));
		jpnMenu.add(menuBar);

		mnHeThong = new JMenu("H???? th????ng");
		mnHeThong.setIcon(new ImageIcon("hinh\\iconSystem1.png"));
		mnHeThong.setHorizontalAlignment(SwingConstants.CENTER);
		mnHeThong.setForeground(new Color(0, 0, 0));
		mnHeThong.setFont(new Font("Times New Roman", Font.BOLD, 22));
		mnHeThong.setMnemonic(KeyEvent.VK_F1);// -----------------------
		menuBar.add(mnHeThong);

//		mntmThongTin = new JMenuItem("Th??ng tin");
//		mntmThongTin.setIcon(new ImageIcon("hinh\\info.png"));
//		mntmThongTin.setHorizontalAlignment(SwingConstants.CENTER);
//		mntmThongTin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mntmThongTin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));
//		mnHeThong.add(mntmThongTin);

//		mntmTaiKhoan = new JMenuItem("Ta??i khoa??n");
//		mntmTaiKhoan.setIcon(new ImageIcon("hinh\\account.png"));
//		mntmTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mnHeThong.add(mntmTaiKhoan);

//		mntmDoiMatKhau = new JMenuItem("?????i m???t kh???u");
//		mntmDoiMatKhau.setIcon(new ImageIcon("hinh\\icons8-lock-24.png"));
//		mntmDoiMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mntmDoiMatKhau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, ActionEvent.CTRL_MASK));
//		mnHeThong.add(mntmDoiMatKhau);

		mntmDangXuat = new JMenuItem("????ng xu????t");
		mntmDangXuat.setIcon(new ImageIcon("hinh\\logout.png"));
		mntmDangXuat.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmDangXuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		mnHeThong.add(mntmDangXuat);

//		JSeparator separator = new JSeparator();
//		menuBar.add(separator);

		// Menu Danh Mu??c
		mnDanhMuc = new JMenu("Danh mu??c");
		mnDanhMuc.setIcon(new ImageIcon("hinh\\icondanhMuc.png"));
		mnDanhMuc.setForeground(new Color(0, 0, 0));
		mnDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 22));
		menuBar.add(mnDanhMuc);

		mntmNhanVien = new JMenuItem("Nh??n vi??n");
		mntmNhanVien.setIcon(new ImageIcon("hinh\\nv.png"));
		mntmNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmNhanVien.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, ActionEvent.ALT_MASK));
		mnDanhMuc.add(mntmNhanVien);

		mntmCongNhan = new JMenuItem("C??ng nh??n");
		mntmCongNhan.setIcon(new ImageIcon("hinh\\construction-worker.png"));
		mntmCongNhan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmCongNhan.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
		mnDanhMuc.add(mntmCongNhan);

		mntmSanPham = new JMenuItem("Sa??n ph????m");
		mntmSanPham.setIcon(new ImageIcon("hinh\\box.png"));
		mntmSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmSanPham.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		mnDanhMuc.add(mntmSanPham);

		mntmTrinhDo = new JMenuItem("Tr??nh ?????");
		mntmTrinhDo.setIcon(new ImageIcon("hinh\\iconTrinhDo.png"));
//		mntmSanPham.setIcon(new ImageIcon("hinh\\box.png"));
		mntmTrinhDo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmTrinhDo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, ActionEvent.ALT_MASK));
		mnDanhMuc.add(mntmTrinhDo);

		mntmTayNghe = new JMenuItem("Tay Ngh???");
		mntmTayNghe.setIcon(new ImageIcon("hinh\\iconTayNghe.png"));
//		mntmSanPham.setIcon(new ImageIcon("hinh\\box.png"));
		mntmTayNghe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmTayNghe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
		mnDanhMuc.add(mntmTayNghe);

//		mntmHeSoLuong = new JMenuItem("H??? S??? L????ng");
//		mntmHeSoLuong.setIcon(new ImageIcon("hinh\\iconHSL.png"));
//		mntmSanPham.setIcon(new ImageIcon("hinh\\box.png"));
//		mntmHeSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mntmHeSoLuong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.CTRL_MASK));
//		mnDanhMuc.add(mntmHeSoLuong);
//		mntmLuongCB = new JMenuItem("L????ng c?? ba??n");
//		mntmLuongCB.setIcon(new ImageIcon("hinh\\salary.png"));
//		mntmLuongCB.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mntmLuongCB.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, ActionEvent.ALT_MASK));
//		mnDanhMuc.add(mntmLuongCB);

		// Menu X???? Ly??
		mnXuLy = new JMenu("X???? ly??");
		mnXuLy.setIcon(new ImageIcon("hinh\\iconXuli.png"));
		mnXuLy.setForeground(new Color(0, 0, 0));
		mnXuLy.setFont(new Font("Times New Roman", Font.BOLD, 22));
		menuBar.add(mnXuLy);

		mntmTienLuong = new JMenuItem("Ti????n l????ng");
		mntmTienLuong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmTienLuong.setIcon(new ImageIcon("hinh\\salary (1).png"));
		mntmTienLuong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, ActionEvent.ALT_MASK));
		mnXuLy.add(mntmTienLuong);

		mntmChamCong = new JMenuItem("Ch????m c??ng");
		mntmChamCong.setIcon(new ImageIcon("hinh\\timetable.png"));
		mntmChamCong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmChamCong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, ActionEvent.ALT_MASK));
		mnXuLy.add(mntmChamCong);

		mntmPhanCongCN = new JMenuItem("Ph??n c??ng");
		mntmPhanCongCN.setIcon(new ImageIcon("hinh\\assignment.png"));
		mntmPhanCongCN.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmPhanCongCN.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, ActionEvent.ALT_MASK));
		mntmPhanCongCN.setSelected(false);
		mnXuLy.add(mntmPhanCongCN);

		mntmCongDoanSX = new JMenuItem("C??ng ??oa??n sa??n xu????t");
		mntmCongDoanSX.setIcon(new ImageIcon("hinh\\engineering.png"));
		mntmCongDoanSX.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmCongDoanSX.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F9, ActionEvent.ALT_MASK));
		mnXuLy.add(mntmCongDoanSX);

		mnTimKiem = new JMenu("Ti??m Ki????m");
		mnTimKiem.setIcon(new ImageIcon("hinh\\iconTimKiem.png"));
		mnTimKiem.setForeground(new Color(0, 0, 0));
		mnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 22));
		menuBar.add(mnTimKiem);

		mnThongKe = new JMenu("Th????ng k??");
		mnThongKe.setIcon(new ImageIcon("hinh\\pngtree-statistics-vector-icon-png-image_3758948.jpg"));
		mnThongKe.setForeground(new Color(0, 0, 0));
		mnThongKe.setFont(new Font("Times New Roman", Font.BOLD, 22));
		menuBar.add(mnThongKe);

		mntmTKNhanVien = new JMenuItem("Th????ng k?? nh??n vi??n");
		mntmTKNhanVien.setIcon(new ImageIcon("hinh\\nv.png"));
		mntmTKNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmTKNhanVien.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, ActionEvent.ALT_MASK));
		mnThongKe.add(mntmTKNhanVien);

		mntmTKCongNhan = new JMenuItem("Th????ng k?? c??ng nh??n");
		mntmTKCongNhan.setIcon(new ImageIcon("hinh\\construction-worker.png"));
		mntmTKCongNhan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mntmTKCongNhan.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, ActionEvent.ALT_MASK));
		mnThongKe.add(mntmTKCongNhan);
//
//		mntmTKSanPham = new JMenuItem("Th????ng k?? s???n ph???m");
//		mntmTKSanPham.setIcon(new ImageIcon("hinh\\box.png"));
//		mntmTKSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		mntmTKSanPham.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, ActionEvent.ALT_MASK));
//		mnThongKe.add(mntmTKSanPham);

		tk = new TaiKhoan();
		// ????ng ky?? s???? ki????n

		// menu Th???ng k??
		mntmTKNhanVien.addActionListener(this);
		mntmTKCongNhan.addActionListener(this);

//		mntmTKSanPham.addActionListener(this);
		// menu Danh mu??c
		mntmNhanVien.addActionListener(this);
		mntmCongNhan.addActionListener(this);
		mntmSanPham.addActionListener(this);
		mntmTrinhDo.addActionListener(this);
		mntmTayNghe.addActionListener(this);
//		mntmHeSoLuong.addActionListener(this);
//		mntmLuongCB.addActionListener(this);

		// Menu x???? ly??
		mntmChamCong.addActionListener(this);
		mntmCongDoanSX.addActionListener(this);
		mntmPhanCongCN.addActionListener(this);

		mntmTienLuong.addActionListener(this);

		// dang xuat, thoat
//		mntmThongTin.addActionListener(this);
//		mntmDoiMatKhau.addActionListener(this);
		mntmDangXuat.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				thoat();
			}
		});

//		S???? ki????n menu Ti??m ki????m
		mnTimKiem.addMenuListener(new MenuListener() {

			@Override
			public void menuSelected(MenuEvent e) {
				jpnNoidung.remove(jpnNoidung.getSelectedComponent());
				jpnNoidung.removeAll();
				try {
					frmTimKiemCN = new FrmTimKiemCN();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					frmTimKiemNV = new FrmTimKiemNV();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					frmTimKiemSP = new FrmTimKiemSP();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jpnNoidung.addTab("Nh??n Vi??n", frmTimKiemNV);
				jpnNoidung.addTab("C??ng Nh??n", frmTimKiemCN);
				jpnNoidung.addTab("S???n Ph???m", frmTimKiemSP);
			}

			@Override
			public void menuDeselected(MenuEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void menuCanceled(MenuEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(mntmTKNhanVien)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			frmTKNhanVien = new FrmTKNhanVien();
			jpnNoidung.addTab("Th???ng K?? Nh??n Vi??n", frmTKNhanVien);
		}
		if (o.equals(mntmTKCongNhan)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			frmTKCongNhan = new FrmTKCongNhan();
			jpnNoidung.addTab("Th???ng K?? C??ng Nh??n", frmTKCongNhan);
		}
//		if (o.equals(mntmTKSanPham)) {
//			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
//			jpnNoidung.removeAll();
//
//		}
		if (o.equals(mntmNhanVien)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmNhanVien = new FrmNhanVien();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Nh??n Vi??n", frmNhanVien);
		}
		if (o.equals(mntmCongNhan)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
//			jpnNoidung.setTitleAt(, "C??ng nh??n");
			frmCongNhan = new FrmCongNhan();
			jpnNoidung.addTab("C??ng Nh??n", frmCongNhan);
		}
		if (o.equals(mntmSanPham)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmSanPham = new FrmSanPham();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Sa??n Ph????m", frmSanPham);
		}
		if (o.equals(mntmTrinhDo)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmTrinhDo = new FrmTrinhDo();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Tr??nh ?????", frmTrinhDo);
		}
		if (o.equals(mntmTayNghe)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmTayNghe = new FrmTayNghe();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Tay Ngh???", frmTayNghe);
		}
//		if (o.equals(mntmHeSoLuong)) {
//			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
//			jpnNoidung.removeAll();
//			try {
//				frmHeSoLuong = new FrmHeSoLuong();
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			jpnNoidung.addTab("H??? S??? L????ng ", frmHeSoLuong);
//		}
//		if (o.equals(mntmLuongCB)) {
//			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
//			jpnNoidung.removeAll();
////			frmLuongCN = new FrmLuongCN();
//			try {
//				frmLuongNV = new FrmLuongNV();
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
////			jpnNoidung.addTab("C??ng nh??n", frmLuongCN);
//			jpnNoidung.addTab("Nh??n Vi??n", frmLuongNV);
//		}
		if (o.equals(mntmChamCong)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmChamCongNV = new FrmChamCongNV();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				frmChamCongCN = new FrmChamCongCN();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Nh??n Vi??n", frmChamCongNV);
			jpnNoidung.addTab("C??ng Nh??n", frmChamCongCN);
		}
		if (o.equals(mntmCongDoanSX)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmCongDoanSX = new FrmCongDoanSanXuat();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.removeAll();
			jpnNoidung.addTab("C??ng ??oa??n sa??n xu????t", frmCongDoanSX);
		}
		if (o.equals(mntmPhanCongCN)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			try {
				frmPhanCongCN = new FrmPhanCongCN();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jpnNoidung.addTab("Ph??n c??ng", frmPhanCongCN);
		}
		if (o.equals(mntmTienLuong)) {
			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
			jpnNoidung.removeAll();
			frmTienluong = new FrmTienLuongCN();
			jpnNoidung.addTab("Ti????n L????ng C??ng Nh??n", frmTienluong);
			frmTienLuongNV = new FrmTienLuongNV();
			jpnNoidung.addTab("Ti????n L????ng Nh??n Vi??n", frmTienLuongNV);
		}
//		if (o.equals(mntmDoiMatKhau)) {
//			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
//			jpnNoidung.removeAll();
//			try {
//				frmDoiMatKhau = new FrmDoiMatKhau();
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			jpnNoidung.addTab("?????i m???t kh???u", frmDoiMatKhau);
//
//		} 
//		if (o.equals(mntmThongTin)) {
//			jpnNoidung.remove(jpnNoidung.getSelectedComponent());
//			jpnNoidung.removeAll();
//			try {
//				frmTTTaiKhoan = new FrmThongTinTaiKhoan();
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			jpnNoidung.addTab("Th??ng Tin T??i Kho???n", frmTTTaiKhoan);
//		}
		else if (o.equals(mntmDangXuat)) {
//			this.setVisible(false);
//			DangNhapGUI frmDangNhap = new DangNhapGUI();
//			frmDangNhap.setVisible(true);

			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			int re = JOptionPane.showConfirmDialog(null, "B???n c?? ch???c ch???n mu???n ????ng xu???t ?", "Exit",
					JOptionPane.YES_NO_OPTION);
			if (re == JOptionPane.YES_OPTION) {
				this.setVisible(false);
				DangNhapGUI frmDangNhap = new DangNhapGUI();
				frmDangNhap.setVisible(true);
			}

		}
	}

	@Override
	public void menuSelected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	public void thoat() {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		int re = JOptionPane.showConfirmDialog(null, "B???n c?? ch???c ch???n mu???n tho??t ?", "Exit",
				JOptionPane.YES_NO_OPTION);
		if (re == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
