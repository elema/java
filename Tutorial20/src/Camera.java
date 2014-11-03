
public class Camera extends Machine{
	public void snap() {
		System.out.println("Photo taken");
	}
	@Override
	public void stop() {
		System.out.println("Camera stopped");
	}
}