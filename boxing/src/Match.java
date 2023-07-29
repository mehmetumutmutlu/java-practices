public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== NEW ROUND ====");
                double randomNumber = Math.random() * 100;
                if (randomNumber > 50) {
                    this.f2.health = this.f1.hit(this.f2);
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                }
                if (isWin()) {
                    break;
                }
                if (randomNumber > 50) {
                    this.f1.health = this.f2.hit(this.f1);
                } else {
                    this.f2.health = this.f1.hit(this.f2);
                }
                System.out.println(this.f1.name + "'s HP: " + this.f1.health + "\n" + this.f2.name + "'s HP: " + this.f2.health);
                if (isWin()) {
                    break;
                }
            }
        } else {
            System.out.println("Error: The fighter weights are not appropriate.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " BEAT!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " BEAT!");
            return true;
        }

        return false;
    }
}
