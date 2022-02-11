// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FlowConnectorType {
        SAPOData("SAPOData"),
        Salesforce("Salesforce"),
        Singular("Singular"),
        Slack("Slack"),
        Redshift("Redshift"),
        S3("S3"),
        Marketo("Marketo"),
        Googleanalytics("Googleanalytics"),
        Zendesk("Zendesk"),
        Servicenow("Servicenow"),
        Datadog("Datadog"),
        Trendmicro("Trendmicro"),
        Snowflake("Snowflake"),
        Dynatrace("Dynatrace"),
        Infornexus("Infornexus"),
        Amplitude("Amplitude"),
        Veeva("Veeva"),
        EventBridge("EventBridge"),
        Upsolver("Upsolver"),
        LookoutMetrics("LookoutMetrics");

        private final String value;

        FlowConnectorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FlowConnectorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
