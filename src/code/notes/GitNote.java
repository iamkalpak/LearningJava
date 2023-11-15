package code.notes;

public class GitNote {
    /*
    Certainly! Here's a step-by-step guide to help you set up your project on GitHub from your local machine using IntelliJ:

    Create a GitHub Repository:
        Go to github.com and sign in to your account.
        Click on the "+" button on the top-right corner and select "New repository."
        Provide a name for your repository, choose its visibility (public or private), and add an optional description.
        Click on the "Create repository" button.

    Initialize Git in your Local Project:
        Open your project in IntelliJ.
        Go to the terminal window in IntelliJ (usually located at the bottom).
        Run the command git init to initialize Git in your project folder.

    Connect Your Local Project to the GitHub Repository:
        In the terminal, add the remote GitHub repository URL using the command:
        git remote add origin <repository_url>
        Replace <repository_url> with the URL of the GitHub repository you created in step 1.

    Stage and Commit Your Project Files:
        In IntelliJ, open the Git tool window by going to "View" -> "Tool Windows" -> "Git."
        Select the files you want to commit by checking the checkboxes next to them.
        Enter a commit message in the "Commit Message" field.
        Click on the "Commit" button to commit the changes.

    Push Your Local Project to GitHub:
        In the Git tool window, click on the "Push" button to push your changes to the remote GitHub repository.

Now your project is successfully set up on GitHub. You can pull it from any other machine by cloning the repository using the repository URL.

*****************************************************************************************************************

**1. Cloning to New PC**

Apologies for the confusion. If you want to clone only the "master" branch from your repository to another PC using IntelliJ, you can follow these steps:

    Open IntelliJ:
    Launch IntelliJ on the PC where you want to clone the repository.

    Open the Welcome Screen:
    If you already have a project open in IntelliJ, go to "File" -> "Close Project" to open the Welcome Screen.

    Clone the Repository:
    On the Welcome Screen, click on "Get from Version Control" or "Check out from Version Control" and select "Git" from the dropdown menu.

    Enter Repository URL:
    In the "URL" field, enter the URL of your repository. For example: https://github.com/your-username/your-repository.git

    Choose Directory:
    Choose the directory where you want to clone the repository on your local machine.

    Select Branch:
    After entering the repository URL, IntelliJ will fetch the available branches. Select the "master" branch from the list.

    Clone the Repository:
    Click on the "Clone" or "Clone Repository" button to start cloning the repository.

    Open Project:
    Once the cloning process is complete, IntelliJ will open the project with the "master" branch checked out.

Now you have successfully cloned the "master" branch of your repository to the new PC using IntelliJ. You can start working on the project on the new PC.


*********************************************************************************************
2. Cloning to new PC

To clone the "master" branch of your repository to another PC using IntelliJ, you can follow these steps:

    Open IntelliJ:
    Launch IntelliJ on the PC where you want to clone the repository.

    Open the Welcome Screen:
    If you already have a project open in IntelliJ, go to "File" -> "Close Project" to open the Welcome Screen.

    Clone the Repository:
    On the Welcome Screen, click on "Get from Version Control" or "Check out from Version Control" and select "Git" from the dropdown menu.

    Enter Repository URL:
    In the "URL" field, enter the URL of your repository. For example: https://github.com/your-username/your-repository.git

    Choose Directory:
    Choose the directory where you want to clone the repository on your local machine.

    Select Branch:
    In the "Branch" field, select the "master" branch.

    Clone the Repository:
    Click on the "Clone" or "Clone Repository" button to start cloning the repository.

    Open Project:
    Once the cloning process is complete, IntelliJ will open the project with the "master" branch checked out.

Now you have successfully cloned the "master" branch of your repository to the new PC using IntelliJ. You can start working on the project on the new PC.


**Merging branches**
To merge two branches in Git, you can follow these steps:

    Checkout the branch where you want to merge the changes:
    In your case, if you want to merge the changes from the "feature" branch into the "master" branch, you need to make sure you are currently on the "master" branch. You can use the following command to switch to the "master" branch:

git checkout master

Merge the changes from the other branch:
Once you are on the branch where you want to merge the changes, you can use the following command to merge the changes from another branch (in this case, the "feature" branch) into the current branch (the "master" branch):

sql

    git merge feature

    Resolve any merge conflicts:
    If there are any conflicting changes between the two branches, Git will prompt you to resolve them. Open the files with conflicts, manually resolve the conflicting changes, and save the files.

    Commit the merge changes:
    After resolving the conflicts, add the changes to the staging area using git add . and then commit the merge changes with a commit message using git commit.

    Push the merged branch:
    Finally, push the merged branch to the remote repository using git push.

These steps will merge the changes from the "feature" branch into the "master" branch. Make sure to replace "feature" with the actual name of the branch you want to merge.

Fetch : Pulls all the changes in the branch doesen't update files
Pull: Updates files as well with the changes in branch


    Learnt steps:
      To upload a Java project to git
        1. Create an empty repo without readme file.
        2. Copy the URL.
        3. Open IntelliJ create a new project and initialize it with git.
        4. Right click on project name -> Git -> Manage remotes
        5. Add the copied URL here and save.
        6. Now commit your changes by
            Right click on project name -> Git -> Commit
        7. Select files to commit and add commit message
        8. Push the code.

     Clone the above repo by
        1. Open welcome screen in IntelliJ.
        2. Get project from VCS.
        3. Happy Learning!



    */
}
