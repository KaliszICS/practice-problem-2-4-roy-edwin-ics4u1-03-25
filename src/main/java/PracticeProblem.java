public class PracticeProblem {

public static void main(String args[]) {
}

public static void selectionSortName(String[] name, int[] ages){
	for (int x=0; x<name.length-1;x++){
	int small=x;
	for (int y=x+1; y<name.length;y++){
	if(name[y].toLowerCase().compareTo(name[small].toLowerCase()) < 0){
	small=y;

		}
	}
	String tempName=name[small];
	name[small]=name[i];
	name[x]=tempName;
	int tempAges=ages[small];
	ages[small]=ages[x];
	ages[x]=tempAge;
			
		}

	}
public static void selectionSortAge(String[] name, int[] ages){
	int small=0;
	for (int x=0; x<ages.length-1;x++){
	for (int y=x+1; y<ages.length;y++){
	if(ages[small]>ages[j]){
	small=y;
		}
	}
	String tempName=name[small];
	name[small]=name[x];
	name[x]=tempName;
	int tempAge=ages[small];
	ages[small]=ages[x];
	ages[x]=tempAge;

		}

	}

}
