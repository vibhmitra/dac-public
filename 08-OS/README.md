### Introduction to OS 
#### 2024-07-03 

### Operating System <img src='https://www.linuxfoundation.org/hubfs/Tux-flat-version.svg' width="40px"/>
-   **Acts as a middleman:** Manages communication between hardware and software.
-   **Resource boss:** Controls and allocates resources like CPU, memory, and storage.
-   **Application manager:** Runs applications and programs.
-   **Hardware dependent:** Designed for specific hardware architectures.
-   **Types for all needs:** Different OSes exist for desktops, mobiles, embedded systems, servers, and real-time tasks.
- Acts as Interface between HW and SW.

#### Types of OS
* By User Interface
	* Desktop and Mobile
	* Batch OS (. It prioritizes efficient use of system resources for large volumes of data processing, but user interaction is limited.)
	* CLI Based OS
* By Functionality
	* Real Time OS (flight control system, Drones, autonomous driving cars)
	* Embedded (Smartwatch, Calculators, Ovens, etc.)
	* Server (Windows Server, Linux Servers)
	* Network (Provides network services like file sharing, security, and user management for connected devices on a network.)
	* Distributer
		* Manages a network of computers as a single system. 
		* Data Centers and Cloud Computing.

#### Functions of OS
* Resource Management
* Process Management
* File Management
* Security
* User Interface / Command Interpreter
* Device Communication

#### Components of OS
* Process Management
* Memory Management
* File Management
* I/O Management
* Security Management
* Device Driver Management

#### Basic computer organization required for OS
* CPU
* Memory
* Secondary Memory
* I/O Devices
* Bus

#### User Space & Kernel Space
-   **Security & Stability:** User space and kernel space create a secure and stable environment within the operating system.
    
-   **Two Realms:**
    
    -   **User Space:** Where user applications run (web browsers, games). Limited access to resources for protection.
    -   **Kernel Space:** The privileged area (control room) that manages core functionalities (memory, processes, devices). Full access for complete control.
-   **CPU Modes:** Align with the spaces.
    
    -   **User Mode:** Applications operate here with limited privileges, relying on system calls to interact with the kernel.
    -   **Kernel Mode:** Higher privilege mode for critical tasks. System calls trigger a switch to kernel mode for secure execution.

#### System Call & System Interrupts [^1]
* **System Call:** a program running on a computer requests a service from the kernel.
* **System Interrupts:** A way for a process to alert the kernel that an event has occurred, like USB is connected give priority to that damn thing.
---
### Linux 🐧
* Unix-Like OS (or Kernel)
* Created by Linus Torvalds.
* A Free and Open Source software.

> Every thing is File in Linux

#### File Structure of Linux File System[^2]
* /bin - contains all binaries
* /boot - contains system boot related files
* /root - root files
* /dev - devices, external usb and devices will show here.(this is virtual directory)
* /etc - Old definition : *dump all stuff here*, New Definition: *Every thing to configure*. 😜
* /home - Users personal space.
* /lib - libraries are files containing code that your applications can use.
* /media - External storage will be automatically mounted Here.
* /mnt - Manually mounted storage devices or partitions (not use much these days)
* /opt - The _/opt_ directory is often where software you compile lives here.
* /proc - Process Info About CPU, System and Running Process. (virtual dir)
* /root - home directory of the superuser (kinda Virtual)
* /run - System processes use it to store temporary data.
* /sbin - Contains applications that only the superuser can run.
* /usr - contain applications, libraries, documentation, wallpapers, icons that need to be shared among applications.
* /srv - Contains data for servers.
* /sys - Contains information from devices connected to your computer like you can change brightness of the screen from here. (Virtual)
* /tmp - Temporary files (meh! 🤷‍♂️)
* /var - Contain data that changes frequently + Things like Logs

