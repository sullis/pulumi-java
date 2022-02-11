// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowAmplitudeConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowDatadogConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowDynatraceConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowGoogleAnalyticsConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowInforNexusConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowMarketoConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowS3ConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSAPODataConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSalesforceConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowServiceNowConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSingularConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSlackConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowTrendmicroConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowVeevaConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowZendeskConnectorOperator;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowConnectorOperatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowConnectorOperatorArgs Empty = new FlowConnectorOperatorArgs();

    @InputImport(name="amplitude")
    private final @Nullable Input<FlowAmplitudeConnectorOperator> amplitude;

    public Input<FlowAmplitudeConnectorOperator> getAmplitude() {
        return this.amplitude == null ? Input.empty() : this.amplitude;
    }

    @InputImport(name="datadog")
    private final @Nullable Input<FlowDatadogConnectorOperator> datadog;

    public Input<FlowDatadogConnectorOperator> getDatadog() {
        return this.datadog == null ? Input.empty() : this.datadog;
    }

    @InputImport(name="dynatrace")
    private final @Nullable Input<FlowDynatraceConnectorOperator> dynatrace;

    public Input<FlowDynatraceConnectorOperator> getDynatrace() {
        return this.dynatrace == null ? Input.empty() : this.dynatrace;
    }

    @InputImport(name="googleAnalytics")
    private final @Nullable Input<FlowGoogleAnalyticsConnectorOperator> googleAnalytics;

    public Input<FlowGoogleAnalyticsConnectorOperator> getGoogleAnalytics() {
        return this.googleAnalytics == null ? Input.empty() : this.googleAnalytics;
    }

    @InputImport(name="inforNexus")
    private final @Nullable Input<FlowInforNexusConnectorOperator> inforNexus;

    public Input<FlowInforNexusConnectorOperator> getInforNexus() {
        return this.inforNexus == null ? Input.empty() : this.inforNexus;
    }

    @InputImport(name="marketo")
    private final @Nullable Input<FlowMarketoConnectorOperator> marketo;

    public Input<FlowMarketoConnectorOperator> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="s3")
    private final @Nullable Input<FlowS3ConnectorOperator> s3;

    public Input<FlowS3ConnectorOperator> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="sAPOData")
    private final @Nullable Input<FlowSAPODataConnectorOperator> sAPOData;

    public Input<FlowSAPODataConnectorOperator> getSAPOData() {
        return this.sAPOData == null ? Input.empty() : this.sAPOData;
    }

    @InputImport(name="salesforce")
    private final @Nullable Input<FlowSalesforceConnectorOperator> salesforce;

    public Input<FlowSalesforceConnectorOperator> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
    private final @Nullable Input<FlowServiceNowConnectorOperator> serviceNow;

    public Input<FlowServiceNowConnectorOperator> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="singular")
    private final @Nullable Input<FlowSingularConnectorOperator> singular;

    public Input<FlowSingularConnectorOperator> getSingular() {
        return this.singular == null ? Input.empty() : this.singular;
    }

    @InputImport(name="slack")
    private final @Nullable Input<FlowSlackConnectorOperator> slack;

    public Input<FlowSlackConnectorOperator> getSlack() {
        return this.slack == null ? Input.empty() : this.slack;
    }

    @InputImport(name="trendmicro")
    private final @Nullable Input<FlowTrendmicroConnectorOperator> trendmicro;

    public Input<FlowTrendmicroConnectorOperator> getTrendmicro() {
        return this.trendmicro == null ? Input.empty() : this.trendmicro;
    }

    @InputImport(name="veeva")
    private final @Nullable Input<FlowVeevaConnectorOperator> veeva;

    public Input<FlowVeevaConnectorOperator> getVeeva() {
        return this.veeva == null ? Input.empty() : this.veeva;
    }

    @InputImport(name="zendesk")
    private final @Nullable Input<FlowZendeskConnectorOperator> zendesk;

    public Input<FlowZendeskConnectorOperator> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public FlowConnectorOperatorArgs(
        @Nullable Input<FlowAmplitudeConnectorOperator> amplitude,
        @Nullable Input<FlowDatadogConnectorOperator> datadog,
        @Nullable Input<FlowDynatraceConnectorOperator> dynatrace,
        @Nullable Input<FlowGoogleAnalyticsConnectorOperator> googleAnalytics,
        @Nullable Input<FlowInforNexusConnectorOperator> inforNexus,
        @Nullable Input<FlowMarketoConnectorOperator> marketo,
        @Nullable Input<FlowS3ConnectorOperator> s3,
        @Nullable Input<FlowSAPODataConnectorOperator> sAPOData,
        @Nullable Input<FlowSalesforceConnectorOperator> salesforce,
        @Nullable Input<FlowServiceNowConnectorOperator> serviceNow,
        @Nullable Input<FlowSingularConnectorOperator> singular,
        @Nullable Input<FlowSlackConnectorOperator> slack,
        @Nullable Input<FlowTrendmicroConnectorOperator> trendmicro,
        @Nullable Input<FlowVeevaConnectorOperator> veeva,
        @Nullable Input<FlowZendeskConnectorOperator> zendesk) {
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

    private FlowConnectorOperatorArgs() {
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

    public static Builder builder(FlowConnectorOperatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowAmplitudeConnectorOperator> amplitude;
        private @Nullable Input<FlowDatadogConnectorOperator> datadog;
        private @Nullable Input<FlowDynatraceConnectorOperator> dynatrace;
        private @Nullable Input<FlowGoogleAnalyticsConnectorOperator> googleAnalytics;
        private @Nullable Input<FlowInforNexusConnectorOperator> inforNexus;
        private @Nullable Input<FlowMarketoConnectorOperator> marketo;
        private @Nullable Input<FlowS3ConnectorOperator> s3;
        private @Nullable Input<FlowSAPODataConnectorOperator> sAPOData;
        private @Nullable Input<FlowSalesforceConnectorOperator> salesforce;
        private @Nullable Input<FlowServiceNowConnectorOperator> serviceNow;
        private @Nullable Input<FlowSingularConnectorOperator> singular;
        private @Nullable Input<FlowSlackConnectorOperator> slack;
        private @Nullable Input<FlowTrendmicroConnectorOperator> trendmicro;
        private @Nullable Input<FlowVeevaConnectorOperator> veeva;
        private @Nullable Input<FlowZendeskConnectorOperator> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowConnectorOperatorArgs defaults) {
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

        public Builder setAmplitude(@Nullable Input<FlowAmplitudeConnectorOperator> amplitude) {
            this.amplitude = amplitude;
            return this;
        }

        public Builder setAmplitude(@Nullable FlowAmplitudeConnectorOperator amplitude) {
            this.amplitude = Input.ofNullable(amplitude);
            return this;
        }

        public Builder setDatadog(@Nullable Input<FlowDatadogConnectorOperator> datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDatadog(@Nullable FlowDatadogConnectorOperator datadog) {
            this.datadog = Input.ofNullable(datadog);
            return this;
        }

        public Builder setDynatrace(@Nullable Input<FlowDynatraceConnectorOperator> dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setDynatrace(@Nullable FlowDynatraceConnectorOperator dynatrace) {
            this.dynatrace = Input.ofNullable(dynatrace);
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable Input<FlowGoogleAnalyticsConnectorOperator> googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics) {
            this.googleAnalytics = Input.ofNullable(googleAnalytics);
            return this;
        }

        public Builder setInforNexus(@Nullable Input<FlowInforNexusConnectorOperator> inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setInforNexus(@Nullable FlowInforNexusConnectorOperator inforNexus) {
            this.inforNexus = Input.ofNullable(inforNexus);
            return this;
        }

        public Builder setMarketo(@Nullable Input<FlowMarketoConnectorOperator> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable FlowMarketoConnectorOperator marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setS3(@Nullable Input<FlowS3ConnectorOperator> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable FlowS3ConnectorOperator s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setSAPOData(@Nullable Input<FlowSAPODataConnectorOperator> sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSAPOData(@Nullable FlowSAPODataConnectorOperator sAPOData) {
            this.sAPOData = Input.ofNullable(sAPOData);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<FlowSalesforceConnectorOperator> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable FlowSalesforceConnectorOperator salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<FlowServiceNowConnectorOperator> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable FlowServiceNowConnectorOperator serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setSingular(@Nullable Input<FlowSingularConnectorOperator> singular) {
            this.singular = singular;
            return this;
        }

        public Builder setSingular(@Nullable FlowSingularConnectorOperator singular) {
            this.singular = Input.ofNullable(singular);
            return this;
        }

        public Builder setSlack(@Nullable Input<FlowSlackConnectorOperator> slack) {
            this.slack = slack;
            return this;
        }

        public Builder setSlack(@Nullable FlowSlackConnectorOperator slack) {
            this.slack = Input.ofNullable(slack);
            return this;
        }

        public Builder setTrendmicro(@Nullable Input<FlowTrendmicroConnectorOperator> trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }

        public Builder setTrendmicro(@Nullable FlowTrendmicroConnectorOperator trendmicro) {
            this.trendmicro = Input.ofNullable(trendmicro);
            return this;
        }

        public Builder setVeeva(@Nullable Input<FlowVeevaConnectorOperator> veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setVeeva(@Nullable FlowVeevaConnectorOperator veeva) {
            this.veeva = Input.ofNullable(veeva);
            return this;
        }

        public Builder setZendesk(@Nullable Input<FlowZendeskConnectorOperator> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable FlowZendeskConnectorOperator zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }

        public FlowConnectorOperatorArgs build() {
            return new FlowConnectorOperatorArgs(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, s3, sAPOData, salesforce, serviceNow, singular, slack, trendmicro, veeva, zendesk);
        }
    }
}
