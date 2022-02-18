// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGroupMemberArgs Empty = new DistributionOriginGroupMemberArgs();

    @InputImport(name="originId", required=true)
    private final Input<String> originId;

    public Input<String> getOriginId() {
        return this.originId;
    }

    public DistributionOriginGroupMemberArgs(Input<String> originId) {
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
    }

    private DistributionOriginGroupMemberArgs() {
        this.originId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> originId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originId = defaults.originId;
        }

        public Builder setOriginId(Input<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder setOriginId(String originId) {
            this.originId = Input.of(Objects.requireNonNull(originId));
            return this;
        }

        public DistributionOriginGroupMemberArgs build() {
            return new DistributionOriginGroupMemberArgs(originId);
        }
    }
}