#### 2024-07-04
### Linux Shell and Shell Scripting[^3]
#### Basic Part of OS
*  **Kernel** - the chef | The System
* **Shell** - the waiter that takes order | Provides a command-line or menu interface for users to interact with the kernel.
	- CLI - (bash, powershell) <- Access via Terminal, Powershell
	- GUI - (Windows Shell)
* **Terminal** - the menu at table | Displays the shell's UI (think it of as older display screen)

#### Shells are available for Linux systems:
1. BASH - Bourne Again SHell (Cross Platform)
2. C-Shell - Uses a C Programming Language like Scripting Language
3. KSH (Korn SHell)

#### Why do we need shell scripts?
* To avoid repetitive work and automation
* System admins use shell scripting for routine backups.
* System monitoring
* Adding new functionality to the shell etc.

#### Basic Commands in Linux Bash Shell
**Navigation**
* `cd, cd .., cd <directory_name>` - change directory
* `user@ubuntu $` 👈 If you see '$' that means u logged in as NORMAL user
* `root@ubuntu #` 👈 If you see '#' that means u logged in as ROOT user
* `cd <dir name>` 👈 to move into the directory
* `cd ..` 👈 Go One Level up in directory
* `ls` - List files in directory
* `ls -l or ll` - Long List
* `ls -a` - List all files (including hidden one)
* `echo <string>` - Usually used to echo out the data into some file or whatever or just repeat it on screen.
* `pwd` - Print Working Directory
* `ln` - Creates *Physical Link* b/w two files. 
* `ln -s <file1> <file2>` - Creates *Symbolic Link* b/w two files.
* `man <cmd name>` - Shows **man**uals of supplied command.

**Files & Directory**
* `touch <filename>` **Creates** a new file
* for editing files we have basic utility - `VIM` or `nano`\
`nano <filename>`
* `mkdir <directory name>` 👈 Creates Directory
* **`cp`**  **Copy** Command
	- For Files - `cp <src file> <des file>`
	- For Dir - `cp <src dir> <des dir>`
	- Recursive Dir Copy - `cp -R <src> <des>`
* **`mv`** **Move** Command (or Rename Command)
	- `mv <src> <des>`  for moving
	- `mv <src filename> <des filename>` for renaming
* **`rm`** **Remove** Command
	- `rm <filename>` 👈 Deletes File
	- `rm -d <dir name>` 👈 Deletes Directory (Empty)
	- `rm -rf <dir name>` 👈 Remove recursively + forcefully (Full) Directory
	- `rm -i <file or dir name>`	👈 Will Ask Confirmation!

**Other Useful Commands**
* **`cat <filename>`** Command *catenate files* - will peek a file contents without opening it up.
* **`head <filename>`** - shows 10 lines (by default) of the file contents from start, override is possible by suppling no for lines with the command `head 5 <filename>`
* **`tail <filename>`** - shows 10 lines (by default) from bottom of file. 
* **`grep <expression to search>`** - Global Regular Expression, Basically used to search files.
* **pipe command `|`** - This command is used to pipe the output of one command to input of another command
* **`echo "hello" > mymessage.txt`** - output redirection
* **`echo "$(< mymessage.txt)"`** - input redirection

**Admin, User and Group**
* **`sudo`** command 
* For Other Commands Refer to this:\
	[![Manage User In Linux - NetworkChuck](https://img.youtube.com/vi/jwnvKOjmtEA/0.jpg)](https://www.youtube.com/watch?v=jwnvKOjmtEA)
 


[^1]:https://www.baeldung.com/cs/system-call-vs-system-interrupt#:~:text=the%20operating%20system.-,A%20system%20call%20is%20a%20call%20from%20user%20mode%20to,that%20an%20interruption%20has%20occurred.
[^2]: https://www.linuxfoundation.org/blog/blog/classic-sysadmin-the-linux-filesystem-explained
[^3]: [Bash For Beginners by Microsoft Developer YT Channel](https://www.youtube.com/watch?v=nrfwcbYJZfc&list=PLlrxD0HtieHh9ZhrnEbZKhzk0cetzuX7l)
