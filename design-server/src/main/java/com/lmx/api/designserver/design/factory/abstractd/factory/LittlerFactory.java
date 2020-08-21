package com.lmx.api.designserver.design.factory.abstractd.factory;

import com.lmx.api.designserver.design.factory.abstractd.dto.LittleStudent;
import com.lmx.api.designserver.design.factory.abstractd.dto.LittleTeacher;
import com.lmx.api.designserver.design.factory.abstractd.dto.Person;
import com.lmx.api.designserver.design.factory.abstractd.enums.PersonType;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class LittlerFactory extends PersonFactory {
    @Override
    public Person getPersonFactory(PersonType type) {
        switch (type) {
            case TEACHER:
                return new LittleTeacher();
            case STUDENT:
                return new LittleStudent();
            default:
                return null;
        }
    }
}
