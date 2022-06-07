// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionArgs Empty = new GetRegionArgs();

    /**
     * The EC2 endpoint of the region to select.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The EC2 endpoint of the region to select.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The full name of the region to select.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The full name of the region to select.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetRegionArgs() {}

    private GetRegionArgs(GetRegionArgs $) {
        this.endpoint = $.endpoint;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionArgs $;

        public Builder() {
            $ = new GetRegionArgs();
        }

        public Builder(GetRegionArgs defaults) {
            $ = new GetRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The EC2 endpoint of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The EC2 endpoint of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param name The full name of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The full name of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetRegionArgs build() {
            return $;
        }
    }

}
