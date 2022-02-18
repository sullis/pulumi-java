// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationMarketoSourcePropertiesArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationS3SourcePropertiesArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationSalesforceSourcePropertiesArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationServiceNowSourcePropertiesArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationZendeskSourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationSourceConnectorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationSourceConnectorPropertiesArgs Empty = new IntegrationSourceConnectorPropertiesArgs();

    @InputImport(name="marketo")
    private final @Nullable Input<IntegrationMarketoSourcePropertiesArgs> marketo;

    public Input<IntegrationMarketoSourcePropertiesArgs> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="s3")
    private final @Nullable Input<IntegrationS3SourcePropertiesArgs> s3;

    public Input<IntegrationS3SourcePropertiesArgs> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="salesforce")
    private final @Nullable Input<IntegrationSalesforceSourcePropertiesArgs> salesforce;

    public Input<IntegrationSalesforceSourcePropertiesArgs> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
    private final @Nullable Input<IntegrationServiceNowSourcePropertiesArgs> serviceNow;

    public Input<IntegrationServiceNowSourcePropertiesArgs> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="zendesk")
    private final @Nullable Input<IntegrationZendeskSourcePropertiesArgs> zendesk;

    public Input<IntegrationZendeskSourcePropertiesArgs> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public IntegrationSourceConnectorPropertiesArgs(
        @Nullable Input<IntegrationMarketoSourcePropertiesArgs> marketo,
        @Nullable Input<IntegrationS3SourcePropertiesArgs> s3,
        @Nullable Input<IntegrationSalesforceSourcePropertiesArgs> salesforce,
        @Nullable Input<IntegrationServiceNowSourcePropertiesArgs> serviceNow,
        @Nullable Input<IntegrationZendeskSourcePropertiesArgs> zendesk) {
        this.marketo = marketo;
        this.s3 = s3;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.zendesk = zendesk;
    }

    private IntegrationSourceConnectorPropertiesArgs() {
        this.marketo = Input.empty();
        this.s3 = Input.empty();
        this.salesforce = Input.empty();
        this.serviceNow = Input.empty();
        this.zendesk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSourceConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationMarketoSourcePropertiesArgs> marketo;
        private @Nullable Input<IntegrationS3SourcePropertiesArgs> s3;
        private @Nullable Input<IntegrationSalesforceSourcePropertiesArgs> salesforce;
        private @Nullable Input<IntegrationServiceNowSourcePropertiesArgs> serviceNow;
        private @Nullable Input<IntegrationZendeskSourcePropertiesArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSourceConnectorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setMarketo(@Nullable Input<IntegrationMarketoSourcePropertiesArgs> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable IntegrationMarketoSourcePropertiesArgs marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setS3(@Nullable Input<IntegrationS3SourcePropertiesArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable IntegrationS3SourcePropertiesArgs s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<IntegrationSalesforceSourcePropertiesArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable IntegrationSalesforceSourcePropertiesArgs salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<IntegrationServiceNowSourcePropertiesArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable IntegrationServiceNowSourcePropertiesArgs serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setZendesk(@Nullable Input<IntegrationZendeskSourcePropertiesArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable IntegrationZendeskSourcePropertiesArgs zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }

        public IntegrationSourceConnectorPropertiesArgs build() {
            return new IntegrationSourceConnectorPropertiesArgs(marketo, s3, salesforce, serviceNow, zendesk);
        }
    }
}
