import Engine.Window;
import org.lwjgl.opengl.GL;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;
public class Main {
    private Window window = new Window(800, 800, "Hello World");
    public void init(){
        window.init();
        GL.createCapabilities();


    }
    public void loop(){
        while(window.isOpen()){
            window.update();
            glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GL.createCapabilities();
            //Code

            //Restore state
            glDisableVertexAttribArray(0);

            //Pool for window events
            //The key callbacks above will only invoke during this call



            glfwPollEvents();
        }
    }
    public void run(){
        init();
        loop();
        glfwTerminate();
        glfwSetErrorCallback(null).free();

    }
    public static void main(String[] args) {
        new Main().run();
//        System.out.println("Hello world!");
    }
}