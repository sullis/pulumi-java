// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorMappingErrorManagementResponse {
    /**
     * The error limit allowed while importing data.
     * 
     */
    private final @Nullable Integer errorLimit;
    /**
     * The type of error management to use for the mapping.
     * 
     */
    private final String errorManagementType;

    @OutputCustomType.Constructor({"errorLimit","errorManagementType"})
    private ConnectorMappingErrorManagementResponse(
        @Nullable Integer errorLimit,
        String errorManagementType) {
        this.errorLimit = errorLimit;
        this.errorManagementType = Objects.requireNonNull(errorManagementType);
    }

    /**
     * The error limit allowed while importing data.
     * 
    */
    public Optional<Integer> getErrorLimit() {
        return Optional.ofNullable(this.errorLimit);
    }
    /**
     * The type of error management to use for the mapping.
     * 
    */
    public String getErrorManagementType() {
        return this.errorManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingErrorManagementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer errorLimit;
        private String errorManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingErrorManagementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorLimit = defaults.errorLimit;
    	      this.errorManagementType = defaults.errorManagementType;
        }

        public Builder setErrorLimit(@Nullable Integer errorLimit) {
            this.errorLimit = errorLimit;
            return this;
        }

        public Builder setErrorManagementType(String errorManagementType) {
            this.errorManagementType = Objects.requireNonNull(errorManagementType);
            return this;
        }
        public ConnectorMappingErrorManagementResponse build() {
            return new ConnectorMappingErrorManagementResponse(errorLimit, errorManagementType);
        }
    }
}