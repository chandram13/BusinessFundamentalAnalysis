

public class Fundamental Analysis{

    public static void totalROA (String [] totalAssets,netIncome){
       ROA = netIncome / totalAssets * 100
       System.outPrintln("The total return on assets given a company's information is" + ROA + ".")
    }
    public static void totalROE (String [] netIncome, equity){
        ROE = netIncome / equity * 100
        System.outPrintln("The total return on equity given a company's information is" + ROE + ".")
    }
    public static void amountEquity (String [] totalAssets, totalLiabilities){
        totalEquity = totalAssets - totalLiabilities
        System.outPrintln("The total amount of equity given a company's information is" + totalEquity + ".")
    }
    public static void calctotalAssets (String [] netIncome, ROA){
        calcTA = netIncome / ROA
        System.outPrintln("The total amount of a company's assets is" + calcTA + ".")
    }
    public static void calctotalLiabilities (String [] totalAssets, equity){
        calcTL = totalAssets - equity
        System.outPrintln("The total amount of a company's total liabilities is" + calcTL + ".")
    }
}
