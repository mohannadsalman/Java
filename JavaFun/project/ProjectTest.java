public class ProjectTest{
    public static void main(String[] args){
        Project testProject = new Project("nice seen", "Intercontinintal palza ", 49999.99);
        testProject.setName("middle of the city");
        testProject.setDescription("Bethlehem_Palstine.");
        testProject.setCost(8000.99);
        System.out.println(testProject.getName());
        System.out.println(testProject.getDescription());
        System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}