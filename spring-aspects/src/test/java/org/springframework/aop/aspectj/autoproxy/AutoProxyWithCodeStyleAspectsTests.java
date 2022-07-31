/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop.aspectj.autoproxy;

import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adrian Colyer
 */
public class AutoProxyWithCodeStyleAspectsTests {

	ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");

	@Test
	@SuppressWarnings("resource")
	public void noAutoproxyingOfAjcCompiledAspects() {
		new ClassPathXmlApplicationContext("org/springframework/aop/aspectj/autoproxy/ajcAutoproxyTests.xml");
	}

	@Test
	public void testAc() {
		SpringConfiguredConfiguration bean = ac.getBean(SpringConfiguredConfiguration.class);
	}

}
