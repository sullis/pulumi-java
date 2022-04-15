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
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Operation to be performed on provided source fields
 * 
 */
public final class FlowConnectorOperator extends io.pulumi.resources.InvokeArgs {

    public static final FlowConnectorOperator Empty = new FlowConnectorOperator();

    @Import(name="amplitude")
      private final @Nullable FlowAmplitudeConnectorOperator amplitude;

    public Optional<FlowAmplitudeConnectorOperator> amplitude() {
        return this.amplitude == null ? Optional.empty() : Optional.ofNullable(this.amplitude);
    }

    @Import(name="datadog")
      private final @Nullable FlowDatadogConnectorOperator datadog;

    public Optional<FlowDatadogConnectorOperator> datadog() {
        return this.datadog == null ? Optional.empty() : Optional.ofNullable(this.datadog);
    }

    @Import(name="dynatrace")
      private final @Nullable FlowDynatraceConnectorOperator dynatrace;

    public Optional<FlowDynatraceConnectorOperator> dynatrace() {
        return this.dynatrace == null ? Optional.empty() : Optional.ofNullable(this.dynatrace);
    }

    @Import(name="googleAnalytics")
      private final @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics;

    public Optional<FlowGoogleAnalyticsConnectorOperator> googleAnalytics() {
        return this.googleAnalytics == null ? Optional.empty() : Optional.ofNullable(this.googleAnalytics);
    }

    @Import(name="inforNexus")
      private final @Nullable FlowInforNexusConnectorOperator inforNexus;

    public Optional<FlowInforNexusConnectorOperator> inforNexus() {
        return this.inforNexus == null ? Optional.empty() : Optional.ofNullable(this.inforNexus);
    }

    @Import(name="marketo")
      private final @Nullable FlowMarketoConnectorOperator marketo;

    public Optional<FlowMarketoConnectorOperator> marketo() {
        return this.marketo == null ? Optional.empty() : Optional.ofNullable(this.marketo);
    }

    @Import(name="s3")
      private final @Nullable FlowS3ConnectorOperator s3;

    public Optional<FlowS3ConnectorOperator> s3() {
        return this.s3 == null ? Optional.empty() : Optional.ofNullable(this.s3);
    }

    @Import(name="sAPOData")
      private final @Nullable FlowSAPODataConnectorOperator sAPOData;

    public Optional<FlowSAPODataConnectorOperator> sAPOData() {
        return this.sAPOData == null ? Optional.empty() : Optional.ofNullable(this.sAPOData);
    }

    @Import(name="salesforce")
      private final @Nullable FlowSalesforceConnectorOperator salesforce;

    public Optional<FlowSalesforceConnectorOperator> salesforce() {
        return this.salesforce == null ? Optional.empty() : Optional.ofNullable(this.salesforce);
    }

    @Import(name="serviceNow")
      private final @Nullable FlowServiceNowConnectorOperator serviceNow;

    public Optional<FlowServiceNowConnectorOperator> serviceNow() {
        return this.serviceNow == null ? Optional.empty() : Optional.ofNullable(this.serviceNow);
    }

    @Import(name="singular")
      private final @Nullable FlowSingularConnectorOperator singular;

    public Optional<FlowSingularConnectorOperator> singular() {
        return this.singular == null ? Optional.empty() : Optional.ofNullable(this.singular);
    }

    @Import(name="slack")
      private final @Nullable FlowSlackConnectorOperator slack;

    public Optional<FlowSlackConnectorOperator> slack() {
        return this.slack == null ? Optional.empty() : Optional.ofNullable(this.slack);
    }

    @Import(name="trendmicro")
      private final @Nullable FlowTrendmicroConnectorOperator trendmicro;

    public Optional<FlowTrendmicroConnectorOperator> trendmicro() {
        return this.trendmicro == null ? Optional.empty() : Optional.ofNullable(this.trendmicro);
    }

    @Import(name="veeva")
      private final @Nullable FlowVeevaConnectorOperator veeva;

    public Optional<FlowVeevaConnectorOperator> veeva() {
        return this.veeva == null ? Optional.empty() : Optional.ofNullable(this.veeva);
    }

    @Import(name="zendesk")
      private final @Nullable FlowZendeskConnectorOperator zendesk;

    public Optional<FlowZendeskConnectorOperator> zendesk() {
        return this.zendesk == null ? Optional.empty() : Optional.ofNullable(this.zendesk);
    }

