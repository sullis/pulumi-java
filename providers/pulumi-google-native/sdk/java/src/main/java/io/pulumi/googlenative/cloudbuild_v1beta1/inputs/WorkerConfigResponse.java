// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the configuration to be used for creating workers in the pool.
 * 
 */
public final class WorkerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkerConfigResponse Empty = new WorkerConfigResponse();

    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Machine type of a worker, such as `n1-standard-1`. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    @Import(name="noExternalIp", required=true)
      private final Boolean noExternalIp;

    public Boolean getNoExternalIp() {
        return this.noExternalIp;
    }

    public WorkerConfigResponse(
        String diskSizeGb,
        String machineType,
        Boolean noExternalIp) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.noExternalIp = Objects.requireNonNull(noExternalIp, "expected parameter 'noExternalIp' to be non-null");
    }

    private WorkerConfigResponse() {
        this.diskSizeGb = null;
        this.machineType = null;
        this.noExternalIp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private String machineType;
        private Boolean noExternalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.noExternalIp = defaults.noExternalIp;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder noExternalIp(Boolean noExternalIp) {
            this.noExternalIp = Objects.requireNonNull(noExternalIp);
            return this;
        }        public WorkerConfigResponse build() {
            return new WorkerConfigResponse(diskSizeGb, machineType, noExternalIp);
        }
    }
}
