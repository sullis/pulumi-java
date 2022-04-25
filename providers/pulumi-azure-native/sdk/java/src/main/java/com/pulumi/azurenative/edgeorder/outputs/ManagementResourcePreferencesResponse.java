// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementResourcePreferencesResponse {
    /**
     * @return Customer preferred Management resource ARM ID
     * 
     */
    private final @Nullable String preferredManagementResourceId;

    @CustomType.Constructor
    private ManagementResourcePreferencesResponse(@CustomType.Parameter("preferredManagementResourceId") @Nullable String preferredManagementResourceId) {
        this.preferredManagementResourceId = preferredManagementResourceId;
    }

    /**
     * @return Customer preferred Management resource ARM ID
     * 
     */
    public Optional<String> preferredManagementResourceId() {
        return Optional.ofNullable(this.preferredManagementResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementResourcePreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String preferredManagementResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementResourcePreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredManagementResourceId = defaults.preferredManagementResourceId;
        }

        public Builder preferredManagementResourceId(@Nullable String preferredManagementResourceId) {
            this.preferredManagementResourceId = preferredManagementResourceId;
            return this;
        }        public ManagementResourcePreferencesResponse build() {
            return new ManagementResourcePreferencesResponse(preferredManagementResourceId);
        }
    }
}
