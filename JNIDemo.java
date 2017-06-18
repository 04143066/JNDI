public class JNIDemo
{
	public native void sayHello();

	public static void main(String argv[]) {
		//put helloWorld.dll location in path
		System.loadLibrary("helloWorld");
		JNIDemo jniDemo = new JNIDemo();
		jniDemo.sayHello();
	}
}