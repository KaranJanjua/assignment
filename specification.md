# Tools for Software Development - Assignment 1

### Version 1.0

### Due date: Week 13 <TBD>

This is a group assignment. 
You can self-nominate your group members before the end of week 5, provided: 

- All members are required to be officially enrolled in the same practical session.
- Minimum of 3 students, maximum of 4 students.
- Email the course coordinator with your group members. (tim.simon@unisa.edu.au). 

Nominations fail to meet the requirement will be discarded. 

The remaining students will be placed into groups at the beginning of week 6. 

### Optional
You may wish to work on extensions of an already-existing, open-source project instead of the given code-base. Seek approval from the course coordinator, discuss, and we'll see what we can organize.

## Overview

1. You'll be cloning an existing repository <TBD>. This code is broken and buggy. 

2. Your group is welcome to use any of the online Git repository sites: 
	- gitlab
	- github
	- bitbucket
   You don't have to use any of these, but they may be valuable to you. 
	It's recommended that you use GitLab.com. 

3. Your group will have to find and use:
	- An issue tracker
	- 
3. Your group will have to find an issue tracker of some kind. 
	- gitlab/github/bitbucket have inbuilt issue trackers

On the gitlab project page milestones will need to be created to align with the milestones described in the
assignment, and issues will need to be correctly assigned to the right milestones.
Since programming is not the major focus of this course the list of bugs and some features are supplied in
the appendix. As a group you’ll need to create an ‘Issue’ on gitlab for each of these bugs and assign each
one to an individual team member. That team member will then be responsible for fixing the bug, leaving a
descriptive commit message, pushing their changes, and closing this issue. Once all issues for a particular
milestone have been fixed you’ll need to tag the current state in the git repository, then close the milestone
before starting on the issues for the next milestone.
The first milestone will be related to fixing bugs in the supplied code, the second milestone will be adding
features from the supplied list, and the third milestone will be adding features you choose as a group.
Additionally, two branches need to be created, the first will be an international translation (using google
translate) of milestone 1 that will be separately tagged. The second will be a branch to add a new feature
that will be merged back into the mainline before milestone 3.
Once milestone 3 has been reached a code review will be conducted to improve and optimise the code.
Two wiki pages will need to be created, one listing the changes made during the code review, and one
user manual detailing how to use the software.
A presentation covering your solution and the features you chose to add will be required in week 13.
This is a team-project to practice many of the team-development concepts and tools we covered in this
course. It is important to note that team members do not have equal marks. Individual contributions (such
as log stored in the gitlab server) will be considered across all assessment criteria.
The Scenario
The supplied code is the first alpha of a cash register program. Upon running the code the user is
prompted for their float (the amount of money in the cash register at the start of the day). The user then
enters a product name, product price, and the amount of cash tendered by a customer. The program then
prints to the screen the amount of change required by the customer and the balance of the cash in the
cash register. As milestones are met the program will gain in functionality.
Creating Your Account
Every student will need to create an account on the class gitlab server at:
http://130.220.208.173/
Please use your real name, your university email address as the email address, and your university
username as the username. Your password can be whatever you like.
Creating the Project, Milestones, and Initial Issues
note: It is recommended this stage is done as a group using a lab computer. note: In a collaborative
project communication is key - leave descriptive names and messages, and fill in as much information
as possible.
One member of the team will need to be designated the project leader. It will be under their account the
project will be created. The project name must be ‘assignment2­<your team name>’.
When first creating a project you’ll be reminded that you can’t push or pull to the repository until you
add an ssh key to your profile.
You’ll then need to add every other team member to the project, and create three milestones ­ version 1,
version 2, and version 3.
The list of bugs in the appendix will then need to be created as ‘issues’ associated with milestone 1 and
assigned to individual team members who will then be responsible for fixing the bug.
An ‘issue’ will need to be created for each of the ‘features’ also listed in the appendix. These issues will be
associated with milestone 2, and like the bugs will need to be assigned to individual team members.
Milestone 1: Fixing the Bugs (15%)
1. Clone your repository from gitlab
2. Download the starting code from the homepage
3. Add the starting code to your gitlab repository
4. Each team member will then need to clone the repository
5. Each team member then fixes the bugs assigned to them and uploads the changes 
6. Each team member must then close the issue assigned to them
7. Once all milestone 1 issues are resolved and the code has been checked to make sure then close
milestone 1 and tag the code as version1
Milestone 2: Adding Features (15%)
1. As before each user must add the features assigned to them, commit their code, and close the
issue.
2. The group member tasked with translating the application’s text prompts into another language will
need to create a new branch, and add the translation on this branch (google translate is fine). Once
the translation is complete this branch will be tagged, and the group member will push their
changes to the repository then return to the mainline without merging.
3. Once all milestone 2 issues have been closed, test the code, then tag it as version2 and close the
milestone.
Milestone 3: New Features (30%)
1. As a group you will need to choose new features to add functionality to your cash register program.
Try to be original and unique as these features will form much of your later presentation. Create
these features as ‘issues’ and assign them to team members.
2. Each team member should be responsible on a new feature. All new features should be discussed
among team members and should be interoperable as one project (as oppose to submitting
independent incompatible code.)
3. One feature must be developed on a separate branch before being merged back into the mainline.
4. Once all features have been completed and closed, test the code, tag it as version 3, then close
milestone 3.
Final Task: Code Review and Wiki Creation (20%)
1. Create a wiki page for the user manual instructing users how to download, install, and use your
software. All team members must contribute as the wiki history will be checked during marking.
2. Review the code of your application, look for improvements and optimisations. Create a second
wiki page that lists each change to the code and why it was done.
3. Create another wiki page to store the meeting minutes and/or major discussion outcome.
Presentation (20%)
A 5-minute powerpoint presentation is required for every student in the Week 13, penalty applies if the
presentation goes overtime. All internal students are required to attend the Week 13 practical class and
lecture for the presentation. External students will submit a voice recorded powerpoint slides.
The presentation should be mainly on
(1) the new feature each individual is focused on;
(2) software development tools used in your project.
The powerpoint file (and audio file for external students) needs to be added to the git repository by the due
date. After the due date the git repository and gitlab access will be blocked for marking (except for
students with pre-arranged extensions).
Your presentation filename should follow the given pattern. Penalty applies for incorrect filenames.
Appendix
Milestone 1
1. Can't compile using the Makefile
2. Spelling errors in prompts
3. Change value is not correct
4. Ending balance of cash register is not displaying
5. No dollar signs before cash values
Milestone 2
1. After entering the float present the user with a menu asking if they wish to exit, or process a
transaction. Loop back to this menu after processing a transaction.
2. Remove the display of the cash register balance after each transaction and only display at the end
when the user quits.
3. When processing a transaction allow multiple items to be bought at the same time by asking if all
items have been entered after entering the item name and cost. If the user says no then another
item is added to the transaction. If the user says yes the amount of cash tendered is requested and
change calculated.
4. After processing a transaction present an option to provide a receipt. If the customer says yes print
a receipt to the screen including the names and cost of all items bought, the total, the cash
tendered, and the change.
5. Modify the makefile to include creation of a jar file
6. Add a nice welcome message once the program is started.
7. Add eloquent error handling in the case of unexpected input from the user
8. Create a branch for an experimental version of the software in another language 
