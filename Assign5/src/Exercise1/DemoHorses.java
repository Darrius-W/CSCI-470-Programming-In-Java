public class DemoHorses {
        public static void main(String[] args) throws Exception {
                // Create 2 horse objects
                Horse horse1 = new Horse();
                RaceHorse horse2 = new RaceHorse();

                // Set horse1 values
                horse1.setName("Old Paint");
                horse1.setColor("brown");
                horse1.setBirthYear(2009);

                // Set horse2 values
                horse2.setName("Champion");
                horse2.setColor("black");
                horse2.setBirthYear(2011);
                horse2.setRace(4);

                // Display horse1 values
                System.out.printf("%s is %s and was born in %d.%n",
                                horse1.getName(), horse1.getColor(), horse1.getBirthYear());
                // Display horse2 values
                System.out.printf("%s is %s and was born in %d.%n",
                                horse2.getName(), horse2.getColor(), horse2.getBirthYear());

                // Display horse2 races
                System.out.printf("%s has been in %d races.",
                                horse2.getName(), horse2.getRace());

        }
}
