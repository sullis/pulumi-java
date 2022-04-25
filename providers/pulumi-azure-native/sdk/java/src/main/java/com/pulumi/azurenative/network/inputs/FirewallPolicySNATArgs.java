// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private IP addresses/IP ranges to which traffic will not be SNAT.
 * 
 */
public final class FirewallPolicySNATArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicySNATArgs Empty = new FirewallPolicySNATArgs();

    /**
     * List of private IP addresses/IP address ranges to not be SNAT.
     * 
     */
    @Import(name="privateRanges")
    private @Nullable Output<List<String>> privateRanges;

    /**
     * @return List of private IP addresses/IP address ranges to not be SNAT.
     * 
     */
    public Optional<Output<List<String>>> privateRanges() {
        return Optional.ofNullable(this.privateRanges);
    }

    private FirewallPolicySNATArgs() {}

    private FirewallPolicySNATArgs(FirewallPolicySNATArgs $) {
        this.privateRanges = $.privateRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicySNATArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicySNATArgs $;

        public Builder() {
            $ = new FirewallPolicySNATArgs();
        }

        public Builder(FirewallPolicySNATArgs defaults) {
            $ = new FirewallPolicySNATArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateRanges List of private IP addresses/IP address ranges to not be SNAT.
         * 
         * @return builder
         * 
         */
        public Builder privateRanges(@Nullable Output<List<String>> privateRanges) {
            $.privateRanges = privateRanges;
            return this;
        }

        /**
         * @param privateRanges List of private IP addresses/IP address ranges to not be SNAT.
         * 
         * @return builder
         * 
         */
        public Builder privateRanges(List<String> privateRanges) {
            return privateRanges(Output.of(privateRanges));
        }

        /**
         * @param privateRanges List of private IP addresses/IP address ranges to not be SNAT.
         * 
         * @return builder
         * 
         */
        public Builder privateRanges(String... privateRanges) {
            return privateRanges(List.of(privateRanges));
        }

        public FirewallPolicySNATArgs build() {
            return $;
        }
    }

}
