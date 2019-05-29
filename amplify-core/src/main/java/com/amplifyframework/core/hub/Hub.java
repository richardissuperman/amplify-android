/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.core.hub;

import com.amplifyframework.core.async.Callback;
import com.amplifyframework.core.task.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hub {

    private static Map<HubChannel, ArrayList<Callback<? extends Result>>> callbacks =
            new HashMap<HubChannel, ArrayList<Callback<? extends Result>>>();

    public static void listen(HubChannel hubChannel, Callback<? extends Result> callback) {

    }

    public static void dispatch(HubChannel hubChannel, HubPayload hubpayload) {

    }

    public static void remove(HubChannel hubChannel, Callback<? extends Result> callback) {

    }
}