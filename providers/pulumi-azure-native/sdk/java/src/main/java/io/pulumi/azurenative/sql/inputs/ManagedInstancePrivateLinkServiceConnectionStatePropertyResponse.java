// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse Empty = new ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse();

    /**
     * The private link service connection description.
     * 
     */
    @InputImport(name="actionsRequired", required=true)
    private final String actionsRequired;

    public String getActionsRequired() {
        return this.actionsRequired;
    }

    /**
     * The private link service connection description.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired, "expected parameter 'actionsRequired' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse build() {
            return new ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse(actionsRequired, description, status);
        }
    }
}
