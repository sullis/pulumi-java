// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPointVpcConfiguration {
    /**
     * Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
     * 
     */
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor
    private AccessPointVpcConfiguration(@OutputCustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public AccessPointVpcConfiguration build() {
            return new AccessPointVpcConfiguration(vpcId);
        }
    }
}
