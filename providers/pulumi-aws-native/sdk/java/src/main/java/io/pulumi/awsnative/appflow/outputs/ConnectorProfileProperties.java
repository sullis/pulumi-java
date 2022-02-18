// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileDatadogConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileDynatraceConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileInforNexusConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileMarketoConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileRedshiftConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSAPODataConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSalesforceConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileServiceNowConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSlackConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSnowflakeConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileVeevaConnectorProfileProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileZendeskConnectorProfileProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileProperties {
    private final @Nullable ConnectorProfileDatadogConnectorProfileProperties datadog;
    private final @Nullable ConnectorProfileDynatraceConnectorProfileProperties dynatrace;
    private final @Nullable ConnectorProfileInforNexusConnectorProfileProperties inforNexus;
    private final @Nullable ConnectorProfileMarketoConnectorProfileProperties marketo;
    private final @Nullable ConnectorProfileRedshiftConnectorProfileProperties redshift;
    private final @Nullable ConnectorProfileSAPODataConnectorProfileProperties sAPOData;
    private final @Nullable ConnectorProfileSalesforceConnectorProfileProperties salesforce;
    private final @Nullable ConnectorProfileServiceNowConnectorProfileProperties serviceNow;
    private final @Nullable ConnectorProfileSlackConnectorProfileProperties slack;
    private final @Nullable ConnectorProfileSnowflakeConnectorProfileProperties snowflake;
    private final @Nullable ConnectorProfileVeevaConnectorProfileProperties veeva;
    private final @Nullable ConnectorProfileZendeskConnectorProfileProperties zendesk;

    @OutputCustomType.Constructor({"datadog","dynatrace","inforNexus","marketo","redshift","sAPOData","salesforce","serviceNow","slack","snowflake","veeva","zendesk"})
    private ConnectorProfileProperties(
        @Nullable ConnectorProfileDatadogConnectorProfileProperties datadog,
        @Nullable ConnectorProfileDynatraceConnectorProfileProperties dynatrace,
        @Nullable ConnectorProfileInforNexusConnectorProfileProperties inforNexus,
        @Nullable ConnectorProfileMarketoConnectorProfileProperties marketo,
        @Nullable ConnectorProfileRedshiftConnectorProfileProperties redshift,
        @Nullable ConnectorProfileSAPODataConnectorProfileProperties sAPOData,
        @Nullable ConnectorProfileSalesforceConnectorProfileProperties salesforce,
        @Nullable ConnectorProfileServiceNowConnectorProfileProperties serviceNow,
        @Nullable ConnectorProfileSlackConnectorProfileProperties slack,
        @Nullable ConnectorProfileSnowflakeConnectorProfileProperties snowflake,
        @Nullable ConnectorProfileVeevaConnectorProfileProperties veeva,
        @Nullable ConnectorProfileZendeskConnectorProfileProperties zendesk) {
        this.datadog = datadog;
        this.dynatrace = dynatrace;
        this.inforNexus = inforNexus;
        this.marketo = marketo;
        this.redshift = redshift;
        this.sAPOData = sAPOData;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.slack = slack;
        this.snowflake = snowflake;
        this.veeva = veeva;
        this.zendesk = zendesk;
    }

    public Optional<ConnectorProfileDatadogConnectorProfileProperties> getDatadog() {
        return Optional.ofNullable(this.datadog);
    }
    public Optional<ConnectorProfileDynatraceConnectorProfileProperties> getDynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }
    public Optional<ConnectorProfileInforNexusConnectorProfileProperties> getInforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }
    public Optional<ConnectorProfileMarketoConnectorProfileProperties> getMarketo() {
        return Optional.ofNullable(this.marketo);
    }
    public Optional<ConnectorProfileRedshiftConnectorProfileProperties> getRedshift() {
        return Optional.ofNullable(this.redshift);
    }
    public Optional<ConnectorProfileSAPODataConnectorProfileProperties> getSAPOData() {
        return Optional.ofNullable(this.sAPOData);
    }
    public Optional<ConnectorProfileSalesforceConnectorProfileProperties> getSalesforce() {
        return Optional.ofNullable(this.salesforce);
    }
    public Optional<ConnectorProfileServiceNowConnectorProfileProperties> getServiceNow() {
        return Optional.ofNullable(this.serviceNow);
    }
    public Optional<ConnectorProfileSlackConnectorProfileProperties> getSlack() {
        return Optional.ofNullable(this.slack);
    }
    public Optional<ConnectorProfileSnowflakeConnectorProfileProperties> getSnowflake() {
        return Optional.ofNullable(this.snowflake);
    }
    public Optional<ConnectorProfileVeevaConnectorProfileProperties> getVeeva() {
        return Optional.ofNullable(this.veeva);
    }
    public Optional<ConnectorProfileZendeskConnectorProfileProperties> getZendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorProfileDatadogConnectorProfileProperties datadog;
        private @Nullable ConnectorProfileDynatraceConnectorProfileProperties dynatrace;
        private @Nullable ConnectorProfileInforNexusConnectorProfileProperties inforNexus;
        private @Nullable ConnectorProfileMarketoConnectorProfileProperties marketo;
        private @Nullable ConnectorProfileRedshiftConnectorProfileProperties redshift;
        private @Nullable ConnectorProfileSAPODataConnectorProfileProperties sAPOData;
        private @Nullable ConnectorProfileSalesforceConnectorProfileProperties salesforce;
        private @Nullable ConnectorProfileServiceNowConnectorProfileProperties serviceNow;
        private @Nullable ConnectorProfileSlackConnectorProfileProperties slack;
        private @Nullable ConnectorProfileSnowflakeConnectorProfileProperties snowflake;
        private @Nullable ConnectorProfileVeevaConnectorProfileProperties veeva;
        private @Nullable ConnectorProfileZendeskConnectorProfileProperties zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.redshift = defaults.redshift;
    	      this.sAPOData = defaults.sAPOData;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.slack = defaults.slack;
    	      this.snowflake = defaults.snowflake;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setDatadog(@Nullable ConnectorProfileDatadogConnectorProfileProperties datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDynatrace(@Nullable ConnectorProfileDynatraceConnectorProfileProperties dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setInforNexus(@Nullable ConnectorProfileInforNexusConnectorProfileProperties inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setMarketo(@Nullable ConnectorProfileMarketoConnectorProfileProperties marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setRedshift(@Nullable ConnectorProfileRedshiftConnectorProfileProperties redshift) {
            this.redshift = redshift;
            return this;
        }

        public Builder setSAPOData(@Nullable ConnectorProfileSAPODataConnectorProfileProperties sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSalesforce(@Nullable ConnectorProfileSalesforceConnectorProfileProperties salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setServiceNow(@Nullable ConnectorProfileServiceNowConnectorProfileProperties serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setSlack(@Nullable ConnectorProfileSlackConnectorProfileProperties slack) {
            this.slack = slack;
            return this;
        }

        public Builder setSnowflake(@Nullable ConnectorProfileSnowflakeConnectorProfileProperties snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        public Builder setVeeva(@Nullable ConnectorProfileVeevaConnectorProfileProperties veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setZendesk(@Nullable ConnectorProfileZendeskConnectorProfileProperties zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public ConnectorProfileProperties build() {
            return new ConnectorProfileProperties(datadog, dynatrace, inforNexus, marketo, redshift, sAPOData, salesforce, serviceNow, slack, snowflake, veeva, zendesk);
        }
    }
}
