package jpu2016.dogfight.view;


import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

public class EventPerformer implements IEventPerformer{
    public EventPerformer(IOrderPerformer orderPerformer) {

    }

    @Override
    public void eventPerform(KeyEvent keyCode){

    }

    private UserOrder keyCodeToUserOrder(int keyCode){
        return new UserOrder();
    }
}
