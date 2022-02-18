// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.azurenative.hybridcompute.enums.PublicNetworkAccessType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties that define a Azure Arc PrivateLinkScope resource.
 * 
 */
public final class HybridComputePrivateLinkScopePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridComputePrivateLinkScopePropertiesArgs Empty = new HybridComputePrivateLinkScopePropertiesArgs();

    /**
     * Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints.
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccessType>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccessType>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    public HybridComputePrivateLinkScopePropertiesArgs(@Nullable Input<Either<String,PublicNetworkAccessType>> publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private HybridComputePrivateLinkScopePropertiesArgs() {
        this.publicNetworkAccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridComputePrivateLinkScopePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,PublicNetworkAccessType>> publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridComputePrivateLinkScopePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccessType>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccessType> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public HybridComputePrivateLinkScopePropertiesArgs build() {
            return new HybridComputePrivateLinkScopePropertiesArgs(publicNetworkAccess);
        }
    }
}
