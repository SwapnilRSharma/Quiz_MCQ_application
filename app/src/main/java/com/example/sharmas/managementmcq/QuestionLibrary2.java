package com.example.sharmas.managementmcq;


public class QuestionLibrary2 {

    private String mQuestions2 [] = {
            "What is management?",
            "Out of the mentioned below, which is not the output of management?",
            "Principle of Management is contribution of:",
            "Following is not the principle of Management.",
            "Position, designation, seniority defines",
            "When many functions are controlled by a central authority, it is called as",
            "What is Esprit de Corps?",
            "First step in planning is",
            "First step in decision making is",
            "Management is there from",
            "Due to unity of direction",
            "The assignment of each grouping to a manager with the authority necessary to supervise it, is called as",
            "Control System having feedback is",
            "____________ is an activity which defines the steps of how and when work will be done effectively and efficiently.",
            "_____________ ensure that things fall within the standards defined by an organization and should not divert from it.",
            "Levels of Management are:",
            "Lower level include peoples loke:",
            "Principles proposed by Henry Fayol are__________",
            "______results into better output in terms of work.",
            "______________is given to a manager (supervisor) to get the work done from his or her subordinates.",
            "_________mainly focuses on the specific authority that guides subordinate about what work has to be done and how it has to be done.",
            "Good __________ or salaries motive people to work efficiently and make them satisfied and eventually they become loyal to the organization.",
            "___________ refers to the planning, Only planning is not sufficient, It is to be ensured that work is done as per the plan made.",
            "Managers who are responsible for making organization-wide decisions and establishing the plans and goals that affect the entire organization are _____________.",
            "All levels of management between the supervisory level and the top level of the organization are termed _____________.",
            "Executive vice president, president, managing director, chief operating officer, chief executive officer, or chairman of the board are positions associated with which of the following levels of management?",
            "_____________ is the process of getting activities completed efficiently and effectively with and through other people.",
            "Which of the following is NOT a core function of management?",
            "Monitoring and correcting ongoing activities that facilitate goal attainment id defines as",
            "Motivating members of the organization to work in the best interests of the organization is defined as",
            "Determining how best to group activities and resources is defined as",
            "________ is the process of locating, identifying, and attracting capable applicants.",
            "\"Management is getting things done by other\" is said by –",
            "Henry Fayol has given ____ principles of management.",
            "Remuneration is not based on",
            "Why Planning Fails?",
            "The author of principles of scientific management was:",
            "Which theory was put forwarded by F.W. Taylor?",
            "According to Fayol‟s 14 principles of management, „Esprit De Corps‟ refers to which of the following:",
            "Planning Means-",

    };
    private String mChoices2 [][] = {
            {"It is science","It is Art","a & b are wrong","a & b are correct"},
            {"Desired Result","Goal Achievement","Technology","Status in market"},
            {"Adam Smith","Henry Fayol","Mery Parker","F.W. Taylor"},
            {"Initiative","Scalar Chain","Staffing","Responsibility"},
            {"Centralization","Initiative","Authority","Scalar Chain"},
            {"Authority","Management","Discipline","Centralization"},
            {"It is function of management","It is principle of management","It is management concept is Russia","It is name of company"},
            {"Establish goal","Identify resources","Prioritize goals","Establish Task"},
            {"Recognize the problem","Evaluation","Analysis","Finding out alternatives"},
            {"After 1700","After 1800","After 1900","Historical Period"},
            {"Deviation from the defined path is prevented","Work is divided","Authority is delegated","Teams are formed"},
            {"Planning","Organizing","Staffing","Controlling"},
            {"Reverse System","Feedback Control","Open loop System","Closed loop System"},
            {"Planning","Organizing","Staffing","Controlling"},
            {"Planning","Organizing","Staffing","Controlling"},
            {"Strategical level","Tactical Level","Operational level","All of above"},
            {"Clerk","Supervisor","Data entry operator","All of the above"},
            {"Unity of direction","Remuneration of personnel","Centralization","All of the above"},
            {"Division of work","Authority and responsibility","Discipline","All of above"},
            {"Division of work","Authority and responsibility","Discipline","All of above"},
            {"Division of work","Authority and responsibility","Discipline","Unity of commands"},
            {"Unity of direction","Remuneration","Discipline","Unity of commands"},
            {"Scalar chain","Order","Equity","Initiative"},
            {"First-line managers","Top managers","Production managers","Research managers"},
            {"middle managers","first-line managers","Supervisors","Foremen"},
            {"team leaders","middle managers","first-line managers","top managers"},
            {"Leading","Management","Supervision","Controlling"},
            {"Planning","Organizing","Motivating","Leading"},
            {"Organizing","Planning and decision making","Controlling","Leading"},
            {"Organizing","Planning and decision making","Controlling","Leading"},
            {"Organizing","Planning and decision making","Controlling","Leading"},
            {"Downsizing","Human resource inventory report","Recruitment","Strategic human resource planning"},
            {"Henry Fayol","Mary Parker","Mascon","Drucker"},
            {"6","14","10","12"},
            {"Emotions","Performance","Designation","Responsibility"},
            {"Lack of knowledge","Insufficient data","Over confidence","All of the above"},
            {"F.W. Taylor","Harold Koontz","Mary Follet","None of these"},
            {"Management by objectives","Industrial Management","Functional Management","Scientific Management"},
            {"Being treated fairly and kindly.","Spirit of the corporation","Team work and harmony","Spirit of work"},
            {"Thinking before doing","Thinking after doing","Thinking during doing","All of the above"},

    };
    public int getLength(){
        return mQuestions2.length;
    }

    private String mCorrectAnswers2[] = {
            "a & b are correct",
            "Technology",
            "Henry Fayol",
            "Staffing",
            "Authority",
            "Centralization",
            "It is principle of management",
            "Establish goal",
            "Recognize the problem",
            "Historical Period",
            "Deviation from the defined path is prevented",
            "Organizing",
            "Closed loop System",
            "Staffing",
            "Controlling",
            "All of above",
            "All of the above",
            "All of the above",
            "Division of work",
            "Authority and responsibility",
            "Unity of commands",
            "Remuneration",
            "Initiative",
            "Top managers",
            "middle managers",
            "top managers",
            "Management",
            "Motivating",
            "Controlling",
            "Leading",
            "Organizing",
            "Recruitment",
            "Mary Parker",
            "14",
            "Emotions",
            "All of the above",
            "F.W. Taylor",
            "Scientific Management",
            "Team work and harmony",
            "Thinking before doing",
    };

    public String getQuestion(int a){
        String question = mQuestions2[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices2[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices2[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices2[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices2[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers2[a];
        return answer;
    }
}
