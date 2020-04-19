/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.openmessaging.chaos.recorder;

public class RequestLogEntry {
    public int clientId;
    public String operation;
    public LogEntryType type = LogEntryType.REQUEST;
    //only for enqueue
    public String value;
    //only for enqueue
    public String shardingKey;
    public long timestamp;

    //for enqueue
    public RequestLogEntry(int clientId, String operation, String value, long timestamp) {
        this.clientId = clientId;
        this.operation = operation;
        this.value = value;
        this.timestamp = timestamp;
    }

    public RequestLogEntry(int clientId, String operation, String shardingKey, String value,
        long timestamp) {
        this.clientId = clientId;
        this.operation = operation;
        this.value = value;
        this.shardingKey = shardingKey;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s\t%d\n", clientId, operation, type, value, shardingKey, timestamp);
    }
}
