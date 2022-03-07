// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a hardware accelerator request config. Note that the AcceleratorConfig can be used in both Jobs and Versions. Learn more about [accelerators for training](/ml-engine/docs/using-gpus) and [accelerators for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
 * 
 */
public final class GoogleCloudMlV1__AcceleratorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__AcceleratorConfigResponse Empty = new GoogleCloudMlV1__AcceleratorConfigResponse();

    /**
     * The number of accelerators to attach to each machine running the job.
     * 
     */
    @InputImport(name="count", required=true)
      private final String count;

    public String getCount() {
        return this.count;
    }

    /**
     * The type of accelerator to use.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudMlV1__AcceleratorConfigResponse(
        String count,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudMlV1__AcceleratorConfigResponse() {
        this.count = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder setCount(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudMlV1__AcceleratorConfigResponse build() {
            return new GoogleCloudMlV1__AcceleratorConfigResponse(count, type);
        }
    }
}