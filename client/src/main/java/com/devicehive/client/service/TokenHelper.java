/*
 *
 *
 *   TokenHelper.java
 *
 *   Copyright (C) 2017 DataArt
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.devicehive.client.service;

import com.devicehive.client.model.TokenAuth;

class TokenHelper {
    private final TokenAuth tokenAuth;

    TokenHelper() {
        tokenAuth = new TokenAuth();
    }

    private static class InstanceHolder {
        static final TokenHelper INSTANCE = new TokenHelper();
    }

    static TokenHelper getInstance() {
        return TokenHelper.InstanceHolder.INSTANCE;
    }

    TokenAuth getTokenAuth() {
        return tokenAuth;
    }
}
