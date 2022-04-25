// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceGuardOperationResponse {
    /**
     * @return Type of resource request.
     * 
     */
    private final String requestResourceType;
    /**
     * @return Name of the critical operation.
     * 
     */
    private final String vaultCriticalOperation;

    @CustomType.Constructor
    private ResourceGuardOperationResponse(
        @CustomType.Parameter("requestResourceType") String requestResourceType,
        @CustomType.Parameter("vaultCriticalOperation") String vaultCriticalOperation) {
        this.requestResourceType = requestResourceType;
        this.vaultCriticalOperation = vaultCriticalOperation;
    }

    /**
     * @return Type of resource request.
     * 
     */
    public String requestResourceType() {
        return this.requestResourceType;
    }
    /**
     * @return Name of the critical operation.
     * 
     */
    public String vaultCriticalOperation() {
        return this.vaultCriticalOperation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requestResourceType;
        private String vaultCriticalOperation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestResourceType = defaults.requestResourceType;
    	      this.vaultCriticalOperation = defaults.vaultCriticalOperation;
        }

        public Builder requestResourceType(String requestResourceType) {
            this.requestResourceType = Objects.requireNonNull(requestResourceType);
            return this;
        }
        public Builder vaultCriticalOperation(String vaultCriticalOperation) {
            this.vaultCriticalOperation = Objects.requireNonNull(vaultCriticalOperation);
            return this;
        }        public ResourceGuardOperationResponse build() {
            return new ResourceGuardOperationResponse(requestResourceType, vaultCriticalOperation);
        }
    }
}
