package com.example.sharmas.managementmcq;


import android.support.annotation.DrawableRes;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Following business pattern is not coming under service industry",
            "Mechanism That allows trade is called as:",
            "Following is not among the top 5 countries in the list of our importers.",
            "India is the largest market in the world for",
            "Old textile industry was predominantly _____based.",
            "Following is not the textile industry",
            "Following is not the chemical industry",
            "Following bank is working for agriculture field",
            "Following is not associated with insurance",
            "Types of business____.",
            "Industrial sector involves________.",
            "Engineering industrial sectors not involves_______.",
            "Top agro industry in India is_______.",
            "ITES stands for_______.",
            "Major functions of insurance company__________.",
            "KPO stands for________.",
            "LPG__________.",
            "WTO stands for________.",
            "____________ includes all of the activities involved in the sale of products to final customers.",
            "The following are included in a business plan:",
            "The first stage of evolution of business is?",
            "Which among the following does not belong to India's major large scale industries?",
            "The service sector includes activities such as:",
            "Which of the following statement is true in respect of public sector:",
            "Which one of the following does not belong to the major general insurance private sector companies in India?",
            "What does the letter 'S' denote in the term IFSC?",
            "Which sector is the backbone of Indian economy?",
            "One major factor that has stimulated the globalization process is:",
            "Which is the fastest growing sector in India now days?",
            "SEZ is –",
            "Which of Following is not the agro industry?",
            "Which is the apex authority of Government of India?",
            "Infosys is an example of _______________ industry.",
            "Indian insurance sector has _____ no. of insurance companies.",
            "KPO stands for",
            "------- means integrating the economy of a country with global / world economy",
            "An economic activity involving regular production or distribution of goods and services with object of earning profits through satisfaction of human needs is called as:",
            "The year 1991 is famous for:",
            "License permit raj in India was in this period",
            "All exports and imports activities are governed by",

    };
    private String mChoices [][] = {
            {"ITes","Banking","Real Estate","Textile"},
            {"Government","Finance department","Market","Industry"},
            {"UK","Saudi Arabia","USA","China"},
            {"Cars","Heavy Vehicles","Public Travels","Three Wheelers"},
            {"Cotton","Polysters","Synthetic Textile","Blended Fabrics"},
            {"Arvind","Welspun","Century","IBP"},
            {"Polymer","Sugar","Paints","Petrochemical"},
            {"ICICI","Allahabad","NABARD","AgroB"},
            {"ICC","LIC","Max Life","Bajaj Allianz"},
            {"Service","Manufacturing","Trade","All of above"},
            {"Construction","Fisheries","Textile","All of above"},
            {"Civil","Mechanical","Chemical","Filament yard"},
            {"Fabindia","Pidiliite","DuPont India","None of above"},
            {"IT Enabled Services","IT Enterprise Services","IT Enabled Systems","Industry Telecomm Enabled Services"},
            {"To provide certainty","To provide protection","Shares risk","All of above"},
            {"Knowledge Procedure Outsourcing","Knowledge Process Outsourcing","Knowledge Process organization","None of above"},
            {"Liberalization, Privatization, Globalization","Liberate, private, globalization","Liberate, private, global","None of above"},
            {"World Trade Organization","World Test Organization","Work Test Organization","Work Trade Organization"},
            {"Wholesaling","Retailing","Marketing","Distributing"},
            {"Financial information, production plans, personnel policies","Goals of the business and how they will be achieved.","Market analysis","All of the above"},
            {"Industrial Revolution","Marketing Era","Entrepreneurship","Globalization"},
            {"Cotton textile industry","Iron and steel industry","Jute industry","Khadi and village industry"},
            {"Agriculture, Dairy, Fishing and forestry","Marketing sugar, gur and bricks","Transport, communication and banking","None of these"},
            {"Big companies own most of the assets","Government owns the assets","A group of people owns most of the assets","An individual owns most of the assets"},
            {"Bajaj Allianz General Insurance","Reliance General Insurance","Royal Sundaram Alliance Insurance","The Oriental Insurance Company"},
            {"Subscriber","State","System","Source"},
            {"Service Sector","Financial Sector","Tourism Sector","Agriculture Sector"},
            {"Improvement in Transportation","Telecommunication","Internet","All of the above"},
            {"Agriculture","Banking","Service","Manufacturing"},
            {"Special Export Zone","State Economic Zone","Special Economic Zone","Special Engineering Zone"},
            {"Jute","Sugar","Paper","Poultry"},
            {"SAIL","TISCO","Heavy Industries Ministry","ISA"},
            {"Textile","Engineering","Agro","IT"},
            {"112","20","52","86"},
            {"Knowledge Procedure Outsourcing","Knowledge Process OutSourcing","Knowledge Process Organization","None of above"},
            {"Globalization","Privatization","Liberalization","L-P-G"},
            {"Business","Organization","Management","Budget"},
            {"New Fiscal deficit Policy","IT parks initiated in Bangalore","Globalisation policy, liberalisation were accepted by India","Policy of cooperative societies changed"},
            {"1965-1990","1990-2002","1965-1970","1995-1965"},
            {"Foreign trade policy","Fiscal policy","Global policy","Trade and Business policy"},
    };
    public int getLength(){
        return mQuestions.length;
    }

    private String mCorrectAnswers[] = {
            "Textile",
            "Market",
            "UK",
            "Three Wheelers",
            "Cotton",
            "IBP",
            "Sugar",
            "NABARD",
            "ICC",
            "All of above",
            "All of above",
            "Filament yard",
            "DuPont India",
            "IT Enabled Services",
            "All of above",
            "Knowledge Process Outsourcing",
            "Liberalization, Privatization, Globalization",
            "World Trade Organization",
            "Retailing",
            "All of the above",
            "Industrial Revolution",
            "Khadi and village industry",
            "Transport, communication and banking",
            "Government owns the assets",
            "The Oriental Insurance Company",
            "System",
            "Agriculture Sector",
            "All of the above",
            "Service",
            "Special Economic Zone",
            "Paper",
            "SAIL",
            "IT",
            "52",
            "Knowledge Process OutSourcing",
            "Globalization",
            "Business",
            "Globalisation policy, liberalisation were accepted by India",
            "1965-1990",
            "Foreign trade policy",
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
