// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceSourceCodeVersionType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceSourceCodeVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceCodeVersionArgs Empty = new ServiceSourceCodeVersionArgs();

    @InputImport(name="type", required=true)
    private final Input<ServiceSourceCodeVersionType> type;

    public Input<ServiceSourceCodeVersionType> getType() {
        return this.type;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ServiceSourceCodeVersionArgs(
        Input<ServiceSourceCodeVersionType> type,
        Input<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceSourceCodeVersionArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceCodeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ServiceSourceCodeVersionType> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceCodeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(Input<ServiceSourceCodeVersionType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ServiceSourceCodeVersionType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public ServiceSourceCodeVersionArgs build() {
            return new ServiceSourceCodeVersionArgs(type, value);
        }
    }
}
