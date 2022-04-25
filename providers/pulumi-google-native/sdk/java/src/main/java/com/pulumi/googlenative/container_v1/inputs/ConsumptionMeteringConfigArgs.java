// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for controlling consumption metering.
 * 
 */
public final class ConsumptionMeteringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumptionMeteringConfigArgs Empty = new ConsumptionMeteringConfigArgs();

    /**
     * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ConsumptionMeteringConfigArgs() {}

    private ConsumptionMeteringConfigArgs(ConsumptionMeteringConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsumptionMeteringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsumptionMeteringConfigArgs $;

        public Builder() {
            $ = new ConsumptionMeteringConfigArgs();
        }

        public Builder(ConsumptionMeteringConfigArgs defaults) {
            $ = new ConsumptionMeteringConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ConsumptionMeteringConfigArgs build() {
            return $;
        }
    }

}
