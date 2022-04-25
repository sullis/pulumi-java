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
 * Configuration for controlling master global access settings.
 * 
 */
public final class PrivateClusterMasterGlobalAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateClusterMasterGlobalAccessConfigArgs Empty = new PrivateClusterMasterGlobalAccessConfigArgs();

    /**
     * Whenever master is accessible globally or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whenever master is accessible globally or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private PrivateClusterMasterGlobalAccessConfigArgs() {}

    private PrivateClusterMasterGlobalAccessConfigArgs(PrivateClusterMasterGlobalAccessConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateClusterMasterGlobalAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateClusterMasterGlobalAccessConfigArgs $;

        public Builder() {
            $ = new PrivateClusterMasterGlobalAccessConfigArgs();
        }

        public Builder(PrivateClusterMasterGlobalAccessConfigArgs defaults) {
            $ = new PrivateClusterMasterGlobalAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whenever master is accessible globally or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whenever master is accessible globally or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public PrivateClusterMasterGlobalAccessConfigArgs build() {
            return $;
        }
    }

}
