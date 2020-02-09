
    public void generateBinary(int numBits) {
        boolean[] bits = newBoolArrayOfFalse(numBits);

        int step = 0;
        while(!wholeArrayIsTrue(bits)) {
            printArray(bits);
            for (int i=bits.length-1; i>-1; i--) {
                double num = (double) step+1;
                double denom = Math.pow(2.0, bits.length -1 - i);
                if (num % denom == 0) {
                    bits[i] = !bits[i];
                }
            }
            // Any operations can happen here
            step++;
        }
        printArray(bits);
    }

    private boolean[] newBoolArrayOfFalse(int numBits) {
        boolean[] bits = new boolean[numBits];
        for (int i=0; i<bits.length; i++) {
            bits[numBits-1] = false;
        }
        return bits;
    }

    private boolean wholeArrayIsTrue(boolean[] b) {
        for (boolean bol: b) {
            if (!bol) return false;
        }
        return true;
    }

    private void printArray(boolean[] b) {
        String array = "";
        for (boolean _b: b) {
            array = array.concat(_b ? " 1" : " 0");
        }
        System.out.println(array);
    }
