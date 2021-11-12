package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract public class AbstractTemplate {
    public void execute(){
        long startTime = System.currentTimeMillis();

        call();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;

        log.info("resultTime:{}", resultTime);
    }

    abstract void call();
}
