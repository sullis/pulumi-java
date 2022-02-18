// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CMKIdentityDefinitionResponse {
    /**
     * The resource id of the user assigned identity to authenticate to customer's key vault.
     * 
     */
    private final @Nullable String userAssignedIdentity;

    @OutputCustomType.Constructor({"userAssignedIdentity"})
    private CMKIdentityDefinitionResponse(@Nullable String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The resource id of the user assigned identity to authenticate to customer's key vault.
     * 
     */
    public Optional<String> getUserAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CMKIdentityDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(CMKIdentityDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public CMKIdentityDefinitionResponse build() {
            return new CMKIdentityDefinitionResponse(userAssignedIdentity);
        }
    }
}
