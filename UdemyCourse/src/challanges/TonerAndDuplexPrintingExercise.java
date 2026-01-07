package challanges;

public class TonerAndDuplexPrintingExercise {
    public static class Printer{
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            if ((tonerLevel < 0) || (tonerLevel > 100))tonerLevel=-1;
            this.tonerLevel = tonerLevel;
            this.duplex = duplex;
            pagesPrinted=0;
        }

        public int addToner(int tonerAmount){
            if (tonerAmount>0 && tonerAmount<=100){
                if ((tonerLevel+tonerAmount)>100)return -1;
                else return tonerLevel+=tonerAmount;
            }
            return -1;
        }

        public int printPages(int pages){
            int pagesToPrint=0;
            if (duplex){
                System.out.println("Printing in duplex mode");
                pagesToPrint+=((pages/2)+(pages%2));
                return pagesPrinted+=pagesToPrint;
            }
            return pagesPrinted+=pages;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }

        public int getTonerLevel() {
            return tonerLevel;
        }
    }
}

class RunTonerAndDuplexPrintingExercise{
    static void main() {
        TonerAndDuplexPrintingExercise.Printer printer = new TonerAndDuplexPrintingExercise.Printer(50, true);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
