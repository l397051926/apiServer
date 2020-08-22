package com.lmx.api.designserver.design.adupter.springmvc.cont;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public interface Controller {

    boolean supposed(Controller controller);

    void doStart();
}

class HelloController implements Controller{

    @Override
    public boolean supposed(Controller controller) {
        return controller instanceof HelloController;
    }

    @Override
    public void doStart() {
        System.out.println("hello controller do");
    }
}

class DemoController implements Controller{

    @Override
    public boolean supposed(Controller controller) {
        return controller instanceof  DemoController;
    }

    @Override
    public void doStart() {
        System.out.println("demo controller do");
    }
}
