package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean changeingScene = false;
    private float timeToChangeScene = 2.0f;
    public LevelEditorScene(){
        System.out.println("Inside level editor scene");
    }

    @Override
    public void update(float dt) {


        if(!changeingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)){
            changeingScene = true;
        }

        if (changeingScene && timeToChangeScene > 0){
            timeToChangeScene -= dt;
            Window.get().r -= dt * 5.0f;
            Window.get().g -= dt * 5.0f;
            Window.get().b -= dt * 5.0f;
        } else if (changeingScene) {
            Window.changeScene( 1 );
        }
    }
}
