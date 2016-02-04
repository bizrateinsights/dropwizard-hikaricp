/*
 * Copyright (c) 2016 Deloitte MCS Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.deloittedigital.dropwizard.hikari;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.dropwizard.db.ManagedDataSource;

/**
 *
 */
public class ManagedHikariPoolWrapper extends HikariDataSource implements ManagedDataSource {

    public ManagedHikariPoolWrapper(HikariConfig hikariConfig) {
        super(hikariConfig);
    }

    @Override
    public void start() throws Exception {
    }

    @Override
    public void stop() throws Exception {
        this.close();
    }
}
