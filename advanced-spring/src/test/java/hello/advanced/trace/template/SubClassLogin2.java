package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogin2 extends AbstractTemplate{
    @Override
    void call() {
        log.info("비즈니스 로직2 실행");
    }
}
