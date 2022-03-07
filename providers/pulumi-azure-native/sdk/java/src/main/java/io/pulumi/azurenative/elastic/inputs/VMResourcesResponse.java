// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The vm resource properties that is currently being monitored by the Elastic monitor resource.
 * 
 */
public final class VMResourcesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMResourcesResponse Empty = new VMResourcesResponse();

    /**
     * The ARM id of the VM resource.
     * 
     */
    @InputImport(name="vmResourceId")
      private final @Nullable String vmResourceId;

    public Optional<String> getVmResourceId() {
        return this.vmResourceId == null ? Optional.empty() : Optional.ofNullable(this.vmResourceId);
    }

    public VMResourcesResponse(@Nullable String vmResourceId) {
        this.vmResourceId = vmResourceId;
    }

    private VMResourcesResponse() {
        this.vmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder setVmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }
        public VMResourcesResponse build() {
            return new VMResourcesResponse(vmResourceId);
        }
    }
}