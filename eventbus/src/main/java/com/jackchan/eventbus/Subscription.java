/*
 * Copyright (C) 2016 JackChan <jackychan2040@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jackchan.eventbus;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：FocusToday
 * Package_Name：com.jackchan.eventbus
 * Version：1.0
 * time：2016/4/25 0:46
 * des ：订阅者对象,包含订阅者和目标方法
 * gitVersion：2.12.0.windows.1
 * updateAuthor：JackChan
 * updateDate：2016/4/25 0:46
 * updateDes：${TODO}
 * ============================================================
 */

public class Subscription {
    /**
     * 订阅者对象
     */
    public Reference<Object> subscriber;
    /**
     * 接受者的方法
     */
    public Method targetMethod;
    /**
     * 执行事件的线程模型
     */
    public ThreadMode threadMode;
    /**
     * 事件类型
     */
    public EventType eventType;

    /**
     * @param subscriber
     * @param targetMethod
     */
    public Subscription(Object subscriber, TargetMethod targetMethod) {
        this.subscriber = new WeakReference<Object>(subscriber);
        this.targetMethod = targetMethod.method;
        this.threadMode = targetMethod.threadMode;
        this.eventType = targetMethod.eventType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subscriber == null) ? 0 : subscriber.hashCode());
        result = prime * result + ((targetMethod == null) ? 0 : targetMethod.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Subscription other = (Subscription) obj;
        if (subscriber.get() == null) {
            if (other.subscriber.get() != null)
                return false;
        } else if (!subscriber.get().equals(other.subscriber.get()))
            return false;
        if (targetMethod == null) {
            if (other.targetMethod != null)
                return false;
        } else if (!targetMethod.equals(other.targetMethod))
            return false;
        return true;
    }

}
