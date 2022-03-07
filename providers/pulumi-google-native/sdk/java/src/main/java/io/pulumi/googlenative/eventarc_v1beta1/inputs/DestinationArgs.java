// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.eventarc_v1beta1.inputs.CloudRunServiceArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a target of an invocation over HTTP.
 * 
 */
public final class DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project as the trigger.
     * 
     */
    @InputImport(name="cloudRunService")
      private final @Nullable Input<CloudRunServiceArgs> cloudRunService;

    public Input<CloudRunServiceArgs> getCloudRunService() {
        return this.cloudRunService == null ? Input.empty() : this.cloudRunService;
    }

    public DestinationArgs(@Nullable Input<CloudRunServiceArgs> cloudRunService) {
        this.cloudRunService = cloudRunService;
    }

    private DestinationArgs() {
        this.cloudRunService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudRunServiceArgs> cloudRunService;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRunService = defaults.cloudRunService;
        }

        public Builder setCloudRunService(@Nullable Input<CloudRunServiceArgs> cloudRunService) {
            this.cloudRunService = cloudRunService;
            return this;
        }

        public Builder setCloudRunService(@Nullable CloudRunServiceArgs cloudRunService) {
            this.cloudRunService = Input.ofNullable(cloudRunService);
            return this;
        }
        public DestinationArgs build() {
            return new DestinationArgs(cloudRunService);
        }
    }
}