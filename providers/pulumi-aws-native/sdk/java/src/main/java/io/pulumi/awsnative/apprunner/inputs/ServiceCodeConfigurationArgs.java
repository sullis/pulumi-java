// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationConfigurationSource;
import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationValuesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Code Configuration
 * 
 */
public final class ServiceCodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCodeConfigurationArgs Empty = new ServiceCodeConfigurationArgs();

    @InputImport(name="codeConfigurationValues")
    private final @Nullable Input<ServiceCodeConfigurationValuesArgs> codeConfigurationValues;

    public Input<ServiceCodeConfigurationValuesArgs> getCodeConfigurationValues() {
        return this.codeConfigurationValues == null ? Input.empty() : this.codeConfigurationValues;
    }

    /**
     * Configuration Source
     * 
     */
    @InputImport(name="configurationSource", required=true)
    private final Input<ServiceCodeConfigurationConfigurationSource> configurationSource;

    public Input<ServiceCodeConfigurationConfigurationSource> getConfigurationSource() {
        return this.configurationSource;
    }

    public ServiceCodeConfigurationArgs(
        @Nullable Input<ServiceCodeConfigurationValuesArgs> codeConfigurationValues,
        Input<ServiceCodeConfigurationConfigurationSource> configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource, "expected parameter 'configurationSource' to be non-null");
    }

    private ServiceCodeConfigurationArgs() {
        this.codeConfigurationValues = Input.empty();
        this.configurationSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceCodeConfigurationValuesArgs> codeConfigurationValues;
        private Input<ServiceCodeConfigurationConfigurationSource> configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder setCodeConfigurationValues(@Nullable Input<ServiceCodeConfigurationValuesArgs> codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder setCodeConfigurationValues(@Nullable ServiceCodeConfigurationValuesArgs codeConfigurationValues) {
            this.codeConfigurationValues = Input.ofNullable(codeConfigurationValues);
            return this;
        }

        public Builder setConfigurationSource(Input<ServiceCodeConfigurationConfigurationSource> configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }

        public Builder setConfigurationSource(ServiceCodeConfigurationConfigurationSource configurationSource) {
            this.configurationSource = Input.of(Objects.requireNonNull(configurationSource));
            return this;
        }

        public ServiceCodeConfigurationArgs build() {
            return new ServiceCodeConfigurationArgs(codeConfigurationValues, configurationSource);
        }
    }
}
