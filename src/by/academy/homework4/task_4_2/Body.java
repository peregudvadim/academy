//created by Vadim Peregud
package by.academy.homework4.task_4_2;
public class Body {
    private Heart heart;
    private Lungs lungs;

    public Body() {
        this.setHeart(new Heart());
        this.setLungs(new Lungs());
    }

    void live() {
        getLungs().live();
        System.out.println();
        getHeart().live();
        System.out.println();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \n" +
                "And I believe that you are free, and life has only begun.");
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Lungs getLungs() {
        return lungs;
    }

    public void setLungs(Lungs lungs) {
        this.lungs = lungs;
    }

    class Heart {
        void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i!=0&&i % 100_000_000 == 0) {
                    System.out.println("Knock-knock-knocking on heaven's door " + i);
                }
            }
        }
    }
    class Lungs {
        void live() {
            boolean inhale=false;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (i% 50_000_000 == 0) {
                    inhale=!inhale;
                    if (inhale) {
                        System.out.println("breathe IN " +i);
                    } else System.out.println("breathe OUT "+i);
                }
            }
        }
    }
}
