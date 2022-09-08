package site.telion.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "<b>hello</b>";
    }

    public String answerHello(String userName) {
        return "<b>answer-hello</b> " + userName;
    }
}
