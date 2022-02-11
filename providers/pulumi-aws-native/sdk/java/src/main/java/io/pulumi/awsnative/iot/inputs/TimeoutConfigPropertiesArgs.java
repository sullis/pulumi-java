// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TimeoutConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeoutConfigPropertiesArgs Empty = new TimeoutConfigPropertiesArgs();

    @InputImport(name="inProgressTimeoutInMinutes", required=true)
    private final Input<Integer> inProgressTimeoutInMinutes;

    public Input<Integer> getInProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    public TimeoutConfigPropertiesArgs(Input<Integer> inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = Objects.requireNonNull(inProgressTimeoutInMinutes, "expected parameter 'inProgressTimeoutInMinutes' to be non-null");
    }

    private TimeoutConfigPropertiesArgs() {
        this.inProgressTimeoutInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeoutConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> inProgressTimeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeoutConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inProgressTimeoutInMinutes = defaults.inProgressTimeoutInMinutes;
        }

        public Builder setInProgressTimeoutInMinutes(Input<Integer> inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = Objects.requireNonNull(inProgressTimeoutInMinutes);
            return this;
        }

        public Builder setInProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = Input.of(Objects.requireNonNull(inProgressTimeoutInMinutes));
            return this;
        }

        public TimeoutConfigPropertiesArgs build() {
            return new TimeoutConfigPropertiesArgs(inProgressTimeoutInMinutes);
        }
    }
}
