package org.class_assotiation;

public class outputhelper {
//    org.class_assotiation.csv.IOutputGenerator outputGenerator;
//    public org.class_assotiation.csv.outputhelper(){
//        outputGenerator = new jsonA.JsonOutputGenerator();
//    }
//
//    public void generateOutput(){
//        outputGenerator.generateOutput();
//    }
    IOutputGenerator outputGenerator;
    public void generateOutput(){
        outputGenerator.generateOutput();
    }
    public outputhelper(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

}
