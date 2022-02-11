// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationMarketoConnectorOperator;
import io.pulumi.awsnative.customerprofiles.enums.IntegrationS3ConnectorOperator;
import io.pulumi.awsnative.customerprofiles.enums.IntegrationSalesforceConnectorOperator;
import io.pulumi.awsnative.customerprofiles.enums.IntegrationServiceNowConnectorOperator;
import io.pulumi.awsnative.customerprofiles.enums.IntegrationZendeskConnectorOperator;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationConnectorOperatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationConnectorOperatorArgs Empty = new IntegrationConnectorOperatorArgs();

    @InputImport(name="marketo")
    private final @Nullable Input<IntegrationMarketoConnectorOperator> marketo;

    public Input<IntegrationMarketoConnectorOperator> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="s3")
    private final @Nullable Input<IntegrationS3ConnectorOperator> s3;

    public Input<IntegrationS3ConnectorOperator> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="salesforce")
    private final @Nullable Input<IntegrationSalesforceConnectorOperator> salesforce;

    public Input<IntegrationSalesforceConnectorOperator> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
    private final @Nullable Input<IntegrationServiceNowConnectorOperator> serviceNow;

    public Input<IntegrationServiceNowConnectorOperator> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="zendesk")
    private final @Nullable Input<IntegrationZendeskConnectorOperator> zendesk;

    public Input<IntegrationZendeskConnectorOperator> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public IntegrationConnectorOperatorArgs(
        @Nullable Input<IntegrationMarketoConnectorOperator> marketo,
        @Nullable Input<IntegrationS3ConnectorOperator> s3,
        @Nullable Input<IntegrationSalesforceConnectorOperator> salesforce,
        @Nullable Input<IntegrationServiceNowConnectorOperator> serviceNow,
        @Nullable Input<IntegrationZendeskConnectorOperator> zendesk) {
        this.marketo = marketo;
        this.s3 = s3;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.zendesk = zendesk;
    }

    private IntegrationConnectorOperatorArgs() {
        this.marketo = Input.empty();
        this.s3 = Input.empty();
        this.salesforce = Input.empty();
        this.serviceNow = Input.empty();
        this.zendesk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationConnectorOperatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationMarketoConnectorOperator> marketo;
        private @Nullable Input<IntegrationS3ConnectorOperator> s3;
        private @Nullable Input<IntegrationSalesforceConnectorOperator> salesforce;
        private @Nullable Input<IntegrationServiceNowConnectorOperator> serviceNow;
        private @Nullable Input<IntegrationZendeskConnectorOperator> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationConnectorOperatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setMarketo(@Nullable Input<IntegrationMarketoConnectorOperator> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable IntegrationMarketoConnectorOperator marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setS3(@Nullable Input<IntegrationS3ConnectorOperator> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable IntegrationS3ConnectorOperator s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<IntegrationSalesforceConnectorOperator> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable IntegrationSalesforceConnectorOperator salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<IntegrationServiceNowConnectorOperator> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable IntegrationServiceNowConnectorOperator serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setZendesk(@Nullable Input<IntegrationZendeskConnectorOperator> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable IntegrationZendeskConnectorOperator zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }

        public IntegrationConnectorOperatorArgs build() {
            return new IntegrationConnectorOperatorArgs(marketo, s3, salesforce, serviceNow, zendesk);
        }
    }
}
