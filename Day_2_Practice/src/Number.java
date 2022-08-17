public class Number {
    private java.lang.Number number;

    public Number(String number) {
        try {
            this.number = Integer.parseInt(number);
        }
        catch (NumberFormatException integerException) {
            try {
                this.number = Double.parseDouble(number);
            }
            catch (NumberFormatException doubleException) {
                try {
                    this.number = Long.parseLong(number);
                }
                catch (NumberFormatException longException) {
                    throw new NumberFormatException();
                }
            }
        }
    }

    public java.lang.Number getNumber(){
        return this.number;
    }

    public int getIntegerValue(){
        return this.number.intValue();
    }

    public double getDoubleValue(){
        return this.number.doubleValue();
    }
    public long getLongValue(){
        return this.number.longValue();
    }


    public Boolean isEqual(Number number) {
        if(this.number instanceof Integer && number.getNumber() instanceof Integer) {

            return this.number.intValue() == number.getIntegerValue();

        } else if (this.number instanceof Integer && number.getNumber() instanceof Double){

            return this.number.intValue() == number.getDoubleValue();

        } else if(this.number instanceof Integer && number.getNumber() instanceof Long){

            return this.number.intValue() == number.getLongValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Double){

            return this.number.doubleValue() == number.getDoubleValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Integer){

            return this.number.doubleValue() == number.getIntegerValue();

        } else if(this.number instanceof Double && number.getNumber() instanceof Long){

            return this.number.doubleValue() == number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Long){

            return this.number.longValue() == number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Integer){

            return this.number.longValue() == number.getIntegerValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Double){

            return this.number.longValue() == number.getDoubleValue();
        }
        return false;
    }

    public Boolean isLess(Number number) {
        if(this.number instanceof Integer && number.getNumber() instanceof Integer) {

            return this.number.intValue() < number.getIntegerValue();

        } else if (this.number instanceof Integer && number.getNumber() instanceof Double){

            return this.number.intValue() < number.getDoubleValue();

        } else if(this.number instanceof Integer && number.getNumber() instanceof Long){

            return this.number.intValue() < number.getLongValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Double){

            return this.number.doubleValue() < number.getDoubleValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Integer){

            return this.number.doubleValue() < number.getIntegerValue();

        } else if(this.number instanceof Double && number.getNumber() instanceof Long){

            return this.number.doubleValue() < number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Long){

            return this.number.longValue() < number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Integer){

            return this.number.longValue() < number.getIntegerValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Double){

            return this.number.longValue() < number.getDoubleValue();
        }
        return false;
    }

    public Boolean isLessOrEqual(Number number) {
        if(this.number instanceof Integer && number.getNumber() instanceof Integer) {

            return this.number.intValue() <= number.getIntegerValue();

        } else if (this.number instanceof Integer && number.getNumber() instanceof Double){

            return this.number.intValue() <= number.getDoubleValue();

        } else if(this.number instanceof Integer && number.getNumber() instanceof Long){

            return this.number.intValue() <= number.getLongValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Double){

            return this.number.doubleValue() <= number.getDoubleValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Integer){

            return this.number.doubleValue() <= number.getIntegerValue();

        } else if(this.number instanceof Double && number.getNumber() instanceof Long){

            return this.number.doubleValue() <= number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Long){

            return this.number.longValue() <= number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Integer){

            return this.number.longValue() <= number.getIntegerValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Double){

            return this.number.longValue() <= number.getDoubleValue();
        }
        return false;


    }

    public Boolean isGreater(Number number) {
        if(this.number instanceof Integer && number.getNumber() instanceof Integer) {

            return this.number.intValue() > number.getIntegerValue();

        } else if (this.number instanceof Integer && number.getNumber() instanceof Double){

            return this.number.intValue() > number.getDoubleValue();

        } else if(this.number instanceof Integer && number.getNumber() instanceof Long){

            return this.number.intValue() > number.getLongValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Double){

            return this.number.doubleValue() > number.getDoubleValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Integer){

            return this.number.doubleValue() > number.getIntegerValue();

        } else if(this.number instanceof Double && number.getNumber() instanceof Long){

            return this.number.doubleValue() > number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Long){

            return this.number.longValue() > number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Integer){

            return this.number.longValue() > number.getIntegerValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Double){

            return this.number.longValue() > number.getDoubleValue();
        }
        return false;


    }

    public Boolean isGreaterOrEqual(Number number) {
        if(this.number instanceof Integer && number.getNumber() instanceof Integer) {

            return this.number.intValue() >= number.getIntegerValue();

        } else if (this.number instanceof Integer && number.getNumber() instanceof Double){

            return this.number.intValue() >= number.getDoubleValue();

        } else if(this.number instanceof Integer && number.getNumber() instanceof Long){

            return this.number.intValue() >= number.getLongValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Double){

            return this.number.doubleValue() >= number.getDoubleValue();

        } else if (this.number instanceof Double && number.getNumber() instanceof Integer){

            return this.number.doubleValue() >= number.getIntegerValue();

        } else if(this.number instanceof Double && number.getNumber() instanceof Long){

            return this.number.doubleValue() >= number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Long){

            return this.number.longValue() >= number.getLongValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Integer){

            return this.number.longValue() >= number.getIntegerValue();

        } else if (this.number instanceof Long && number.getNumber() instanceof Double){

            return this.number.longValue() >= number.getDoubleValue();
        }
        return false;
    }
}
