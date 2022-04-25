// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ReportDefinitionResponse;
import com.pulumi.azurenative.costmanagement.outputs.ReportDeliveryInfoResponse;
import com.pulumi.azurenative.costmanagement.outputs.ReportScheduleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReportResult {
    /**
     * @return Has definition for the report.
     * 
     */
    private final ReportDefinitionResponse definition;
    /**
     * @return Has delivery information for the report.
     * 
     */
    private final ReportDeliveryInfoResponse deliveryInfo;
    /**
     * @return The format of the report being delivered.
     * 
     */
    private final @Nullable String format;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Has schedule information for the report.
     * 
     */
    private final @Nullable ReportScheduleResponse schedule;
    /**
     * @return Resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetReportResult(
        @CustomType.Parameter("definition") ReportDefinitionResponse definition,
        @CustomType.Parameter("deliveryInfo") ReportDeliveryInfoResponse deliveryInfo,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") @Nullable ReportScheduleResponse schedule,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.definition = definition;
        this.deliveryInfo = deliveryInfo;
        this.format = format;
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Has definition for the report.
     * 
     */
    public ReportDefinitionResponse definition() {
        return this.definition;
    }
    /**
     * @return Has delivery information for the report.
     * 
     */
    public ReportDeliveryInfoResponse deliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * @return The format of the report being delivered.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Has schedule information for the report.
     * 
     */
    public Optional<ReportScheduleResponse> schedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDefinitionResponse definition;
        private ReportDeliveryInfoResponse deliveryInfo;
        private @Nullable String format;
        private String id;
        private String name;
        private @Nullable ReportScheduleResponse schedule;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder definition(ReportDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder deliveryInfo(ReportDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(@Nullable ReportScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetReportResult build() {
            return new GetReportResult(definition, deliveryInfo, format, id, name, schedule, tags, type);
        }
    }
}
