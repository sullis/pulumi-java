// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileDatadogConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileDynatraceConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileInforNexusConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileMarketoConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileRedshiftConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSAPODataConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSalesforceConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileServiceNowConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSlackConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSnowflakeConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileVeevaConnectorProfilePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileZendeskConnectorProfilePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector specific properties needed to create connector profile - currently not needed for Amplitude, Trendmicro, Googleanalytics and Singular
 * 
 */
public final class ConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfilePropertiesArgs Empty = new ConnectorProfilePropertiesArgs();

    @InputImport(name="datadog")
    private final @Nullable Input<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog;

    public Input<ConnectorProfileDatadogConnectorProfilePropertiesArgs> getDatadog() {
        return this.datadog == null ? Input.empty() : this.datadog;
    }

    @InputImport(name="dynatrace")
    private final @Nullable Input<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace;

    public Input<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> getDynatrace() {
        return this.dynatrace == null ? Input.empty() : this.dynatrace;
    }

    @InputImport(name="inforNexus")
    private final @Nullable Input<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus;

    public Input<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> getInforNexus() {
        return this.inforNexus == null ? Input.empty() : this.inforNexus;
    }

    @InputImport(name="marketo")
    private final @Nullable Input<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo;

    public Input<ConnectorProfileMarketoConnectorProfilePropertiesArgs> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="redshift")
    private final @Nullable Input<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift;

    public Input<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> getRedshift() {
        return this.redshift == null ? Input.empty() : this.redshift;
    }

    @InputImport(name="sAPOData")
    private final @Nullable Input<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData;

    public Input<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> getSAPOData() {
        return this.sAPOData == null ? Input.empty() : this.sAPOData;
    }

    @InputImport(name="salesforce")
    private final @Nullable Input<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce;

    public Input<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
    private final @Nullable Input<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow;

    public Input<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="slack")
    private final @Nullable Input<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack;

    public Input<ConnectorProfileSlackConnectorProfilePropertiesArgs> getSlack() {
        return this.slack == null ? Input.empty() : this.slack;
    }

    @InputImport(name="snowflake")
    private final @Nullable Input<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake;

    public Input<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> getSnowflake() {
        return this.snowflake == null ? Input.empty() : this.snowflake;
    }

    @InputImport(name="veeva")
    private final @Nullable Input<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva;

    public Input<ConnectorProfileVeevaConnectorProfilePropertiesArgs> getVeeva() {
        return this.veeva == null ? Input.empty() : this.veeva;
    }

    @InputImport(name="zendesk")
    private final @Nullable Input<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk;

    public Input<ConnectorProfileZendeskConnectorProfilePropertiesArgs> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public ConnectorProfilePropertiesArgs(
        @Nullable Input<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog,
        @Nullable Input<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace,
        @Nullable Input<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus,
        @Nullable Input<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo,
        @Nullable Input<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift,
        @Nullable Input<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData,
        @Nullable Input<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce,
        @Nullable Input<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow,
        @Nullable Input<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack,
        @Nullable Input<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake,
        @Nullable Input<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva,
        @Nullable Input<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk) {
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

    private ConnectorProfilePropertiesArgs() {
        this.datadog = Input.empty();
        this.dynatrace = Input.empty();
        this.inforNexus = Input.empty();
        this.marketo = Input.empty();
        this.redshift = Input.empty();
        this.sAPOData = Input.empty();
        this.salesforce = Input.empty();
        this.serviceNow = Input.empty();
        this.slack = Input.empty();
        this.snowflake = Input.empty();
        this.veeva = Input.empty();
        this.zendesk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog;
        private @Nullable Input<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace;
        private @Nullable Input<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus;
        private @Nullable Input<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo;
        private @Nullable Input<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift;
        private @Nullable Input<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData;
        private @Nullable Input<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce;
        private @Nullable Input<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow;
        private @Nullable Input<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack;
        private @Nullable Input<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake;
        private @Nullable Input<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva;
        private @Nullable Input<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfilePropertiesArgs defaults) {
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

        public Builder setDatadog(@Nullable Input<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDatadog(@Nullable ConnectorProfileDatadogConnectorProfilePropertiesArgs datadog) {
            this.datadog = Input.ofNullable(datadog);
            return this;
        }

        public Builder setDynatrace(@Nullable Input<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setDynatrace(@Nullable ConnectorProfileDynatraceConnectorProfilePropertiesArgs dynatrace) {
            this.dynatrace = Input.ofNullable(dynatrace);
            return this;
        }

        public Builder setInforNexus(@Nullable Input<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setInforNexus(@Nullable ConnectorProfileInforNexusConnectorProfilePropertiesArgs inforNexus) {
            this.inforNexus = Input.ofNullable(inforNexus);
            return this;
        }

        public Builder setMarketo(@Nullable Input<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable ConnectorProfileMarketoConnectorProfilePropertiesArgs marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setRedshift(@Nullable Input<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift) {
            this.redshift = redshift;
            return this;
        }

        public Builder setRedshift(@Nullable ConnectorProfileRedshiftConnectorProfilePropertiesArgs redshift) {
            this.redshift = Input.ofNullable(redshift);
            return this;
        }

        public Builder setSAPOData(@Nullable Input<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSAPOData(@Nullable ConnectorProfileSAPODataConnectorProfilePropertiesArgs sAPOData) {
            this.sAPOData = Input.ofNullable(sAPOData);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable ConnectorProfileSalesforceConnectorProfilePropertiesArgs salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable ConnectorProfileServiceNowConnectorProfilePropertiesArgs serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setSlack(@Nullable Input<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack) {
            this.slack = slack;
            return this;
        }

        public Builder setSlack(@Nullable ConnectorProfileSlackConnectorProfilePropertiesArgs slack) {
            this.slack = Input.ofNullable(slack);
            return this;
        }

        public Builder setSnowflake(@Nullable Input<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        public Builder setSnowflake(@Nullable ConnectorProfileSnowflakeConnectorProfilePropertiesArgs snowflake) {
            this.snowflake = Input.ofNullable(snowflake);
            return this;
        }

        public Builder setVeeva(@Nullable Input<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setVeeva(@Nullable ConnectorProfileVeevaConnectorProfilePropertiesArgs veeva) {
            this.veeva = Input.ofNullable(veeva);
            return this;
        }

        public Builder setZendesk(@Nullable Input<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable ConnectorProfileZendeskConnectorProfilePropertiesArgs zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }

        public ConnectorProfilePropertiesArgs build() {
            return new ConnectorProfilePropertiesArgs(datadog, dynatrace, inforNexus, marketo, redshift, sAPOData, salesforce, serviceNow, slack, snowflake, veeva, zendesk);
        }
    }
}
