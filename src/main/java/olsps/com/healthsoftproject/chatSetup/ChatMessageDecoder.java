/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olsps.com.healthsoftproject.chatSetup;

import java.io.StringReader;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author Eusuph
 */
public class ChatMessageDecoder implements Decoder.Text<ChatMessage>{

    @Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public ChatMessage decode(final String textMessage) throws DecodeException {
		ChatMessage chatMessage = new ChatMessage();
		JsonObject obj = Json.createReader(new StringReader(textMessage))
				.readObject();
		chatMessage.setMessage(obj.getString("message"));
		chatMessage.setSender(obj.getString("sender"));
		chatMessage.setRecieved(new Date());
		return chatMessage;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
    
}
