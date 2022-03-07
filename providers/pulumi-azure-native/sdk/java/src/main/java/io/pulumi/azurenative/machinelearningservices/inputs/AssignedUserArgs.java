// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A user that can be assigned to a compute instance.
 * 
 */
public final class AssignedUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignedUserArgs Empty = new AssignedUserArgs();

    /**
     * User’s AAD Object Id.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId;
    }

    /**
     * User’s AAD Tenant Id.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId;
    }

    public AssignedUserArgs(
        Input<String> objectId,
        Input<String> tenantId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AssignedUserArgs() {
        this.objectId = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectId;
        private Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setObjectId(Input<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder setTenantId(Input<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Input.of(Objects.requireNonNull(tenantId));
            return this;
        }
        public AssignedUserArgs build() {
            return new AssignedUserArgs(objectId, tenantId);
        }
    }
}