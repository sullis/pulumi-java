// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowAmplitudeSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowDatadogSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowDynatraceSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowGoogleAnalyticsSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowInforNexusSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowMarketoSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowS3SourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSAPODataSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSalesforceSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowServiceNowSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSingularSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSlackSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTrendmicroSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowVeevaSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowZendeskSourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source connector details required to query a connector
 * 
 */
public final class FlowSourceConnectorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSourceConnectorPropertiesArgs Empty = new FlowSourceConnectorPropertiesArgs();

    @InputImport(name="amplitude")
    private final @Nullable Input<FlowAmplitudeSourcePropertiesArgs> amplitude;

    public Input<FlowAmplitudeSourcePropertiesArgs> getAmplitude() {
        return this.amplitude == null ? Input.empty() : this.amplitude;
    }

    @InputImport(name="datadog")
    private final @Nullable Input<FlowDatadogSourcePropertiesArgs> datadog;

    public Input<FlowDatadogSourcePropertiesArgs> getDatadog() {
        return this.datadog == null ? Input.empty() : this.datadog;
    }

    @InputImport(name="dynatrace")
    private final @Nullable Input<FlowDynatraceSourcePropertiesArgs> dynatrace;

    public Input<FlowDynatraceSourcePropertiesArgs> getDynatrace() {
        return this.dynatrace == null ? Input.empty() : this.dynatrace;
    }

    @InputImport(name="googleAnalytics")
    private final @Nullable Input<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics;

    public Input<FlowGoogleAnalyticsSourcePropertiesArgs> getGoogleAnalytics() {
        return this.googleAnalytics == null ? Input.empty() : this.googleAnalytics;
    }

    @InputImport(name="inforNexus")
    private final @Nullable Input<FlowInforNexusSourcePropertiesArgs> inforNexus;

    public Input<FlowInforNexusSourcePropertiesArgs> getInforNexus() {
        return this.inforNexus == null ? Input.empty() : this.inforNexus;
    }

    @InputImport(name="marketo")
    private final @Nullable Input<FlowMarketoSourcePropertiesArgs> marketo;

    public Input<FlowMarketoSourcePropertiesArgs> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="s3")
    private final @Nullable Input<FlowS3SourcePropertiesArgs> s3;

    public Input<FlowS3SourcePropertiesArgs> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="sAPOData")
    private final @Nullable Input<FlowSAPODataSourcePropertiesArgs> sAPOData;

    public Input<FlowSAPODataSourcePropertiesArgs> getSAPOData() {
        return this.sAPOData == null ? Input.empty() : this.sAPOData;
    }

    @InputImport(name="salesforce")
    private final @Nullable Input<FlowSalesforceSourcePropertiesArgs> salesforce;

    public Input<FlowSalesforceSourcePropertiesArgs> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
    private final @Nullable Input<FlowServiceNowSourcePropertiesArgs> serviceNow;

    public Input<FlowServiceNowSourcePropertiesArgs> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="singular")
    private final @Nullable Input<FlowSingularSourcePropertiesArgs> singular;

    public Input<FlowSingularSourcePropertiesArgs> getSingular() {
        return this.singular == null ? Input.empty() : this.singular;
    }

    @InputImport(name="slack")
    private final @Nullable Input<FlowSlackSourcePropertiesArgs> slack;

    public Input<FlowSlackSourcePropertiesArgs> getSlack() {
        return this.slack == null ? Input.empty() : this.slack;
    }

    @InputImport(name="trendmicro")
    private final @Nullable Input<FlowTrendmicroSourcePropertiesArgs> trendmicro;

    public Input<FlowTrendmicroSourcePropertiesArgs> getTrendmicro() {
        return this.trendmicro == null ? Input.empty() : this.trendmicro;
    }

    @InputImport(name="veeva")
    private final @Nullable Input<FlowVeevaSourcePropertiesArgs> veeva;

    public Input<FlowVeevaSourcePropertiesArgs> getVeeva() {
        return this.veeva == null ? Input.empty() : this.veeva;
    }

    @InputImport(name="zendesk")
    private final @Nullable Input<FlowZendeskSourcePropertiesArgs> zendesk;

    public Input<FlowZendeskSourcePropertiesArgs> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public FlowSourceConnectorPropertiesArgs(
        @Nullable Input<FlowAmplitudeSourcePropertiesArgs> amplitude,
        @Nullable Input<FlowDatadogSourcePropertiesArgs> datadog,
        @Nullable Input<FlowDynatraceSourcePropertiesArgs> dynatrace,
        @Nullable Input<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics,
        @Nullable Input<FlowInforNexusSourcePropertiesArgs> inforNexus,
        @Nullable Input<FlowMarketoSourcePropertiesArgs> marketo,
        @Nullable Input<FlowS3SourcePropertiesArgs> s3,
        @Nullable Input<FlowSAPODataSourcePropertiesArgs> sAPOData,
        @Nullable Input<FlowSalesforceSourcePropertiesArgs> salesforce,
        @Nullable Input<FlowServiceNowSourcePropertiesArgs> serviceNow,
        @Nullable Input<FlowSingularSourcePropertiesArgs> singular,
        @Nullable Input<FlowSlackSourcePropertiesArgs> slack,
        @Nullable Input<FlowTrendmicroSourcePropertiesArgs> trendmicro,
        @Nullable Input<FlowVeevaSourcePropertiesArgs> veeva,
        @Nullable Input<FlowZendeskSourcePropertiesArgs> zendesk) {
        this.amplitude = amplitude;
        this.datadog = datadog;
        this.dynatrace = dynatrace;
        this.googleAnalytics = googleAnalytics;
        this.inforNexus = inforNexus;
        this.marketo = marketo;
        this.s3 = s3;
        this.sAPOData = sAPOData;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.singular = singular;
        this.slack = slack;
        this.trendmicro = trendmicro;
        this.veeva = veeva;
        this.zendesk = zendesk;
    }

    private FlowSourceConnectorPropertiesArgs() {
        this.amplitude = Input.empty();
        this.datadog = Input.empty();
        this.dynatrace = Input.empty();
        this.googleAnalytics = Input.empty();
        this.inforNexus = Input.empty();
        this.marketo = Input.empty();
        this.s3 = Input.empty();
        this.sAPOData = Input.empty();
        this.salesforce = Input.empty();
        this.serviceNow = Input.empty();
        this.singular = Input.empty();
        this.slack = Input.empty();
        this.trendmicro = Input.empty();
        this.veeva = Input.empty();
        this.zendesk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowAmplitudeSourcePropertiesArgs> amplitude;
        private @Nullable Input<FlowDatadogSourcePropertiesArgs> datadog;
        private @Nullable Input<FlowDynatraceSourcePropertiesArgs> dynatrace;
        private @Nullable Input<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics;
        private @Nullable Input<FlowInforNexusSourcePropertiesArgs> inforNexus;
        private @Nullable Input<FlowMarketoSourcePropertiesArgs> marketo;
        private @Nullable Input<FlowS3SourcePropertiesArgs> s3;
        private @Nullable Input<FlowSAPODataSourcePropertiesArgs> sAPOData;
        private @Nullable Input<FlowSalesforceSourcePropertiesArgs> salesforce;
        private @Nullable Input<FlowServiceNowSourcePropertiesArgs> serviceNow;
        private @Nullable Input<FlowSingularSourcePropertiesArgs> singular;
        private @Nullable Input<FlowSlackSourcePropertiesArgs> slack;
        private @Nullable Input<FlowTrendmicroSourcePropertiesArgs> trendmicro;
        private @Nullable Input<FlowVeevaSourcePropertiesArgs> veeva;
        private @Nullable Input<FlowZendeskSourcePropertiesArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceConnectorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amplitude = defaults.amplitude;
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.googleAnalytics = defaults.googleAnalytics;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.sAPOData = defaults.sAPOData;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.singular = defaults.singular;
    	      this.slack = defaults.slack;
    	      this.trendmicro = defaults.trendmicro;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setAmplitude(@Nullable Input<FlowAmplitudeSourcePropertiesArgs> amplitude) {
            this.amplitude = amplitude;
            return this;
        }

        public Builder setAmplitude(@Nullable FlowAmplitudeSourcePropertiesArgs amplitude) {
            this.amplitude = Input.ofNullable(amplitude);
            return this;
        }

        public Builder setDatadog(@Nullable Input<FlowDatadogSourcePropertiesArgs> datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDatadog(@Nullable FlowDatadogSourcePropertiesArgs datadog) {
            this.datadog = Input.ofNullable(datadog);
            return this;
        }

        public Builder setDynatrace(@Nullable Input<FlowDynatraceSourcePropertiesArgs> dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setDynatrace(@Nullable FlowDynatraceSourcePropertiesArgs dynatrace) {
            this.dynatrace = Input.ofNullable(dynatrace);
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable Input<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable FlowGoogleAnalyticsSourcePropertiesArgs googleAnalytics) {
            this.googleAnalytics = Input.ofNullable(googleAnalytics);
            return this;
        }

        public Builder setInforNexus(@Nullable Input<FlowInforNexusSourcePropertiesArgs> inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setInforNexus(@Nullable FlowInforNexusSourcePropertiesArgs inforNexus) {
            this.inforNexus = Input.ofNullable(inforNexus);
            return this;
        }

        public Builder setMarketo(@Nullable Input<FlowMarketoSourcePropertiesArgs> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable FlowMarketoSourcePropertiesArgs marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setS3(@Nullable Input<FlowS3SourcePropertiesArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable FlowS3SourcePropertiesArgs s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setSAPOData(@Nullable Input<FlowSAPODataSourcePropertiesArgs> sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSAPOData(@Nullable FlowSAPODataSourcePropertiesArgs sAPOData) {
            this.sAPOData = Input.ofNullable(sAPOData);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<FlowSalesforceSourcePropertiesArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable FlowSalesforceSourcePropertiesArgs salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<FlowServiceNowSourcePropertiesArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable FlowServiceNowSourcePropertiesArgs serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setSingular(@Nullable Input<FlowSingularSourcePropertiesArgs> singular) {
            this.singular = singular;
            return this;
        }

        public Builder setSingular(@Nullable FlowSingularSourcePropertiesArgs singular) {
            this.singular = Input.ofNullable(singular);
            return this;
        }

        public Builder setSlack(@Nullable Input<FlowSlackSourcePropertiesArgs> slack) {
            this.slack = slack;
            return this;
        }

        public Builder setSlack(@Nullable FlowSlackSourcePropertiesArgs slack) {
            this.slack = Input.ofNullable(slack);
            return this;
        }

        public Builder setTrendmicro(@Nullable Input<FlowTrendmicroSourcePropertiesArgs> trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }

        public Builder setTrendmicro(@Nullable FlowTrendmicroSourcePropertiesArgs trendmicro) {
            this.trendmicro = Input.ofNullable(trendmicro);
            return this;
        }

        public Builder setVeeva(@Nullable Input<FlowVeevaSourcePropertiesArgs> veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setVeeva(@Nullable FlowVeevaSourcePropertiesArgs veeva) {
            this.veeva = Input.ofNullable(veeva);
            return this;
        }

        public Builder setZendesk(@Nullable Input<FlowZendeskSourcePropertiesArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable FlowZendeskSourcePropertiesArgs zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }

        public FlowSourceConnectorPropertiesArgs build() {
            return new FlowSourceConnectorPropertiesArgs(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, s3, sAPOData, salesforce, serviceNow, singular, slack, trendmicro, veeva, zendesk);
        }
    }
}
