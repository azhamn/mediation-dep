/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package com.wso2telco.dep.mediator.impl.smsmessaging;

import org.apache.synapse.MessageContext;
import org.json.JSONObject;

// TODO: Auto-generated Javadoc

/**
 * The Interface SMSHandler.
 */
public interface SMSHandler {

    /**
     * Validate.
     *
     * @param httpMethod the http method
     * @param requestPath the request path
     * @param jsonBody the json body
     * @param context the context
     * @return true, if successful
     * @throws Exception the exception
     */
    public boolean validate(String httpMethod, String requestPath, JSONObject jsonBody, MessageContext context) throws Exception ;

    /**
     * Handle.
     *
     * @param context the context
     * @return true, if successful
     * @throws Exception the exception
     */
    public boolean handle(MessageContext context) throws Exception;
}
