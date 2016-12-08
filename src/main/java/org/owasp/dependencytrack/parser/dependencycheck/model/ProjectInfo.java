/*
 * This file is part of Dependency-Track.
 *
 * Dependency-Track is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Dependency-Track is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Dependency-Track. If not, see http://www.gnu.org/licenses/.
 */
package org.owasp.dependencytrack.parser.dependencycheck.model;

import org.apache.commons.lang3.StringUtils;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "projectInfo")
public class ProjectInfo {

    private String name;
    private String reportDate;
    private String credits;

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = StringUtils.normalizeSpace(StringUtils.trimToNull(name));
    }

    public String getReportDate() {
        return reportDate;
    }

    @XmlElement(name = "reportDate")
    public void setReportDate(String reportDate) {
        this.reportDate = StringUtils.normalizeSpace(StringUtils.trimToNull(reportDate));
    }

    public String getCredits() {
        return credits;
    }

    @XmlElement(name = "credits")
    public void setCredits(String credits) {
        this.credits = StringUtils.normalizeSpace(StringUtils.trimToNull(credits));
    }
}