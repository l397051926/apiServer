package com.lmx.api.designserver.design.factory.abstractd.factory;

import com.lmx.api.designserver.design.factory.abstractd.dto.Person;
import com.lmx.api.designserver.design.factory.abstractd.enums.PersonType;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public abstract class PersonFactory {

    public abstract Person getPersonFactory(PersonType type);

}
