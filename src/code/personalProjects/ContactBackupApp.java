package code.personalProjects;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void backupContacts(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Contact contact : contacts) {
                writer.println(contact.getName() + "," + contact.getPhoneNumber());
            }
            System.out.println("Contacts backed up successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while backing up contacts: " + e.getMessage());
        }
    }

    public void restoreContacts(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String name = data[0];
                    String phoneNumber = data[1];
                    addContact(name, phoneNumber);
                }
            }
            System.out.println("Contacts restored successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while restoring contacts: " + e.getMessage());
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}

public class ContactBackupApp {
    private Frame mainFrame;
    private TextArea contactTextArea;

    private ContactManager contactManager;

    public ContactBackupApp() {
        contactManager = new ContactManager();
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Contact Backup App");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField(20);
        Label phoneLabel = new Label("Phone Number:");
        TextField phoneTextField = new TextField(20);
        Button addButton = new Button("Add Contact");
        Button backupButton = new Button("Backup Contacts");
        Button restoreButton = new Button("Restore Contacts");

        contactTextArea = new TextArea(10, 30);
        contactTextArea.setEditable(false);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String phoneNumber = phoneTextField.getText();
                contactManager.addContact(name, phoneNumber);
                updateContactTextArea();
                nameTextField.setText("");
                phoneTextField.setText("");
            }
        });

        backupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactManager.backupContacts("contacts_backup.csv");
            }
        });

        restoreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactManager.restoreContacts("contacts_backup.csv");
                updateContactTextArea();
            }
        });

        mainFrame.add(nameLabel);
        mainFrame.add(nameTextField);
        mainFrame.add(phoneLabel);
        mainFrame.add(phoneTextField);
        mainFrame.add(addButton);
        mainFrame.add(backupButton);
        mainFrame.add(restoreButton);
        mainFrame.add(contactTextArea);
        mainFrame.setVisible(true);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void updateContactTextArea() {
        StringBuilder sb = new StringBuilder();
        for (Contact contact : contactManager.getContacts()) {
            sb.append("Name: ").append(contact.getName()).append(", Phone: ").append(contact.getPhoneNumber()).append("\n");
        }
        contactTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        ContactBackupApp app = new ContactBackupApp();
    }
}


