import Engine.Object2d;
import Engine.Rectangle;
import Engine.ShaderProgram;
import Engine.Window;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;
public class Main {
    private Window window = new Window(800, 800, "Hello World");
    public void init(){
        window.init();
        GL.createCapabilities();

        //Code
//        objects.add(new Object2d(
//                        Arrays.asList(
//                                new ShaderProgram.ShaderModuleData(
//                                        "resources/sceneVertices.vert", GL_VERTEX_SHADER),
//                                new ShaderProgram.ShaderModuleData(
//                                        "resources/sceneVertices.frag", GL_FRAGMENT_SHADER)
//                        ),
//                        new ArrayList<>(
//                                List.of(
//                                        new Vector3f(0.5f, 0.5f, 0.0f),
//                                        new Vector3f(-0.5f, 0.5f, 0.0f),
//                                        new Vector3f(-0.5f, -0.5f, 0.0f),
//                                        new Vector3f(0.5f, -0.5f, 0.0f)
//                                )
//                        ),
//                        new ArrayList<>(
//                                List.of(
//                                        new Vector3f(1.0f, 0.0f, 0.0f),
//                                        new Vector3f(0.0f, 1.0f, 0.0f),
//                                        new Vector3f(1.0f, 1.0f, 0.0f),
//                                        new Vector3f(0.0f, 0.0f, 1.0f)
//                                )
//                        )
//            )
//        );

//        objectsRectangle.add(new Rectangle(
//                        Arrays.asList(
//                                new ShaderProgram.ShaderModuleData(
//                                        "resources/scene.vert", GL_VERTEX_SHADER),
//                                new ShaderProgram.ShaderModuleData(
//                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
//                        ),
//                        new ArrayList<>(
//                                List.of(
//                                        new Vector3f(0.5f, 0.5f, 0.0f),
//                                        new Vector3f(-0.5f, 0.5f, 0.0f),
//                                        new Vector3f(-0.5f, -0.5f, 0.0f),
//                                        new Vector3f(0.5f, -0.5f, 0.0f)
//                                )
//                        ),
//                        new Vector4f(0.0f, 1.0f, 1.0f, 1.0f),
//                        Arrays.asList(0,1,2,1,2,3)
//                )
//        );
        //bg biru
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(-1.0f, 1.0f, 0.0f),
                                        new Vector3f(-1.0f, -0.5f, 0.0f),
                                        new Vector3f(1.0f, -0.5f, 0.0f),
                                        new Vector3f(1.0f, 1.0f, 0.0f)
                                )
                        ),
                        new Vector4f(0.0f, 0.15f, 0.89f, 0.8f),
                        Arrays.asList(0,1,2,3)
                )
        );
        //bg hijau
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(-1.0f, -0.5f, 0.0f),
                                        new Vector3f(-1.0f, -1.0f, 0.0f),
                                        new Vector3f(1.0f, -1.0f, 0.0f),
                                        new Vector3f(1.0f, -0.5f, 0.0f)
                                )
                        ),
                        new Vector4f(0.0f, 0.94f, 0.33f, 0.8f),
                        Arrays.asList(0,1,2,3)
                )
        );
        //kotak coklat
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(-0.65f, -0.7f, 0.0f),
                                        new Vector3f(0.65f, -0.7f, 0.0f),
                                        new Vector3f(0.65f, -0.2f, 0.0f),
                                        new Vector3f(-0.65f, -0.2f, 0.0f)
                                )
                        ),
                        new Vector4f(0.95f, 0.46f, 0.27f, 0.8f),
                        Arrays.asList(0,1,2,3,4)
                )
        );
        //atap merah
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(-0.75f, -0.2f, 0.0f),
                                        new Vector3f(0.75f, -0.2f, 0.0f),
                                        new Vector3f(0.5f, 0.2f, 0.0f),
                                        new Vector3f(-0.5f, 0.2f, 0.0f)
                                )
                        ),
                        new Vector4f(0.95f, 0.0f, 0.0f, 0.8f),
                        Arrays.asList(0,1,2,3,4)
                )
        );
        //atap coklat
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(-0.25f, -0.2f, 0.0f),
                                        new Vector3f(-0.465f, 0.15f, 0.0f),
                                        new Vector3f(-0.65f, -0.15f, 0.0f),
                                        new Vector3f(-0.65f, -0.2f, 0.0f)
                                )
                        ),
                        new Vector4f(0.95f, 0.46f, 0.27f, 0.8f),
                        Arrays.asList(0,1,2,3)
                )
        );
        //cerobong coklat
        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(0.4f, 0.1f, 0.0f),
                                        new Vector3f(0.3f, 0.1f, 0.0f),
                                        new Vector3f(0.3f, 0.3f, 0.0f),
                                        new Vector3f(0.4f, 0.3f, 0.0f)
                                )
                        ),
                        new Vector4f(0.95f, 0.46f, 0.27f, 0.8f),
                        Arrays.asList(0,1,2,3)
                )
        );

        objectsRectangle.add(new Rectangle(
                        Arrays.asList(
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.vert", GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData(
                                        "resources/scene.frag", GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(
                                List.of(
                                        new Vector3f(0.42f, 0.3f, 0.0f),
                                        new Vector3f(0.28f, 0.3f, 0.0f),
                                        new Vector3f(0.28f, 0.33f, 0.0f),
                                        new Vector3f(0.42f, 0.33f, 0.0f)
                                )
                        ),
                        new Vector4f(0.95f, 0.0f, 0.0f, 0.8f),
                        Arrays.asList(0,1,2,3)
                )
        );

    }
    private ArrayList<Object2d> objects = new ArrayList<>();
    private ArrayList<Object2d> objectsRectangle = new ArrayList<>();
    public void loop(){
        while(window.isOpen()){
            window.update();
            glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GL.createCapabilities();

            //Code
            for(Object2d object : objectsRectangle){
                object.draw();
            }

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