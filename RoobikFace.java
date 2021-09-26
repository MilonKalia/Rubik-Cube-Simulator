import java.util.Random;
public class RoobikFace
{
    private String color; // color of cube face
    public String [][] face = new String [3][3]; //2d array for the 3*3 face of the cube
    
    public RoobikFace(String _color) // constructor
    {
        color = _color;
        String[] faceColors = {"W", "B", "O", "G", "Y", "R"}; //list of all possible colors
        
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                //chooses random color for each element in the array
                int rnd = new Random().nextInt(faceColors.length);
                String randColor = faceColors[rnd];
                face[i][j] = randColor;
            }
        }
        
        face[1][1] = color;//sets middle of face to the original color given by RoobikFace
    }
    
    public void turnCW()//reassigning each element in the 2d array accordingly 
    {
        String a = face[0][0];
        String b = face[0][1]; 
        String c = face[0][2];
        String d = face[1][0];
        
        String f = face[1][2];
        String g = face[2][0];
        String h = face[2][1];
        String i = face[2][2];
        
        face[0][0] = g;
        face[0][1] = d; 
        face[0][2] = a;
        face[1][0] = h;
        
        face[1][2] = b;
        face[2][0] = i;
        face[2][1] = f;
        face[2][2] = c;
    }
    
    public void turnCCW()//reassigning each element in the 2d array accordingly
    {
        String a = face[0][0];
        String b = face[0][1]; 
        String c = face[0][2];
        String d = face[1][0];
        
        String f = face[1][2];
        String g = face[2][0];
        String h = face[2][1];
        String i = face[2][2];
        
        face[0][0] = c;
        face[0][1] = f; 
        face[0][2] = i;
        face[1][0] = b;
        
        face[1][2] = h;
        face[2][0] = a;
        face[2][1] = d;
        face[2][2] = g;
    }
    
    public String Column(int ColumnNum)
    {
        String result = "";
        for (int i=0; i<3; i++)
        {
            result = result + face[i][ColumnNum] + " ";
        }
        return result;
    }
    
    public String Row(int RowNum)
    {
        String result = "";
        for (int j=0; j<3; j++)
        {
            result = result + face[RowNum][j] + " ";
        }
        return result;
    }
    
    
    public String toString()
    {
        String result = "";
        
        for (int i=0; i<3; i++)
        {
            result = result + this.Row(i) + "\n";
        }
        
        return result;
    }
}
