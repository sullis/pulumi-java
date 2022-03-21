// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managementpartner.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPartnerArgs Empty = new GetPartnerArgs();

    /**
     * Id of the Partner
     * 
     */
    @Import(name="partnerId", required=true)
      private final String partnerId;

    public String getPartnerId() {
        return this.partnerId;
    }

    public GetPartnerArgs(String partnerId) {
        this.partnerId = Objects.requireNonNull(partnerId, "expected parameter 'partnerId' to be non-null");
    }

    private GetPartnerArgs() {
        this.partnerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerId = defaults.partnerId;
        }

        public Builder partnerId(String partnerId) {
            this.partnerId = Objects.requireNonNull(partnerId);
            return this;
        }        public GetPartnerArgs build() {
            return new GetPartnerArgs(partnerId);
        }
    }
}
