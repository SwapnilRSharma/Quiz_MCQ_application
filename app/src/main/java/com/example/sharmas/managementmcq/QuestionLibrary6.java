package com.example.sharmas.managementmcq;


public class QuestionLibrary6 {

    private String mQuestions6 [] = {
            "___ include raw material and semi finished products supplied by another firm and which are raw items for the present industry.",
            "____Analysis helps in segregating the items from one another and tells how much values the item is and controlling it to what extent is in the interest of the organization.",
            "High quality items and C class items such as clips, pins, pencils etc. usually bought by",
            "_____ is an effective tool for minimizing unnecessary inventory investment",
            "JD Edward and PeopleSoft are examples of",
            "Suggest the appropriate inputs to MRP:",
            "The SAP ERP product is very popular for material management called as",
            "____ is one which allows lowest cost per unit and is most advantageous",
            "ABC Analysis plays a vital role in ____ management",
            "ERP Vendor is",
            "Calling quotations, order follow-up, material receiving, placing PO are the functions of ______________",
            "Central government is not dealing with",
            "Annual consumption of the items is represented by __________ in EOQ",
            "In purchasing, DGSD belongs to",
            "Effect of Innovation is _________ and effect of Kaizen is _______________",
            "Which is the first step in doing ABC analysis?",
            "What is an assumption in EOQ?",
            "The purchasing function can plays the role of mediator between _________ and _____________ for purchase of material.",
            "______ can be defined as an integrated information system that serves all departments within an enterprise.",
            "_________________ is a part of material management.",
            "________________ are the finished goods lying in stock rooms and waiting for diapatch.",
            "A sales person can access the warehouse, inventory and delivery to give a customer a quick update on status of his order through:",
            "Process flow chart helps to explain:",
    };
    private String mChoices6 [][] = {
            {"Raw Inventories","In-process inventories","Finished Inventories","Indirect inventories"},
            {"Financial","Inventory","Material","ABC"},
            {"Single Tender","Open Tender","Closed tender","Limited tender"},
            {"ERP","SAP","MRP","EOQ"},
            {"MRP Components","ERP Software Products","SAP Software Products","Inventory Products"},
            {"Master Distribution Schedule, Inventory File","Master Production Schedule, Inventory Record File","Master Sales Schedule, Inventory Sale File","Master Output Schedule, Inventory Bill File"},
            {"Material Requirement Planning","Enterprise Resource Planning","Material Resource Planning","Material Management Module"},
            {"Economic Order Quantity","Economic Order Quality","Equal Order Quantity","Equal Order Quality"},
            {"Finance","Inventory","Both (a) and (b)","Material"},
            {"SAP","ORACLE","PEOPLE SOFT","All of the above"},
            {"Purchase Department","Quality Department","Inventory Department","Marketing Department"},
            {"Income Tax","Sales Tax","Excise Duty","Custom Duty"},
            {"q0","S","A","AC"},
            {"Division General of Sales and Distribution","Defined Goods for Supply and Dispatch","Director General of Supplies and Disposals","None of the above"},
            {"Long Term, Short Term","Short Term, Long Term","Long Term, Long Term","Short Term, Short Term"},
            {"arranging the items","Determine unit price","Preparing the list of all items","None"},
            {"Lead time is known and is constant","Total Cost","Primary Cost","All of the above"},
            {"Vendors, control","Organization, Control","Vendors, Organization","Organization, Vendors"},
            {"MRP","MPR","ERP","EPR"},
            {"Inventory Management","Marketing Management","Both a & b","None of the above"},
            {"Raw Inventories","In-process inventories","Finished Inventories","Indirect inventories"},
            {"MRP","MPS","BOM","ERP"},
            {"Process steps and their relationships","Cost of quality","A clause in ISO 9001:2000","Customer Complaints"},




    };
    public int getLength(){
        return mQuestions6.length;
    }

    private String mCorrectAnswers6[] = {
            "Raw Inventories",
            "ABC",
            "Single Tender",
            "MRP",
            "ERP Software Products",
            "Master Production Schedule, Inventory Record File",
            "Material Management Module",
            "Economic Order Quantity",
            "Inventory",
            "All of the above",
            "Purchase Department",
            "Sales Tax",
            "S",
            "Director General of Supplies and Disposals",
            "Short Term, Long Term",
            "Preparing the list of all items",
            "Lead time is known and is constant",
            "Vendors, Organization",
            "ERP",
            "Inventory Management",
            "Finished Inventories",
            "ERP",
            "Process steps and their relationships",

    };

    public String getQuestion(int a){
        String question = mQuestions6[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices6[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices6[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices6[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices6[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers6[a];
        return answer;
    }
}
