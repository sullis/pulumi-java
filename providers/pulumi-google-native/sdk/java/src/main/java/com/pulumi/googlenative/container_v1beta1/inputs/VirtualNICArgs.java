// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of gVNIC feature.
 * 
 */
public final class VirtualNICArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNICArgs Empty = new VirtualNICArgs();

    /**
     * Whether gVNIC features are enabled in the node pool.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether gVNIC features are enabled in the node pool.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private VirtualNICArgs() {}

    private VirtualNICArgs(VirtualNICArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNICArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNICArgs $;

        public Builder() {
            $ = new VirtualNICArgs();
        }

        public Builder(VirtualNICArgs defaults) {
            $ = new VirtualNICArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether gVNIC features are enabled in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether gVNIC features are enabled in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public VirtualNICArgs build() {
            return $;
        }
    }

}
