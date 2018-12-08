public class Fraction {
    int num;
    int denum;
    Fraction(int num, int denum){
        if(num<0 && denum<0 || num>0&& denum<0){
            num=-num;
            denum=-denum;
        }
        if(denum!=0){
            this.num = num;
            if(num== 0) denum=0;
            this.denum = denum;
        }
        else{
            clearScreen();
            throw new NullPointerException("Creating a fraction: division by zero ಠ_ಠ");
        }

    }
    Fraction(int num){    //целое число
        this.num = num;
        this.denum = 1;
    }
    Fraction(Fraction copy){
        this.num= copy.num;
        this.denum= copy.denum;
    }

    public Fraction add(Fraction fraction){
        int num1= this.num;
        int denum1= this.denum;
        int num2= fraction.num;
        int denum2= fraction.denum;
        int res_num;
        int res_denum;
        if(num1== 0||num2==0){
            res_num= num1+num2;
            res_denum= denum1+denum2;
        }
        else {
            res_num= num1*denum2+num2*denum1;
            res_denum= denum1*denum2;
        }
        Fraction res_fraction = new Fraction(res_num, res_denum);
        return res_fraction;
    }
    public Fraction subtract(Fraction fraction){
        int num1= this.num;
        int denum1= this.denum;
        int num2= fraction.num;
        int denum2= fraction.denum;
        int res_num;
        int res_denum;
        if(num1== 0||num2==0){
            res_num= num1-num2;
            res_denum= denum1+denum2;
        }
        else {
            res_num= num1*denum2-num2*denum1;
            res_denum= denum1*denum2;
        }
        Fraction res_fraction = new Fraction(res_num, res_denum);
        return res_fraction;
    }
    public Fraction multiply(Fraction fraction) {
        int num1 = this.num;
        int denum1 = this.denum;
        int num2 = fraction.num;
        int denum2 = fraction.denum;
        int res_num;
        int res_denum;
        res_num = num1*num2;
        res_denum = denum1 * denum2;
        if(res_num==0){
            res_denum = 1;
        }
        Fraction res_fraction = new Fraction(res_num, res_denum);
        return res_fraction;
    }
    public Fraction divide(Fraction fraction) {
        int num1 = this.num;
        int denum1 = this.denum;
        int num2 = fraction.num;
        int denum2 = fraction.denum;
        int res_num;
        int res_denum;
        if(num2== 0){
            clearScreen();
            throw new NullPointerException("Divide: division by zero ಠ_ಠ");
        }
        res_num = num1*denum2;
        res_denum = denum1 * num2;
        if(res_num==0){
            res_denum = 1;
        }
        Fraction res_fraction = new Fraction(res_num, res_denum);
        return res_fraction;
    }
    public void f_print(){
        if(this.num== 0) System.out.println(0);
        else if(this.denum == 1) System.out.println(this.num);
        else System.out.println(this.num+"/"+this.denum);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
