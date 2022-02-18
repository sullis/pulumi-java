// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     */
    @EnumType
    public enum PackagingConfigurationDashPackageSegmentTemplateFormat {
        NumberWithTimeline("NUMBER_WITH_TIMELINE"),
        TimeWithTimeline("TIME_WITH_TIMELINE"),
        NumberWithDuration("NUMBER_WITH_DURATION");

        private final String value;

        PackagingConfigurationDashPackageSegmentTemplateFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PackagingConfigurationDashPackageSegmentTemplateFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
