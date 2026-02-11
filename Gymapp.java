public class Gymapp {
    public static void main(String[] args) throws Exception {
        System.out.println("Gym schema voor de hele week");
        System.out.println("-----------------------------");

        String[] days = {
                "Maandag", "Dinsdag", "Woensdag", "Donderdag",
                "Vrijdag", "Zaterdag", "Zondag"
        };

        String[][] exercises = {
                { "Leg Press", "Bench Press", "Pull-ups", "Plank" },
                { "Deadlift", "Overhead Press", "Barbell Row", "Hanging Leg Raises" },
                { "Rust / Actief herstel", "Wandelen 30 min", "Stretching 15 min" },
                { "Front Squat", "Incline Dumbbell Press", "Lat Pulldown", "Side Plank" },
                { "Hip Thrust", "Push-ups", "Seated Cable Row", "Russian Twists" },
                { "Cardio 30 min", "Core Circuit", "Mobility 20 min" },
                { "Rust", "Lichte stretching 10 min" }
        };

        for (int i = 0; i < days.length; i++) {
            System.out.println();
            System.out.println(days[i] + ":");
            for (int j = 0; j < exercises[i].length; j++) {
                System.out.println("- " + exercises[i][j]);
            }
        }
    }
}