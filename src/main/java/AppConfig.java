import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean(name="cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll() ;
    }

    @Bean(name="camera")
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
