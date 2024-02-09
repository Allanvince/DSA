
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Steps {
    public static boolean valid_steps(Set<Integer> steps, Map<Integer, int[]> dependencies){
        Map<Integer, Boolean> status = new HashMap<>();

        for (int stepCount : steps){
            status.put(stepCount, false);
        }
        for (int stepCount : steps){
            if (!checkValidSteps(stepCount,status, dependencies)){
                return false;
            }
        }
        return true;
    }

    private static boolean checkValidSteps(int stepCount, Map<Integer, Boolean> status, Map<Integer,int[]> dependencies) {
        if (status.get(stepCount)) {

            return true;
        }

        int[] dependent_step = dependencies.getOrDefault(stepCount, new int[]{});

        for (int dependentSteps : dependent_step){
            if (checkValidSteps(dependentSteps, status, dependencies)){
                return false;
            }
        }
        status.put(stepCount, true);

        return true;
    }
    public static void main(String[]args){
        Map<Integer, int[]>  dependencies = Map.of(1,new int[]{14,15},
                2,new int[]{15},
                3, new int[]{});

        System.out.println(valid_steps(Set.of(14,15), dependencies));
        System.out.println(valid_steps(Set.of(15,14,13), dependencies));
        System.out.println(valid_steps(Set.of(15), dependencies));
        System.out.println(valid_steps(Set.of(13,15), dependencies));
    }

}