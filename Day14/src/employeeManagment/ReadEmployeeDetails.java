package employeeManagment;

import java.io.*;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class ReadEmployeeDetails {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{

            fis = new FileInputStream("C:\\Users\\saxenaaa\\IdeaProjects\\cdkTraining\\Day14\\src\\EmployeeDetails.txt");
            ois = new ObjectInputStream(fis);

            while (ois != null){

               Employee employee = (Employee) ois.readObject();
               System.out.println(employee);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e) {
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if(ois != null){
                    ois.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){

                e.printStackTrace();

            }
        }

    }
}
