package com.lmx.api.designserver.design.factory.abstractd.factory;

import com.lmx.api.designserver.design.factory.abstractd.dto.CenterStudent;
import com.lmx.api.designserver.design.factory.abstractd.dto.CenterTeacher;
import com.lmx.api.designserver.design.factory.abstractd.dto.Person;
import com.lmx.api.designserver.design.factory.abstractd.enums.PersonType;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class CenterFactory extends PersonFactory {


    @Override
    public Person getPersonFactory(PersonType type) {
        switch (type){
            case STUDENT: return new CenterStudent();
            case TEACHER: return new CenterTeacher();
            default:return null;
        }
    }
}
