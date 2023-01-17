# Trust-Wallet-Automation Using Appium Java With POM Design Pattern

## 1. POM

This automation created using POM design pattern. What is POM? POM stands for Page Object Model. POM is a design pattern used to make automation. Where each page an application or website is used as its own class. This gives an advantage when one of a page's interface changes, then other classes will not be affected. 

## 2. Cucumber and Gherkin

Then for Scenario scripting, we will use Cucumber and Gherkin.<br/>
What is Cucumber? What is Gherkin?<br/>
**Cucumber** is a tool that supports BDD *(Behavior-Driven Development)*.<br/>
**Gherkin** is a set of grammar rules that makes plain text structured enough to be understood by Cucumber. Scenario scripts are written using Gherkin.<br/><br/>Reference: https://docs.cucumber.io/docs/guides/overview/

## 3. Preparation

| Factor        | Item                                                         |
| ------------ | ------------------------------------------------------------ |
| Editor       | Intellij IDEA Community (https://www.jetbrains.com/idea/download/#section=mac) |
| JDK          | JDK 8 (https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) |
| SDK          | Android SDK (https://developer.android.com/studio/archive)   |
| Tools        | Node.js (https://nodejs.org/dist/latest/)                    |
| Device       | Real device or emulator                                      |
| Dependencies | artifactId: `selenium-java`, groupId: `org.seleniumhq.selenium` <br />artifactId: `selenium-api`, groupId: `org.seleniumhq.selenium`<br />artifactId: `cucumber-junit`, groupId: `info.cukes`<br />artifactId: `cucumber-java`, groupId: `info.cukes`<br />artifactId: `cucumber-core`, groupId: `info.cukes`<br />artifactId: `gherkin`, groupId: `info.cukes`<br />artifactId: `java-client`, groupId: `io-appium`<br />artifactId: `testng`, groupId: `org.testng` |

## 4. Installation

#### General

Install Editor Intellij Idea Community, SDK, Tools, and JDK in computer.

#### Appium

#### Windows & Mac OS

1. Run terminal or command prompt
2. Type ```npm install -g appium``` 
3. Enter

#### Mac:

1. Run terminal
2. Type ```sudo npm install -g appium --unsafe-perm=true --allow-root``` 
3. Enter

## 5. Configuration

#### Windows:

###### JDK 8

1. Right-click My Computer > Properties > Advance system settings > Environment Variables > PATH > Edit 
2. Type `C:\Java\java-8\bin` 
3. Click Save

###### Android SDK

1. Right-click My Computer > Properties > Advance system settings > Environment Variables > PATH > Edit
2. Type ```C:\Android\Android-sdk\tools;C:\Android\Android-sdk\platform-tools;``` > Save
3. Create new variable  ```ANDROID_HOME``` then type: ```C:\Android\Android-sdk``` > Save

#### Windows & Mac OS

###### JDK 8

*Automatically set itself*

###### Android SDK

1. Run Terminal.

2. For Mac: Ketikkan ```sudo nano ~/.zhrc``` For Mac OS: ```sudo nano ~/.bash_profile``` 

3. On top row type

   ```
   export ANDROID_HOME=/Users/itworker/Library/Android/sdk
   export PATH="${ANDROID_HOME}/tools:${PATH}"
   export PATH="${ANDROID_HOME}/emulator:${PATH}"
   export PATH="${ANDROID_HOME}/platform-tools:${PATH}"
   ```

   *Path depend user computer.*

4. Then save

## 6. Project

#### Clone

Clone this repository using this command `https://github.com/Ebrahim-Mostafa/TrustWalletAutomation.git` in terminal or command prompt.

#### Intellij IDEA Configuration

Open this automation using Intellij IDEA.

##### Project Setting

1. Click File > Project Structure
2. Make sure JDK 8 is selected in Project SDK

##### Plugin

1. Search using keyword `cucumber for java`
2. Click Install
3. Repeat cucumber.steps 1-2 for plugin `gherkin`

## 7. Package & Class

### Project Structure

```
|-- test
		|-- java
				|-- pages
				|-- setups
				|-- cucumber.steps
		|-- resources
				|-- features
```

- `pages` package for all page classes.
- `setups` package for all automation configuration.
- `cucumber.steps` package for all page step definitions.
- `resources` package for all features or non java classes.

## 8. Running Automation

For running the automation, we can open scenario file. For example, we will run WelcomeTest scenarios:

1. Open `WelcomeTest.java class`
2. Right click one of scenario, then click Run.
3. Run from the terminal by using the following command `mvn clean test`:
   > mvn clean test -Dfile=testNG.xml <br />
   > mvn clean test -Dfile=CucumberTestRunner.xml 
4. Run from IntelliJ by adding testNG.xml file to the project configuration runner.


## 9. `Install Allure to generate reports:`

Open your windows PowerShell:<br />

One of the easiest ways to start PowerShell in Windows is using the Run window. Press Win + R keys on your keyboard, then type PowerShell and press Enter or click OK.<br />

Run these Commands:<br />

> Set-ExecutionPolicy RemoteSigned -scope CurrentUser <br />

> iex (new-object net.webclient).downloadstring('https://get.scoop.sh') <br />

In the above case, it was already installed, so you a message as 'Scoop is already installed'. You can run 'scoop update' to get the latest version any time, To install Allure, using Scoop, run the below command:<br />

> scoop install allure <br />

## Mac OS X Installation -<br />

>brew install allure

## Allure Report Generation Command - <br />
> allure serve target/allure-results