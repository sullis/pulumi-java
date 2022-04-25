// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.MetadataLabelMatcherResponse;
import java.util.Objects;

@CustomType
public final class EndpointMatcherResponse {
    /**
     * @return The matcher is based on node metadata presented by xDS clients.
     * 
     */
    private final MetadataLabelMatcherResponse metadataLabelMatcher;

    @CustomType.Constructor
    private EndpointMatcherResponse(@CustomType.Parameter("metadataLabelMatcher") MetadataLabelMatcherResponse metadataLabelMatcher) {
        this.metadataLabelMatcher = metadataLabelMatcher;
    }

    /**
     * @return The matcher is based on node metadata presented by xDS clients.
     * 
     */
    public MetadataLabelMatcherResponse metadataLabelMatcher() {
        return this.metadataLabelMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataLabelMatcherResponse metadataLabelMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatcher = defaults.metadataLabelMatcher;
        }

        public Builder metadataLabelMatcher(MetadataLabelMatcherResponse metadataLabelMatcher) {
            this.metadataLabelMatcher = Objects.requireNonNull(metadataLabelMatcher);
            return this;
        }        public EndpointMatcherResponse build() {
            return new EndpointMatcherResponse(metadataLabelMatcher);
        }
    }
}
