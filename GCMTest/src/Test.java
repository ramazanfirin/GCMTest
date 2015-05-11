import java.io.IOException;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;


public class Test {
public static void main(String[] args) {
	String key ="AIzaSyA5vr74kwURbtKibIJUcKIe0Y019xj2gwE";
	String id  = "APA91bEYx2JyCTvy7KDp-QytAj1jVtBM1VUome9J9i9ef6qTjqqLEyjgj8cdbxGsCvpY1pl4eY2hgD3oUTN8BG7knoBiKwjzHxOE3KVcjLfbCgJywHMoRp5osuFjI4ipLg55qpT-GZYlBv_eD6Xgrzhzo21nVu34pA";
	        id = "APA91bHZMGBbTJFmNdm47uoNfMJUL7IkmwGU-DimbJq1KB7OZoozGv3OuerDVJbHOzeRJsadI1RByo4ad3bMdNjd-0twgGlArt8ptya9j8lOsfcWNMBKGCakRIcHQOedOh6T-83R2EHJj2S7-dqcMranxNYbBm6OkOBS_-Sp3LL8-p5cOnPK6NaBQgV-2wow_J81x_LnFw57";
//suneyye telefon	
	        id = "APA91bEr7tTY1FvzkxzLc8oqBwGV6ftRyoc13QRdIc8PtfPECIrAV3etHtidVp8L9a2WJn9mW5qr47Qxs2P3f8Yr4zuZQ9HApSEyG4HWo2PLADNwNzkqns5CmP9s5l5OhDEK3k5dfoYzYql-IRwzuTHUYEMXr0GF_q2KwkF6nrCDbGxqHM0obc_tt9AitSQQ1T6B_pEomw0-";
	   //grand 
	        id =  "APA91bGcEz4xnBungl7NZuhTVhp0tDejwO1TVADwD6TtnY83m_MDFpKDg4xKKtOq1UtJSLLOo8cGESwSXLx5fbvncHk9AJ3TO7_U39YZLwZjlZzLS4aic5GFlHzMO4MGQosoqv3OwjbOqTOBxIOGnDsGtvFexlNO9OKzoFvpT28gbbSz37CBebW7Bv5BTz8TRWSCc6J7OP8_";
	        Message message2 = new Message.Builder()
    .collapseKey("deneme")
    //.timeToLive(300)
    //.delayWhileIdle(true)
    //.dryRun(true)
    //.restrictedPackageName("com.example.bletesst1")
    .addData("programName", "gcmTest")
    .addData("address", "http://www.bac.com")
    .addData("message", "test")
    .addData("stopName", "Durak1")
    .addData("distance", "50")
    .addData("speed", "50")
    
    .build();
	
	
	
	Sender sender= new Sender(key);
	
	try {
		Result result = sender.send(message2, id, 10);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("bitti");
}
}
