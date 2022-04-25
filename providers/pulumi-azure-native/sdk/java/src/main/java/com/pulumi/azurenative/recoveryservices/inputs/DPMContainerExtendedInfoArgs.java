// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information of the DPMContainer.
 * 
 */
public final class DPMContainerExtendedInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final DPMContainerExtendedInfoArgs Empty = new DPMContainerExtendedInfoArgs();

    /**
     * Last refresh time of the DPMContainer.
     * 
     */
    @Import(name="lastRefreshedAt")
    private @Nullable Output<String> lastRefreshedAt;

    /**
     * @return Last refresh time of the DPMContainer.
     * 
     */
    public Optional<Output<String>> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }

    private DPMContainerExtendedInfoArgs() {}

    private DPMContainerExtendedInfoArgs(DPMContainerExtendedInfoArgs $) {
        this.lastRefreshedAt = $.lastRefreshedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DPMContainerExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DPMContainerExtendedInfoArgs $;

        public Builder() {
            $ = new DPMContainerExtendedInfoArgs();
        }

        public Builder(DPMContainerExtendedInfoArgs defaults) {
            $ = new DPMContainerExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastRefreshedAt Last refresh time of the DPMContainer.
         * 
         * @return builder
         * 
         */
        public Builder lastRefreshedAt(@Nullable Output<String> lastRefreshedAt) {
            $.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        /**
         * @param lastRefreshedAt Last refresh time of the DPMContainer.
         * 
         * @return builder
         * 
         */
        public Builder lastRefreshedAt(String lastRefreshedAt) {
            return lastRefreshedAt(Output.of(lastRefreshedAt));
        }

        public DPMContainerExtendedInfoArgs build() {
            return $;
        }
    }

}
