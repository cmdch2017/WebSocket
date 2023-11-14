package org.example.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

import static org.example.websocket.WebSocketMessageUtil.SESSION_MAP;


/**
 * ws://127.0.0.1:8081/api/pad/websocket
 */
@Component
@ServerEndpoint("/websocket")
/**
 *
 * @author lst
 * @date 2022/12/15 11:12
 * @param null
 * @return null
 */
public class WebSocketService {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        SESSION_MAP.put(session.getId(), session);
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        WebSocketMessageUtil.close(session);
    }

    /**
     * 连接错误调用的方法
     */
    @OnError
    public void onError(Throwable error) {

    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     **/
    @OnMessage
    public void onMessage(Session session, String message) {

    }

}