    public FlowConnectorOperator(
        @Nullable FlowAmplitudeConnectorOperator amplitude,
        @Nullable FlowDatadogConnectorOperator datadog,
        @Nullable FlowDynatraceConnectorOperator dynatrace,
        @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics,
        @Nullable FlowInforNexusConnectorOperator inforNexus,
        @Nullable FlowMarketoConnectorOperator marketo,
        @Nullable FlowS3ConnectorOperator s3,
        @Nullable FlowSAPODataConnectorOperator sAPOData,
        @Nullable FlowSalesforceConnectorOperator salesforce,
        @Nullable FlowServiceNowConnectorOperator serviceNow,
        @Nullable FlowSingularConnectorOperator singular,
        @Nullable FlowSlackConnectorOperator slack,
        @Nullable FlowTrendmicroConnectorOperator trendmicro,
        @Nullable FlowVeevaConnectorOperator veeva,
        @Nullable FlowZendeskConnectorOperator zendesk) {
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

    private FlowConnectorOperator() {
        this.amplitude = null;
        this.datadog = null;
        this.dynatrace = null;
        this.googleAnalytics = null;
        this.inforNexus = null;
        this.marketo = null;
        this.s3 = null;
        this.sAPOData = null;
        this.salesforce = null;
        this.serviceNow = null;
        this.singular = null;
        this.slack = null;
        this.trendmicro = null;
        this.veeva = null;
        this.zendesk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowConnectorOperator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAmplitudeConnectorOperator amplitude;
        private @Nullable FlowDatadogConnectorOperator datadog;
        private @Nullable FlowDynatraceConnectorOperator dynatrace;
        private @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics;
        private @Nullable FlowInforNexusConnectorOperator inforNexus;
        private @Nullable FlowMarketoConnectorOperator marketo;
        private @Nullable FlowS3ConnectorOperator s3;
        private @Nullable FlowSAPODataConnectorOperator sAPOData;
        private @Nullable FlowSalesforceConnectorOperator salesforce;
        private @Nullable FlowServiceNowConnectorOperator serviceNow;
        private @Nullable FlowSingularConnectorOperator singular;
        private @Nullable FlowSlackConnectorOperator slack;
        private @Nullable FlowTrendmicroConnectorOperator trendmicro;
        private @Nullable FlowVeevaConnectorOperator veeva;
        private @Nullable FlowZendeskConnectorOperator zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowConnectorOperator defaults) {
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

        public Builder amplitude(@Nullable FlowAmplitudeConnectorOperator amplitude) {
            this.amplitude = amplitude;
            return this;
        }
        public Builder datadog(@Nullable FlowDatadogConnectorOperator datadog) {
            this.datadog = datadog;
            return this;
        }
        public Builder dynatrace(@Nullable FlowDynatraceConnectorOperator dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }
        public Builder googleAnalytics(@Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }
        public Builder inforNexus(@Nullable FlowInforNexusConnectorOperator inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }
        public Builder marketo(@Nullable FlowMarketoConnectorOperator marketo) {
            this.marketo = marketo;
            return this;
        }
        public Builder s3(@Nullable FlowS3ConnectorOperator s3) {
            this.s3 = s3;
            return this;
        }
        public Builder sAPOData(@Nullable FlowSAPODataConnectorOperator sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }
        public Builder salesforce(@Nullable FlowSalesforceConnectorOperator salesforce) {
            this.salesforce = salesforce;
            return this;
        }
        public Builder serviceNow(@Nullable FlowServiceNowConnectorOperator serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }
        public Builder singular(@Nullable FlowSingularConnectorOperator singular) {
            this.singular = singular;
            return this;
        }
        public Builder slack(@Nullable FlowSlackConnectorOperator slack) {
            this.slack = slack;
            return this;
        }
        public Builder trendmicro(@Nullable FlowTrendmicroConnectorOperator trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }
        public Builder veeva(@Nullable FlowVeevaConnectorOperator veeva) {
            this.veeva = veeva;
            return this;
        }
        public Builder zendesk(@Nullable FlowZendeskConnectorOperator zendesk) {
            this.zendesk = zendesk;
            return this;
        }        public FlowConnectorOperator build() {
            return new FlowConnectorOperator(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, s3, sAPOData, salesforce, serviceNow, singular, slack, trendmicro, veeva, zendesk);
        }
    }
}
