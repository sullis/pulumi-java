// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.outputs;

import com.pulumi.awsnative.backup.outputs.ReportDeliveryChannelProperties;
import com.pulumi.awsnative.backup.outputs.ReportPlanTag;
import com.pulumi.awsnative.backup.outputs.ReportSettingProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReportPlanResult {
    /**
     * @return A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    private final @Nullable ReportDeliveryChannelProperties reportDeliveryChannel;
    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    private final @Nullable String reportPlanArn;
    /**
     * @return An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    private final @Nullable String reportPlanDescription;
    /**
     * @return Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<ReportPlanTag> reportPlanTags;
    /**
     * @return Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    private final @Nullable ReportSettingProperties reportSetting;

    @CustomType.Constructor
    private GetReportPlanResult(
        @CustomType.Parameter("reportDeliveryChannel") @Nullable ReportDeliveryChannelProperties reportDeliveryChannel,
        @CustomType.Parameter("reportPlanArn") @Nullable String reportPlanArn,
        @CustomType.Parameter("reportPlanDescription") @Nullable String reportPlanDescription,
        @CustomType.Parameter("reportPlanTags") @Nullable List<ReportPlanTag> reportPlanTags,
        @CustomType.Parameter("reportSetting") @Nullable ReportSettingProperties reportSetting) {
        this.reportDeliveryChannel = reportDeliveryChannel;
        this.reportPlanArn = reportPlanArn;
        this.reportPlanDescription = reportPlanDescription;
        this.reportPlanTags = reportPlanTags;
        this.reportSetting = reportSetting;
    }

    /**
     * @return A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    public Optional<ReportDeliveryChannelProperties> reportDeliveryChannel() {
        return Optional.ofNullable(this.reportDeliveryChannel);
    }
    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    public Optional<String> reportPlanArn() {
        return Optional.ofNullable(this.reportPlanArn);
    }
    /**
     * @return An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    public Optional<String> reportPlanDescription() {
        return Optional.ofNullable(this.reportPlanDescription);
    }
    /**
     * @return Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    public List<ReportPlanTag> reportPlanTags() {
        return this.reportPlanTags == null ? List.of() : this.reportPlanTags;
    }
    /**
     * @return Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    public Optional<ReportSettingProperties> reportSetting() {
        return Optional.ofNullable(this.reportSetting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ReportDeliveryChannelProperties reportDeliveryChannel;
        private @Nullable String reportPlanArn;
        private @Nullable String reportPlanDescription;
        private @Nullable List<ReportPlanTag> reportPlanTags;
        private @Nullable ReportSettingProperties reportSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reportDeliveryChannel = defaults.reportDeliveryChannel;
    	      this.reportPlanArn = defaults.reportPlanArn;
    	      this.reportPlanDescription = defaults.reportPlanDescription;
    	      this.reportPlanTags = defaults.reportPlanTags;
    	      this.reportSetting = defaults.reportSetting;
        }

        public Builder reportDeliveryChannel(@Nullable ReportDeliveryChannelProperties reportDeliveryChannel) {
            this.reportDeliveryChannel = reportDeliveryChannel;
            return this;
        }
        public Builder reportPlanArn(@Nullable String reportPlanArn) {
            this.reportPlanArn = reportPlanArn;
            return this;
        }
        public Builder reportPlanDescription(@Nullable String reportPlanDescription) {
            this.reportPlanDescription = reportPlanDescription;
            return this;
        }
        public Builder reportPlanTags(@Nullable List<ReportPlanTag> reportPlanTags) {
            this.reportPlanTags = reportPlanTags;
            return this;
        }
        public Builder reportPlanTags(ReportPlanTag... reportPlanTags) {
            return reportPlanTags(List.of(reportPlanTags));
        }
        public Builder reportSetting(@Nullable ReportSettingProperties reportSetting) {
            this.reportSetting = reportSetting;
            return this;
        }        public GetReportPlanResult build() {
            return new GetReportPlanResult(reportDeliveryChannel, reportPlanArn, reportPlanDescription, reportPlanTags, reportSetting);
        }
    }
}
