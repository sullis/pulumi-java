// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.GoogleRpcStatusResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Result of an instance attempt.
 * 
 */
public final class InstanceAttemptResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceAttemptResultResponse Empty = new InstanceAttemptResultResponse();

    /**
     * Optional. The exit code of this attempt. This may be unset if the container was unable to exit cleanly with a code due to some other failure. See status field for possible failure details.
     * 
     */
    @InputImport(name="exitCode", required=true)
      private final Integer exitCode;

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * Optional. The status of this attempt. If the status code is OK, then the attempt succeeded.
     * 
     */
    @InputImport(name="status", required=true)
      private final GoogleRpcStatusResponse status;

    public GoogleRpcStatusResponse getStatus() {
        return this.status;
    }

    public InstanceAttemptResultResponse(
        Integer exitCode,
        GoogleRpcStatusResponse status) {
        this.exitCode = Objects.requireNonNull(exitCode, "expected parameter 'exitCode' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private InstanceAttemptResultResponse() {
        this.exitCode = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAttemptResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer exitCode;
        private GoogleRpcStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAttemptResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exitCode = defaults.exitCode;
    	      this.status = defaults.status;
        }

        public Builder setExitCode(Integer exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }

        public Builder setStatus(GoogleRpcStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public InstanceAttemptResultResponse build() {
            return new InstanceAttemptResultResponse(exitCode, status);
        }
    }
}