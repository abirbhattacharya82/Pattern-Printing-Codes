using system;

public class LowerTriangle {
    public static void Main() {
        var rows = 7;
        for (var i = 0; i <= rows; i++) {
            var triangleString = "";
            var spaces = rows - i;
            for (var k = 0; k < spaces; k++) {
                triangleString += " ";
            }
            for (var j = 0; j <= i; j++) {
                triangleString += "* ";
            }
            Console.WriteLine(triangleString);
        }
    }
}