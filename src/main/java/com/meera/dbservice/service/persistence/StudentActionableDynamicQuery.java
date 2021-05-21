package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.dbservice.model.Student;
import com.meera.dbservice.service.StudentLocalServiceUtil;

/**
 * @author LiferaySavvy
 * @generated
 */
public abstract class StudentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentLocalServiceUtil.getService());
        setClass(Student.class);

        setClassLoader(com.meera.dbservice.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentId");
    }
}
