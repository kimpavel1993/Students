package com.meera.dbservice.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.meera.dbservice.service.ClpSerializer;
import com.meera.dbservice.service.StudentLocalServiceUtil;
import com.meera.dbservice.service.StudentServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
        }
    }
}
