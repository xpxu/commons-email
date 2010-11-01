/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.mail;

import javax.activation.DataSource;
import java.io.IOException;

/**
 * Creates a <code>DataSource</code> based on an URL.
 *
 * @since 1.3
 */
public interface DataSourceResolver
{
    /**
     * Resolves the given resource location to a <code>DataSource</code>.
     *
     * @param resourceLocation the location of the resource
     * @return the <code>DataSource</code>
     * @throws IOException the resource was not found
     */
    DataSource resolve(final String resourceLocation) throws IOException;
}
