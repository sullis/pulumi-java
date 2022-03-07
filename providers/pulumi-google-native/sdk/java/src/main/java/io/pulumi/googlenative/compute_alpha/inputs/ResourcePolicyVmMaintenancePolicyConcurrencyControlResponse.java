// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * A concurrency control configuration. Defines a group config that, when attached to an instance, recognizes that instance as part of a group of instances where only up the concurrency_limit of instances in that group can undergo simultaneous maintenance. For more information: go/concurrency-control-design-doc
 * 
 */
public final class ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse Empty = new ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse();

    @InputImport(name="concurrencyLimit", required=true)
      private final Integer concurrencyLimit;

    public Integer getConcurrencyLimit() {
        return this.concurrencyLimit;
    }

    public ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse(Integer concurrencyLimit) {
        this.concurrencyLimit = Objects.requireNonNull(concurrencyLimit, "expected parameter 'concurrencyLimit' to be non-null");
    }

    private ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse() {
        this.concurrencyLimit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer concurrencyLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyLimit = defaults.concurrencyLimit;
        }

        public Builder setConcurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = Objects.requireNonNull(concurrencyLimit);
            return this;
        }
        public ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse build() {
            return new ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse(concurrencyLimit);
        }
    }
}