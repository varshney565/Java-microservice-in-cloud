class C4 {
    public static void main(String[] args) {
        
        /**
         * 	byte (number, 1 byte)
         *  short (number, 2 bytes)
         *  int (number, 4 bytes)
         *  long (number, 8 bytes)
         *  float (float number, 4 bytes)
         *  double (float number, 8 bytes)
         *  char (a character, 2 bytes)
         *  boolean (true or false, 1 byte)
         * */
         
         byte a = 12;
         System.out.println("minimum value of a byte : " + Byte.MIN_VALUE);
         System.out.println("maximum value of a byte : " + Byte.MAX_VALUE);
         /**
          * byte's corrosponding wrapper class is Byte
          * */
          
         short b = 12;
         System.out.println("minimum value of a short : " + Short.MIN_VALUE);
         System.out.println("maximum value of a short : " + Short.MAX_VALUE);
         /**
          * short's corrosponding wrapper class is Short
          * */
          
         int c = 12;
         System.out.println("minimum value of a int : " + Integer.MIN_VALUE);
         System.out.println("maximum value of a int : " + Integer.MAX_VALUE);
         /**
          * int's corrosponding wrapper class is Integer
          * */
          
          /**
           * other data types in java = long(Long),double,float,char,boolean
           * */
         long d = 123456789567l;
         float e = 1.23f;
         double f = 1.424234242424242424;
         boolean g = false;
         char h = 'a';
         
    }
}
