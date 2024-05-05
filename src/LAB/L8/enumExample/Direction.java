package L8.enumExample;

public enum Direction {

    NORTH{
        @Override
        public void showDirection() {
            System.out.println("Going North");
        }
    },
    EAST{
        @Override
        public void showDirection() {
            System.out.println("Going East");
        }
    },
    SOUTH {
        @Override
        public void showDirection() {
            System.out.println(" Going South");
        }
    },
    WEST {
        @Override
        public void showDirection () {
           System . out . println (" Going West") ;
        }
    };

    public abstract void showDirection();
}
