package com.Assignment1;

import javax.swing.*;
import java.awt.*;

public class CongratulatoryPoster extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CongratulatoryPoster(String name, String company, String packageOffer) {
        setTitle("Congratulatory Poster");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(102, 178, 255));
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("CODE COVERAGE", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        titleLabel.setForeground(Color.WHITE);

        JLabel subTitleLabel = new JLabel("Java New Batch Starting from 1st June 2024", SwingConstants.CENTER);
        subTitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        subTitleLabel.setForeground(Color.WHITE);

        JLabel contactLabel = new JLabel("Contact Us: +91 9579703394", SwingConstants.CENTER);
        contactLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        contactLabel.setForeground(Color.WHITE);

        headerPanel.add(Box.createVerticalStrut(10));
        headerPanel.add(titleLabel);
        headerPanel.add(subTitleLabel);
        headerPanel.add(contactLabel);
        headerPanel.add(Box.createVerticalStrut(10));

        // Profile Section
        JPanel profilePanel = new JPanel();
        profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
        profilePanel.setBackground(Color.WHITE);

        JLabel profilePicture = new JLabel();
        profilePicture.setIcon(new ImageIcon("Rohit.jpeg")); // Replace with actual image path
        profilePicture.setHorizontalAlignment(SwingConstants.CENTER);
        profilePicture.setPreferredSize(new Dimension(150, 150));

        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 28));
        nameLabel.setForeground(new Color(0, 153, 51));

        JLabel companyLabel = new JLabel(company, SwingConstants.CENTER);
        companyLabel.setFont(new Font("Arial", Font.BOLD, 24));
        companyLabel.setForeground(Color.RED);

        JLabel packageLabel = new JLabel("Package - " + packageOffer, SwingConstants.CENTER);
        packageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        packageLabel.setForeground(new Color(64, 64, 64));

        profilePanel.add(Box.createVerticalStrut(20));
        profilePanel.add(profilePicture);
        profilePanel.add(Box.createVerticalStrut(10));
        profilePanel.add(nameLabel);
        profilePanel.add(Box.createVerticalStrut(5));
        profilePanel.add(companyLabel);
        profilePanel.add(Box.createVerticalStrut(5));
        profilePanel.add(packageLabel);

        // Congratulatory Section
        JPanel congratsPanel = new JPanel();
        congratsPanel.setBackground(new Color(230, 230, 250));
        congratsPanel.setLayout(new BoxLayout(congratsPanel, BoxLayout.Y_AXIS));

        JLabel congratsLabel = new JLabel("Heartiest Congratulations", SwingConstants.CENTER);
        congratsLabel.setFont(new Font("Cursive", Font.ITALIC, 24));
        congratsLabel.setForeground(new Color(138, 43, 226));

        JLabel messageLabel = new JLabel("From Moment to Proud Moment", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        messageLabel.setForeground(Color.DARK_GRAY);

        congratsPanel.add(Box.createVerticalStrut(10));
        congratsPanel.add(congratsLabel);
        congratsPanel.add(Box.createVerticalStrut(5));
        congratsPanel.add(messageLabel);
        congratsPanel.add(Box.createVerticalStrut(10));

        // Add Components to Frame
        add(headerPanel, BorderLayout.NORTH);
        add(profilePanel, BorderLayout.CENTER);
        add(congratsPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new CongratulatoryPoster("Rohit Dhandar", "Wipro", "8 Lakh"));
    }
}
