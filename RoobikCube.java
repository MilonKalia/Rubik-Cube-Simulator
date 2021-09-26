public class RoobikCube 
{
    private RoobikFace[] cubeFaces = new RoobikFace[6]; // array for each face of the net

    public RoobikCube()
    {
        // constructor sets each element of the cubeFaces array to a 3*3 face
        cubeFaces[0] = new RoobikFace("W"); 
        cubeFaces[1] = new RoobikFace("B");
        cubeFaces[2] = new RoobikFace("O");
        cubeFaces[3] = new RoobikFace("G");
        cubeFaces[4] = new RoobikFace("Y");
        cubeFaces[5] = new RoobikFace("R");
    }
    
    public void cw()
    {
        cubeFaces[2].turnCW(); //calls the void method from RubikFace
        
        // reassigns the rows and colums with the adjacent faces
        String a = cubeFaces[0].face[2][0];
        String b = cubeFaces[0].face[2][1];
        String c = cubeFaces[0].face[2][2];
        String d = cubeFaces[1].face[0][2];
        String e = cubeFaces[1].face[1][2];
        String f = cubeFaces[1].face[2][2];
        String g = cubeFaces[3].face[0][0];
        String h = cubeFaces[3].face[1][0];
        String i = cubeFaces[3].face[2][0];
        String j = cubeFaces[4].face[0][0];
        String k = cubeFaces[4].face[0][1];
        String l = cubeFaces[4].face[0][2];
        cubeFaces[0].face[2][0] = f;
        cubeFaces[0].face[2][1] = e;
        cubeFaces[0].face[2][2] = d;
        cubeFaces[1].face[0][2] = j;
        cubeFaces[1].face[1][2] = k;
        cubeFaces[1].face[2][2] = l;
        cubeFaces[3].face[0][0] = a;
        cubeFaces[3].face[1][0] = b;
        cubeFaces[3].face[2][0] = c;
        cubeFaces[4].face[0][0] = i;
        cubeFaces[4].face[0][1] = h;
        cubeFaces[4].face[0][2] = g;
    }
    
    public void ccw()
    {
        cubeFaces[2].turnCCW();//calls the void method from RubikFace
        
        // reassigns the rows and colums with the adjacent faces
        String a = cubeFaces[0].face[2][0];
        String b = cubeFaces[0].face[2][1];
        String c = cubeFaces[0].face[2][2];
        
        String d = cubeFaces[1].face[0][2];
        String e = cubeFaces[1].face[1][2];
        String f = cubeFaces[1].face[2][2];
        
        String g = cubeFaces[3].face[0][0];
        String h = cubeFaces[3].face[1][0];
        String i = cubeFaces[3].face[2][0];
        
        String j = cubeFaces[4].face[0][0];
        String k = cubeFaces[4].face[0][1];
        String l = cubeFaces[4].face[0][2];
        
        cubeFaces[0].face[2][0] = g;
        cubeFaces[0].face[2][1] = h;
        cubeFaces[0].face[2][2] = i;
        
        cubeFaces[1].face[0][2] = c;
        cubeFaces[1].face[1][2] = b;
        cubeFaces[1].face[2][2] = a;
        
        cubeFaces[3].face[0][0] = l;
        cubeFaces[3].face[1][0] = k;
        cubeFaces[3].face[2][0] = j;
        
        cubeFaces[4].face[0][0] = d;
        cubeFaces[4].face[0][1] = e;
        cubeFaces[4].face[0][2] = f;
    }
    
    public void left() //reassining each face accordingly
    {
        RoobikFace a = cubeFaces[0];
        RoobikFace b = cubeFaces[1];
        RoobikFace c = cubeFaces[2];
        RoobikFace d = cubeFaces[3];
        RoobikFace e = cubeFaces[4];
        RoobikFace f = cubeFaces[5];
        
        cubeFaces[0] = a;
        cubeFaces[1] = c;
        cubeFaces[2] = d;
        cubeFaces[3] = f;
        cubeFaces[4] = e;
        cubeFaces[5] = b;
    }
    
    public void right() //reassining each face accordingly
    {
        RoobikFace a = cubeFaces[0];
        RoobikFace b = cubeFaces[1];
        RoobikFace c = cubeFaces[2];
        RoobikFace d = cubeFaces[3];
        RoobikFace e = cubeFaces[4];
        RoobikFace f = cubeFaces[5];
        
        cubeFaces[0] = a;
        cubeFaces[1] = f;
        cubeFaces[2] = b;
        cubeFaces[3] = c;
        cubeFaces[4] = e;
        cubeFaces[5] = d;
    }
    
    public void up() //reassining each face accordingly
    {
        RoobikFace a = cubeFaces[0];
        RoobikFace b = cubeFaces[1];
        RoobikFace c = cubeFaces[2];
        RoobikFace d = cubeFaces[3];
        RoobikFace e = cubeFaces[4];
        RoobikFace f = cubeFaces[5];
        
        cubeFaces[0] = c;
        cubeFaces[1] = b;
        cubeFaces[2] = e;
        cubeFaces[3] = d;
        cubeFaces[4] = f;
        cubeFaces[5] = a;
    }
    
    public void down() //reassining each face accordingly
    {
        RoobikFace a = cubeFaces[0];
        RoobikFace b = cubeFaces[1];
        RoobikFace c = cubeFaces[2];
        RoobikFace d = cubeFaces[3];
        RoobikFace e = cubeFaces[4];
        RoobikFace f = cubeFaces[5];
        
        cubeFaces[0] = f;
        cubeFaces[1] = b;
        cubeFaces[2] = a;
        cubeFaces[3] = d;
        cubeFaces[4] = c;
        cubeFaces[5] = e;
    }
    
    public String toString() //prints out the net as a string
    {
        String result = "        " + cubeFaces[0].Row(0) + "\n        " + cubeFaces[0].Row(1) + "\n        " + cubeFaces[0].Row(2) + "\n \n" + cubeFaces[1].Row(0) + "  " + cubeFaces[2].Row(0) + "  " + cubeFaces[3].Row(0) + "\n" + cubeFaces[1].Row(1) + "  " + cubeFaces[2].Row(1) + "  " + cubeFaces[3].Row(1) + "\n" + cubeFaces[1].Row(2) + "  " + cubeFaces[2].Row(2) + "  " + cubeFaces[3].Row(2) + "\n \n" + "        " + cubeFaces[4].Row(0) + "\n        " + cubeFaces[4].Row(1) + "\n        " + cubeFaces[4].Row(2) +  "\n \n" + "        " + cubeFaces[5].Row(0) + "\n        " + cubeFaces[5].Row(1) + "\n        " + cubeFaces[5].Row(2);
        return result;
    }
}
