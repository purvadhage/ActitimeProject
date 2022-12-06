/* Robot Class= Robot class is a class present in java.AWT package.
 * .AWT (Abstract Window Tool Kit)
 */

//Q] Write a script to demonstrate Robot class for typing Qsp in Notepad.

package nishu;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class robot {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("Notepad");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		
		
		

	}

}
