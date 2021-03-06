# ECommerce-DDD
Magenic Masters DDD Project ECommerce

I have delivered a relatively simplistic view of an ECommerce site.  My biggest takeaway from doing this project was noticing the lack of decent tooling 
to automate the generation of the charts from code.  Then again, I paid nothing for the tools I found so ...

I did externalize as much as I could.  I'm in full agreement of not trying to build the entire world when tools / systems already exist to do some of the 
more mundane and repetative tasks (fulfillment, payments, etc.)

As for persona's my idea was to create an abstract Person class that all types of users can be.  I would ultimately tie these to authorization.

My project structure is:

1) Code in the Code/src...folde  (Interfaces, Classes and Enums)
2) The diagrams folder includes the following views (context, container, api components and fulfillment componets) Class views (DDD Class Diagram is the 
  decent one, the ClassView.png is an attempt to generate from code using an IntelliJ plugin)
3) The dsl folder is the input to structurizr which generated the majority of the diagrams as mentioned in 2.  This was by far the best tool I encountered.

------------------------------------------------------------------------------------------------------------------------------------------
The ask:

1) Make a GitHub Repo -- DONE
2) Invite instructors (and team members if any) -- DONE
3) Pick a complex system to model -- DONE
4) Do a DDD using any/all of the followings:
  DDD Diagrams in UML/MS/C4
  Classes, Enums, etc. e.g. classes and namespaces
  SQL or other schema that represents the mapping of DDD to storage
5) As you work through the problem, PR the instructors
6) We'll provide feedback, and ultimately CE Credits
---------------------------------------------------------------------------------------------------------------------------------------------
Milestones:

June 6: 

  Setup environment / Initial investigation of tools (github, Structurizr, VSCode integration)
  Generation of Context View


Initial investigation notes:

Have done UML in the past, so wanting to try something new.  Going with C4

www.c4model.com
https://youtu.be/x2-rSnhpw0g

Will try https://structurizr.com/ as the modeling tool (Modeling as json or code -- will try the json first)
My private workspace: https://structurizr.com/workspace/67626

CLI Tool: https://github.com/structurizr/cli 

Language Reference: https://github.com/structurizr/dsl/blob/master/docs/language-reference.md

DSL Examples: https://github.com/structurizr/dsl/tree/master/examples

Cookbook / Readme: https://github.com/structurizr/dsl/blob/master/README.md

Styles: https://github.com/structurizr/dsl/blob/master/docs/language-reference.md#element-style

        https://github.com/structurizr/dsl/blob/master/docs/cookbook/element-styles/README.md


Command Line Example:
./structurizr.sh push -id <id> -key <key> -secret <secret> -workspace examples/big-bank-plc/internet-banking-system.dsl

id -- 67626
key and secret -- found in settings section of workspace
workspace file must have dsl extension

June 12:
  
  Rename / cleanup Context View
  Start container view

June 26:

  Added container view diagram
  
  Added component view
  
  Begin code modeling https://www.jetbrains.com/help/idea/class-diagram.html 
  
  Code Iris -- IntelliJ UML from code generation: https://stackoverflow.com/questions/41290430/using-code-iris-with-intellij-to-generate-class-diagram
  
June 27:
  
  Generated component view and added to git
  
  Added classes
  
July 3
  
  Read 1/4 of Domain Driven Reference
  
  Added more models 
  
  Researching how to better generate UML's from code
  
July 6
  
  Added fulfillment container and view
  
  Refactored code
  
  Added class diagram
  
July 11
  
  Went with Lucid Charts and manual adding of class diagram.
  
  Refactored some incorrect relationships within the model.
  
