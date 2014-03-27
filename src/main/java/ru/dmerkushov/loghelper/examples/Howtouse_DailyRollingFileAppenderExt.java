/*
 * Copyright 2014 dmerkushov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.dmerkushov.loghelper.examples;

import java.io.IOException;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Example utility that creates Log4j log files according to log4j_DailyRollingFileAppenderExt.xml. See log4j_DailyRollingFileAppenderExt.xml for instructions on DailyRollingFileAppenderExt configuration
 * @author Dmitriy Merkushov
 */
public class Howtouse_DailyRollingFileAppenderExt {
	
	public static void main (String args[]) throws Exception {

		DOMConfigurator.configure ("log4j_DailyRollingFileAppenderExt.xml");
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger (Howtouse_DailyRollingFileAppenderExt.class.getCanonicalName ());
		
		int statements = 500;

		for (int i = 0; i < statements; i++) {
			logger.fatal ("Fatal message " + i, new IOException ("Fatal IOException " + i));
			System.out.println ("Statement " + i + " of " + statements + " written down. Sleeping...");
			Thread.sleep (2000L);
		}

		System.out.println ("Over");	}

}
