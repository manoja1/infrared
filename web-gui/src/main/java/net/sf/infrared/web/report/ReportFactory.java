/* 
 * Copyright 2005 Tavant Technologies and Contributors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License")
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
 * 
 *
 *
 * Original Author:  kamal.govindraj (Tavant Technologies)
 * Contributor(s):   -;
 *
 */
package net.sf.infrared.web.report;

/**
 * Returns an implementation of the SummaryReport Interface based on the report type parameter passed.
 */
public class ReportFactory
{
    public static final String EXCEL = "xls";

    public static SummaryReport createReport(String reportType)
    {
        if (EXCEL.equals(reportType))
        {
             return new ExcelSummaryReport();
        }
        else
        {
            throw new IllegalArgumentException("Can't create report for type "
                                               + reportType);
        }
    }
}
