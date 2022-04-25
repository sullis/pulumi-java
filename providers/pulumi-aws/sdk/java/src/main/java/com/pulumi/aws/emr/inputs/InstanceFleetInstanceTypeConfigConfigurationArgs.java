// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFleetInstanceTypeConfigConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFleetInstanceTypeConfigConfigurationArgs Empty = new InstanceFleetInstanceTypeConfigConfigurationArgs();

    /**
     * The classification within a configuration.
     * 
     */
    @Import(name="classification")
    private @Nullable Output<String> classification;

    /**
     * @return The classification within a configuration.
     * 
     */
    public Optional<Output<String>> classification() {
        return Optional.ofNullable(this.classification);
    }

    /**
     * A map of properties specified within a configuration classification
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return A map of properties specified within a configuration classification
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private InstanceFleetInstanceTypeConfigConfigurationArgs() {}

    private InstanceFleetInstanceTypeConfigConfigurationArgs(InstanceFleetInstanceTypeConfigConfigurationArgs $) {
        this.classification = $.classification;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFleetInstanceTypeConfigConfigurationArgs $;

        public Builder() {
            $ = new InstanceFleetInstanceTypeConfigConfigurationArgs();
        }

        public Builder(InstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
            $ = new InstanceFleetInstanceTypeConfigConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classification The classification within a configuration.
         * 
         * @return builder
         * 
         */
        public Builder classification(@Nullable Output<String> classification) {
            $.classification = classification;
            return this;
        }

        /**
         * @param classification The classification within a configuration.
         * 
         * @return builder
         * 
         */
        public Builder classification(String classification) {
            return classification(Output.of(classification));
        }

        /**
         * @param properties A map of properties specified within a configuration classification
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A map of properties specified within a configuration classification
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        public InstanceFleetInstanceTypeConfigConfigurationArgs build() {
            return $;
        }
    }

}
