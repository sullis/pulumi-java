// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TaskDefinitionInferenceAccelerator {
    /**
     * @return Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    private final String deviceName;
    /**
     * @return Elastic Inference accelerator type to use.
     * 
     */
    private final String deviceType;

    @CustomType.Constructor
    private TaskDefinitionInferenceAccelerator(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("deviceType") String deviceType) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    /**
     * @return Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Elastic Inference accelerator type to use.
     * 
     */
    public String deviceType() {
        return this.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String deviceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceType(String deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }        public TaskDefinitionInferenceAccelerator build() {
            return new TaskDefinitionInferenceAccelerator(deviceName, deviceType);
        }
    }
}
