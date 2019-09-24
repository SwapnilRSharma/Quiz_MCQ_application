package com.example.sharmas.managementmcq;


public class QuestionLibrary3 {

    private String mQuestions3 [] = {
            "Which are the aim of forming the organization",
            "Which statement is wrong",
            "Which is the first step is forming the organization",
            "Scalar organization is also known as",
            "Military type organization is seen in",
            "At which place the line organization is not possible",
            "Functional Organization is also called as",
            "Which is the aim of departmentation",
            "Which is not the type of departmentation",
            "Which is the principle of organization",
            "Element of organization are:",
            "The principles of organization are:",
            "__________ is one the simplest types of organization.",
            "Advantage of line and staff organization:",
            "Types of project organization:",
            "___________ means giving right work to the right person.",
            "A manager resolving conflict among organizational members is performing what function?",
            "The process of monitoring, comparing, and correcting is called _____________.",
            "The three essential managerial skills put forth by Katz include _____________.",
            "Which is not a type of communication?",
            "No. of subordinates a manager can supervise effectively is:",
            "Line and Staff organization is the modification of:",
            "All the partners have same status in:",
            "Supply of Human and material resources and helps to achieve the objective of business is:",
            "Advantages of Line organization are:",
            "The partner who contributes capital, shares, profit and losses of firm but does not contribute in day to day activities or affairs of the firm are called as:",
            "In Private limited company, no. of members are limited to",
            "----------- is the function of putting together the different parts of enterprise into working\n" +
                    "Order.",
            "Reliance Industries Ltd. Is a form of –",
            "In --------- type of organization the sub ordinates receive orders from their immediate Boss.",
            "Amul Dairy industries refers to which of the following company type:",
            "Following are the kinds of partners.",
            "Discipline starts from",
            "Which is incorrect type of partner?",
            "Maximum members in private limited company are –",
            "\"Achievement due to one, will be shared by all others\". This happens in",
            "The content of the communication is called:",
            "Which of the following is not a medium of transmission?",
            "Manuals and policy statements are referred to as:",
            "Suggestions for improvements from an employee in the accounting department is an example of:",

    };
    private String mChoices3 [][] = {
            {"Teamwork","Combined Effort","Responsibility on all","All are correct"},
            {"Organization is group of working people","It has aims & objectives","Organization has no boundaries","Organization is a system"},
            {"Assignment of duties","Aims are determined","Identifying activities","Formulating Plans"},
            {"Line Organization","Project Organization","Staff Organization","Functional Organization"},
            {"Line","Staff","Line & staff","Project"},
            {"Small workshop","Tiny Firms","Military department","Government Company"},
            {"Line","Staff","Project","None of above"},
            {"To distribute work","To make people specialized","To give freedom for each function","All the above"},
            {"By Product","By Function","By Process","By material Pattern"},
            {"Authority","Responsibility","Span of Control","ALL"},
            {"Set of defined objectives.","Well organized and coordinated group of people.","Proper division of work and labour.","All of the above"},
            {"Span of control","Division and grouping of work","Proper delegation of work","All of the above"},
            {"Line organization","Line and staff organization","Functional organization","All of the above"},
            {"Expert advice is available from specialist staff executives.","Perfect work division","No work overloading","All the above"},
            {"Function based","Project based","Matrix based","All of the above"},
            {"Delegation of authority","Responsibility","Effective Delegation","All of the above"},
            {"Controlling","Commanding","Directing","Leading"},
            {"Controlling","Coordinating","Leading","Organizing"},
            {"technical, human, and empirical","human, empirical, and conceptual","technical, interpersonal, and controlling","technical, human, and conceptual"},
            {"Voice Mail","Publications","Formal Presentations","Listening"},
            {"Scope of Supervisor","Span of Control","Focus of Supervisor","None of above"},
            {"Functional Organization","Staff Organization","Special Organization","Line Organization"},
            {"General Partnership","Nominal Partnership","Limited Partnership","None of the above"},
            {"Planning","Organization","Management","Control"},
            {"Easy communication among employees","Almost no confusion exists","Working speed is fast","All of the above"},
            {"Nominal Partner","Minor Partner","Sleeping Partner","Secret Partner"},
            {"100","150","50","60"},
            {"Planning","Management","Organization","Administration"},
            {"Single Ownership","Partnership","Private ltd.","Joint Stock Company"},
            {"Line organization","Line and staff organization","Functional organization","Product organization"},
            {"Private limited company","Ownership Company","Partnership company","Co-operative Company"},
            {"Active partner and Sleeping Partner","Owner and Distributor","Global Partner and Media Partner","Permanent Partner and Temporary Partner"},
            {"Bottom to Top","From Middle","Top to Bottom","None of Above"},
            {"Active Partner","General Partner","Sleeping Partner","Perfect Partner"},
            {"20","10","50","30"},
            {"General Partnership","Limited Partnership","Both a and b","None of the above"},
            {"message","noise.","media richness.","jargon(Nonsense)"},
            {"memos.","policy statements.","discussions.","none of the above."},
            {"upward communication.","horizontal communication.","downward communication.","none of the above."},
            {"upward communication.","horizontal communication.","downward communication.","the grapevine."},

    };
    public int getLength(){
        return mQuestions3.length;
    }

    private String mCorrectAnswers3[] = {
            "All are correct",
            "Organization has no boundaries",
            "Aims are determined",
            "Line Organization",
            "Line",
            "Government Company",
            "None of above",
            "All the above",
            "By material Pattern",
            "ALL",
            "All of the above",
            "All of the above",
            "Line organization",
            "All the above",
            "All of the above",
            "Effective Delegation",
            "Leading",
            "Controlling",
            "technical, human, and conceptual",
            "Publications",
            "Span of Control",
            "Line Organization",
            "General Partnership",
            "Management",
            "All of the above",
            "Sleeping Partner",
            "50",
            "Management",
            "Joint Stock Company",
            "Line organization",
            "Co-operative Company",
            "Active partner and Sleeping Partner",
            "Top to Bottom",
            "Perfect Partner",
            "50",
            "General Partnership",
            "message",
            "none of the above.",
            "downward communication.",
            "upward communication.",
    };

    public String getQuestion(int a){
        String question = mQuestions3[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices3[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices3[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices3[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices3[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers3[a];
        return answer;
    }
}
