package com.example.sharmas.managementmcq;


public class QuestionLibrary5 {

    private String mQuestions5 [] = {
            "Working Capital is also called as",
            "Buildings' is coming under",
            "Debentures are included in ______ source of finance.",
            "____ is the financial statement that summarizes a company‟s assets, liabilities and shareholders equity at a specific point of time",
            "Travel on cruise ships will be charge d under",
            "Suggest the appropriate types of sources for Middle Term Capital",
            "The ____ is an accounting and a taxation term",
            "____=Total Current Assets - Total Current Liabilites",
            "____ is universal lubricant which keeps enterprise dynamic",
            "According to F.W.Paich ____ can be defined as \" the provision of money at the time it is wanted\"",
            "______ is the study of relationship between the raising of finance and deployment of finance",
            "In balance sheet, we see, ______ equal to the sources of the funds",
            "Which source of income is specified under IT act, 1961",
            "Which is input to MRP",
            "________________ is process of dividing large organization into small and flexible administrative units",
            "___________ is a life-blood of business enterprise. It is a universal lubricant which keeps enterprise dynamic.",
            "__________ can be defined as goods or cash used to generate income from business or property.",
            "Examples of retained earnings are:",
            "___________ is a method of buying goods by making installment payments over a period of time.",
            "When foreign investors done huge sell of stocks back to its own country is referred as:",
            "Production budget is based upon:",
            "_________ can be defined as a resource with specific economic value that an individual, corporation or country owns or control.",
            "____________ is a direct tax which is paid by the individual to the central government of India is known as",
            "Which type of capital is used for all the current assets (Possession of property)?",
            "A statement which reflects future income and expenditure:",
            "Which of the following is not a direct tax?",
            "________________ is the financial snapshot of the organization.",
            "Which one of the following is not a current liability?",

    };
    private String mChoices5 [][] = {
            {"Fixed Capital","Circulating Capital","Floating Capital","Management Capital"},
            {"Fixed Capital","Circulating Capital","Floating Capital","Management Capital"},
            {"Long Term","Short Term","Medium Term","Single Term"},
            {"Balance Sheet","Profit and Loss Account","Snap Sheet","Budget"},
            {"Excise Tax","Income Tax","Service Tax","Value Added Tax"},
            {"Trade credit, Bank Credit","Equipment Leasing, Straight Term Loans","Sale and Lease Back, Loans","Credit Sales, Trade Credits"},
            {"Retained Earnings","Depreciation Provisions","Deferred Taxation","All of the Above"},
            {"Gross Working Capital","Net Working Capital","Permanent Working Capital","Temporary Working Capital"},
            {"Capital","Finance","Budget","VAT"},
            {"Capital","Finance","Budget","VAT"},
            {"Financing","Financial Deficit","Finance","Financial Management"},
            {"Assets","Expenditure","Savings","Liabilities"},
            {"Income from capital gains","Business profits","Salary","All of the above"},
            {"Current Forecasting","Bill of Material","On Hand Inventory","All of the above"},
            {"Defragmentation","Departmentation","Division Formation","None of the above"},
            {"Finance","Capital","Budget","VAT"},
            {"Finance","Capital","Budget","VAT"},
            {"Buying new machinery","Doing research","Development","All of the above"},
            {"Bank loans","Hire purchase","Sale and lease back","All of the above"},
            {"Bank Loans","Hire Purchase","Equipment Leasing","Profit Flow Back"},
            {"Sales budget","Factory Capacity (production and storage)","Budgeted stock requirements","All of the above"},
            {"Asset","Liability","Share","Debenture"},
            {"Direct Tax","Indirect Tax","Service Tax","Income Tax"},
            {"Gross Working Capital","Net Working Capital","Permanent Working Capital","Temporary Working Capital"},
            {"Budget","Profit and Loss","Balance Sheet","Cash Account"},
            {"Income Tax","Wealth Tax","Gift Tax","Service Tax"},
            {"Balance Sheet","Profit and Loss statement","Budget","Snap Sheet"},
            {"Short Term Borrowings","Trade Payables","Short Term Provisions","Long Term Provisions"},




    };
    public int getLength(){
        return mQuestions5.length;
    }

    private String mCorrectAnswers5[] = {
            "Circulating Capital",
            "Fixed Capital",
            "Long Term",
            "Balance Sheet",
            "Service Tax",
            "Equipment Leasing, Straight Term Loans",
            "Depreciation Provisions",
            "Net Working Capital",
            "Capital",
            "Finance",
            "Financial Management",
            "Assets",
            "All of the above",
            "All of the above",
            "Departmentation",
            "Capital",
            "Capital",
            "All of the above",
            "Hire purchase",
            "Profit Flow Back",
            "All of the above",
            "Asset",
            "Income Tax",
            "Gross Working Capital",
            "Profit and Loss",
            "Service Tax",
            "Balance Sheet",
            "Long Term Provisions",
    };

    public String getQuestion(int a){
        String question = mQuestions5[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices5[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices5[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices5[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices5[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers5[a];
        return answer;
    }
}
