package com.example.sharmas.managementmcq;


public class QuestionLibrary7 {

    private String mQuestions7 [] = {
            "____ is a system of continuous improvement in quality, technology, processes, company culture, productivity, safety and leadership.",
            "___ aims to reduce defects to a rate of 3.4 defects per million defect opportunities by identifying and eliminating causes of variation in business processes",
            "Management responsibility, Quality system, Contract review, Design control are requirements defined by",
            "Identify the elements of TQM",
            "____ is a small group of employees of the same work area, doing similar work that meets voluntarily and regularly to identify, analyze and resolve work related problems.",
            "Clause of ISO 9001:2000 Internal Audit includes ____",
            "The Six Sigma methodology endorse",
            "CRM is",
            "Quality is defined by ____________",
            "Kaizen Means __________",
            "\"Throw away unnecessary\" is in",
            "\" i) Quality Assurance is a proactive approach ii) Quality Assurance improves quality of product\"",
            "Which is the main clause in ISO 9001:2000?",
            "____________ is a process that ensures the quality of a product throughout its lifecycle.",
            "__________________ is the process of verifying or determining whether products or services meet or exceed customer expectations.",
            "____________________ is a management approach to long term success through customer satisfaction.",
            "ISO 9001:2000 is a ________________________ standard.",
            "Six Sigma success factors are:",
            "Food, Water, Sleep, Clothes and an acceptable temperature are all examples of:",
            "Principal of TQM are___________________________________",
            "Continuous improvement means:",
    };
    private String mChoices7 [][] = {
            {"5S","Kaizen","Six Sigma","TQM"},
            {"5S","Kaizen","Six Sigma","TQM"},
            {"5S","Kaizen","Six Sigma","ISO 9001:2000"},
            {"Disaster Recovery, Retained Profits","Cost Cutting, Preferred Employees","Quality Control, Customer Satisfaction","Quality Check, Minimum Defects"},
            {"Quality Control Team","Improvement Team","Quality Circle","Development Team"},
            {"Need of Internal Audits at pre planned intervals","Includes Supervision and Measurements","Monitors and Measures products as well as services","Includes Data Analysis for continuous improvement"},
            {"DMAIC concept","CRM concept","Quality Circle concept","TQM concept"},
            {"Customer Relationship Management","Customer Relation Manager","Custom Relative Management","Custom Relative Manager"},
            {"QC incharge","Manager","Engineer","Customer"},
            {"Improvement","Quality","Good Thing","None of the above"},
            {"Seiso","Seiri","Seiketsu","Seition"},
            {"i is correct and ii is wrong","i is wrong and ii is correct","Both i and ii correct","both i and ii worng"},
            {"Product Realization","Management Responsibility","Resource Management","All of the above"},
            {"Quality management","Quality assurance","Quality Control","Quality Circle"},
            {"Quality management","Quality assurance","Quality Control","Quality Circle"},
            {"Total Quality management","Quality assurance","Quality Management","Quality Circle"},
            {"Quality Circle","Quality","Quality Management System","Quality assurance"},
            {"Leader‟s Commitment","Innovative","Facts with decision making ideas","All of the above"},
            {"Physiological needs","Safety Needs","Competence Needs","Social Needs"},
            {"Quality should be managed","People are the problems but processes are not problems.","Each and every employee is not accountable for quality","None of these."},
            {"Kaizen","5 „S‟","Six Sigma","None of the above"},
    };
    public int getLength(){
        return mQuestions7.length;
    }

    private String mCorrectAnswers7[] = {
            "Kaizen",
            "Six Sigma",
            "ISO 9001:2000",
            "Quality Control, Customer Satisfaction",
            "Quality Circle",
            "Need of Internal Audits at pre planned intervals",
            "DMAIC concept",
            "Customer Relationship Management",
            "Customer",
            "Improvement",
            "Seiri",
            "Both i and ii correct",
            "All of the above",
            "Quality management",
            "Quality assurance",
            "Total Quality management",
            "Quality Management System1",
            "All of the above",
            "Physiological needs",
            "Quality should be managed",
            "Kaizen",
    };

    public String getQuestion(int a){
        String question = mQuestions7[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices7[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices7[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices7[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices7[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers7[a];
        return answer;
    }
}
