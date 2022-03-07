// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The current status of a dynamic group along with timestamp.
 * 
 */
public final class DynamicGroupStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicGroupStatusResponse Empty = new DynamicGroupStatusResponse();

    /**
     * Status of the dynamic group.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * The latest time at which the dynamic group is guaranteed to be in the given status. If status is `UP_TO_DATE`, the latest time at which the dynamic group was confirmed to be up-to-date. If status is `UPDATING_MEMBERSHIPS`, the time at which dynamic group was created.
     * 
     */
    @InputImport(name="statusTime", required=true)
      private final String statusTime;

    public String getStatusTime() {
        return this.statusTime;
    }

    public DynamicGroupStatusResponse(
        String status,
        String statusTime) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusTime = Objects.requireNonNull(statusTime, "expected parameter 'statusTime' to be non-null");
    }

    private DynamicGroupStatusResponse() {
        this.status = null;
        this.statusTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private String statusTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.statusTime = defaults.statusTime;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusTime(String statusTime) {
            this.statusTime = Objects.requireNonNull(statusTime);
            return this;
        }
        public DynamicGroupStatusResponse build() {
            return new DynamicGroupStatusResponse(status, statusTime);
        }
    }
}