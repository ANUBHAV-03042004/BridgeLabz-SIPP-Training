package stackqueuehashmapandhashingfunction.queue;

public class CircularTourProblem {
	    static class PetrolPump {
	        int petrol;
	        int distance;

	        PetrolPump(int p, int d) {
	            petrol = p;
	            distance = d;
	        }
	    }

	    public static int findStartingPoint(PetrolPump[] pumps) {
	        int n = pumps.length;
	        int start = 0, end = 1;
	        int currPetrol = pumps[start].petrol - pumps[start].distance;

	        while (start != end || currPetrol < 0) {
	            while (currPetrol < 0 && start != end) {
	                currPetrol -= pumps[start].petrol - pumps[start].distance;
	                start = (start + 1) % n;
	                if (start == 0)
	                    return -1;
	            }

	            currPetrol += pumps[end].petrol - pumps[end].distance;
	            end = (end + 1) % n;
	        }

	        return start;
	    }

	    public static void main(String[] args) {
	        PetrolPump[] pumps = {
	            new PetrolPump(6, 4),
	            new PetrolPump(3, 6),
	            new PetrolPump(7, 3)
	        };

	        int start = findStartingPoint(pumps);
	        System.out.println("Start at petrol pump index: " + start);
	    }
	}

