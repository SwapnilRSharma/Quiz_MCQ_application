package com.example.sharmas.managementmcq;


public class QuestionLibrary4 {

    private String mQuestions4 [] = {
            "Factory using power as per Factory Act is a premise of minimum",
            "Which is not included in the cause of accident due to worker?",
            "Disease contracted is an occupational disease peculiar to the employment such as silicosis to the foundry workers comes under the",
            "___ Disablement means disablement of temporary nature and which reduces the earning capacity of workman.",
            "Which is not included in \"Wage\" under Minimum Wages Act?",
            "Which factor does not cause accidents due to dangerous machines?",
            "This provision provides that female workers shall not be employed in any factory except between",
            "____ is of temporary nature and the earning capacity is reduced due to disablement temporarily",
            "Tsunami is",
            "____ is a person who has completed his 15th year of age but not completed 18th year of age",
            "Major amendments done in Factory Act in",
            "Crenches should be provided when there are more than ____ female workers of their kids of age below ____ years",
            "Workman`s Compensation Act is passed in",
            "Which is not included in the 'causes of accidents' due to nature?",
            "Injury after accident disables the affected worker forever is _________ accident",
            "Types of accidents are:",
            "Accidents because of management are:",
            "Reasons due to which non-machinery accidents may occur:",
            "Fire extinguishers should be kept at easily accessible places is the condition of__________",
            "Following is the health provision:",
            "__________ of factory means the person who has ultimate control over the affairs of the factory and where the said affairs are entrusted to a managing agent",
            "First- aid appliance is a ____________________",
            "Minimum wages need to be paid in the __________",
            "What happens in Fatal Accident?",
            "_____________ is a person who has completed 18 years.",
            "A Worker has used cutter instead of plier for doing some job and he gets a cut on his right hand. What is the cause of this accident classified as:",

    };
    private String mChoices4 [][] = {
            {"10 Workers","20 Workers","30 Workers","40 Workers"},
            {"Lack of concentration","Poor housekeeping","Mischievous behavior","Overconfidence"},
            {"Minimum Wages Act","Workmen’s Compensation Act","Indian Factory Act","Safety Act"},
            {"Permanent","Partial","Complete","Total"},
            {"Travelling allowance","PF","Gratuity","All"},
            {"Boiler","Unsafe Clothing","Prime Movers","Transmission system"},
            {"7 AM and 6 PM","6 AM and 7 PM","5 AM and 7 PM","6 AM and 5 PM"},
            {"Partial disablement","Total disablement","Permanent Disablement","None of the above"},
            {"Accident because of human","Accident because of Management","Accident because of bad weather","Accident because of Natural Disasters"},
            {"Adult","Adolescent","Child","Young Person"},
            {"1948","1952","1976","1991"},
            {"30, 6","25, 6","25, 9","100, 6"},
            {"1924","1950","1948","1934"},
            {"Floods","Heavy Rains","Gas Leakage","Temperature Strokes"},
            {"Fatal","Permanent","Major","None of above"},
            {"Fatal","Minor","Serious","All of the above"},
            {"Mental Distractions","Lack of training to workers.","Equipments for safety are not provided","Both b and c"},
            {"Age of Person","Harmful Substance","Toxic Gases","Unsafe clothing"},
            {"Safe material handling","Personal Protection Devices","Safe activities in the organization","Good house-keeping"},
            {"Fencing of machinery","Cleanliness","Washing Facilities","None of the above"},
            {"Worker","Factory","Occupier","None of the above"},
            {"Health Provisions","Safety Provisions","Welfare Provisions","Employment of young persons"},
            {"Cash","Cheque","Either a or b","None"},
            {"Hospitalization","Fractures","Disablement","Death"},
            {"Adult","Adoloscent","Child","Young Person"},
            {"Mechanical Factor","Environmental Factor","Human Cause","Technical Cause"},

    };
    public int getLength(){
        return mQuestions4.length;
    }

    private String mCorrectAnswers4[] = {
            "10 Workers",
            "Poor housekeeping",
            "Workmen’s Compensation Act",
            "Partial",
            "All",
            "Unsafe Clothing",
            "6 AM and 7 PM",
            "Partial disablement",
            "Accident because of Natural Disasters",
            "Adolescent",
            "1976",
            "30, 6",
            "1924",
            "Gas Leakage",
            "Permanent",
            "All of the above",
            "Both b and c",
            "Age of Person",
            "Personal Protection Devices",
            "Cleanliness",
            "Occupier",
            "Welfare Provisions",
            "Cash",
            "Death",
            "Adult",
            "Human Cause",

    };

    public String getQuestion(int a){
        String question = mQuestions4[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices4[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices4[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices4[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices4[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers4[a];
        return answer;
    }
}
