package model;

public class Flower {
    
        public static final byte COLOR_IDX_YELLOW = 2;
        
        private String color;
        private static int flowerCounter;
        private final static String defaultColor = "green";
        private STATUS status;

        public static enum STATUS {
            SLEEP, BLOSSOM, DRY;
        }
        
        public void setStatus(STATUS newStatus) {
            this.status = newStatus;
        }
        
        public STATUS getStatus() {
            return this.status;
        }

        public static int getStatusOrder (STATUS status) {
            return status.ordinal();
        }
        
        public Flower() {
          super();
          this.status = STATUS.SLEEP;
          this.color = defaultColor;
          flowerCounter++;
        }

        public Flower(String color) {
          super();
          this.status = STATUS.BLOSSOM;
          this.color = color;
          flowerCounter++;
        }

        public String getColor() {
          return color;
        }

        public void setColor(String color) {
          this.color = color;
        }

        public static int getFlowerCount() {
          return flowerCounter;
        }
      
}
