package pack6;

public class Student_Info {
    public float avg(int num_stud, int arr[]) {
        int i;
        int  avg = 0;
        for (i = 0; i < num_stud; i++) {
            avg = (avg + arr[i]) ;
        }
        float avg1=(float)avg/num_stud;
        return avg1 ;
    }

    public int min(int num_stud, int arr[]) {
        int minimum = arr[0];

        int i;
        for(i = 1; i < num_stud; i++){
            if ( arr[i]<minimum) {
                minimum = arr[i];
            }

        }
        return minimum;
    }

    public int max(int num_stud, int arr[]) {
        int maximum = arr[0];
        int position;
        int i;
        for(i = 1; i < num_stud; i++){
            if (maximum < arr[i]) {
                maximum = arr[i];
                position = i;

            }

        }
        return maximum;
    }
}

